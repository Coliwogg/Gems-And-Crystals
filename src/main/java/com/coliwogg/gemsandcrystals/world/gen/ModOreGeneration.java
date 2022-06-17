package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import com.coliwogg.gemsandcrystals.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        if (GemsAndCrystalsCommonConfigs.RUBY_ORE_GENERATION.get()) {
            base.add(ModPlacedFeatures.RUBY_ORE_PLACED);
        }

        if (GemsAndCrystalsCommonConfigs.SAPPHIRE_ORE_GENERATION.get()) {
            base.add(ModPlacedFeatures.SAPPHIRE_ORE_PLACED);
        }

        if (GemsAndCrystalsCommonConfigs.TOPAZ_ORE_GENERATION.get()) {
            base.add(ModPlacedFeatures.TOPAZ_ORE_PLACED);
        }

        if (GemsAndCrystalsCommonConfigs.AMETHYST_ORE_GENERATION.get()) {
            base.add(ModPlacedFeatures.AMETHYST_ORE_PLACED);
        }
        if (GemsAndCrystalsCommonConfigs.QUARTZ_ORE_GENERATION.get()) {
            base.add(ModPlacedFeatures.QUARTZ_ORE_PLACED);
        }
    }
}