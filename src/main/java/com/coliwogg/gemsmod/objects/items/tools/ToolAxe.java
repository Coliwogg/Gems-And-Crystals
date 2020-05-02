package com.coliwogg.gemsmod.objects.items.tools;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 8.0F, -3.1F);
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