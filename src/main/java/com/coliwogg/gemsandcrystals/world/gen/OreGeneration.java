package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGeneration {

    @SubscribeEvent
    public static void generateOre(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            generate(biome, 2, 4, 0, 14, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE.get().getDefaultState(), 4);
            generate(biome, 2, 4, 0, 14, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SAPPHIRE_ORE.get().getDefaultState(), 4);
            generate(biome, 3, 4, 0, 28, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.TOPAZ_ORE.get().getDefaultState(), 5);
            generate(biome, 4, 4, 0, 32, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.AMETHYST_ORE.get().getDefaultState(), 6);
            // generate(biome, 6, 4, 0, 40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.QUARTZ_ORE.get().getDefaultState(), 8);

        }
    }

    private static void generate(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
