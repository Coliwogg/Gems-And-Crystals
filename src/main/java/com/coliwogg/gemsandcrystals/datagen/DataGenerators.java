package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.trim.ModTrimMaterials;
import com.coliwogg.gemsandcrystals.worldgen.ModBiomeModifiers;
import com.coliwogg.gemsandcrystals.worldgen.ModFeatures;
import com.coliwogg.gemsandcrystals.worldgen.ModPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = GemsAndCrystals.MOD_ID)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherDataRegistryEvents(GatherDataRegistryEntriesEvent event) {
        event.gatherFor(GemsAndCrystals.MOD_ID, Identifier.DEFAULT_NAMESPACE)
                .add(Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap)
                .add(Registries.FEATURE, ModFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)
                .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                                new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK))))
                .add(ModRecipeProvider.create());
    }

    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getReloadableLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModEquipmentAssetProvider(packOutput));
    }
}
