package com.coliwogg.gemsandcrystals.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModTiers {
    public static final Tier RUBY = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1796,
            8.5f,
            4f,
            16,
            () -> Ingredient.of(ModItems.RUBY.get())
    );

    public static final Tier SAPPHIRE = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1796,
            8.5f,
            4f,
            16,
            () -> Ingredient.of(ModItems.SAPPHIRE.get())
    );

    public static final Tier EMERALD = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1451,
            7.5f,
            3f,
            14,
            () -> Ingredient.of(Items.EMERALD)
    );

    public static final Tier TOPAZ = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1061,
            6.5f,
            2f,
            14,
            () -> Ingredient.of(ModItems.TOPAZ.get())
    );

    public static final Tier AMETHYST = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            871,
            6f,
            2f,
            13,
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    );

    public static final Tier QUARTZ = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            671,
            4f,
            1f,
            12,
            () -> Ingredient.of(Items.QUARTZ)
    );
}
