package com.coliwogg.gemsandcrystals.world.feature;

import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, ModOrePlacement.commonOrePlacement(GemsAndCrystalsCommonConfigs.RUBY_ORE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.RUBY_ORE_MIN_HEIGHT.get()), VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.RUBY_ORE_MAX_HEIGHT.get()))));
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, ModOrePlacement.commonOrePlacement(GemsAndCrystalsCommonConfigs.SAPPHIRE_ORE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(GemsAndCrystalsCommonConfigs.SAPPHIRE_ORE_MIN_HEIGHT.get()), VerticalAnchor.absolute(GemsAndCrystalsCommonConfigs.SAPPHIRE_ORE_MAX_HEIGHT.get()))));
    public static final Holder<PlacedFeature> TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed",
            ModConfiguredFeatures.TOPAZ_ORE, ModOrePlacement.commonOrePlacement(GemsAndCrystalsCommonConfigs.TOPAZ_ORE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.TOPAZ_ORE_MIN_HEIGHT.get()), VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.TOPAZ_ORE_MAX_HEIGHT.get()))));
    public static final Holder<PlacedFeature> AMETHYST_ORE_PLACED = PlacementUtils.register("amethyst_ore_placed",
            ModConfiguredFeatures.AMETHYST_ORE, ModOrePlacement.commonOrePlacement(GemsAndCrystalsCommonConfigs.AMETHYST_ORE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.AMETHYST_ORE_MIN_HEIGHT.get()), VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.AMETHYST_ORE_MAX_HEIGHT.get()))));
    public static final Holder<PlacedFeature> QUARTZ_ORE_PLACED = PlacementUtils.register("quartz_ore_placed",
            ModConfiguredFeatures.QUARTZ_ORE, ModOrePlacement.commonOrePlacement(GemsAndCrystalsCommonConfigs.QUARTZ_ORE_VEINS_PER_CHUNK.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.QUARTZ_ORE_MIN_HEIGHT.get()), VerticalAnchor.aboveBottom(GemsAndCrystalsCommonConfigs.QUARTZ_ORE_MAX_HEIGHT.get()))));


}
