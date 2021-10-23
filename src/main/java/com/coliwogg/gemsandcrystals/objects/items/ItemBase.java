package com.coliwogg.gemsandcrystals.objects.items;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().tab(GemsandCrystals.TAB));
    }
}
