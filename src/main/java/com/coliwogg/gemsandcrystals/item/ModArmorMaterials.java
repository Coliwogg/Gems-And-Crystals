package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static ResourceKey<EquipmentAsset> RUBY = EquipmentAssets.createId("ruby");
    public static ResourceKey<EquipmentAsset> SAPPHIRE = EquipmentAssets.createId("sapphire");
    public static ResourceKey<EquipmentAsset> EMERALD = EquipmentAssets.createId("emerald");
    public static ResourceKey<EquipmentAsset> TOPAZ = EquipmentAssets.createId("topaz");
    public static ResourceKey<EquipmentAsset> AMETHYST = EquipmentAssets.createId("amethyst");
    public static ResourceKey<EquipmentAsset> QUARTZ = EquipmentAssets.createId("quartz");

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(35,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 3);
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 8);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 11);
            }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.5f, 0.1f, ModTags.Items.RUBY_REPAIRABLE, RUBY);

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(35,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 3);
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 8);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 11);
            }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.5f, 0.1f, ModTags.Items.SAPPHIRE_REPAIRABLE, SAPPHIRE);

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(32,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 8);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 11);
            }),14, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.5f, 0.1f, ModTags.Items.EMERALD_REPAIRABLE, EMERALD);

    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(22,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 8);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 9);
            }), 13, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0f, ModTags.Items.TOPAZ_REPAIRABLE, TOPAZ);

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(18,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 5);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 9);
            }), 12, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0f, ModTags.Items.AMETHYST_REPAIRABLE, AMETHYST);

    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(10,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 1);
                attribute.put(ArmorType.LEGGINGS, 3);
                attribute.put(ArmorType.CHESTPLATE, 5);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 7);
            }), 10, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0f, ModTags.Items.QUARTZ_REPAIRABLE, QUARTZ);
}