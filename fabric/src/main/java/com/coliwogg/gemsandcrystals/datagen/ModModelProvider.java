package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.AMETHYST_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.QUARTZ_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

        /* Gems */
        itemModelGenerators.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ.get(), ModelTemplates.FLAT_ITEM);

        /* Ruby Tools */
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Sapphire Tools */
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Emerald Tools */
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Topaz Tools */
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Amethyst Tools */
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Quartz Tools */
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Ruby Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUBY_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUBY_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUBY_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUBY_BOOTS.get());

        /* Sapphire Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.SAPPHIRE_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.SAPPHIRE_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.SAPPHIRE_BOOTS.get());

        /* Emerald Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.EMERALD_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.EMERALD_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.EMERALD_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.EMERALD_BOOTS.get());

        /* Topaz Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.TOPAZ_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.TOPAZ_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.TOPAZ_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.TOPAZ_BOOTS.get());

        /* Amethyst Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.AMETHYST_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.AMETHYST_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.AMETHYST_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.AMETHYST_BOOTS.get());

        /* Quartz Armor */
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.QUARTZ_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.QUARTZ_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.QUARTZ_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.QUARTZ_BOOTS.get());

        /* Horse Armor */
        itemModelGenerators.generateFlatItem(ModItems.RUBY_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
    }
}
