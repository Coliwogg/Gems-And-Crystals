package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GemsAndCrystals.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties()));
    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.RUBY, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.RUBY, 1.5F, -3.0f))));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.RUBY, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModTiers.RUBY, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.RUBY, 5, -3.0f))));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.RUBY, -4, 0))));
    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.SAPPHIRE, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.SAPPHIRE, 1.5F, -3.0f))));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.SAPPHIRE, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.SAPPHIRE, 5, -3.0f))));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.SAPPHIRE, -4, 0))));
    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.EMERALD, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.EMERALD, 1.5F, -3.0f))));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.EMERALD, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.EMERALD, 5, -3.0f))));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.EMERALD, -3, 0))));
    public static final DeferredItem<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModTiers.TOPAZ, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.TOPAZ, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModTiers.TOPAZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.TOPAZ, 2, -3.0f))));
    public static final DeferredItem<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModTiers.TOPAZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.TOPAZ, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModTiers.TOPAZ, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.TOPAZ, 6, -3.1f))));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModTiers.TOPAZ, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.TOPAZ, -2, -1))));
    public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.AMETHYST, 2, -2.4f))));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.AMETHYST, 1.5F, -3.0f))));
    public static final DeferredItem<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.AMETHYST, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.AMETHYST, 5, -3.1f))));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.AMETHYST, -2, -1))));
    public static final DeferredItem<SwordItem> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModTiers.QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.QUARTZ, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModTiers.QUARTZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.QUARTZ, 2, -3.0f))));
    public static final DeferredItem<PickaxeItem> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModTiers.QUARTZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.QUARTZ, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModTiers.QUARTZ, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.QUARTZ, 6, -3.2f))));
    public static final DeferredItem<HoeItem> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModTiers.QUARTZ, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.QUARTZ, -1, -2f))));
    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(32)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(32)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(32)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(32)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(22)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(22)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(22)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_HELMET = ITEMS.register("quartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10)).stacksTo(1)));
    public static final DeferredItem<ArmorItem> QUARTZ_BOOTS = ITEMS.register("quartz_boots",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10)).stacksTo(1)));
    public static final DeferredItem<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));
    public static final DeferredItem<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));
    public static final DeferredItem<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));
    public static final DeferredItem<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));
    public static final DeferredItem<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));
    public static final DeferredItem<Item> QUARTZ_HORSE_ARMOR = ITEMS.register("quartz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, (new Item.Properties()).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
