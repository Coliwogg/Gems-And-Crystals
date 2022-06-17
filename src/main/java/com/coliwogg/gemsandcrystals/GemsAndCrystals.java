package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsClientConfigs;
import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GemsAndCrystals.MOD_ID)
public class GemsAndCrystals {
    public static final String MOD_ID = "gemsandcrystals";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public GemsAndCrystals() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GemsAndCrystalsClientConfigs.SPEC, "gemsandcrystals-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GemsAndCrystalsCommonConfigs.SPEC, "gemsandcrystals-common.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
