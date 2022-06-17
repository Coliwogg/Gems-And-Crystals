package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.config.GemsAndCrystalsCommonConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(
            GemsAndCrystalsCommonConfigs.RUBY_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.RUBY_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.RUBY_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.RUBY_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.RUBY_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get())
    );
    public static final ForgeTier SAPPHIRE = new ForgeTier(
            GemsAndCrystalsCommonConfigs.SAPPHIRE_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.SAPPHIRE_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.SAPPHIRE_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.SAPPHIRE_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.SAPPHIRE_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get())
    );
    public static final ForgeTier EMERALD = new ForgeTier(
            GemsAndCrystalsCommonConfigs.EMERALD_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.EMERALD_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.EMERALD_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.EMERALD_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.EMERALD_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD)
    );
    public static final ForgeTier TOPAZ = new ForgeTier(
            GemsAndCrystalsCommonConfigs.TOPAZ_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.TOPAZ_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.TOPAZ_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.TOPAZ_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.TOPAZ_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ.get())
    );
    public static final ForgeTier AMETHYST = new ForgeTier(
            GemsAndCrystalsCommonConfigs.AMETHYST_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.AMETHYST_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.AMETHYST_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.AMETHYST_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.AMETHYST_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD)
    );
    public static final ForgeTier QUARTZ = new ForgeTier(
            GemsAndCrystalsCommonConfigs.QUARTZ_TOOLS_LEVEL.get(),
            GemsAndCrystalsCommonConfigs.QUARTZ_TOOLS_USES.get(),
            GemsAndCrystalsCommonConfigs.QUARTZ_TOOLS_SPEED.get(),
            GemsAndCrystalsCommonConfigs.QUARTZ_TOOLS_ATTACK_DAMAGE_BONUS.get(),
            GemsAndCrystalsCommonConfigs.QUARTZ_TOOLS_ENCHANTMENT_VALUE.get(),
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.QUARTZ)
    );
}
