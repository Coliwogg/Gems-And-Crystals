package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.lists.ItemList;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeItemGroup extends ItemGroup {
	public CreativeItemGroup() {
		super("gemsandcrystals");
	}
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemList.ruby);
	}
}
