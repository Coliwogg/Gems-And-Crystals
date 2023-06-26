package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreBlasting(consumer, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 100, "ruby");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 100, "ruby");

        oreSmelting(consumer, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreBlasting(consumer, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");

        oreSmelting(consumer, List.of(ModBlocks.TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreBlasting(consumer, List.of(ModBlocks.TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 100, "topaz");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 100, "topaz");

        oreSmelting(consumer, List.of(ModBlocks.AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 200, "amethyst");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 200, "amethyst");
        oreBlasting(consumer, List.of(ModBlocks.AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 100, "amethyst");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 100, "amethyst");

        oreSmelting(consumer, List.of(ModBlocks.QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 200, "quartz");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 200, "quartz");
        oreBlasting(consumer, List.of(ModBlocks.QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 100, "quartz");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 100, "quartz");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(),
                RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(),
                RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ.get(),
                RecipeCategory.MISC, ModBlocks.TOPAZ_BLOCK.get());

        axeBuilder(consumer, ModItems.AMETHYST_AXE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        axeBuilder(consumer, ModItems.EMERALD_AXE.get(), Items.EMERALD.asItem(), "emerald");
        axeBuilder(consumer, ModItems.QUARTZ_AXE.get(), Items.QUARTZ.asItem(), "quartz");
        axeBuilder(consumer, ModItems.RUBY_AXE.get(), ModItems.RUBY.get(), "ruby");
        axeBuilder(consumer, ModItems.SAPPHIRE_AXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        axeBuilder(consumer, ModItems.TOPAZ_AXE.get(), ModItems.TOPAZ.get(), "topaz");

        hoeBuilder(consumer, ModItems.AMETHYST_HOE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        hoeBuilder(consumer, ModItems.EMERALD_HOE.get(), Items.EMERALD.asItem(), "emerald");
        hoeBuilder(consumer, ModItems.QUARTZ_HOE.get(), Items.QUARTZ.asItem(), "quartz");
        hoeBuilder(consumer, ModItems.RUBY_HOE.get(), ModItems.RUBY.get(), "ruby");
        hoeBuilder(consumer, ModItems.SAPPHIRE_HOE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        hoeBuilder(consumer, ModItems.TOPAZ_HOE.get(), ModItems.TOPAZ.get(), "topaz");

        pickaxeBuilder(consumer, ModItems.AMETHYST_PICKAXE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        pickaxeBuilder(consumer, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD.asItem(), "emerald");
        pickaxeBuilder(consumer, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ.asItem(), "quartz");
        pickaxeBuilder(consumer, ModItems.RUBY_PICKAXE.get(), ModItems.RUBY.get(), "ruby");
        pickaxeBuilder(consumer, ModItems.SAPPHIRE_PICKAXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        pickaxeBuilder(consumer, ModItems.TOPAZ_PICKAXE.get(), ModItems.TOPAZ.get(), "topaz");

        shovelBuilder(consumer, ModItems.AMETHYST_SHOVEL.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        shovelBuilder(consumer, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD.asItem(), "emerald");
        shovelBuilder(consumer, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ.asItem(), "quartz");
        shovelBuilder(consumer, ModItems.RUBY_SHOVEL.get(), ModItems.RUBY.get(), "ruby");
        shovelBuilder(consumer, ModItems.SAPPHIRE_SHOVEL.get(), ModItems.SAPPHIRE.get(), "sapphire");
        shovelBuilder(consumer, ModItems.TOPAZ_SHOVEL.get(), ModItems.TOPAZ.get(), "topaz");

        swordBuilder(consumer, ModItems.AMETHYST_SWORD.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        swordBuilder(consumer, ModItems.EMERALD_SWORD.get(), Items.EMERALD.asItem(), "emerald");
        swordBuilder(consumer, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ.asItem(), "quartz");
        swordBuilder(consumer, ModItems.RUBY_SWORD.get(), ModItems.RUBY.get(), "ruby");
        swordBuilder(consumer, ModItems.SAPPHIRE_SWORD.get(), ModItems.SAPPHIRE.get(), "sapphire");
        swordBuilder(consumer, ModItems.TOPAZ_SWORD.get(), ModItems.TOPAZ.get(), "topaz");
        
        bootsBuilder(consumer, ModItems.AMETHYST_BOOTS.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        bootsBuilder(consumer, ModItems.EMERALD_BOOTS.get(), Items.EMERALD.asItem(), "emerald");
        bootsBuilder(consumer, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ.asItem(), "quartz");
        bootsBuilder(consumer, ModItems.RUBY_BOOTS.get(), ModItems.RUBY.get(), "ruby");
        bootsBuilder(consumer, ModItems.SAPPHIRE_BOOTS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        bootsBuilder(consumer, ModItems.TOPAZ_BOOTS.get(), ModItems.TOPAZ.get(), "topaz");

        chestplateBuilder(consumer, ModItems.AMETHYST_CHESTPLATE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        chestplateBuilder(consumer, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD.asItem(), "emerald");
        chestplateBuilder(consumer, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ.asItem(), "quartz");
        chestplateBuilder(consumer, ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY.get(), "ruby");
        chestplateBuilder(consumer, ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        chestplateBuilder(consumer, ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ.get(), "topaz");

        helmetBuilder(consumer, ModItems.AMETHYST_HELMET.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        helmetBuilder(consumer, ModItems.EMERALD_HELMET.get(), Items.EMERALD.asItem(), "emerald");
        helmetBuilder(consumer, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ.asItem(), "quartz");
        helmetBuilder(consumer, ModItems.RUBY_HELMET.get(), ModItems.RUBY.get(), "ruby");
        helmetBuilder(consumer, ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE.get(), "sapphire");
        helmetBuilder(consumer, ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ.get(), "topaz");

        leggingsBuilder(consumer, ModItems.AMETHYST_LEGGINGS.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        leggingsBuilder(consumer, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD.asItem(), "emerald");
        leggingsBuilder(consumer, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ.asItem(), "quartz");
        leggingsBuilder(consumer, ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY.get(), "ruby");
        leggingsBuilder(consumer, ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        leggingsBuilder(consumer, ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ.get(), "topaz");

        horseArmorBuilder(consumer, ModItems.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        horseArmorBuilder(consumer, ModItems.EMERALD_HORSE_ARMOR.get(), Items.EMERALD.asItem(), "emerald");
        horseArmorBuilder(consumer, ModItems.QUARTZ_HORSE_ARMOR.get(), Items.QUARTZ.asItem(), "quartz");
        horseArmorBuilder(consumer, ModItems.RUBY_HORSE_ARMOR.get(), ModItems.RUBY.get(), "ruby");
        horseArmorBuilder(consumer, ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModItems.SAPPHIRE.get(), "sapphire");
        horseArmorBuilder(consumer, ModItems.TOPAZ_HORSE_ARMOR.get(), ModItems.TOPAZ.get(), "topaz");
    }

    protected static void axeBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void hoeBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void pickaxeBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void shovelBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void swordBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void horseArmorBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('X', Items.LEATHER_HORSE_ARMOR.asItem())
                .pattern("# #")
                .pattern("###")
                .pattern("#X#")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void helmetBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void chestplateBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void leggingsBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }

    protected static void bootsBuilder(Consumer<FinishedRecipe> finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_" + itemName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ingredientItem).build()))
                .save(finishedRecipe);
    }



    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_, RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_, String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_)).save(p_250423_, new ResourceLocation(GemsAndCrystals.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_).unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(GemsAndCrystals.MOD_ID, p_250475_));
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(GemsAndCrystals.MOD_ID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }
}
