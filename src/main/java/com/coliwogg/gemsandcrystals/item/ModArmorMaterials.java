package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"));
    public static final ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"));
    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"));
    public static final ResourceKey<EquipmentAsset> TOPAZ_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"));
    public static final ResourceKey<EquipmentAsset> AMETHYST_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"));
    public static final ResourceKey<EquipmentAsset> QUARTZ_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"));

    // RUBY: Juggernaut armor. Maximum protection, high toughness (3.0f), and massive Knockback Resistance (0.25f per piece!)
    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(37,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 3); 
                attribute.put(ArmorType.LEGGINGS, 6);
                attribute.put(ArmorType.CHESTPLATE, 8); 
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 11);
            }), 10, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f, 0.25f, ModTags.Items.RUBY_REPAIRABLE, RUBY_KEY);

    // SAPPHIRE: Battle-mage armor. High enchantment value (25), fair toughness (2.0f), no knockback resistance.
    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(28,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 3);
                attribute.put(ArmorType.LEGGINGS, 5);
                attribute.put(ArmorType.CHESTPLATE, 7);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 10);
            }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0f, 0.0f, ModTags.Items.SAPPHIRE_REPAIRABLE, SAPPHIRE_KEY);

    // EMERALD: Utility gear. Decent defenses, low toughness, but highly enchantable.
    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(22,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 5);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 3);
                attribute.put(ArmorType.BODY, 9);
            }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0f, 0.0f, ModTags.Items.EMERALD_REPAIRABLE, EMERALD_KEY);

    // TOPAZ: Flak / Light Striker jacket. Low base armor points, but grants standard toughness (1.0f) so it scales against big hits.
    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(16,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 5);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 7);
            }), 14, SoundEvents.ARMOR_EQUIP_GENERIC,
            1.0f, 0.0f, ModTags.Items.TOPAZ_REPAIRABLE, TOPAZ_KEY);

    // AMETHYST: Light evasive gear. Extremely weak armor points, but high enchantability (18) to allow custom builds.
    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(12,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 1);
                attribute.put(ArmorType.LEGGINGS, 3);
                attribute.put(ArmorType.CHESTPLATE, 4);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 5);
            }), 18, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0f, ModTags.Items.AMETHYST_REPAIRABLE, AMETHYST_KEY);

    // QUARTZ: Fragile glass armor. Decent initial chunk protection, but zero toughness or knockback resistance, breaks fast.
    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(6,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 3);
                attribute.put(ArmorType.CHESTPLATE, 5);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 6);
            }), 8, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0f, ModTags.Items.QUARTZ_REPAIRABLE, QUARTZ_KEY);
}