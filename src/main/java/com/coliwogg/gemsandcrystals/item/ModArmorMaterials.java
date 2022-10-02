package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby",36,
            new int[]{3, 6, 8, 3}, 16,
            SoundEvents.ARMOR_EQUIP_DIAMOND,2.5F,
            0.1F,
            () -> Ingredient.of(ModItems.RUBY.get())
    ),
    SAPPHIRE("sapphire",36,
            new int[]{3, 6, 8, 3}, 16,
            SoundEvents.ARMOR_EQUIP_DIAMOND,2.5F,
            0.1F,
            () -> Ingredient.of(ModItems.SAPPHIRE.get())
    ),
    EMERALD("emerald",36,
            new int[]{3, 6, 8, 3}, 14,
            SoundEvents.ARMOR_EQUIP_DIAMOND,1.5F,
            0.0F,
            () -> Ingredient.of(Items.EMERALD)
    ),
    TOPAZ("topaz",22,
            new int[]{3, 6, 8, 3}, 13,
            SoundEvents.ARMOR_EQUIP_GOLD,0.0F,
            0.0F,
            () -> Ingredient.of(ModItems.TOPAZ.get())
    ),
    AMETHYST("amethyst",18,
            new int[]{3, 6, 8, 3}, 12,
            SoundEvents.ARMOR_EQUIP_GOLD,0.0F,
            0.0F,
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    ),
    QUARTZ("quartz",10,
            new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_GOLD,0.0F,
            0.0F,
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