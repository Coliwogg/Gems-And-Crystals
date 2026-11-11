package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;

import java.util.Map;

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
        itemModels.generateSpear(ModItems.RUBY_SPEAR.get());

        /* Sapphire Tools */
        itemModels.generateFlatItem(ModItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.SAPPHIRE_SPEAR.get());

        /* Emerald Tools */
        itemModels.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.EMERALD_SPEAR.get());

        /* Topaz Tools */
        itemModels.generateFlatItem(ModItems.TOPAZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.TOPAZ_SPEAR.get());

        /* Amethyst Tools */
        itemModels.generateFlatItem(ModItems.AMETHYST_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.AMETHYST_SPEAR.get());

        /* Quartz Tools */
        itemModels.generateFlatItem(ModItems.QUARTZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.QUARTZ_SPEAR.get());

        /* Ruby Armor */
        itemModels.generateTrimmableArmorSet(ModItems.RUBY_HELMET.get(), ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY_BOOTS.get(), false, Map.of());

        /* Sapphire Armor */
        itemModels.generateTrimmableArmorSet(ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE_BOOTS.get(), false, Map.of());

        /* Emerald Armor */
        itemModels.generateTrimmableArmorSet(ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get(), false, Map.of());

        /* Topaz Armor */
        itemModels.generateTrimmableArmorSet(ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ_BOOTS.get(), false, Map.of());

        /* Amethyst Armor */
        itemModels.generateTrimmableArmorSet(ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get(), false, Map.of());

        /* Quartz Armor */
        itemModels.generateTrimmableArmorSet(ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get(), false, Map.of());

        /* Horse Armor */
        itemModels.generateFlatItem(ModItems.RUBY_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TOPAZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AMETHYST_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTZ_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);

        itemModels.declareCustomModelItem(ModBlocks.QUARTZ_CLUSTER.get().asItem());
        itemModels.declareCustomModelItem(ModBlocks.LARGE_QUARTZ_BUD.get().asItem());
        itemModels.declareCustomModelItem(ModBlocks.MEDIUM_QUARTZ_BUD.get().asItem());
        itemModels.declareCustomModelItem(ModBlocks.SMALL_QUARTZ_BUD.get().asItem());

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
        blockModels.createTrivialCube(ModBlocks.BUDDING_QUARTZ.get());

        createQuartzCluster(blockModels, ModBlocks.SMALL_QUARTZ_BUD.get());
        createQuartzCluster(blockModels, ModBlocks.MEDIUM_QUARTZ_BUD.get());
        createQuartzCluster(blockModels, ModBlocks.LARGE_QUARTZ_BUD.get());
        createQuartzCluster(blockModels, ModBlocks.QUARTZ_CLUSTER.get());
    }

    private void createQuartzCluster(BlockModelGenerators blockModels, Block block) {
        MultiVariant multiVariant = BlockModelGenerators.plainVariant(
                ModelTemplates.CROSS
                        .extend()
                        .build()
                        .create(block, TextureMapping.cross(block), blockModels.modelOutput)
        );
        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(block, multiVariant)
                        .with(BlockModelGenerators.ROTATIONS_COLUMN_WITH_FACING)
        );
    }
}
