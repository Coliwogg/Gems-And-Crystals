package com.coliwogg.gemsandcrystals.worldgen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModFeatures {
    public static final ResourceKey<Feature> OVERWORLD_RUBY_ORE_SMALL_KEY = registerKey("ruby_ore_small");
    public static final ResourceKey<Feature> OVERWORLD_RUBY_ORE_LARGE_KEY = registerKey("ruby_ore_large");
    public static final ResourceKey<Feature> OVERWORLD_SAPPHIRE_ORE_SMALL_KEY = registerKey("sapphire_ore_small");
    public static final ResourceKey<Feature> OVERWORLD_SAPPHIRE_ORE_LARGE_KEY = registerKey("sapphire_ore_large");
    public static final ResourceKey<Feature> OVERWORLD_TOPAZ_ORE_SMALL_KEY = registerKey("topaz_ore_small");
    public static final ResourceKey<Feature> OVERWORLD_TOPAZ_ORE_LARGE_KEY = registerKey("topaz_ore_large");
    public static final ResourceKey<Feature> OVERWORLD_AMETHYST_ORE_SMALL_KEY = registerKey("amethyst_ore_small");
    public static final ResourceKey<Feature> OVERWORLD_QUARTZ_ORE_SMALL_KEY = registerKey("quartz_ore_small");
    public static final ResourceKey<Feature> OVERWORLD_QUARTZ_ORE_LARGE_KEY = registerKey("quartz_ore_large");
    public static final ResourceKey<Feature> OVERWORLD_QUARTZ_GEODE_KEY = registerKey("quartz_geode");

    public static void bootstrap(BootstrapContext<Feature> context) {
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<BlockReplacement> overworldRubyOres = List.of(BlockReplacement.replace(stoneReplaceables,
                ModBlocks.RUBY_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
        List<BlockReplacement> overworldSaphireOres = List.of(BlockReplacement.replace(stoneReplaceables,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
        List<BlockReplacement> overworldTopazOres = List.of(BlockReplacement.replace(stoneReplaceables,
                ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState()));
        List<BlockReplacement> overworldAmethystOres = List.of(BlockReplacement.replace(stoneReplaceables,
                ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));
        List<BlockReplacement> overworldQuartzOres = List.of(BlockReplacement.replace(stoneReplaceables,
                ModBlocks.QUARTZ_ORE.get().defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));


        context.register(OVERWORLD_RUBY_ORE_SMALL_KEY, new OreFeature(overworldRubyOres, 4));
        context.register(OVERWORLD_RUBY_ORE_LARGE_KEY, new OreFeature(overworldRubyOres, 8));
        context.register(OVERWORLD_SAPPHIRE_ORE_SMALL_KEY, new OreFeature(overworldSaphireOres, 5));
        context.register(OVERWORLD_SAPPHIRE_ORE_LARGE_KEY, new OreFeature(overworldSaphireOres, 9));
        context.register(OVERWORLD_TOPAZ_ORE_SMALL_KEY, new OreFeature(overworldTopazOres, 6));
        context.register(OVERWORLD_TOPAZ_ORE_LARGE_KEY, new OreFeature(overworldTopazOres, 11));
        context.register(OVERWORLD_AMETHYST_ORE_SMALL_KEY, new OreFeature(overworldAmethystOres,3));
        context.register(OVERWORLD_QUARTZ_ORE_SMALL_KEY, new OreFeature(overworldQuartzOres, 7));
        context.register(OVERWORLD_QUARTZ_ORE_LARGE_KEY, new OreFeature(overworldQuartzOres, 12));

        context.register(OVERWORLD_QUARTZ_GEODE_KEY, new GeodeFeature(new GeodeBlockSettings(
                BlockStateProvider.holderOf(Blocks.AIR),
                BlockStateProvider.holderOf(Blocks.DIORITE),
                BlockStateProvider.holderOf(ModBlocks.BUDDING_QUARTZ.get()),
                BlockStateProvider.holderOf(Blocks.TUFF),
                BlockStateProvider.holderOf(Blocks.SMOOTH_BASALT),
                List.of(
                        ModBlocks.SMALL_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_QUARTZ_BUD.get().defaultBlockState(),
                        ModBlocks.QUARTZ_CLUSTER.get().defaultBlockState()
                ),
                blocks.getOrThrow(BlockTags.FEATURES_CANNOT_REPLACE),
                blocks.getOrThrow(BlockTags.GEODE_INVALID_BLOCKS)),
                new GeodeLayerSettings(1.7, 2.2, 3.0, 4.2),
                new GeodeCrackSettings(0.6, 2.0, 2),
                        0.4, 0.083,
                        true, UniformInt.of(4, 7),
                        UniformInt.of(2, 4), UniformInt.of(1, 2),
                        -16, 16, 0.065, 1
                )
        );
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name));
    }
}
