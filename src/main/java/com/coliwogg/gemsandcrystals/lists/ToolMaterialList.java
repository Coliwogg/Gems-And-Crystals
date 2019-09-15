package com.coliwogg.gemsandcrystals.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
	ruby(9.0f, 9.0f, 900, 3, 12, ItemList.ruby),
	sapphire(9.0f, 9.0f, 900, 3, 11, ItemList.sapphire),
	emerald(8.0f, 8.0f, 825, 3, 10, ItemList.emerald),
	topaz(8.0f, 7.0f, 775, 2, 13, ItemList.topaz),
	amethyst(7.0f, 7.0f, 700, 2, 14, ItemList.amethyst),
	quartz(7.0f, 6.5f, 400, 2, 13, ItemList.quartz);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
}	
