package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID)
public class OreGeneration {

    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {

        for (OreType ore : OreType.values()) {
            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
                    new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

            ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig, ConfiguredPlacement configuredPlacement) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(), Feature.ORE.configured(oreFeatureConfig).decorated(configuredPlacement).squared().count(ore.getMaxVeinSize()));
    }
}
