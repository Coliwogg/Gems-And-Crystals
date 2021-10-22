package com.coliwogg.gemsandcrystals.util;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.init.BlockInit;
import com.coliwogg.gemsandcrystals.init.ItemInit;
import com.coliwogg.gemsandcrystals.objects.armor.ModArmorMaterial;
import com.coliwogg.gemsandcrystals.objects.blocks.BlockBase;
import com.coliwogg.gemsandcrystals.objects.blocks.BlockItemBase;
import com.coliwogg.gemsandcrystals.objects.blocks.OreBlockBase;
import com.coliwogg.gemsandcrystals.objects.items.ItemBase;
import com.coliwogg.gemsandcrystals.objects.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemsandCrystals.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemsandCrystals.MOD_ID);

    public static void init() {
        ItemInit.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockInit.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    /* Items */
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ItemBase::new);
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", ItemBase::new);

    /* Tools */
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5.0F, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -3, 2.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTier.SAPPHIRE, 5.0F, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTier.SAPPHIRE, -3,2.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTier.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTier.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModItemTier.EMERALD, 5.5F, -2.9F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModItemTier.EMERALD, -3,1.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModItemTier.EMERALD, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModItemTier.EMERALD, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModItemTier.EMERALD, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModItemTier.TOPAZ, 5.3F, -3.03F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModItemTier.TOPAZ, -3, -0.3F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModItemTier.TOPAZ, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModItemTier.TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModItemTier.TOPAZ, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModItemTier.AMETHYST, 5.7F, -3.07F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModItemTier.AMETHYST, -3, -0.7F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModItemTier.AMETHYST, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModItemTier.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModItemTier.AMETHYST, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModItemTier.QUARTZ, 6.5F, -3.15F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModItemTier.QUARTZ, -3, -1.5F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModItemTier.QUARTZ, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModItemTier.QUARTZ, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));;
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModItemTier.QUARTZ, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    /* Armor */
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    /* Blocks */
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", BlockBase::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", BlockBase::new);
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", BlockBase::new);
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", BlockBase::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", OreBlockBase::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", OreBlockBase::new);
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", OreBlockBase::new);
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", OreBlockBase::new);
    public static final RegistryObject<Block> QUARTZ_ORE = BLOCKS.register("quartz_ore", OreBlockBase::new);

    /* Block Items */
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = ITEMS.register("topaz_block", () -> new BlockItemBase(TOPAZ_BLOCK.get()));
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItemBase(AMETHYST_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () -> new BlockItemBase(SAPPHIRE_ORE.get()));
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = ITEMS.register("topaz_ore", () -> new BlockItemBase(TOPAZ_ORE.get()));
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ITEMS.register("amethyst_ore", () -> new BlockItemBase(AMETHYST_ORE.get()));
    public static final RegistryObject<Item> QUARTZ_ORE_ITEM = ITEMS.register("quartz_ore", () -> new BlockItemBase(QUARTZ_ORE.get()));

}
