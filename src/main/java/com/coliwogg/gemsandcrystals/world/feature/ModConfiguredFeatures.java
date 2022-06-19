package com.coliwogg.gemsandcrystals.world.feature;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TOPAZ_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AMETHYST_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_QUARTZ_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.QUARTZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAPPHIRE_ORE = FeatureUtils.register("sapphire_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TOPAZ_ORE = FeatureUtils.register("topaz_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMETHYST_ORE = FeatureUtils.register("amethyst_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_AMETHYST_ORES, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> QUARTZ_ORE = FeatureUtils.register("quartz_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_QUARTZ_ORES, 4));
}
