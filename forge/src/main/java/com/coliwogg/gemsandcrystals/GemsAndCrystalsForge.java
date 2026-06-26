package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.item.ModCreativeModeTabs;
import com.coliwogg.gemsandcrystals.platform.ForgeRegistryHelper;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class GemsAndCrystalsForge {

    public static IEventBus EVENT_BUS;

    public GemsAndCrystalsForge(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();

        ForgeRegistryHelper.CREATIVE_MODE_TABS.register(EVENT_BUS);

        ForgeRegistryHelper.ITEMS.register(EVENT_BUS);
        ForgeRegistryHelper.BLOCKS.register(EVENT_BUS);

        EVENT_BUS.addListener(this::addCreative);

        GemsAndCrystals.init();

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            ModCreativeModeTabs.addItemsToIngredients(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModCreativeModeTabs.addBlocksToBuildingBlocks(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            ModCreativeModeTabs.addBlocksToNaturalBlocks(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            ModCreativeModeTabs.addItemsToCombat(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ModCreativeModeTabs.addItemsToToolsAndUtilities(event::accept);
        }

    }
}