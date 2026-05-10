package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 35, new int[]{ 3, 8, 6, 3 }, 16,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0.1f, () -> Ingredient.of(ModItems.RUBY.get())),
    SAPPHIRE("sapphire", 35, new int[]{ 3, 8, 6, 3 }, 16,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0.1f, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
    EMERALD("emerald", 32, new int[]{ 3, 8, 6, 2 }, 14,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5f, 0.1f, () -> Ingredient.of(Items.EMERALD)),
    TOPAZ("topaz", 22, new int[]{ 3, 8, 6, 2 }, 13,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Ingredient.of(ModItems.TOPAZ.get())),
    AMETHYST("amethyst", 18, new int[]{ 2, 6, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    QUARTZ("quartz", 10, new int[]{ 2, 5, 3, 1 }, 10,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Ingredient.of(Items.QUARTZ));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return GemsAndCrystals.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}