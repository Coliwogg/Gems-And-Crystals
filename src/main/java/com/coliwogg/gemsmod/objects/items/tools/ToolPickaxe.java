package com.coliwogg.gemsmod.objects.items.tools;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
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
