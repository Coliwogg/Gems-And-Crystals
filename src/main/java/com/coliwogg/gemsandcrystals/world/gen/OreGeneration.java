package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID)
public class OreGeneration {

    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
                if (ore.getGenerateOreToggle()) {

                    List<OreConfiguration.TargetBlockState> ORE_TARGET_LIST = List.of(
                            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ore.getBlock().get().defaultBlockState()),
                            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ore.getDeepslateBlock().get().defaultBlockState())
                    );

                    ConfiguredFeature<?, ?> ORE_FEATURE = Feature.ORE.configured(new OreConfiguration(ORE_TARGET_LIST, ore.getMinVeinSize()));

                    PlacedFeature ORE_PLACEMENT = ORE_FEATURE.placed(HeightRangePlacement.triangle(
                            VerticalAnchor.absolute(ore.getMinHeight()),
                            VerticalAnchor.absolute(ore.getMaxHeight())), InSquarePlacement.spread(), CountPlacement.of(ore.getChance()));

                    generateOre(event.getGeneration(), ORE_PLACEMENT);
                }
            }
        }
    }

    private static void generateOre(BiomeGenerationSettings.Builder pBuilder, PlacedFeature ORE_PLACEMENT) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ORE_PLACEMENT);
    }

}
