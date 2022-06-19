package com.coliwogg.gemsandcrystals.world.feature;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GemsAndCrystals.MOD_ID);

    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfiguredFeatures.RUBY_ORE, ModOrePlacement.commonOrePlacement(4,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("sapphire_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfiguredFeatures.SAPPHIRE_ORE, ModOrePlacement.commonOrePlacement(4,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_PLACED = PLACED_FEATURES.register("topaz_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfiguredFeatures.TOPAZ_ORE, ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> AMETHYST_ORE_PLACED = PLACED_FEATURES.register("amethyst_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfiguredFeatures.AMETHYST_ORE, ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> QUARTZ_ORE_PLACED = PLACED_FEATURES.register("quartz_ore_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfiguredFeatures.QUARTZ_ORE, ModOrePlacement.commonOrePlacement(8,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }


}
