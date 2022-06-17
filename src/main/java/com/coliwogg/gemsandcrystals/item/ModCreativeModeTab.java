package com.coliwogg.gemsandcrystals.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GEMSANDCRYSTALS_TAB = new CreativeModeTab("gemsandcrystalstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
}
