package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
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
            3F,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD)
    );
    public static final ForgeTier TOPAZ = new ForgeTier(
           2,
            1061,
           6.5F,
            3F,
           14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ.get())
    );
    public static final ForgeTier AMETHYST = new ForgeTier(
            2,
            871,
            6F,
            2F,
            13,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    );
    public static final ForgeTier QUARTZ = new ForgeTier(
            2,
            661,
            4F,
            1F,
            12,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.QUARTZ)
    );
}
