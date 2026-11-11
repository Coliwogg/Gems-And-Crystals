package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.trim.ModTrimMaterials;
import com.coliwogg.gemsandcrystals.worldgen.ModBiomeModifiers;
import com.coliwogg.gemsandcrystals.worldgen.ModFeatures;
import com.coliwogg.gemsandcrystals.worldgen.ModPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;

public class ModDatapackProvider {
    public static final RegistrySetBuilder WORLD_BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap)
            .add(Registries.FEATURE, ModFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public static final RegistrySetBuilder RELOADABLE_BUILDER = new RegistrySetBuilder()
            .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                    new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK))))
            .add(ModRecipeProvider.create());
}
