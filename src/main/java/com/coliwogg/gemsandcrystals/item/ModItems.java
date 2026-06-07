package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GemsAndCrystals.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.registerSimpleItem("sapphire");
    public static final DeferredItem<Item> TOPAZ = ITEMS.registerSimpleItem("topaz");

    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword", (properties) -> new Item(properties.sword(ModToolTiers.RUBY, 4, -2.8f)));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel", (properties) -> new ShovelItem(ModToolTiers.RUBY, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.RUBY, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.registerItem("ruby_axe", (properties) -> new AxeItem(ModToolTiers.RUBY, 6, -3.2f, properties));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.registerItem("ruby_hoe", (properties) -> new HoeItem(ModToolTiers.RUBY, -4, 0, properties));

    public static final DeferredItem<Item> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword", (properties) -> new Item(properties.sword(ModToolTiers.SAPPHIRE, 3, -2.4f)));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel", (properties) -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.SAPPHIRE, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe", (properties) -> new AxeItem(ModToolTiers.SAPPHIRE, 5, -3.0f, properties));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe", (properties) -> new HoeItem(ModToolTiers.SAPPHIRE, -3, 0, properties));

    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem("emerald_sword", (properties) -> new Item(properties.sword(ModToolTiers.EMERALD, 3, -2.4f)));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.registerItem("emerald_shovel", (properties) -> new ShovelItem(ModToolTiers.EMERALD, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem("emerald_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.EMERALD, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.registerItem("emerald_axe", (properties) -> new AxeItem(ModToolTiers.EMERALD, 5, -3.0f, properties));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.registerItem("emerald_hoe", (properties) -> new HoeItem(ModToolTiers.EMERALD, -3, 0, properties));

    public static final DeferredItem<Item> TOPAZ_SWORD = ITEMS.registerItem("topaz_sword", (properties) -> new Item(properties.sword(ModToolTiers.TOPAZ, 2, -1.8f)));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.registerItem("topaz_shovel", (properties) -> new ShovelItem(ModToolTiers.TOPAZ, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> TOPAZ_PICKAXE = ITEMS.registerItem("topaz_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.TOPAZ, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.registerItem("topaz_axe", (properties) -> new AxeItem(ModToolTiers.TOPAZ, 4, -2.9f, properties));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.registerItem("topaz_hoe", (properties) -> new HoeItem(ModToolTiers.TOPAZ, -2, -1, properties));

    public static final DeferredItem<Item> AMETHYST_SWORD = ITEMS.registerItem("amethyst_sword", (properties) -> new Item(properties.sword(ModToolTiers.AMETHYST, 2, -1.4f)));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.registerItem("amethyst_shovel", (properties) -> new ShovelItem(ModToolTiers.AMETHYST, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> AMETHYST_PICKAXE = ITEMS.registerItem("amethyst_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.AMETHYST, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.registerItem("amethyst_axe", (properties) -> new AxeItem(ModToolTiers.AMETHYST, 5, -3.1f, properties));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.registerItem("amethyst_hoe", (properties) -> new HoeItem(ModToolTiers.AMETHYST, -2, -1, properties));

    public static final DeferredItem<Item> QUARTZ_SWORD = ITEMS.registerItem("quartz_sword", (properties) -> new Item(properties.sword(ModToolTiers.QUARTZ, 3, -2.4f)));
    public static final DeferredItem<ShovelItem> QUARTZ_SHOVEL = ITEMS.registerItem("quartz_shovel", (properties) -> new ShovelItem(ModToolTiers.QUARTZ, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> QUARTZ_PICKAXE = ITEMS.registerItem("quartz_pickaxe", (properties) -> new Item(properties.pickaxe(ModToolTiers.QUARTZ, 1.0F, -2.8f)));
    public static final DeferredItem<AxeItem> QUARTZ_AXE = ITEMS.registerItem("quartz_axe", (properties) -> new AxeItem(ModToolTiers.QUARTZ, 5, -3.2f, properties));
    public static final DeferredItem<HoeItem> QUARTZ_HOE = ITEMS.registerItem("quartz_hoe", (properties) -> new HoeItem(ModToolTiers.QUARTZ, -2, -3F, properties));

    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem("emerald_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem("emerald_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem("emerald_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem("emerald_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> TOPAZ_HELMET = ITEMS.registerItem("topaz_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> TOPAZ_CHESTPLATE = ITEMS.registerItem("topaz_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> TOPAZ_LEGGINGS = ITEMS.registerItem("topaz_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> TOPAZ_BOOTS = ITEMS.registerItem("topaz_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> AMETHYST_HELMET = ITEMS.registerItem("amethyst_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = ITEMS.registerItem("amethyst_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = ITEMS.registerItem("amethyst_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> AMETHYST_BOOTS = ITEMS.registerItem("amethyst_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> QUARTZ_HELMET = ITEMS.registerItem("quartz_helmet", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> QUARTZ_CHESTPLATE = ITEMS.registerItem("quartz_chestplate", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> QUARTZ_LEGGINGS = ITEMS.registerItem("quartz_leggings", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> QUARTZ_BOOTS = ITEMS.registerItem("quartz_boots", (properties) -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> RUBY_HORSE_ARMOR = ITEMS.registerItem("ruby_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL)));
    public static final DeferredItem<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.registerItem("sapphire_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL)));
    public static final DeferredItem<Item> EMERALD_HORSE_ARMOR = ITEMS.registerItem("emerald_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL)));
    public static final DeferredItem<Item> TOPAZ_HORSE_ARMOR = ITEMS.registerItem("topaz_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL)));
    public static final DeferredItem<Item> AMETHYST_HORSE_ARMOR = ITEMS.registerItem("amethyst_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL)));
    public static final DeferredItem<Item> QUARTZ_HORSE_ARMOR = ITEMS.registerItem("quartz_horse_armor", (properties) -> new Item(properties.horseArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
