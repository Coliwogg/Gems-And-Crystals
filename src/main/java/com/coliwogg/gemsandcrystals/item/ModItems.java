package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GemsAndCrystals.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.registerItem("ruby", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.registerItem("sapphire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> TOPAZ = ITEMS.registerItem("topaz", Item::new, new Item.Properties());

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.registerItem("ruby_sword", (properties) -> new SwordItem(ModToolTiers.RUBY, 3, -2.4f, properties));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel", (properties) -> new ShovelItem(ModToolTiers.RUBY, 1.5F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.RUBY, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.registerItem("ruby_axe", (properties) -> new AxeItem(ModToolTiers.RUBY, 5, -3.0f, properties));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.registerItem("ruby_hoe", (properties) -> new HoeItem(ModToolTiers.RUBY, -4, 0, properties));

    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword", (properties) -> new SwordItem(ModToolTiers.SAPPHIRE, 3, -2.4f, properties));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel", (properties) -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe", (properties) -> new AxeItem(ModToolTiers.SAPPHIRE, 5, -3.0f, properties));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe", (properties) -> new HoeItem(ModToolTiers.SAPPHIRE, -4, 0, properties));

    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.registerItem("emerald_sword", (properties) -> new SwordItem(ModToolTiers.EMERALD, 3, -2.4f, properties));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.registerItem("emerald_shovel", (properties) -> new ShovelItem(ModToolTiers.EMERALD, 1.5F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.registerItem("emerald_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.EMERALD, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.registerItem("emerald_axe", (properties) -> new AxeItem(ModToolTiers.EMERALD, 5, -3.0f, properties));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.registerItem("emerald_hoe", (properties) -> new HoeItem(ModToolTiers.EMERALD, -3, 0, properties));

    public static final DeferredItem<SwordItem> TOPAZ_SWORD = ITEMS.registerItem("topaz_sword", (properties) -> new SwordItem(ModToolTiers.TOPAZ, 3, -2.4f, properties));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.registerItem("topaz_shovel", (properties) -> new ShovelItem(ModToolTiers.TOPAZ, 2F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> TOPAZ_PICKAXE = ITEMS.registerItem("topaz_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.TOPAZ, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.registerItem("topaz_axe", (properties) -> new AxeItem(ModToolTiers.TOPAZ, 6, -3.1f, properties));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.registerItem("topaz_hoe", (properties) -> new HoeItem(ModToolTiers.TOPAZ, -2, -1, properties));

    public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.registerItem("amethyst_sword", (properties) -> new SwordItem(ModToolTiers.AMETHYST, 2, -2.4f, properties));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.registerItem("amethyst_shovel", (properties) -> new ShovelItem(ModToolTiers.AMETHYST, 1.5F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> AMETHYST_PICKAXE = ITEMS.registerItem("amethyst_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.AMETHYST, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.registerItem("amethyst_axe", (properties) -> new AxeItem(ModToolTiers.AMETHYST, 5, -3.1f, properties));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.registerItem("amethyst_hoe", (properties) -> new HoeItem(ModToolTiers.AMETHYST, -2, -1, properties));

    public static final DeferredItem<SwordItem> QUARTZ_SWORD = ITEMS.registerItem("quartz_sword", (properties) -> new SwordItem(ModToolTiers.QUARTZ, 3, -2.4f, properties));
    public static final DeferredItem<ShovelItem> QUARTZ_SHOVEL = ITEMS.registerItem("quartz_shovel", (properties) -> new ShovelItem(ModToolTiers.QUARTZ, 2F, -3.0f, properties));
    public static final DeferredItem<PickaxeItem> QUARTZ_PICKAXE = ITEMS.registerItem("quartz_pickaxe", (properties) -> new PickaxeItem(ModToolTiers.QUARTZ, 1.0F, -2.8f, properties));
    public static final DeferredItem<AxeItem> QUARTZ_AXE = ITEMS.registerItem("quartz_axe", (properties) -> new AxeItem(ModToolTiers.QUARTZ, 6, -3.2f, properties));
    public static final DeferredItem<HoeItem> QUARTZ_HOE = ITEMS.registerItem("quartz_hoe", (properties) -> new HoeItem(ModToolTiers.QUARTZ, -1, -2F, properties));

    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.registerItem("ruby_helmet", (properties) -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings", (properties) -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.registerItem("ruby_boots", (properties) -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<ArmorItem> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet", (properties) -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings", (properties) -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots", (properties) -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.registerItem("emerald_helmet", (properties) -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.registerItem("emerald_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.registerItem("emerald_leggings", (properties) -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.registerItem("emerald_boots", (properties) -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<ArmorItem> TOPAZ_HELMET = ITEMS.registerItem("topaz_helmet", (properties) -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.registerItem("topaz_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_LEGGINGS = ITEMS.registerItem("topaz_leggings", (properties) -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_BOOTS = ITEMS.registerItem("topaz_boots", (properties) -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<ArmorItem> AMETHYST_HELMET = ITEMS.registerItem("amethyst_helmet", (properties) -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.registerItem("amethyst_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_LEGGINGS = ITEMS.registerItem("amethyst_leggings", (properties) -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_BOOTS = ITEMS.registerItem("amethyst_boots", (properties) -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<ArmorItem> QUARTZ_HELMET = ITEMS.registerItem("quartz_helmet", (properties) -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.HELMET, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_CHESTPLATE = ITEMS.registerItem("quartz_chestplate", (properties) -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_LEGGINGS = ITEMS.registerItem("quartz_leggings", (properties) -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.LEGGINGS, properties.stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_BOOTS = ITEMS.registerItem("quartz_boots", (properties) -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.BOOTS, properties.stacksTo(1)));

    public static final DeferredItem<Item> RUBY_HORSE_ARMOR = ITEMS.registerItem("ruby_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));
    public static final DeferredItem<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.registerItem("sapphire_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));
    public static final DeferredItem<Item> EMERALD_HORSE_ARMOR = ITEMS.registerItem("emerald_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));
    public static final DeferredItem<Item> TOPAZ_HORSE_ARMOR = ITEMS.registerItem("topaz_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));
    public static final DeferredItem<Item> AMETHYST_HORSE_ARMOR = ITEMS.registerItem("amethyst_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));
    public static final DeferredItem<Item> QUARTZ_HORSE_ARMOR = ITEMS.registerItem("quartz_horse_armor", (properties) -> new AnimalArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, properties.stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
