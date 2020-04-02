package com.coliwogg.gemsandcrystals.world.gen;

import java.util.Random;

import com.coliwogg.gemsandcrystals.init.BlockInit;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {
	
	private static final CountRangeConfig RUBY = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig SAPPHIRE = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig AMETHYST = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig TOPAZ = new CountRangeConfig(4, 0, 4, 30);
	// private static final CountRangeConfig QUARTZ = new CountRangeConfig(4, 0, 4, 30);

	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(RUBY);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 1, 2))).withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(SAPPHIRE);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 1, 2))).withPlacement(customConfig));
		
			customConfig = Placement.COUNT_RANGE.configure(AMETHYST);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.AMETHYST_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 5))).withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(TOPAZ);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 4))).withPlacement(customConfig));
			
			/* 
			customConfig = Placement.COUNT_RANGE.configure(QUARTZ);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 3, 7))).withPlacement(customConfig));
			*/
		}	
	}
}
