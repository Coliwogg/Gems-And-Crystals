package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.Constants;
import com.coliwogg.gemsandcrystals.platform.Services;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItems {

    public static final Supplier<Item> RUBY = Services.REGISTRY.registerItem("ruby", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE = Services.REGISTRY.registerItem("sapphire", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> TOPAZ = Services.REGISTRY.registerItem("topaz", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> RUBY_SWORD = Services.REGISTRY.registerItem("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 3, -2.4F))));
    public static final Supplier<Item> RUBY_SHOVEL = Services.REGISTRY.registerItem("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 1.5F, -3.0F))));
    public static final Supplier<Item> RUBY_PICKAXE = Services.REGISTRY.registerItem("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY,1, -2.8F))));
    public static final Supplier<Item> RUBY_AXE = Services.REGISTRY.registerItem("ruby_axe", () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 5, -3))));
    public static final Supplier<Item> RUBY_HOE = Services.REGISTRY.registerItem("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.RUBY, -4, 0))));

    public static final Supplier<Item> SAPPHIRE_SWORD = Services.REGISTRY.registerItem("sapphire_sword", () -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SAPPHIRE, 3, -2.4F))));
    public static final Supplier<Item> SAPPHIRE_SHOVEL = Services.REGISTRY.registerItem("sapphire_shovel", () -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SAPPHIRE, 1.5F, -3.0F))));
    public static final Supplier<Item> SAPPHIRE_PICKAXE = Services.REGISTRY.registerItem("sapphire_pickaxe", () -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SAPPHIRE,1, -2.8F))));
    public static final Supplier<Item> SAPPHIRE_AXE = Services.REGISTRY.registerItem("sapphire_axe", () -> new AxeItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SAPPHIRE, 5, -3))));
    public static final Supplier<Item> SAPPHIRE_HOE = Services.REGISTRY.registerItem("sapphire_hoe", () -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SAPPHIRE, -4, 0))));

    public static final Supplier<Item> EMERALD_SWORD = Services.REGISTRY.registerItem("emerald_sword", () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4F))));
    public static final Supplier<Item> EMERALD_SHOVEL = Services.REGISTRY.registerItem("emerald_shovel", () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 1.5F, -3.0F))));
    public static final Supplier<Item> EMERALD_PICKAXE = Services.REGISTRY.registerItem("emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD,1, -2.8F))));
    public static final Supplier<Item> EMERALD_AXE = Services.REGISTRY.registerItem("emerald_axe", () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 5, -3))));
    public static final Supplier<Item> EMERALD_HOE = Services.REGISTRY.registerItem("emerald_hoe", () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, -3, 0))));

    public static final Supplier<Item> TOPAZ_SWORD = Services.REGISTRY.registerItem("topaz_sword", () -> new SwordItem(ModToolTiers.TOPAZ, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TOPAZ, 3, -2.4F))));
    public static final Supplier<Item> TOPAZ_SHOVEL = Services.REGISTRY.registerItem("topaz_shovel", () -> new ShovelItem(ModToolTiers.TOPAZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TOPAZ, 2.0F, -3.0F))));
    public static final Supplier<Item> TOPAZ_PICKAXE = Services.REGISTRY.registerItem("topaz_pickaxe", () -> new PickaxeItem(ModToolTiers.TOPAZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TOPAZ,1, -2.8F))));
    public static final Supplier<Item> TOPAZ_AXE = Services.REGISTRY.registerItem("topaz_axe", () -> new AxeItem(ModToolTiers.TOPAZ, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TOPAZ, 6, -3.1F))));
    public static final Supplier<Item> TOPAZ_HOE = Services.REGISTRY.registerItem("topaz_hoe", () -> new HoeItem(ModToolTiers.TOPAZ, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TOPAZ, -2, -1))));

    public static final Supplier<Item> AMETHYST_SWORD = Services.REGISTRY.registerItem("amethyst_sword", () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 2, -2.4F))));
    public static final Supplier<Item> AMETHYST_SHOVEL = Services.REGISTRY.registerItem("amethyst_shovel", () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, 1.5F, -3.0F))));
    public static final Supplier<Item> AMETHYST_PICKAXE = Services.REGISTRY.registerItem("amethyst_pickaxe", () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST,1, -2.8F))));
    public static final Supplier<Item> AMETHYST_AXE = Services.REGISTRY.registerItem("amethyst_axe", () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, 5, -3.1F))));
    public static final Supplier<Item> AMETHYST_HOE = Services.REGISTRY.registerItem("amethyst_hoe", () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.AMETHYST, -2, -1))));

    public static final Supplier<Item> QUARTZ_SWORD = Services.REGISTRY.registerItem("quartz_sword", () -> new SwordItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.QUARTZ, 3, -2.4F))));
    public static final Supplier<Item> QUARTZ_SHOVEL = Services.REGISTRY.registerItem("quartz_shovel", () -> new ShovelItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.QUARTZ, 2.0F, -3.0F))));
    public static final Supplier<Item> QUARTZ_PICKAXE = Services.REGISTRY.registerItem("quartz_pickaxe", () -> new PickaxeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.QUARTZ,1, -2.8F))));
    public static final Supplier<Item> QUARTZ_AXE = Services.REGISTRY.registerItem("quartz_axe", () -> new AxeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.QUARTZ, 6, -3.2F))));
    public static final Supplier<Item> QUARTZ_HOE = Services.REGISTRY.registerItem("quartz_hoe", () -> new HoeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.QUARTZ, -1, -2))));
    
    public static final Supplier<Item> RUBY_HELMET = Services.REGISTRY.registerItem("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final Supplier<Item> RUBY_CHESTPLATE = Services.REGISTRY.registerItem("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final Supplier<Item> RUBY_LEGGINGS = Services.REGISTRY.registerItem("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final Supplier<Item> RUBY_BOOTS = Services.REGISTRY.registerItem("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final Supplier<Item> SAPPHIRE_HELMET = Services.REGISTRY.registerItem("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final Supplier<Item> SAPPHIRE_CHESTPLATE = Services.REGISTRY.registerItem("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final Supplier<Item> SAPPHIRE_LEGGINGS = Services.REGISTRY.registerItem("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final Supplier<Item> SAPPHIRE_BOOTS = Services.REGISTRY.registerItem("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));

    public static final Supplier<Item> EMERALD_HELMET = Services.REGISTRY.registerItem("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16))));
    public static final Supplier<Item> EMERALD_CHESTPLATE = Services.REGISTRY.registerItem("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16))));
    public static final Supplier<Item> EMERALD_LEGGINGS = Services.REGISTRY.registerItem("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16))));
    public static final Supplier<Item> EMERALD_BOOTS = Services.REGISTRY.registerItem("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));

    public static final Supplier<Item> TOPAZ_HELMET = Services.REGISTRY.registerItem("topaz_helmet", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(14))));
    public static final Supplier<Item> TOPAZ_CHESTPLATE = Services.REGISTRY.registerItem("topaz_chestplate", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(14))));
    public static final Supplier<Item> TOPAZ_LEGGINGS = Services.REGISTRY.registerItem("topaz_leggings", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(14))));
    public static final Supplier<Item> TOPAZ_BOOTS = Services.REGISTRY.registerItem("topaz_boots", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(14))));

    public static final Supplier<Item> AMETHYST_HELMET = Services.REGISTRY.registerItem("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
    public static final Supplier<Item> AMETHYST_CHESTPLATE = Services.REGISTRY.registerItem("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
    public static final Supplier<Item> AMETHYST_LEGGINGS = Services.REGISTRY.registerItem("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
    public static final Supplier<Item> AMETHYST_BOOTS = Services.REGISTRY.registerItem("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));

    public static final Supplier<Item> QUARTZ_HELMET = Services.REGISTRY.registerItem("quartz_helmet", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))));
    public static final Supplier<Item> QUARTZ_CHESTPLATE = Services.REGISTRY.registerItem("quartz_chestplate", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
    public static final Supplier<Item> QUARTZ_LEGGINGS = Services.REGISTRY.registerItem("quartz_leggings", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
    public static final Supplier<Item> QUARTZ_BOOTS = Services.REGISTRY.registerItem("quartz_boots", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))));

    public static final Supplier<Item> RUBY_HORSE_ARMOR = Services.REGISTRY.registerItem("ruby_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.RUBY, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> SAPPHIRE_HORSE_ARMOR = Services.REGISTRY.registerItem("sapphire_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.SAPPHIRE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> EMERALD_HORSE_ARMOR = Services.REGISTRY.registerItem("emerald_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.EMERALD, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> TOPAZ_HORSE_ARMOR = Services.REGISTRY.registerItem("topaz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.TOPAZ, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> AMETHYST_HORSE_ARMOR = Services.REGISTRY.registerItem("amethyst_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.AMETHYST, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> QUARTZ_HORSE_ARMOR = Services.REGISTRY.registerItem("quartz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.QUARTZ, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static void registerModItems() {
        Constants.LOG.info("Registering Mod Items for " + Constants.MOD_ID);
    }

}
