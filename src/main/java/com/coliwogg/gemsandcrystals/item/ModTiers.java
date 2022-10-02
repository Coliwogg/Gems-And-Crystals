package com.coliwogg.gemsandcrystals.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(
            3,
            1761,
            8.5F,
            4.0F,
            16,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get())
    );
    public static final ForgeTier SAPPHIRE = new ForgeTier(
            3,
            1761,
            8.5F,
            4.0F,
            16,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get())
    );
    public static final ForgeTier EMERALD = new ForgeTier(
            3,
            1451,
            7.5F,
            3.0F,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD)
    );
    public static final ForgeTier TOPAZ = new ForgeTier(
            2,
            1061,
            6.5F,
            2.5F,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ.get())
    );
    public static final ForgeTier AMETHYST = new ForgeTier(
            2,
            871,
            6.0F,
            2.0F,
            13,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    );
    public static final ForgeTier QUARTZ = new ForgeTier(
            2,
            671,
            4.0F,
            1.5F,
            12,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.QUARTZ)
    );
}
