package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, GemsAndCrystals.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* Gems */
        itemModels.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ.get(), ModelTemplates.FLAT_ITEM);

        /* Ruby Tools */
        itemModels.generateFlatItem(ModItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Sapphire Tools */
        itemModels.generateFlatItem(ModItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Emerald Tools */
        itemModels.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Topaz Tools */
        itemModels.generateFlatItem(ModItems.TOPAZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Amethyst Tools */
        itemModels.generateFlatItem(ModItems.AMETHYST_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Quartz Tools */
        itemModels.generateFlatItem(ModItems.QUARTZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* Ruby Armor */
        itemModels.generateTrimmableItem(ModItems.RUBY_HELMET.get(), ModArmorMaterials.RUBY, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"), false);
        itemModels.generateTrimmableItem(ModItems.RUBY_CHESTPLATE.get(), ModArmorMaterials.RUBY, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"), false);
        itemModels.generateTrimmableItem(ModItems.RUBY_LEGGINGS.get(), ModArmorMaterials.RUBY, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"), false);
        itemModels.generateTrimmableItem(ModItems.RUBY_BOOTS.get(), ModArmorMaterials.RUBY, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"), false);

        /* Sapphire Armor */
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_HELMET.get(), ModArmorMaterials.SAPPHIRE, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"), false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_CHESTPLATE.get(), ModArmorMaterials.SAPPHIRE, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"), false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_LEGGINGS.get(), ModArmorMaterials.SAPPHIRE, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"), false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_BOOTS.get(), ModArmorMaterials.SAPPHIRE, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"), false);

        /* Emerald Armor */
        itemModels.generateTrimmableItem(ModItems.EMERALD_HELMET.get(), ModArmorMaterials.EMERALD, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"), false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_CHESTPLATE.get(), ModArmorMaterials.EMERALD, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"), false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_LEGGINGS.get(), ModArmorMaterials.EMERALD, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"), false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_BOOTS.get(), ModArmorMaterials.EMERALD, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"), false);

        /* Topaz Armor */
        itemModels.generateTrimmableItem(ModItems.TOPAZ_HELMET.get(), ModArmorMaterials.TOPAZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"), false);
        itemModels.generateTrimmableItem(ModItems.TOPAZ_CHESTPLATE.get(), ModArmorMaterials.TOPAZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"), false);
        itemModels.generateTrimmableItem(ModItems.TOPAZ_LEGGINGS.get(), ModArmorMaterials.TOPAZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"), false);
        itemModels.generateTrimmableItem(ModItems.TOPAZ_BOOTS.get(), ModArmorMaterials.TOPAZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"), false);

        /* Amethyst Armor */
        itemModels.generateTrimmableItem(ModItems.AMETHYST_HELMET.get(), ModArmorMaterials.AMETHYST, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"), false);
        itemModels.generateTrimmableItem(ModItems.AMETHYST_CHESTPLATE.get(), ModArmorMaterials.AMETHYST, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"), false);
        itemModels.generateTrimmableItem(ModItems.AMETHYST_LEGGINGS.get(), ModArmorMaterials.AMETHYST, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"), false);
        itemModels.generateTrimmableItem(ModItems.AMETHYST_BOOTS.get(), ModArmorMaterials.AMETHYST, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"), false);

        /* Quartz Armor */
        itemModels.generateTrimmableItem(ModItems.QUARTZ_HELMET.get(), ModArmorMaterials.QUARTZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"), false);
        itemModels.generateTrimmableItem(ModItems.QUARTZ_CHESTPLATE.get(), ModArmorMaterials.QUARTZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"), false);
        itemModels.generateTrimmableItem(ModItems.QUARTZ_LEGGINGS.get(), ModArmorMaterials.QUARTZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"), false);
        itemModels.generateTrimmableItem(ModItems.QUARTZ_BOOTS.get(), ModArmorMaterials.QUARTZ, ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"), false);

        /* Horse Armor */
        itemModels.generateFlatItem(ModItems.RUBY_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);


        /*** BLOCKS ***/
        blockModels.createTrivialCube(ModBlocks.RUBY_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TOPAZ_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.TOPAZ_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AMETHYST_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
        blockModels.createTrivialCube(ModBlocks.QUARTZ_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());

    }

}
