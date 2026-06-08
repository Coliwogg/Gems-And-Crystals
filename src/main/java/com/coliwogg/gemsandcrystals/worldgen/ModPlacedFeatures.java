package com.coliwogg.gemsandcrystals.worldgen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RUBY_ORE_SMALL_PLACED_KEY = createKey("ruby_ore_small_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_LARGE_PLACED_KEY = createKey("ruby_ore_large_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED_KEY = createKey("sapphire_ore_small_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED_KEY = createKey("sapphire_ore_large_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_SMALL_PLACED_KEY = createKey("topaz_ore_small_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_LARGE_PLACED_KEY = createKey("topaz_ore_large_placed");
    public static final ResourceKey<PlacedFeature> AMETHYST_ORE_SMALL_PLACED_KEY = createKey("amethyst_ore_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_SMALL_PLACED_KEY = createKey("quartz_ore_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_LARGE_PLACED_KEY = createKey("quartz_ore_large_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE_PLACED_KEY = createKey("quartz_geode_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(3, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(8))));
        register(context, RUBY_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-20))));
        register(context, SAPPHIRE_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(-10))));
        register(context, SAPPHIRE_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-30))));
        register(context, TOPAZ_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TOPAZ_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(6, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90))));
        register(context, TOPAZ_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TOPAZ_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(2, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(60))));
        register(context, AMETHYST_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_AMETHYST_ORE_SMALL_KEY),
                ModOrePlacement.rareOrePlacement(2, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(-20))));
        register(context, QUARTZ_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(5, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(48), VerticalAnchor.absolute(160))));
        register(context, QUARTZ_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(3, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(96), VerticalAnchor.absolute(200))));
        register(context, QUARTZ_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_GEODE_KEY),
                        List.of(RarityFilter.onAverageOnceEvery(35), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(40)),
                        BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
