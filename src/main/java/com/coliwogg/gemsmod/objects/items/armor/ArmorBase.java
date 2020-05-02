package com.coliwogg.gemsmod.objects.items.armor;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
