package com.coliwogg.gemsandcrystals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.coliwogg.gemsandcrystals.blocks.AmethystOre;
import com.coliwogg.gemsandcrystals.blocks.QuartzOre;
import com.coliwogg.gemsandcrystals.blocks.RubyOre;
import com.coliwogg.gemsandcrystals.blocks.SapphireOre;
import com.coliwogg.gemsandcrystals.blocks.TopazOre;
import com.coliwogg.gemsandcrystals.config.Config;
import com.coliwogg.gemsandcrystals.lists.ArmorMaterialList;
import com.coliwogg.gemsandcrystals.lists.BlockList;
import com.coliwogg.gemsandcrystals.lists.ItemList;
import com.coliwogg.gemsandcrystals.lists.ToolMaterialList;
import com.coliwogg.gemsandcrystals.world.gen.OreGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("gemsandcrystals")
public class GemsAndCrystals {
	public static GemsAndCrystals instance;
	public static final String MOD_ID = "gemsandcrystals";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	public static final ItemGroup gemsandcrystals = new CreativeItemGroup();
	
	public static final Block RUBY_ORE = new RubyOre();
	public static final Block SAPPHIRE_ORE = new SapphireOre();
	public static final Block TOPAZ_ORE = new TopazOre();
	public static final Block AMETHYST_ORE = new AmethystOre();
	public static final Block QUARTZ_ORE = new QuartzOre();
	
	public GemsAndCrystals() {
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		
		Config.loadConfig(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("gemsandcrystals-server.toml").toString());
		Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("gemsandcrystals-client.toml").toString());

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		LOGGER.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		LOGGER.info("clientRegistries method registered.");
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();
	        registry.register(new BlockItem(RUBY_ORE, new Item.Properties().group(gemsandcrystals)).setRegistryName(GemsAndCrystals.MOD_ID,"ruby_ore"));
	        registry.register(new BlockItem(SAPPHIRE_ORE, new Item.Properties().group(gemsandcrystals)).setRegistryName(GemsAndCrystals.MOD_ID,"sapphire_ore"));
	        registry.register(new BlockItem(TOPAZ_ORE, new Item.Properties().group(gemsandcrystals)).setRegistryName(GemsAndCrystals.MOD_ID,"topaz_ore"));
	        registry.register(new BlockItem(AMETHYST_ORE, new Item.Properties().group(gemsandcrystals)).setRegistryName(GemsAndCrystals.MOD_ID,"amethyst_ore"));
	        registry.register(new BlockItem(QUARTZ_ORE, new Item.Properties().group(gemsandcrystals)).setRegistryName(GemsAndCrystals.MOD_ID,"quartz_ore"));
	        
			event.getRegistry().registerAll(
				ItemList.ruby_block = new BlockItem(BlockList.ruby_block, new Item.Properties().group(gemsandcrystals)).setRegistryName(BlockList.ruby_block.getRegistryName()),
				ItemList.sapphire_block = new BlockItem(BlockList.sapphire_block, new Item.Properties().group(gemsandcrystals)).setRegistryName(BlockList.sapphire_block.getRegistryName()),
				ItemList.topaz_block = new BlockItem(BlockList.topaz_block, new Item.Properties().group(gemsandcrystals)).setRegistryName(BlockList.topaz_block.getRegistryName()),
				ItemList.amethyst_block = new BlockItem(BlockList.amethyst_block, new Item.Properties().group(gemsandcrystals)).setRegistryName(BlockList.amethyst_block.getRegistryName()),
				ItemList.ruby = new Item(new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby")),
				ItemList.sapphire = new Item(new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire")),
				ItemList.topaz = new Item(new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz")),
				ItemList.amethyst = new Item(new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst")),
				ItemList.ruby_sword = new SwordItem(ToolMaterialList.ruby, -2, -1.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_sword")),		
				ItemList.ruby_shovel = new ShovelItem(ToolMaterialList.ruby, -4.5f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_shovel")),				
				ItemList.ruby_pickaxe = new PickaxeItem(ToolMaterialList.ruby, -4, -2.7f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_pickaxe")),				
				ItemList.ruby_axe = new AxeItem(ToolMaterialList.ruby, -1.0f, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_axe")),		
				ItemList.ruby_hoe = new HoeItem(ToolMaterialList.ruby, 1.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_hoe")),				
				ItemList.ruby_helmet = new ArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_helmet")),
				ItemList.ruby_chestplate = new ArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_chestplate")),
				ItemList.ruby_leggings = new ArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_leggings")),
				ItemList.ruby_boots = new ArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("ruby_boots")),
				ItemList.sapphire_sword = new SwordItem(ToolMaterialList.sapphire, -2, -1.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_sword")),	
				ItemList.sapphire_shovel = new ShovelItem(ToolMaterialList.sapphire, -4.5f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_shovel")),				
				ItemList.sapphire_pickaxe = new PickaxeItem(ToolMaterialList.sapphire, -4, -2.7f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_pickaxe")),				
				ItemList.sapphire_axe = new AxeItem(ToolMaterialList.sapphire, -1.0f, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_axe")),		
				ItemList.sapphire_hoe = new HoeItem(ToolMaterialList.sapphire, 1.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_hoe")),				
				ItemList.sapphire_helmet = new ArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_helmet")),
				ItemList.sapphire_chestplate = new ArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_chestplate")),
				ItemList.sapphire_leggings = new ArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_leggings")),
				ItemList.sapphire_boots = new ArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("sapphire_boots")),
				ItemList.emerald_sword = new SwordItem(ToolMaterialList.emerald, -2, -2.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_sword")),	
				ItemList.emerald_shovel = new ShovelItem(ToolMaterialList.emerald, -4.0f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_shovel")),				
				ItemList.emerald_pickaxe = new PickaxeItem(ToolMaterialList.emerald, -4, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_pickaxe")),				
				ItemList.emerald_axe = new AxeItem(ToolMaterialList.emerald, 0.0f, -2.9f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_axe")),		
				ItemList.emerald_hoe = new HoeItem(ToolMaterialList.emerald, 0.5f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_hoe")),				
				ItemList.emerald_helmet = new ArmorItem(ArmorMaterialList.emerald, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_helmet")),
				ItemList.emerald_chestplate = new ArmorItem(ArmorMaterialList.emerald, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_chestplate")),
				ItemList.emerald_leggings = new ArmorItem(ArmorMaterialList.emerald, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_leggings")),
				ItemList.emerald_boots = new ArmorItem(ArmorMaterialList.emerald, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("emerald_boots")),
				ItemList.topaz_sword = new SwordItem(ToolMaterialList.topaz, -2, -2.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_sword")),
				ItemList.topaz_shovel = new ShovelItem(ToolMaterialList.topaz, -4.0f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_shovel")),				
				ItemList.topaz_pickaxe = new PickaxeItem(ToolMaterialList.topaz, -4, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_pickaxe")),				
				ItemList.topaz_axe = new AxeItem(ToolMaterialList.topaz, 0.0f, -2.9f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_axe")),		
				ItemList.topaz_hoe = new HoeItem(ToolMaterialList.topaz, 0.5f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_hoe")),				
				ItemList.topaz_helmet = new ArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_helmet")),
				ItemList.topaz_chestplate = new ArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_chestplate")),
				ItemList.topaz_leggings = new ArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_leggings")),
				ItemList.topaz_boots = new ArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("topaz_boots")),
				ItemList.amethyst_sword = new SwordItem(ToolMaterialList.amethyst, -2, -2.2f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_sword")),		
				ItemList.amethyst_shovel = new ShovelItem(ToolMaterialList.amethyst, -3.5f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_shovel")),				
				ItemList.amethyst_pickaxe = new PickaxeItem(ToolMaterialList.amethyst, -3, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_pickaxe")),				
				ItemList.amethyst_axe = new AxeItem(ToolMaterialList.amethyst, 1.0f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_axe")),		
				ItemList.amethyst_hoe = new HoeItem(ToolMaterialList.amethyst, 0.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_hoe")),				
				ItemList.amethyst_helmet = new ArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_helmet")),
				ItemList.amethyst_chestplate = new ArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_chestplate")),
				ItemList.amethyst_leggings = new ArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_leggings")),
				ItemList.amethyst_boots = new ArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("amethyst_boots")),
				ItemList.quartz_sword = new SwordItem(ToolMaterialList.quartz, -2, -2.4f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_sword")),		
				ItemList.quartz_shovel = new ShovelItem(ToolMaterialList.quartz, -3.5f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_shovel")),				
				ItemList.quartz_pickaxe = new PickaxeItem(ToolMaterialList.quartz, -4, -2.8f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_pickaxe")),				
				ItemList.quartz_axe = new AxeItem(ToolMaterialList.quartz, 1.0f, -3.0f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_axe")),		
				ItemList.quartz_hoe = new HoeItem(ToolMaterialList.quartz, -0.5f, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_hoe")),				
				ItemList.quartz_helmet = new ArmorItem(ArmorMaterialList.quartz, EquipmentSlotType.HEAD, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_helmet")),
				ItemList.quartz_chestplate = new ArmorItem(ArmorMaterialList.quartz, EquipmentSlotType.CHEST, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_chestplate")),
				ItemList.quartz_leggings = new ArmorItem(ArmorMaterialList.quartz, EquipmentSlotType.LEGS, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_leggings")),
				ItemList.quartz_boots = new ArmorItem(ArmorMaterialList.quartz, EquipmentSlotType.FEET, new Item.Properties().group(gemsandcrystals)).setRegistryName(location("quartz_boots"))
			);
			
			LOGGER.info("Items registered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			
			final IForgeRegistry<Block> registry = event.getRegistry();
	        registry.register(RUBY_ORE);
	        registry.register(SAPPHIRE_ORE);
	        registry.register(TOPAZ_ORE);
	        registry.register(AMETHYST_ORE);
	        registry.register(QUARTZ_ORE);
	        
			event.getRegistry().registerAll(
				BlockList.ruby_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(location("ruby_block")),
				BlockList.sapphire_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(location("sapphire_block")),
				BlockList.topaz_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(location("topaz_block")),
				BlockList.amethyst_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName(location("amethyst_block"))
			);
			
			LOGGER.info("Blocks registered");
		}
		
		private static ResourceLocation location(String name) {
			return new ResourceLocation(MOD_ID, name);
		}
	}
}
