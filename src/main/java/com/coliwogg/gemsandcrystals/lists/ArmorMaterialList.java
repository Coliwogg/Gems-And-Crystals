package com.coliwogg.gemsandcrystals.lists;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial {
	ruby("ruby", 450, new int[] {3,6,8,3}, 12, ItemList.ruby, "item.armor.equip_diamond", 0.0f),
	sapphire("sapphire", 450, new int[] {3,6,8,3}, 11, ItemList.sapphire, "item.armor.equip_diamond", 0.0f),
	emerald("emerald", 400, new int[] {3,5,7,4}, 10, ItemList.emerald, "item.armor.equip_diamond", 0.0f),
	topaz("topaz", 400, new int[] {2,6,8,3}, 13, ItemList.topaz, "item.armor.equip_diamond", 0.0f),
	amethyst("amethyst", 350, new int[] {2,5,8,4}, 14, ItemList.amethyst, "item.armor.equip_diamond", 0.0f),
	quartz("quartz", 350, new int[] {2,5,7,3}, 13, ItemList.quartz, "item.armor.equip_diamond", 0.0f);
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {13,15,16,11};
	private String name, equipSound;
	private int durability, enchantability;
	private int[] damageReductionAmounts;
	private Item repairItem;
	private float toughness;
	
	private ArmorMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) {
		this.name = name;
		this.durability = durability;
		this.damageReductionAmounts = damageReductionAmounts;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.equipSound = equipSound;
		this.toughness = toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public String getName() {
		return GemsAndCrystals.MOD_ID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() {
		return new SoundEvent(new ResourceLocation(this.equipSound));
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
}
