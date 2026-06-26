package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class ModCreativeModeTabs {

    public static CreativeModeTab GEMS_AND_CRYSTALS_TAB = null;

    public static void addItemsToIngredients(Consumer<Item> itemAdder) {
        itemAdder.accept(ModItems.RUBY.get());
        itemAdder.accept(ModItems.SAPPHIRE.get());
        itemAdder.accept(ModItems.TOPAZ.get());
    }

    public static void addItemsToToolsAndUtilities(Consumer<Item> itemAdder) {
        itemAdder.accept(ModItems.RUBY_SHOVEL.get());
        itemAdder.accept(ModItems.RUBY_PICKAXE.get());
        itemAdder.accept(ModItems.RUBY_AXE.get());
        itemAdder.accept(ModItems.RUBY_HOE.get());
        itemAdder.accept(ModItems.SAPPHIRE_SHOVEL.get());
        itemAdder.accept(ModItems.SAPPHIRE_PICKAXE.get());
        itemAdder.accept(ModItems.SAPPHIRE_AXE.get());
        itemAdder.accept(ModItems.SAPPHIRE_HOE.get());
        itemAdder.accept(ModItems.EMERALD_SHOVEL.get());
        itemAdder.accept(ModItems.EMERALD_PICKAXE.get());
        itemAdder.accept(ModItems.EMERALD_AXE.get());
        itemAdder.accept(ModItems.EMERALD_HOE.get());
        itemAdder.accept(ModItems.TOPAZ_SHOVEL.get());
        itemAdder.accept(ModItems.TOPAZ_PICKAXE.get());
        itemAdder.accept(ModItems.TOPAZ_AXE.get());
        itemAdder.accept(ModItems.TOPAZ_HOE.get());
        itemAdder.accept(ModItems.AMETHYST_SHOVEL.get());
        itemAdder.accept(ModItems.AMETHYST_PICKAXE.get());
        itemAdder.accept(ModItems.AMETHYST_AXE.get());
        itemAdder.accept(ModItems.AMETHYST_HOE.get());
        itemAdder.accept(ModItems.QUARTZ_SHOVEL.get());
        itemAdder.accept(ModItems.QUARTZ_PICKAXE.get());
        itemAdder.accept(ModItems.QUARTZ_AXE.get());
        itemAdder.accept(ModItems.QUARTZ_HOE.get());
    }

    public static void addItemsToCombat(Consumer<Item> itemAdder) {
        itemAdder.accept(ModItems.RUBY_SWORD.get());
        itemAdder.accept(ModItems.SAPPHIRE_SWORD.get());
        itemAdder.accept(ModItems.EMERALD_SWORD.get());
        itemAdder.accept(ModItems.TOPAZ_SWORD.get());
        itemAdder.accept(ModItems.AMETHYST_SWORD.get());
        itemAdder.accept(ModItems.QUARTZ_SWORD.get());
        itemAdder.accept(ModItems.RUBY_AXE.get());
        itemAdder.accept(ModItems.SAPPHIRE_AXE.get());
        itemAdder.accept(ModItems.EMERALD_AXE.get());
        itemAdder.accept(ModItems.TOPAZ_AXE.get());
        itemAdder.accept(ModItems.AMETHYST_AXE.get());
        itemAdder.accept(ModItems.QUARTZ_AXE.get());
        itemAdder.accept(ModItems.RUBY_HELMET.get());
        itemAdder.accept(ModItems.RUBY_CHESTPLATE.get());
        itemAdder.accept(ModItems.RUBY_LEGGINGS.get());
        itemAdder.accept(ModItems.RUBY_BOOTS.get());
        itemAdder.accept(ModItems.SAPPHIRE_HELMET.get());
        itemAdder.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
        itemAdder.accept(ModItems.SAPPHIRE_LEGGINGS.get());
        itemAdder.accept(ModItems.SAPPHIRE_BOOTS.get());
        itemAdder.accept(ModItems.EMERALD_HELMET.get());
        itemAdder.accept(ModItems.EMERALD_CHESTPLATE.get());
        itemAdder.accept(ModItems.EMERALD_LEGGINGS.get());
        itemAdder.accept(ModItems.EMERALD_BOOTS.get());
        itemAdder.accept(ModItems.TOPAZ_HELMET.get());
        itemAdder.accept(ModItems.TOPAZ_CHESTPLATE.get());
        itemAdder.accept(ModItems.TOPAZ_LEGGINGS.get());
        itemAdder.accept(ModItems.TOPAZ_BOOTS.get());
        itemAdder.accept(ModItems.AMETHYST_HELMET.get());
        itemAdder.accept(ModItems.AMETHYST_CHESTPLATE.get());
        itemAdder.accept(ModItems.AMETHYST_LEGGINGS.get());
        itemAdder.accept(ModItems.AMETHYST_BOOTS.get());
        itemAdder.accept(ModItems.QUARTZ_HELMET.get());
        itemAdder.accept(ModItems.QUARTZ_CHESTPLATE.get());
        itemAdder.accept(ModItems.QUARTZ_LEGGINGS.get());
        itemAdder.accept(ModItems.QUARTZ_BOOTS.get());
        itemAdder.accept(ModItems.RUBY_HORSE_ARMOR.get());
        itemAdder.accept(ModItems.SAPPHIRE_HORSE_ARMOR.get());
        itemAdder.accept(ModItems.EMERALD_HORSE_ARMOR.get());
        itemAdder.accept(ModItems.TOPAZ_HORSE_ARMOR.get());
        itemAdder.accept(ModItems.AMETHYST_HORSE_ARMOR.get());
        itemAdder.accept(ModItems.QUARTZ_HORSE_ARMOR.get());
    }


    public static void addBlocksToBuildingBlocks(Consumer<Block> blockAdder) {
        blockAdder.accept(ModBlocks.RUBY_BLOCK.get());
        blockAdder.accept(ModBlocks.SAPPHIRE_BLOCK.get());
        blockAdder.accept(ModBlocks.TOPAZ_BLOCK.get());
    }

    public static void addBlocksToNaturalBlocks(Consumer<Block> blockAdder) {
        blockAdder.accept(ModBlocks.RUBY_ORE.get());
        blockAdder.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockAdder.accept(ModBlocks.SAPPHIRE_ORE.get());
        blockAdder.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockAdder.accept(ModBlocks.TOPAZ_ORE.get());
        blockAdder.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockAdder.accept(ModBlocks.AMETHYST_ORE.get());
        blockAdder.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
        blockAdder.accept(ModBlocks.QUARTZ_ORE.get());
        blockAdder.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());
    }

    public static void register() {
        GEMS_AND_CRYSTALS_TAB = Services.REGISTRY.tabBuilder()
                .title(Component.translatable("creativemodetab.gemsandcrystals_tab"))
                .icon(() -> new ItemStack(ModItems.RUBY.get()))
                .displayItems((params, output) -> {
                    output.accept(ModItems.RUBY.get());
                    output.accept(ModItems.SAPPHIRE.get());
                    output.accept(ModItems.TOPAZ.get());

                    output.accept(ModItems.RUBY_SWORD.get());
                    output.accept(ModItems.RUBY_SHOVEL.get());
                    output.accept(ModItems.RUBY_PICKAXE.get());
                    output.accept(ModItems.RUBY_AXE.get());
                    output.accept(ModItems.RUBY_HOE.get());

                    output.accept(ModItems.SAPPHIRE_SWORD.get());
                    output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                    output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                    output.accept(ModItems.SAPPHIRE_AXE.get());
                    output.accept(ModItems.SAPPHIRE_HOE.get());

                    output.accept(ModItems.EMERALD_SWORD.get());
                    output.accept(ModItems.EMERALD_SHOVEL.get());
                    output.accept(ModItems.EMERALD_PICKAXE.get());
                    output.accept(ModItems.EMERALD_AXE.get());
                    output.accept(ModItems.EMERALD_HOE.get());

                    output.accept(ModItems.TOPAZ_SWORD.get());
                    output.accept(ModItems.TOPAZ_SHOVEL.get());
                    output.accept(ModItems.TOPAZ_PICKAXE.get());
                    output.accept(ModItems.TOPAZ_AXE.get());
                    output.accept(ModItems.TOPAZ_HOE.get());

                    output.accept(ModItems.AMETHYST_SWORD.get());
                    output.accept(ModItems.AMETHYST_SHOVEL.get());
                    output.accept(ModItems.AMETHYST_PICKAXE.get());
                    output.accept(ModItems.AMETHYST_AXE.get());
                    output.accept(ModItems.AMETHYST_HOE.get());

                    output.accept(ModItems.QUARTZ_SWORD.get());
                    output.accept(ModItems.QUARTZ_SHOVEL.get());
                    output.accept(ModItems.QUARTZ_PICKAXE.get());
                    output.accept(ModItems.QUARTZ_AXE.get());
                    output.accept(ModItems.QUARTZ_HOE.get());

                    output.accept(ModItems.RUBY_HELMET.get());
                    output.accept(ModItems.RUBY_CHESTPLATE.get());
                    output.accept(ModItems.RUBY_LEGGINGS.get());
                    output.accept(ModItems.RUBY_BOOTS.get());

                    output.accept(ModItems.SAPPHIRE_HELMET.get());
                    output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                    output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                    output.accept(ModItems.SAPPHIRE_BOOTS.get());

                    output.accept(ModItems.EMERALD_HELMET.get());
                    output.accept(ModItems.EMERALD_CHESTPLATE.get());
                    output.accept(ModItems.EMERALD_LEGGINGS.get());
                    output.accept(ModItems.EMERALD_BOOTS.get());

                    output.accept(ModItems.TOPAZ_HELMET.get());
                    output.accept(ModItems.TOPAZ_CHESTPLATE.get());
                    output.accept(ModItems.TOPAZ_LEGGINGS.get());
                    output.accept(ModItems.TOPAZ_BOOTS.get());

                    output.accept(ModItems.AMETHYST_HELMET.get());
                    output.accept(ModItems.AMETHYST_CHESTPLATE.get());
                    output.accept(ModItems.AMETHYST_LEGGINGS.get());
                    output.accept(ModItems.AMETHYST_BOOTS.get());

                    output.accept(ModItems.QUARTZ_HELMET.get());
                    output.accept(ModItems.QUARTZ_CHESTPLATE.get());
                    output.accept(ModItems.QUARTZ_LEGGINGS.get());
                    output.accept(ModItems.QUARTZ_BOOTS.get());

                    output.accept(ModItems.RUBY_HORSE_ARMOR.get());
                    output.accept(ModItems.SAPPHIRE_HORSE_ARMOR.get());
                    output.accept(ModItems.EMERALD_HORSE_ARMOR.get());
                    output.accept(ModItems.TOPAZ_HORSE_ARMOR.get());
                    output.accept(ModItems.AMETHYST_HORSE_ARMOR.get());
                    output.accept(ModItems.QUARTZ_HORSE_ARMOR.get());

                    output.accept(ModBlocks.RUBY_BLOCK.get());
                    output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    output.accept(ModBlocks.TOPAZ_BLOCK.get());

                    output.accept(ModBlocks.RUBY_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());

                    output.accept(ModBlocks.SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

                    output.accept(ModBlocks.TOPAZ_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());

                    output.accept(ModBlocks.AMETHYST_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());

                    output.accept(ModBlocks.QUARTZ_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());

                }).build();

        Services.REGISTRY.registerCreativeTab("gemsandcrystals_tab", () -> GEMS_AND_CRYSTALS_TAB);
    }

}
