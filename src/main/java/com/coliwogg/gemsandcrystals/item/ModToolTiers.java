package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolTiers {
    // RUBY: High durability, solid damage, heavy
    public static final ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2500, 8.0F, 4.5F, 10, ModTags.Items.RUBY_REPAIRABLE);
    
    // SAPPHIRE: Incredible enchantment capability, highly reliable
    public static final ToolMaterial SAPPHIRE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1600, 9.0F, 3.5F, 25, ModTags.Items.SAPPHIRE_REPAIRABLE);
    
    // EMERALD: Average stats, but usually paired with luck-based attributes/looting
    public static final ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1200, 7.5F, 3.0F, 18, ModTags.Items.EMERALD_REPAIRABLE);
    
    // TOPAZ: The Berserker. High damage tier, lower durability
    public static final ToolMaterial TOPAZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 700, 8.0F, 5.0F, 12, ModTags.Items.TOPAZ_REPAIRABLE);
    
    // AMETHYST: The Laser. Blazing fast mining speed, but wears out quickly
    public static final ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 14.0F, 2.0F, 15, ModTags.Items.AMETHYST_REPAIRABLE);
    
    // QUARTZ: Glass Cannon. Super low duraility, but hits hard for an early game item
    public static final ToolMaterial QUARTZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 150, 11.0F, 4.0F, 8, ModTags.Items.QUARTZ_REPAIRABLE);
}
