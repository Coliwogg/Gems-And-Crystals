package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.item.ModCreativeModeTabs;
import com.coliwogg.gemsandcrystals.platform.NeoForgeRegistryHelper;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(Constants.MOD_ID)
public class GemsAndCrystalsNeoForge {

    public static IEventBus EVENT_BUS;

    public GemsAndCrystalsNeoForge(IEventBus modEventBus) {
        EVENT_BUS = modEventBus;

        NeoForgeRegistryHelper.CREATIVE_MODE_TABS.register(EVENT_BUS);

        NeoForgeRegistryHelper.ITEMS.register(EVENT_BUS);
        NeoForgeRegistryHelper.BLOCKS.register(EVENT_BUS);

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