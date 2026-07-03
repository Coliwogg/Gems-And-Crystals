package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    ImmutableList<ItemLike> RUBY_SMELTABLES = ImmutableList.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    ImmutableList<ItemLike> SAPPHIRE_SMELTABLES = ImmutableList.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    ImmutableList<ItemLike> TOPAZ_SMELTABLES = ImmutableList.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
    ImmutableList<ItemLike> AMETHYST_SMELTABLES = ImmutableList.of(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE);
    ImmutableList<ItemLike> QUARTZ_SMELTABLES = ImmutableList.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE);

    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Gems and Crystals Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        oreSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBY.get(), 1.0f, 100, "ruby");
        oreSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");
        oreSmelting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreBlasting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ.get(), 1.0f, 100, "topaz");
        oreSmelting(AMETHYST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 200, "amethyst");
        oreBlasting(AMETHYST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 100, "amethyst");
        oreSmelting(QUARTZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz");
        oreBlasting(QUARTZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz");

        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ.get(), RecipeCategory.MISC, ModBlocks.TOPAZ_BLOCK.get());

        axeBuilder(output, ModItems.AMETHYST_AXE.get(), Items.AMETHYST_SHARD, "amethyst");
        axeBuilder(output, ModItems.EMERALD_AXE.get(), Items.EMERALD, "emerald");
        axeBuilder(output, ModItems.QUARTZ_AXE.get(), Items.QUARTZ, "quartz");
        axeBuilder(output, ModItems.RUBY_AXE.get(), ModItems.RUBY.get(), "ruby");
        axeBuilder(output, ModItems.SAPPHIRE_AXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        axeBuilder(output, ModItems.TOPAZ_AXE.get(), ModItems.TOPAZ.get(), "topaz");

        hoeBuilder(output, ModItems.AMETHYST_HOE.get(), Items.AMETHYST_SHARD, "amethyst");
        hoeBuilder(output, ModItems.EMERALD_HOE.get(), Items.EMERALD, "emerald");
        hoeBuilder(output, ModItems.QUARTZ_HOE.get(), Items.QUARTZ, "quartz");
        hoeBuilder(output, ModItems.RUBY_HOE.get(), ModItems.RUBY.get(), "ruby");
        hoeBuilder(output, ModItems.SAPPHIRE_HOE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        hoeBuilder(output, ModItems.TOPAZ_HOE.get(), ModItems.TOPAZ.get(), "topaz");

        pickaxeBuilder(output, ModItems.AMETHYST_PICKAXE.get(), Items.AMETHYST_SHARD, "amethyst");
        pickaxeBuilder(output, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD, "emerald");
        pickaxeBuilder(output, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ, "quartz");
        pickaxeBuilder(output, ModItems.RUBY_PICKAXE.get(), ModItems.RUBY.get(), "ruby");
        pickaxeBuilder(output, ModItems.SAPPHIRE_PICKAXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        pickaxeBuilder(output, ModItems.TOPAZ_PICKAXE.get(), ModItems.TOPAZ.get(), "topaz");

        shovelBuilder(output, ModItems.AMETHYST_SHOVEL.get(), Items.AMETHYST_SHARD, "amethyst");
        shovelBuilder(output, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD, "emerald");
        shovelBuilder(output, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ, "quartz");
        shovelBuilder(output, ModItems.RUBY_SHOVEL.get(), ModItems.RUBY.get(), "ruby");
        shovelBuilder(output, ModItems.SAPPHIRE_SHOVEL.get(), ModItems.SAPPHIRE.get(), "sapphire");
        shovelBuilder(output, ModItems.TOPAZ_SHOVEL.get(), ModItems.TOPAZ.get(), "topaz");

        swordBuilder(output, ModItems.AMETHYST_SWORD.get(), Items.AMETHYST_SHARD, "amethyst");
        swordBuilder(output, ModItems.EMERALD_SWORD.get(), Items.EMERALD, "emerald");
        swordBuilder(output, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ, "quartz");
        swordBuilder(output, ModItems.RUBY_SWORD.get(), ModItems.RUBY.get(), "ruby");
        swordBuilder(output, ModItems.SAPPHIRE_SWORD.get(), ModItems.SAPPHIRE.get(), "sapphire");
        swordBuilder(output, ModItems.TOPAZ_SWORD.get(), ModItems.TOPAZ.get(), "topaz");

        spearBuilder(output, ModItems.AMETHYST_SPEAR.get(), Items.AMETHYST_SHARD, "amethyst");
        spearBuilder(output, ModItems.EMERALD_SPEAR.get(), Items.EMERALD, "emerald");
        spearBuilder(output, ModItems.QUARTZ_SPEAR.get(), Items.QUARTZ, "quartz");
        spearBuilder(output, ModItems.RUBY_SPEAR.get(), ModItems.RUBY.get(), "ruby");
        spearBuilder(output, ModItems.SAPPHIRE_SPEAR.get(), ModItems.SAPPHIRE.get(), "sapphire");
        spearBuilder(output, ModItems.TOPAZ_SPEAR.get(), ModItems.TOPAZ.get(), "topaz");

        bootsBuilder(output, ModItems.AMETHYST_BOOTS.get(), Items.AMETHYST_SHARD, "amethyst");
        bootsBuilder(output, ModItems.EMERALD_BOOTS.get(), Items.EMERALD, "emerald");
        bootsBuilder(output, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ, "quartz");
        bootsBuilder(output, ModItems.RUBY_BOOTS.get(), ModItems.RUBY.get(), "ruby");
        bootsBuilder(output, ModItems.SAPPHIRE_BOOTS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        bootsBuilder(output, ModItems.TOPAZ_BOOTS.get(), ModItems.TOPAZ.get(), "topaz");

        chestplateBuilder(output, ModItems.AMETHYST_CHESTPLATE.get(), Items.AMETHYST_SHARD, "amethyst");
        chestplateBuilder(output, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD, "emerald");
        chestplateBuilder(output, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ, "quartz");
        chestplateBuilder(output, ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY.get(), "ruby");
        chestplateBuilder(output, ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        chestplateBuilder(output, ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ.get(), "topaz");

        helmetBuilder(output, ModItems.AMETHYST_HELMET.get(), Items.AMETHYST_SHARD, "amethyst");
        helmetBuilder(output, ModItems.EMERALD_HELMET.get(), Items.EMERALD, "emerald");
        helmetBuilder(output, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ, "quartz");
        helmetBuilder(output, ModItems.RUBY_HELMET.get(), ModItems.RUBY.get(), "ruby");
        helmetBuilder(output, ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE.get(), "sapphire");
        helmetBuilder(output, ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ.get(), "topaz");

        leggingsBuilder(output, ModItems.AMETHYST_LEGGINGS.get(), Items.AMETHYST_SHARD, "amethyst");
        leggingsBuilder(output, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD, "emerald");
        leggingsBuilder(output, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ, "quartz");
        leggingsBuilder(output, ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY.get(), "ruby");
        leggingsBuilder(output, ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        leggingsBuilder(output, ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ.get(), "topaz");

        horseArmorBuilder(output, ModItems.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD, "amethyst");
        horseArmorBuilder(output, ModItems.EMERALD_HORSE_ARMOR.get(), Items.EMERALD, "emerald");
        horseArmorBuilder(output, ModItems.QUARTZ_HORSE_ARMOR.get(), Items.QUARTZ, "quartz");
        horseArmorBuilder(output, ModItems.RUBY_HORSE_ARMOR.get(), ModItems.RUBY.get(), "ruby");
        horseArmorBuilder(output, ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModItems.SAPPHIRE.get(), "sapphire");
        horseArmorBuilder(output, ModItems.TOPAZ_HORSE_ARMOR.get(), ModItems.TOPAZ.get(), "topaz");
    }

    protected void axeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
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

    protected void hoeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
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

    protected void pickaxeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
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

    protected void shovelBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
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

    protected void swordBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
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

    protected void spearBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK)
                .pattern("  #")
                .pattern(" | ")
                .pattern("|  ")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected void horseArmorBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('X', Items.LEATHER_HORSE_ARMOR)
                .pattern("# #")
                .pattern("###")
                .pattern("#X#")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected void helmetBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected void chestplateBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected void leggingsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    protected void bootsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                .group(itemName)
                .save(finishedRecipe);
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, GemsAndCrystals.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
