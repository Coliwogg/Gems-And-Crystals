package com.coliwogg.gemsandcrystals.init;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.GemsandCrystals.GemsandCrystalsItemGroup;
import com.coliwogg.gemsandcrystals.objects.blocks.ModOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(GemsandCrystals.MOD_ID)
@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
	public static final Block RUBY_ORE = null;
	public static final Block RUBY_BLOCK = null;
	public static final Block SAPPHIRE_ORE = null;
	public static final Block SAPPHIRE_BLOCK = null;
	public static final Block AMETHYST_ORE = null;
	public static final Block AMETHYST_BLOCK = null;
	public static final Block TOPAZ_ORE = null;
	public static final Block TOPAZ_BLOCK = null;
	public static final Block QUARTZ_ORE = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("ruby_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("sapphire_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("amethyst_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("topaz_block"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("ruby_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("sapphire_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("amethyst_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("topaz_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("quartz_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(RUBY_ORE, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_ore"));
		event.getRegistry().register(new BlockItem(RUBY_BLOCK, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_block"));
		event.getRegistry().register(new BlockItem(SAPPHIRE_ORE, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_ore"));
		event.getRegistry().register(new BlockItem(SAPPHIRE_BLOCK, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_block"));
		event.getRegistry().register(new BlockItem(AMETHYST_ORE, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_ore"));
		event.getRegistry().register(new BlockItem(AMETHYST_BLOCK, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_block"));
		event.getRegistry().register(new BlockItem(TOPAZ_ORE, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_ore"));
		event.getRegistry().register(new BlockItem(TOPAZ_BLOCK, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_block"));
		event.getRegistry().register(new BlockItem(QUARTZ_ORE, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_ore"));
	}
}
