package com.coliwogg.gemsandcrystals.config;

import java.io.File;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
	private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SERVER_CONFIG;
	
	private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CLIENT_CONFIG;
	
	static {
		OreGenConfig.init(SERVER_BUILDER, CLIENT_BUILDER);
		
		SERVER_CONFIG = SERVER_BUILDER.build();
		CLIENT_CONFIG = CLIENT_BUILDER.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path) {
		GemsAndCrystals.LOGGER.info("Loading config: "  + path);
		final CommentedFileConfig FILE = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		GemsAndCrystals.LOGGER.info("Built config: " + path);
		FILE.load();
		GemsAndCrystals.LOGGER.info("Loaded config: " + path);
		config.setConfig(FILE);
	}
}
