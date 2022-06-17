package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemsAndCrystals.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModTiers.RUBY, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, -4, 0.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModTiers.SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModTiers.SAPPHIRE, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModTiers.SAPPHIRE, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModTiers.SAPPHIRE, -4, 0.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, 5.0F, -2.9F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, -3, 0.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModTiers.TOPAZ, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModTiers.TOPAZ, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModTiers.TOPAZ, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModTiers.TOPAZ, 5.5F, -3.03F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModTiers.TOPAZ, -2,-0.5F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, 5.5F, -3.07F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, -1, 0.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModTiers.QUARTZ, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModTiers.QUARTZ, 1.5F, -3F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModTiers.QUARTZ, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModTiers.QUARTZ, 6.0F, -3.15F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModTiers.QUARTZ, -2, -1.0F, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new HorseArmorItem(13, "ruby", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new HorseArmorItem(13, "sapphire", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new HorseArmorItem(12, "emerald", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new HorseArmorItem(9, "topaz", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new HorseArmorItem(8, "amethyst", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));
    public static final RegistryObject<Item> QUARTZ_HORSE_ARMOR = ITEMS.register("quartz_horse_armor", () -> new HorseArmorItem(6, "quartz", new Item.Properties().tab(ModCreativeModeTab.GEMSANDCRYSTALS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
