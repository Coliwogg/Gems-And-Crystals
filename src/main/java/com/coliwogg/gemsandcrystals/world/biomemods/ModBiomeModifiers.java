package com.coliwogg.gemsandcrystals.world.biomemods;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeModifiers {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, GemsAndCrystals.MOD_ID);

    public static RegistryObject<Codec<ModOreBiomeModifier>> ORE_MODIFIER = BIOME_MODIFIERS.register("ores", () ->
            RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModOreBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("feature").forGetter(ModOreBiomeModifier::feature)
            ).apply(builder, ModOreBiomeModifier::new)));

    public  static void register(IEventBus eventBus) {
        BIOME_MODIFIERS.register(eventBus);
    }
}
