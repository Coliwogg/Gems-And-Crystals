package com.coliwogg.gemsandcrystals.world.gen;

import java.util.Random;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.config.OreGenConfig;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	private static final CountRangeConfig RUBY = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig SAPPHIRE = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig TOPAZ = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig AMETHYST = new CountRangeConfig(4, 0, 4, 30);
	private static final CountRangeConfig QUARTZ = new CountRangeConfig(4, 0, 4, 30);

	public static void setupOreGeneration() {
		if(OreGenConfig.generate_overworld.get()) {
			for(Biome biome : ForgeRegistries.BIOMES) {
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GemsAndCrystals.RUBY_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 1, 2)), Placement.COUNT_RANGE, RUBY));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GemsAndCrystals.SAPPHIRE_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 1, 2)), Placement.COUNT_RANGE, SAPPHIRE));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GemsAndCrystals.TOPAZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 4)), Placement.COUNT_RANGE, TOPAZ));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GemsAndCrystals.AMETHYST_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 5)), Placement.COUNT_RANGE, AMETHYST));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GemsAndCrystals.QUARTZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 3, 7)), Placement.COUNT_RANGE, QUARTZ));
			}
		}
	}
}
