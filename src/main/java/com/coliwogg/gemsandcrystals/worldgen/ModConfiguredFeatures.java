package com.coliwogg.gemsandcrystals.worldgen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_SMALL_KEY = registerKey("ruby_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_LARGE_KEY = registerKey("ruby_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_SMALL_KEY = registerKey("sapphire_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_LARGE_KEY = registerKey("sapphire_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TOPAZ_ORE_SMALL_KEY = registerKey("topaz_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TOPAZ_ORE_LARGE_KEY = registerKey("topaz_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMETHYST_ORE_SMALL_KEY = registerKey("amethyst_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_SMALL_KEY = registerKey("quartz_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_LARGE_KEY = registerKey("quartz_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_GEODE_KEY = registerKey("quartz_geode");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
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


        register(context, OVERWORLD_RUBY_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 4));
        register(context, OVERWORLD_RUBY_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 8));
        register(context, OVERWORLD_SAPPHIRE_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldSaphireOres, 5));
        register(context, OVERWORLD_SAPPHIRE_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldSaphireOres, 9));
        register(context, OVERWORLD_TOPAZ_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldTopazOres, 6));
        register(context, OVERWORLD_TOPAZ_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldTopazOres, 11));
        register(context, OVERWORLD_AMETHYST_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldAmethystOres,3));
        register(context, OVERWORLD_QUARTZ_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 7));
        register(context, OVERWORLD_QUARTZ_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 12));

        register(context, OVERWORLD_QUARTZ_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(Blocks.DIORITE),
                BlockStateProvider.simple(ModBlocks.BUDDING_QUARTZ.get()),
                BlockStateProvider.simple(Blocks.TUFF),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(
                        ModBlocks.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.QUARTZ_CLUSTER.get().defaultBlockState()
                ),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.0, 4.2),
                new GeodeCrackSettings(0.6, 2.0, 2),
                        0.4, 0.083,
                        true, UniformInt.of(4, 7),
                        UniformInt.of(2, 4), UniformInt.of(1, 2),
                        -16, 16, 0.065, 1
                )
        );

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
