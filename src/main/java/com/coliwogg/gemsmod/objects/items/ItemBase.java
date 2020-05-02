package com.coliwogg.gemsmod.objects.items;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GemsandCrystals.GemsandCrystalsTab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		GemsandCrystals.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
