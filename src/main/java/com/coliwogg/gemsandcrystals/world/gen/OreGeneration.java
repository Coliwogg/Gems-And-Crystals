package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.config.OreGenConfig;
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
            if (OreGenConfig.generate_ruby.get())
                generate(biome, OreGenConfig.ruby_chance.get(), OreGenConfig.ruby_min_height.get(), 0, OreGenConfig.ruby_max_height.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE.get().getDefaultState(), OreGenConfig.ruby_size.get());
            if (OreGenConfig.generate_sapphire.get())
                generate(biome, OreGenConfig.sapphire_chance.get(), OreGenConfig.sapphire_min_height.get(), 0, OreGenConfig.sapphire_max_height.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SAPPHIRE_ORE.get().getDefaultState(), OreGenConfig.sapphire_size.get());
            if (OreGenConfig.generate_topaz.get())
                generate(biome, OreGenConfig.topaz_chance.get(), OreGenConfig.topaz_min_height.get(), 0, OreGenConfig.topaz_max_height.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.TOPAZ_ORE.get().getDefaultState(), OreGenConfig.topaz_size.get());
            if (OreGenConfig.generate_amethyst.get())
                generate(biome, OreGenConfig.amethyst_chance.get(), OreGenConfig.amethyst_min_height.get(), 0, OreGenConfig.amethyst_max_height.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.AMETHYST_ORE.get().getDefaultState(), OreGenConfig.amethyst_size.get());
            if (OreGenConfig.generate_quartz.get())
                generate(biome, OreGenConfig.quartz_chance.get(), OreGenConfig.quartz_min_height.get(), 0, OreGenConfig.quartz_max_height.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.QUARTZ_ORE.get().getDefaultState(), OreGenConfig.quartz_size.get());
        }
    }

    private static void generate(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
