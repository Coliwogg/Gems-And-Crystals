package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID)
public class OreGeneration {

    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {

        for (OreType ore : OreType.values()) {
            if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {

                OreConfiguration oreFeatureConfig = new OreConfiguration(
                        OreConfiguration.Predicates.NATURAL_STONE,
                        ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

                generateOre(ore.getBlock().get(), oreFeatureConfig, event.getGeneration(), ore.getMinHeight(), ore.getMaxHeight(), ore.getMaxVeinSize());
            }
        }

        for (DeepslateOreType ore : DeepslateOreType.values()) {
            if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
                OreConfiguration oreFeatureConfig = new OreConfiguration(
                        OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES,
                        ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

                generateOre(ore.getBlock().get(), oreFeatureConfig, event.getGeneration(), ore.getMinHeight(), ore.getMaxHeight(), ore.getMaxVeinSize());
            }
        }
    }

    private static void generateOre(Block ore, OreConfiguration oreFeatureConfig, BiomeGenerationSettingsBuilder settings, int minHeight, int maxHeight, int maxVeinSize) {
        settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(oreFeatureConfig).rangeUniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)).squared().count(maxVeinSize));
        registerOreFeature(ore, oreFeatureConfig, maxVeinSize);
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(Block ore, OreConfiguration oreFeatureConfig, int maxVeinSize) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getRegistryName(), Feature.ORE.configured(oreFeatureConfig).squared().count(maxVeinSize));
    }
}
