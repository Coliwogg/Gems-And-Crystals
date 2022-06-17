package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", GemsAndCrystalsCommonConfigs.RUBY_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.RUBY_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_DIAMOND, GemsAndCrystalsCommonConfigs.RUBY_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.RUBY_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(ModItems.RUBY.get())
    ),
    SAPPHIRE("sapphire", GemsAndCrystalsCommonConfigs.SAPPHIRE_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.SAPPHIRE_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_DIAMOND, GemsAndCrystalsCommonConfigs.SAPPHIRE_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.SAPPHIRE_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(ModItems.SAPPHIRE.get())
    ),
    EMERALD("emerald", GemsAndCrystalsCommonConfigs.EMERALD_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.EMERALD_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_DIAMOND, GemsAndCrystalsCommonConfigs.EMERALD_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.EMERALD_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(Items.EMERALD)
    ),
    TOPAZ("topaz",  GemsAndCrystalsCommonConfigs.TOPAZ_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.TOPAZ_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_GOLD, GemsAndCrystalsCommonConfigs.TOPAZ_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.TOPAZ_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(ModItems.TOPAZ.get())
    ),
    AMETHYST("amethyst", GemsAndCrystalsCommonConfigs.AMETHYST_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.AMETHYST_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_GOLD, GemsAndCrystalsCommonConfigs.AMETHYST_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.AMETHYST_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    ),
    QUARTZ("quartz", GemsAndCrystalsCommonConfigs.QUARTZ_ARMOR_DURABILITY_MULTIPLIER.get(),
            new int[]{3, 6, 8, 3}, GemsAndCrystalsCommonConfigs.QUARTZ_ARMOR_ENCHANTMENT_VALUE.get(),
            SoundEvents.ARMOR_EQUIP_GOLD, GemsAndCrystalsCommonConfigs.QUARTZ_ARMOR_TOUGHNESS.get(),
            GemsAndCrystalsCommonConfigs.QUARTZ_ARMOR_KNOCKBACK_RESISTANCE.get(),
            () -> Ingredient.of(Items.QUARTZ)
    );

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return GemsAndCrystals.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
