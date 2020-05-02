package com.coliwogg.gemsmod;

import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.init.RecipeInit;
import com.coliwogg.gemsmod.proxy.CommonProxy;
import com.coliwogg.gemsmod.util.Reference;
import com.coliwogg.gemsmod.util.compat.OreDictionaryCompat;
import com.coliwogg.gemsmod.util.handlers.ConfigHandler;
import com.coliwogg.gemsmod.world.OreGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class GemsandCrystals {
	
	public static File config;
	
	@Instance
	public static GemsandCrystals instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new OreGeneration(), 3);
		ConfigHandler.registerConfig(event);
	} 
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RecipeInit.init();
		OreDictionaryCompat.registerOres();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}

	public static final CreativeTabs GemsandCrystalsTab = (new CreativeTabs("GemsandCrystalsTab") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.RUBY);
		}
	});
}
