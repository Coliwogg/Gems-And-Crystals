package com.coliwogg.gemsandcrystals.world.feature;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMETHYST_ORE_KEY = registerKey("amethyst_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_KEY = registerKey("quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_GEODE_KEY = registerKey("quartz_geode");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSaphireOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTopazOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldAmethystOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldQuartzOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));


        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 3));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSaphireOres, 3));
        register(context, OVERWORLD_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTopazOres, 7));
        register(context, OVERWORLD_AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmethystOres,10));
        register(context, OVERWORLD_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 14));
        register(context, OVERWORLD_QUARTZ_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(Blocks.DEEPSLATE),
                BlockStateProvider.simple(ModBlocks.QUARTZ_ORE.get()),
                BlockStateProvider.simple(Blocks.STONE),
                BlockStateProvider.simple(Blocks.CALCITE),
                List.of(Blocks.QUARTZ_BLOCK.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                true, UniformInt.of(3, 8),
                UniformInt.of(2, 6), UniformInt.of(1, 2),
                -18, 18, 0.075D, 1));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(GemsAndCrystals.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
