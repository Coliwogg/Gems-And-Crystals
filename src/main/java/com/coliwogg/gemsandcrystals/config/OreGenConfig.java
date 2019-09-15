package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
	public static ForgeConfigSpec.IntValue ruby_chance;
	public static ForgeConfigSpec.IntValue sapphire_chance;
	public static ForgeConfigSpec.IntValue topaz_chance;
	public static ForgeConfigSpec.IntValue amethyst_chance;
	public static ForgeConfigSpec.IntValue quartz_chance;
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {
		server.comment("OreGen Config");
		
		ruby_chance = server
				.comment("Maximum number of ore veins of ruby ore that can spawn in one chunk.")
				.defineInRange("oregen.ruby_chance", 7, 6, 9);
		sapphire_chance = server
				.comment("Maximum number of ore veins of sapphire ore that can spawn in one chunk.")
				.defineInRange("oregen.sapphire_chance", 7, 6, 9);
		topaz_chance = server
				.comment("Maximum number of ore veins of topaz ore that can spawn in one chunk.")
				.defineInRange("oregen.topaz_chance", 7, 8, 10);
		amethyst_chance = server
				.comment("Maximum number of ore veins of amethyst ore that can spawn in one chunk.")
				.defineInRange("oregen.amethyst_chance",  9, 7, 10);
		quartz_chance = server
				.comment("Maximum number of ore veins of quartz ore that can spawn in one chunk.")
				.defineInRange("oregen.quartz_chance", 11, 9, 13);
		generate_overworld = server
				.comment("Decide if you want Gems And Crystals ores to spawn in the overworld")
				.define("oregen.generate_overworld", true);
	}
}