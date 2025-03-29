package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemsAndCrystals.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.RUBY, 3, -2.4F))));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.RUBY, 1.5F, -3.0F))));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.RUBY,1, -2.8F))));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModTiers.RUBY, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.RUBY, 5, -3))));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.RUBY, -4, 0))));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.SAPPHIRE, 3, -2.4F))));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.SAPPHIRE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.SAPPHIRE,1, -2.8F))));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.SAPPHIRE, 5, -3))));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModTiers.SAPPHIRE, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.SAPPHIRE, -4, 0))));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.EMERALD, 3, -2.4F))));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.EMERALD, 1.5F, -3.0F))));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.EMERALD,1, -2.8F))));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.EMERALD, 5, -3))));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.EMERALD, -3, 0))));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModTiers.TOPAZ, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.TOPAZ, 3, -2.4F))));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModTiers.TOPAZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.TOPAZ, 2.0F, -3.0F))));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModTiers.TOPAZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.TOPAZ,1, -2.8F))));
    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModTiers.TOPAZ, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.TOPAZ, 6, -3.1F))));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModTiers.TOPAZ, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.TOPAZ, -2, -1))));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.AMETHYST, 2, -2.4F))));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.AMETHYST, 1.5F, -3.0F))));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.AMETHYST,1, -2.8F))));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.AMETHYST, 5, -3.1F))));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.AMETHYST, -2, -1))));
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModTiers.QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.QUARTZ, 3, -2.4F))));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModTiers.QUARTZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.QUARTZ, 2.0F, -3.0F))));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModTiers.QUARTZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.QUARTZ,1, -2.8F))));
    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModTiers.QUARTZ, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.QUARTZ, 6, -3.2F))));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModTiers.QUARTZ, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.QUARTZ, -1, -2))));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16))));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16))));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16))));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));
    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(14))));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(14))));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(14))));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(14))));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));
    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))));
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.RUBY, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.SAPPHIRE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.EMERALD, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.TOPAZ, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.AMETHYST, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> QUARTZ_HORSE_ARMOR = ITEMS.register("quartz_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.QUARTZ, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
