package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "My Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        List<ItemLike> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
        List<ItemLike> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE);
        List<ItemLike> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE);


        oreSmelting(output, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreSmelting(output, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 200, "ruby");
        oreBlasting(output, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 100, "ruby");
        oreBlasting(output, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 1.0f, 100, "ruby");

        oreSmelting(output, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreSmelting(output, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 200, "sapphire");
        oreBlasting(output, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");
        oreBlasting(output, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 1.0f, 100, "sapphire");

        oreSmelting(output, List.of(ModBlocks.TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreSmelting(output, List.of(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 200, "topaz");
        oreBlasting(output, List.of(ModBlocks.TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 100, "topaz");
        oreBlasting(output, List.of(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()), RecipeCategory.MISC,
                ModItems.TOPAZ.get(), 1.0f, 100, "topaz");

        oreSmelting(output, List.of(ModBlocks.AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 200, "amethyst");
        oreSmelting(output, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 200, "amethyst");
        oreBlasting(output, List.of(ModBlocks.AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 100, "amethyst");
        oreBlasting(output, List.of(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()), RecipeCategory.MISC,
                Items.AMETHYST_SHARD.asItem(), 1.0f, 100, "amethyst");

        oreSmelting(output, List.of(ModBlocks.QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 200, "quartz");
        oreSmelting(output, List.of(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 200, "quartz");
        oreBlasting(output, List.of(ModBlocks.QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 100, "quartz");
        oreBlasting(output, List.of(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()), RecipeCategory.MISC,
                Items.QUARTZ.asItem(), 1.0f, 100, "quartz");

        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(),
                RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(),
                RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ.get(),
                RecipeCategory.MISC, ModBlocks.TOPAZ_BLOCK.get());

        axeBuilder(output, ModItems.AMETHYST_AXE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        axeBuilder(output, ModItems.EMERALD_AXE.get(), Items.EMERALD.asItem(), "emerald");
        axeBuilder(output, ModItems.QUARTZ_AXE.get(), Items.QUARTZ.asItem(), "quartz");
        axeBuilder(output, ModItems.RUBY_AXE.get(), ModItems.RUBY.get(), "ruby");
        axeBuilder(output, ModItems.SAPPHIRE_AXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        axeBuilder(output, ModItems.TOPAZ_AXE.get(), ModItems.TOPAZ.get(), "topaz");

        hoeBuilder(output, ModItems.AMETHYST_HOE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        hoeBuilder(output, ModItems.EMERALD_HOE.get(), Items.EMERALD.asItem(), "emerald");
        hoeBuilder(output, ModItems.QUARTZ_HOE.get(), Items.QUARTZ.asItem(), "quartz");
        hoeBuilder(output, ModItems.RUBY_HOE.get(), ModItems.RUBY.get(), "ruby");
        hoeBuilder(output, ModItems.SAPPHIRE_HOE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        hoeBuilder(output, ModItems.TOPAZ_HOE.get(), ModItems.TOPAZ.get(), "topaz");

        pickaxeBuilder(output, ModItems.AMETHYST_PICKAXE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        pickaxeBuilder(output, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD.asItem(), "emerald");
        pickaxeBuilder(output, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ.asItem(), "quartz");
        pickaxeBuilder(output, ModItems.RUBY_PICKAXE.get(), ModItems.RUBY.get(), "ruby");
        pickaxeBuilder(output, ModItems.SAPPHIRE_PICKAXE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        pickaxeBuilder(output, ModItems.TOPAZ_PICKAXE.get(), ModItems.TOPAZ.get(), "topaz");

        shovelBuilder(output, ModItems.AMETHYST_SHOVEL.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        shovelBuilder(output, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD.asItem(), "emerald");
        shovelBuilder(output, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ.asItem(), "quartz");
        shovelBuilder(output, ModItems.RUBY_SHOVEL.get(), ModItems.RUBY.get(), "ruby");
        shovelBuilder(output, ModItems.SAPPHIRE_SHOVEL.get(), ModItems.SAPPHIRE.get(), "sapphire");
        shovelBuilder(output, ModItems.TOPAZ_SHOVEL.get(), ModItems.TOPAZ.get(), "topaz");

        swordBuilder(output, ModItems.AMETHYST_SWORD.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        swordBuilder(output, ModItems.EMERALD_SWORD.get(), Items.EMERALD.asItem(), "emerald");
        swordBuilder(output, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ.asItem(), "quartz");
        swordBuilder(output, ModItems.RUBY_SWORD.get(), ModItems.RUBY.get(), "ruby");
        swordBuilder(output, ModItems.SAPPHIRE_SWORD.get(), ModItems.SAPPHIRE.get(), "sapphire");
        swordBuilder(output, ModItems.TOPAZ_SWORD.get(), ModItems.TOPAZ.get(), "topaz");
        
        bootsBuilder(output, ModItems.AMETHYST_BOOTS.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        bootsBuilder(output, ModItems.EMERALD_BOOTS.get(), Items.EMERALD.asItem(), "emerald");
        bootsBuilder(output, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ.asItem(), "quartz");
        bootsBuilder(output, ModItems.RUBY_BOOTS.get(), ModItems.RUBY.get(), "ruby");
        bootsBuilder(output, ModItems.SAPPHIRE_BOOTS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        bootsBuilder(output, ModItems.TOPAZ_BOOTS.get(), ModItems.TOPAZ.get(), "topaz");

        chestplateBuilder(output, ModItems.AMETHYST_CHESTPLATE.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        chestplateBuilder(output, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD.asItem(), "emerald");
        chestplateBuilder(output, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ.asItem(), "quartz");
        chestplateBuilder(output, ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY.get(), "ruby");
        chestplateBuilder(output, ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE.get(), "sapphire");
        chestplateBuilder(output, ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ.get(), "topaz");

        helmetBuilder(output, ModItems.AMETHYST_HELMET.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        helmetBuilder(output, ModItems.EMERALD_HELMET.get(), Items.EMERALD.asItem(), "emerald");
        helmetBuilder(output, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ.asItem(), "quartz");
        helmetBuilder(output, ModItems.RUBY_HELMET.get(), ModItems.RUBY.get(), "ruby");
        helmetBuilder(output, ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE.get(), "sapphire");
        helmetBuilder(output, ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ.get(), "topaz");

        leggingsBuilder(output, ModItems.AMETHYST_LEGGINGS.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        leggingsBuilder(output, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD.asItem(), "emerald");
        leggingsBuilder(output, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ.asItem(), "quartz");
        leggingsBuilder(output, ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY.get(), "ruby");
        leggingsBuilder(output, ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE.get(), "sapphire");
        leggingsBuilder(output, ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ.get(), "topaz");

        horseArmorBuilder(output, ModItems.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD.asItem(), "amethyst");
        horseArmorBuilder(output, ModItems.EMERALD_HORSE_ARMOR.get(), Items.EMERALD.asItem(), "emerald");
        horseArmorBuilder(output, ModItems.QUARTZ_HORSE_ARMOR.get(), Items.QUARTZ.asItem(), "quartz");
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
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void hoeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .unlockedBy(getHasName(ingredientItem), this.has(itemLike))
                .save(finishedRecipe);
    }

    protected void pickaxeBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void shovelBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.TOOLS, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void swordBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('|', Items.STICK.asItem())
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void horseArmorBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .define('X', Items.LEATHER_HORSE_ARMOR.asItem())
                .pattern("# #")
                .pattern("###")
                .pattern("#X#")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void helmetBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void chestplateBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void leggingsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void bootsBuilder(RecipeOutput finishedRecipe, ItemLike itemLike, ItemLike ingredientItem, String itemName) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.COMBAT, itemLike)
                .define('#', ingredientItem)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(ingredientItem), has(itemLike))
                .save(finishedRecipe);
    }

    protected void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), this.has(itemlike))
                    .save(recipeOutput, GemsAndCrystals.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
