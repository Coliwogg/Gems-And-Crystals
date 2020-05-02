package com.coliwogg.gemsmod.init;

import com.coliwogg.gemsmod.objects.blocks.ModBlock;
import com.coliwogg.gemsmod.objects.blocks.ModOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<>();

	public static final Block RUBY_BLOCK = new ModBlock("ruby_block", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new ModBlock("sapphire_block", Material.IRON);
	public static final Block TOPAZ_BLOCK = new ModBlock("topaz_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new ModBlock("amethyst_block", Material.IRON);
	public static final Block RUBY_ORE = new ModOre("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new ModOre("sapphire_ore", Material.ROCK);
	public static final Block TOPAZ_ORE = new ModOre("topaz_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new ModOre("amethyst_ore", Material.ROCK);
	public static final Block QUARTZ_ORE = new ModOre("quartz_ore", Material.ROCK);
}
