package com.coliwogg.gemsmod.util.handlers;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ConfigHandler {
	public static Configuration config;

	public static boolean rubyOreGeneration = true;
	public static boolean sapphireOreGeneration = true;
	public static boolean topazOreGeneration = true;
	public static boolean amethystOreGeneration = true;
	public static boolean quartzOreGeneration = false;

	public static void init(File file) {
		config = new Configuration(file);
		String category;

		category = "Ore Generation";
		config.addCustomCategoryComment(category, "Enable/Disable ore generation in the overworld.");
		rubyOreGeneration = config.getBoolean("Ruby Ore Generation", category, true, "Decide if you want Ruby Ore to generate in the overworld.");
		sapphireOreGeneration = config.getBoolean("Sapphire Ore Generation", category, true, "Decide if you want Sapphire Ore to generate in the overworld.");
		topazOreGeneration = config.getBoolean("Topaz Ore Generation", category, true, "Decide if you want Topaz Ore to generate in the overworld.");
		amethystOreGeneration = config.getBoolean("Amethyst Ore Generation", category, true, "Decide if you want Amethyst Ore to generate in the overworld.");
		quartzOreGeneration = config.getBoolean("Quartz Ore Generation", category, false, "Decide if you want Quartz Ore to generate in the overworld.");

		config.save();
	}

	public static void registerConfig(FMLPreInitializationEvent event) {
		GemsandCrystals.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		GemsandCrystals.config.mkdirs();
		init(new File(GemsandCrystals.config.getParent(), Reference.MODID + ".cfg"));
	}
}
