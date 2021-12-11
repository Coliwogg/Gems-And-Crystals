package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID)
public class OreGeneration {

    // public static final ConfiguredFeature<?, ?> ORE_EMERALD = FeatureUtils.register("ore_emerald", Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, Blocks.EMERALD_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState())), 3)));
    // public static final PlacedFeature ORE_EMERALD = PlacementUtils.register("ore_emerald", OreFeatures.ORE_EMERALD.placed(commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480)))));
    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
                if (ore.getGenerateOreToggle()) {
                    List<OreConfiguration.TargetBlockState> ORE_TARGET_LIST = List.of(
                            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ore.getBlock().get().defaultBlockState()),
                            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ore.getDeepslateBlock().get().defaultBlockState())
                    );

                    ConfiguredFeature<?, ?> ORE_FEATURE = FeatureUtils.register(
                            ore.getBlock().get().getRegistryName().toString(), Feature.ORE.configured(new OreConfiguration(ORE_TARGET_LIST, UniformInt.of(ore.getMinVeinSize(), ore.getMaxVeinSize()).getMinValue()))
                    );

                    PlacedFeature ORE_PLACEMENT = ORE_FEATURE.placed(
                            commonOrePlacement(ore.getChance(), HeightRangePlacement.triangle(VerticalAnchor.absolute(ore.getMinHeight()), VerticalAnchor.absolute(ore.getMaxHeight())))
                    );

                    generateOre(event.getGeneration(), ORE_PLACEMENT);
                }
            }
        }
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static void generateOre(BiomeGenerationSettings.Builder pBuilder, PlacedFeature orePlacement) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, orePlacement);
    }

}
