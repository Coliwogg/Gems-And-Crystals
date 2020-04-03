package com.coliwogg.gemsandcrystals.world.gen;

import java.util.Random;
import java.util.Set;

import com.coliwogg.gemsandcrystals.config.OreGenConfig;
import com.coliwogg.gemsandcrystals.init.BlockInit;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class OreGeneration {
	
	private static final CountRangeConfig RUBY = new CountRangeConfig(OreGenConfig.ruby_chance.get(), 0, 4, 30);
	private static final CountRangeConfig SAPPHIRE = new CountRangeConfig(OreGenConfig.sapphire_chance.get(), 0, 4, 30);
	private static final CountRangeConfig TOPAZ = new CountRangeConfig(OreGenConfig.topaz_chance.get(), 0, 4, 30);
	private static final CountRangeConfig AMETHYST = new CountRangeConfig(OreGenConfig.amethyst_chance.get(), 0, 4, 30);
	private static final CountRangeConfig QUARTZ = new CountRangeConfig(OreGenConfig.quartz_chance.get(), 0, 4, 30);
	
	static ConfiguredPlacement<CountRangeConfig> customConfig = null;

	public static void generateOre() {

		for (Biome biome : ForgeRegistries.BIOMES) {
			
			if(OreGenConfig.generate_ruby.get()) {
				customConfig = Placement.COUNT_RANGE.configure(RUBY);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 4))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_sapphire.get()) {
				customConfig = Placement.COUNT_RANGE.configure(SAPPHIRE);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 4))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_topaz.get()) {
				customConfig = Placement.COUNT_RANGE.configure(TOPAZ);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 2, 5))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_amethyst.get()) {
				customConfig = Placement.COUNT_RANGE.configure(AMETHYST);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.AMETHYST_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 3, 5))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_quartz.get()) {
				customConfig = Placement.COUNT_RANGE.configure(QUARTZ);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TOPAZ_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 3, 7))).withPlacement(customConfig));
			}
		}	
	}
}
