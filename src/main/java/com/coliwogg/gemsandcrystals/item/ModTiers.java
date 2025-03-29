package com.coliwogg.gemsandcrystals.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier RUBY = new ForgeTier(
            1796,
            3,
            8.5F,
            16,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier SAPPHIRE = new ForgeTier(
            1796,
            3,
            8.5F,
            16,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier EMERALD = new ForgeTier(
            1451,
            3,
            7.5F,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier TOPAZ = new ForgeTier(
            1061,
            2,
            6.5F,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier AMETHYST = new ForgeTier(
            871,
            2,
            6.0F,
            13,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier QUARTZ = new ForgeTier(
            671,
            2,
            4.0F,
            12,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.QUARTZ),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
}
