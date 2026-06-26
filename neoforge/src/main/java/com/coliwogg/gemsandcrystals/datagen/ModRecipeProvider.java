package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
    private static final List<ItemLike> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE.get(), ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
    private static final List<ItemLike> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE.get(), ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
    private static final List<ItemLike> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE.get(), ModBlocks.DEEPSLATE_QUARTZ_ORE.get());

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        oreSmelting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreBlasting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 1.0f, 100, "ruby");
        oreSmelting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreBlasting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");
        oreSmelting(recipeOutput, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreBlasting(recipeOutput, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ.get(), 1.0f, 100, "topaz");
        oreSmelting(recipeOutput, AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 200, "amethyst");
        oreBlasting(recipeOutput, AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 100, "amethyst");
        oreSmelting(recipeOutput, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz");
        oreBlasting(recipeOutput, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz");

        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ.get(), RecipeCategory.MISC, ModBlocks.TOPAZ_BLOCK.get());

        axeBuilder(recipeOutput, ModItems.AMETHYST_AXE.get(), Items.AMETHYST_SHARD, "amethyst");
        axeBuilder(recipeOutput, ModItems.EMERALD_AXE.get(), Items.EMERALD, "emerald");
        axeBuilder(recipeOutput, ModItems.QUARTZ_AXE.get(), Items.QUARTZ, "quartz");
        axeBuilder(recipeOutput, ModItems.RUBY_AXE.get(), ModItems.RUBY.get(), "ruby");
        axeBuilder(recipeOutput, ModItems.SAPPHIRE_AXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        axeBuilder(recipeOutput, ModItems.TOPAZ_AXE.get(), ModItems.TOPAZ.get(), "topaz");

        hoeBuilder(recipeOutput, ModItems.AMETHYST_HOE.get(), Items.AMETHYST_SHARD, "amethyst");
        hoeBuilder(recipeOutput, ModItems.EMERALD_HOE.get(), Items.EMERALD, "emerald");
        hoeBuilder(recipeOutput, ModItems.QUARTZ_HOE.get(), Items.QUARTZ, "quartz");
        hoeBuilder(recipeOutput, ModItems.RUBY_HOE.get(), ModItems.RUBY.get(), "ruby");
        hoeBuilder(recipeOutput, ModItems.SAPPHIRE_HOE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        hoeBuilder(recipeOutput, ModItems.TOPAZ_HOE.get(), ModItems.TOPAZ.get(), "topaz");

        pickaxeBuilder(recipeOutput, ModItems.AMETHYST_PICKAXE.get(), Items.AMETHYST_SHARD, "amethyst");
        pickaxeBuilder(recipeOutput, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD, "emerald");
        pickaxeBuilder(recipeOutput, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ, "quartz");
        pickaxeBuilder(recipeOutput, ModItems.RUBY_PICKAXE.get(), ModItems.RUBY.get(), "ruby");
        pickaxeBuilder(recipeOutput, ModItems.SAPPHIRE_PICKAXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        pickaxeBuilder(recipeOutput, ModItems.TOPAZ_PICKAXE.get(), ModItems.TOPAZ.get(), "topaz");

        shovelBuilder(recipeOutput, ModItems.AMETHYST_SHOVEL.get(), Items.AMETHYST_SHARD, "amethyst");
        shovelBuilder(recipeOutput, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD, "emerald");
        shovelBuilder(recipeOutput, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ, "quartz");
        shovelBuilder(recipeOutput, ModItems.RUBY_SHOVEL.get(), ModItems.RUBY.get(), "ruby");
        shovelBuilder(recipeOutput, ModItems.SAPPHIRE_SHOVEL.get(), ModItems.SAPPHIRE.get(), "sapphire");
        shovelBuilder(recipeOutput, ModItems.TOPAZ_SHOVEL.get(), ModItems.TOPAZ.get(), "topaz");

        swordBuilder(recipeOutput, ModItems.AMETHYST_SWORD.get(), Items.AMETHYST_SHARD, "amethyst");
        swordBuilder(recipeOutput, ModItems.EMERALD_SWORD.get(), Items.EMERALD, "emerald");
        swordBuilder(recipeOutput, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ, "quartz");
        swordBuilder(recipeOutput, ModItems.RUBY_SWORD.get(), ModItems.RUBY.get(), "ruby");
        swordBuilder(recipeOutput, ModItems.SAPPHIRE_SWORD.get(), ModItems.SAPPHIRE.get(), "sapphire");
        swordBuilder(recipeOutput, ModItems.TOPAZ_SWORD.get(), ModItems.TOPAZ.get(), "topaz");

        bootsBuilder(recipeOutput, ModItems.AMETHYST_BOOTS.get(), Items.AMETHYST_SHARD, "amethyst");
        bootsBuilder(recipeOutput, ModItems.EMERALD_BOOTS.get(), Items.EMERALD, "emerald");
        bootsBuilder(recipeOutput, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ, "quartz");
        bootsBuilder(recipeOutput, ModItems.RUBY_BOOTS.get(), ModItems.RUBY.get(), "ruby");
        bootsBuilder(recipeOutput, ModItems.SAPPHIRE_BOOTS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        bootsBuilder(recipeOutput, ModItems.TOPAZ_BOOTS.get(), ModItems.TOPAZ.get(), "topaz");

        chestplateBuilder(recipeOutput, ModItems.AMETHYST_CHESTPLATE.get(), Items.AMETHYST_SHARD, "amethyst");
        chestplateBuilder(recipeOutput, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD, "emerald");
        chestplateBuilder(recipeOutput, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ, "quartz");
        chestplateBuilder(recipeOutput, ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY.get(), "ruby");
        chestplateBuilder(recipeOutput, ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        chestplateBuilder(recipeOutput, ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ.get(), "topaz");

        helmetBuilder(recipeOutput, ModItems.AMETHYST_HELMET.get(), Items.AMETHYST_SHARD, "amethyst");
        helmetBuilder(recipeOutput, ModItems.EMERALD_HELMET.get(), Items.EMERALD, "emerald");
        helmetBuilder(recipeOutput, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ, "quartz");
        helmetBuilder(recipeOutput, ModItems.RUBY_HELMET.get(), ModItems.RUBY.get(), "ruby");
        helmetBuilder(recipeOutput, ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE.get(), "sapphire");
        helmetBuilder(recipeOutput, ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ.get(), "topaz");

        leggingsBuilder(recipeOutput, ModItems.AMETHYST_LEGGINGS.get(), Items.AMETHYST_SHARD, "amethyst");
        leggingsBuilder(recipeOutput, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD, "emerald");
        leggingsBuilder(recipeOutput, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ, "quartz");
        leggingsBuilder(recipeOutput, ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY.get(), "ruby");
        leggingsBuilder(recipeOutput, ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        leggingsBuilder(recipeOutput, ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ.get(), "topaz");

        horseArmorBuilder(recipeOutput, ModItems.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD, "amethyst");
        horseArmorBuilder(recipeOutput, ModItems.EMERALD_HORSE_ARMOR.get(), Items.EMERALD, "emerald");
        horseArmorBuilder(recipeOutput, ModItems.QUARTZ_HORSE_ARMOR.get(), Items.QUARTZ, "quartz");
        horseArmorBuilder(recipeOutput, ModItems.RUBY_HORSE_ARMOR.get(), ModItems.RUBY.get(), "ruby");
        horseArmorBuilder(recipeOutput, ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModItems.SAPPHIRE.get(), "sapphire");
        horseArmorBuilder(recipeOutput, ModItems.TOPAZ_HORSE_ARMOR.get(), ModItems.TOPAZ.get(), "topaz");

    }

    protected static void axeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void hoeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void pickaxeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void shovelBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void swordBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void horseArmorBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('X', Items.LEATHER_HORSE_ARMOR)
                .pattern("# #")
                .pattern("###")
                .pattern("#X#")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.LEATHER_HORSE_ARMOR), has(Items.LEATHER_HORSE_ARMOR))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void helmetBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void chestplateBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void leggingsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected static void bootsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

}
