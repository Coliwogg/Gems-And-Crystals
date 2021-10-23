package com.coliwogg.gemsandcrystals.objects.armor;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.config.ArmorStatConfig;
import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    RUBY(GemsandCrystals.MOD_ID + ":ruby", ArmorStatConfig.ruby_max_damage_factor_in.get(), new int[]{ArmorStatConfig.ruby_boots_strength.get(), ArmorStatConfig.ruby_leggings_strength.get(), ArmorStatConfig.ruby_chestplate_strength.get(), ArmorStatConfig.ruby_helmet_strength.get()}, ArmorStatConfig.ruby_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(RegistryHandler.RUBY.get());
    }, ArmorStatConfig.ruby_armor_knockback_resistance.get()),

    SAPPHIRE(GemsandCrystals.MOD_ID + ":sapphire", ArmorStatConfig.sapphire_max_damage_factor_in.get(), new int[]{ArmorStatConfig.sapphire_boots_strength.get(), ArmorStatConfig.sapphire_leggings_strength.get(), ArmorStatConfig.sapphire_chestplate_strength.get(), ArmorStatConfig.sapphire_helmet_strength.get()}, ArmorStatConfig.sapphire_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(RegistryHandler.SAPPHIRE.get());
    }, ArmorStatConfig.sapphire_armor_knockback_resistance.get()),

    EMERALD(GemsandCrystals.MOD_ID + ":emerald", ArmorStatConfig.emerald_max_damage_factor_in.get(), new int[]{ArmorStatConfig.emerald_boots_strength.get(), ArmorStatConfig.emerald_leggings_strength.get(), ArmorStatConfig.emerald_chestplate_strength.get(), ArmorStatConfig.emerald_helmet_strength.get()}, ArmorStatConfig.emerald_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(Items.EMERALD);
    }, ArmorStatConfig.emerald_armor_knockback_resistance.get()),

    TOPAZ(GemsandCrystals.MOD_ID + ":topaz", ArmorStatConfig.topaz_max_damage_factor_in.get(), new int[]{ArmorStatConfig.topaz_boots_strength.get(), ArmorStatConfig.topaz_leggings_strength.get(), ArmorStatConfig.topaz_chestplate_strength.get(), ArmorStatConfig.topaz_helmet_strength.get()}, ArmorStatConfig.topaz_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(RegistryHandler.TOPAZ.get());
    }, ArmorStatConfig.topaz_armor_knockback_resistance.get()),

    AMETHYST(GemsandCrystals.MOD_ID + ":amethyst", ArmorStatConfig.amethyst_max_damage_factor_in.get(), new int[]{ArmorStatConfig.amethyst_boots_strength.get(), ArmorStatConfig.amethyst_leggings_strength.get(), ArmorStatConfig.amethyst_chestplate_strength.get(), ArmorStatConfig.amethyst_helmet_strength.get()}, ArmorStatConfig.amethyst_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(Items.AMETHYST_SHARD);
    }, ArmorStatConfig.amethyst_armor_knockback_resistance.get()),

    QUARTZ(GemsandCrystals.MOD_ID + ":quartz", ArmorStatConfig.quartz_max_damage_factor_in.get(), new int[]{ArmorStatConfig.quartz_boots_strength.get(), ArmorStatConfig.quartz_leggings_strength.get(), ArmorStatConfig.quartz_chestplate_strength.get(), ArmorStatConfig.quartz_helmet_strength.get()}, ArmorStatConfig.quartz_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
        return Ingredient.of(Items.QUARTZ);
    }, ArmorStatConfig.quartz_armor_knockback_resistance.get());

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
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
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
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
