package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolTiers {
    public static final ToolMaterial RUBY = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1796,
            8.5f,
            4f,
            16,
            ModTags.Items.RUBY_REPAIRABLE);

    public static final ToolMaterial SAPPHIRE = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1796,
            8.5f,
            4f,
            16,
            ModTags.Items.SAPPHIRE_REPAIRABLE);

    public static final ToolMaterial EMERALD = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1451,
            7.5f,
            3f,
            14,
            ModTags.Items.EMERALD_REPAIRABLE);

    public static final ToolMaterial TOPAZ = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1061,
            6.5f,
            2f,
            14,
            ModTags.Items.TOPAZ_REPAIRABLE);

    public static final ToolMaterial AMETHYST = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            871,
            6f,
            2f,
            13,
            ModTags.Items.AMETHYST_REPAIRABLE);

    public static final ToolMaterial QUARTZ = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            671,
            4f,
            1f,
            12,
            ModTags.Items.QUARTZ_REPAIRABLE);
}
