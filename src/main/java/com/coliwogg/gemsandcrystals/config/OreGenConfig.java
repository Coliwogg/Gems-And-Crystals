package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
	public static ForgeConfigSpec.BooleanValue generate_ruby;
	public static ForgeConfigSpec.BooleanValue generate_sapphire;
	public static ForgeConfigSpec.BooleanValue generate_topaz;
	public static ForgeConfigSpec.BooleanValue generate_amethyst;
	public static ForgeConfigSpec.BooleanValue generate_quartz;

	public static ForgeConfigSpec.IntValue ruby_size;
	public static ForgeConfigSpec.IntValue sapphire_size;
	public static ForgeConfigSpec.IntValue topaz_size;
	public static ForgeConfigSpec.IntValue amethyst_size;
	public static ForgeConfigSpec.IntValue quartz_size;

	public static ForgeConfigSpec.IntValue ruby_chance;
	public static ForgeConfigSpec.IntValue sapphire_chance;
	public static ForgeConfigSpec.IntValue topaz_chance;
	public static ForgeConfigSpec.IntValue amethyst_chance;
	public static ForgeConfigSpec.IntValue quartz_chance;

	public static ForgeConfigSpec.IntValue ruby_min_height;
	public static ForgeConfigSpec.IntValue sapphire_min_height;
	public static ForgeConfigSpec.IntValue topaz_min_height;
	public static ForgeConfigSpec.IntValue amethyst_min_height;
	public static ForgeConfigSpec.IntValue quartz_min_height;

	public static ForgeConfigSpec.IntValue ruby_max_height;
	public static ForgeConfigSpec.IntValue sapphire_max_height;
	public static ForgeConfigSpec.IntValue topaz_max_height;
	public static ForgeConfigSpec.IntValue amethyst_max_height;
	public static ForgeConfigSpec.IntValue quartz_max_height;


	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {
		server.comment("Ruby Ore Generation");

		generate_ruby = server
				.comment("Generate Ruby Ore in the overworld - [true/false]")
				.define("ruby_ore.generate_ruby", true);
		ruby_size = server
				.comment("Size of Ruby Ore veins - default = 4")
				.defineInRange("ruby_ore.ruby_size", 4, 0, 100);
		ruby_chance = server
				.comment("Number of Ruby Ore veins generated in a chunk - default = 2")
				.defineInRange("ruby_ore.ruby_chance", 2, 0, 100);
		ruby_min_height = server
				.comment("Minimum height for Ruby Ore generation - default = 4")
				.defineInRange("ruby_ore.ruby_min_height", 4, 0, 255);
		ruby_max_height = server
				.comment("Maximum height for Ruby Ore generation - default = 14")
				.defineInRange("ruby_ore.ruby_max_height", 14, 0, 255);

		server.comment("Sapphire Ore Generation");

		generate_sapphire = server
				.comment("Generate Sapphire Ore in the overworld - [true/false]")
				.define("sapphire_ore.generate_sapphire", true);
		sapphire_size = server
				.comment("Size of Sapphire Ore veins - default = 4")
				.defineInRange("sapphire_ore.sapphire_size", 4, 0, 100);
		sapphire_chance = server
				.comment("Number of Sapphire Ore veins generated in a chunk - default = 2")
				.defineInRange("sapphire_ore.sapphire_chance", 2, 0, 100);
		sapphire_min_height = server
				.comment("Minimum height for Sapphire Ore generation - default = 4")
				.defineInRange("sapphire_ore.sapphire_min_height", 4, 0, 255);
		sapphire_max_height = server
				.comment("Maximum height for Sapphire Ore generation - default = 14")
				.defineInRange("sapphire_ore.sapphire_max_height", 14, 0, 255);

		server.comment("Topaz Ore Generation");

		generate_topaz = server
				.comment("Generate Topaz Ore in the overworld - [true/false]")
				.define("topaz_ore.generate_topaz", true);
		topaz_size = server
				.comment("Size of Topaz Ore veins - default = 5")
				.defineInRange("topaz_ore.topaz_size", 5, 0, 100);
		topaz_chance = server
				.comment("Number of Topaz Ore veins generated in a chunk - default = 3")
				.defineInRange("topaz_ore.topaz_chance", 3, 0, 100);
		topaz_min_height = server
				.comment("Minimum height for Topaz Ore generation - default = 4")
				.defineInRange("topaz_ore.topaz_min_height", 4, 0, 255);
		topaz_max_height = server
				.comment("Maximum height for Topaz Ore generation - default = 28")
				.defineInRange("topaz_ore.topaz_max_height", 28, 0, 255);

		server.comment("Amethyst Ore Generation");

		generate_amethyst = server
				.comment("Generate Amethyst Ore in the overworld - [true/false]")
				.define("amethyst_ore.generate_amethyst", true);
		amethyst_size = server
				.comment("Size of Amethyst Ore veins - default = 6")
				.defineInRange("amethyst_ore.amethyst_size", 6, 0, 100);
		amethyst_chance = server
				.comment("Number of Amethyst Ore veins generated in a chunk - default = 4")
				.defineInRange("amethyst_ore.amethyst_chance", 4, 0, 100);
		amethyst_min_height = server
				.comment("Minimum height for Amethyst Ore generation - default = 4")
				.defineInRange("amethyst_ore.amethyst_min_height", 4, 0, 255);
		amethyst_max_height = server
				.comment("Maximum height for Amethyst Ore generation - default = 32")
				.defineInRange("amethyst_ore.amethyst_max_height", 32, 0, 255);

		server.comment("Quartz Ore Generation");

		generate_quartz = server
				.comment("Generate Quartz Ore in the overworld - [true/false]")
				.define("quartz_ore.generate_quartz", false);
		quartz_size = server
				.comment("Size of Quartz Ore veins - default = 8")
				.defineInRange("quartz_ore.quartz_size", 8, 0, 100);
		quartz_chance = server
				.comment("Number of Quartz Ore veins generated in a chunk - default = 6")
				.defineInRange("quartz_ore.quartz_chance", 6, 0, 100);
		quartz_min_height = server
				.comment("Minimum height for Quartz Ore generation - default = 4")
				.defineInRange("quartz_ore.quartz_min_height", 4, 0, 255);
		quartz_max_height = server
				.comment("Maximum height for Quartz Ore generation - default = 40")
				.defineInRange("quartz_ore.quartz_max_height", 40, 0, 255);
	}
}
