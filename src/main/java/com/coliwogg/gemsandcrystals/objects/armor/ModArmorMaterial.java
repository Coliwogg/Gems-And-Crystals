package com.coliwogg.gemsandcrystals.objects.armor;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    RUBY(GemsandCrystals.MOD_ID + ":ruby", 35, new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY.get());
    }, 0),

    SAPPHIRE(GemsandCrystals.MOD_ID + ":sapphire", 35, new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.SAPPHIRE.get());
    }, 0),

    EMERALD(GemsandCrystals.MOD_ID + ":emerald", 33, new int[]{4, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }, 0),

    TOPAZ(GemsandCrystals.MOD_ID + ":topaz", 20, new int[]{2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.TOPAZ.get());
    }, 0),

    AMETHYST(GemsandCrystals.MOD_ID + ":amethyst", 17, new int[]{3, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, () -> {
        return Ingredient.fromItems(RegistryHandler.AMETHYST.get());
    }, 0),

    QUARTZ(GemsandCrystals.MOD_ID + ":quartz", 10, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, () -> {
        return Ingredient.fromItems(Items.QUARTZ);
    }, 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final int knockbackResistance;

    ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn, int knockbackResistance) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.repairMaterial = repairMaterialIn;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float func_230304_f_() {
        return knockbackResistance;
    }
}
