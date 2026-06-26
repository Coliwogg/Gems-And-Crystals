package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.item.ModCreativeModeTabs;
import com.coliwogg.gemsandcrystals.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class GemsAndCrystalsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ModWorldGeneration.generateModWorldGen();

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> ModCreativeModeTabs.addItemsToIngredients(entries::accept));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(entries -> ModCreativeModeTabs.addBlocksToBuildingBlocks(entries::accept));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS)
                .register(entries -> ModCreativeModeTabs.addBlocksToNaturalBlocks(entries::accept));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register(entries -> ModCreativeModeTabs.addItemsToCombat(entries::accept));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register(entries -> ModCreativeModeTabs.addItemsToToolsAndUtilities(entries::accept));

        GemsAndCrystals.init();
    }
}
