package com.coliwogg.gemsandcrystals.item;

import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8.5f, 4.0f, 16, () -> Ingredient.of(ModItems.RUBY.get())),
    SAPPHIRE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8.5f, 4.0f, 16, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
    EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1451, 7.5f, 3.0f, 14, () -> Ingredient.of(Items.EMERALD)),
    TOPAZ(BlockTags.INCORRECT_FOR_IRON_TOOL, 1061, 6.5f, 2.0f, 14, () -> Ingredient.of(ModItems.TOPAZ.get())),
    AMETHYST(BlockTags.INCORRECT_FOR_IRON_TOOL, 871, 6.0f, 2.0f, 13, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    QUARTZ(BlockTags.INCORRECT_FOR_IRON_TOOL, 671, 4.0f, 1.0f, 12, () -> Ingredient.of(Items.QUARTZ));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
