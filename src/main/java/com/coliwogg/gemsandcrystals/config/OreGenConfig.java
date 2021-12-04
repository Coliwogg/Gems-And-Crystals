package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
    public static ForgeConfigSpec.BooleanValue generate_ruby;
    public static ForgeConfigSpec.IntValue ruby_min_vein_size;
    public static ForgeConfigSpec.IntValue ruby_max_vein_size;
    public static ForgeConfigSpec.IntValue ruby_chance;
    public static ForgeConfigSpec.IntValue ruby_min_height;
    public static ForgeConfigSpec.IntValue ruby_max_height;

    public static ForgeConfigSpec.BooleanValue generate_sapphire;
    public static ForgeConfigSpec.IntValue sapphire_min_vein_size;
    public static ForgeConfigSpec.IntValue sapphire_max_vein_size;
    public static ForgeConfigSpec.IntValue sapphire_chance;
    public static ForgeConfigSpec.IntValue sapphire_min_height;
    public static ForgeConfigSpec.IntValue sapphire_max_height;

    public static ForgeConfigSpec.BooleanValue generate_topaz;
    public static ForgeConfigSpec.IntValue topaz_min_vein_size;
    public static ForgeConfigSpec.IntValue topaz_max_vein_size;
    public static ForgeConfigSpec.IntValue topaz_chance;
    public static ForgeConfigSpec.IntValue topaz_min_height;
    public static ForgeConfigSpec.IntValue topaz_max_height;

    public static ForgeConfigSpec.BooleanValue generate_amethyst;
    public static ForgeConfigSpec.IntValue amethyst_min_vein_size;
    public static ForgeConfigSpec.IntValue amethyst_max_vein_size;
    public static ForgeConfigSpec.IntValue amethyst_chance;
    public static ForgeConfigSpec.IntValue amethyst_min_height;
    public static ForgeConfigSpec.IntValue amethyst_max_height;

    public static ForgeConfigSpec.BooleanValue generate_quartz;
    public static ForgeConfigSpec.IntValue quartz_min_vein_size;
    public static ForgeConfigSpec.IntValue quartz_max_vein_size;
    public static ForgeConfigSpec.IntValue quartz_chance;
    public static ForgeConfigSpec.IntValue quartz_min_height;
    public static ForgeConfigSpec.IntValue quartz_max_height;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {

        server.comment("Ruby Ore Generation");

        generate_ruby = server
                .comment("Generate Ruby Ore in the overworld - [true/false]")
                .define("oregen.ruby_ore.generate_ruby", true);

        ruby_min_vein_size = server
                .comment("Minimum size of Ruby Ore veins - default = 3")
                .defineInRange("oregen.ruby_ore.ruby_min_vein_size", 3, 0, 100);

        ruby_max_vein_size = server
                .comment("Maximum size of Ruby Ore veins - default = 8")
                .defineInRange("oregen.ruby_ore.ruby_max_vein_size", 8, 0, 100);

        ruby_chance = server
                .comment("Number of Ruby Ore veins generated in a chunk - default = 4")
                .defineInRange("oregen.ruby_ore.ruby_chance", 4, 0, 1000);

        ruby_min_height = server
                .comment("Minimum height for Ruby Ore generation - default = -80")
                .defineInRange("oregen.ruby_ore.ruby_min_height", -80, 0, 319);

        ruby_max_height = server
                .comment("Maximum height for Ruby Ore generation - default = 16")
                .defineInRange("oregen.ruby_ore.ruby_max_height", 16, 0, 319);

        server.comment("Sapphire Ore Generation");

        generate_sapphire = server
                .comment("Generate Sapphire Ore in the overworld - [true/false]")
                .define("oregen.sapphire_ore.generate_sapphire", true);

        sapphire_min_vein_size = server
                .comment("Minimum size of Sapphire Ore veins - default = 3")
                .defineInRange("oregen.sapphire_ore.sapphire_min_vein_size", 3, 0, 100);

        sapphire_max_vein_size = server
                .comment("Maximum size of Sapphire Ore veins - default = 8")
                .defineInRange("oregen.sapphire_ore.sapphire_max_vein_size", 8, 0, 100);

        sapphire_chance = server
                .comment("Number of Sapphire Ore veins generated in a chunk - default = 4")
                .defineInRange("oregen.sapphire_ore.sapphire_chance", 4, 0, 1000);

        sapphire_min_height = server
                .comment("Minimum height for Sapphire Ore generation - default = -80")
                .defineInRange("oregen.sapphire_ore.sapphire_min_height", -80, 0, 319);

        sapphire_max_height = server
                .comment("Maximum height for Sapphire Ore generation - default = 16")
                .defineInRange("oregen.sapphire_ore.sapphire_max_height", 16, 0, 319);

        server.comment("Topaz Ore Generation");

        generate_topaz = server
                .comment("Generate Topaz Ore in the overworld - [true/false]")
                .define("oregen.topaz_ore.generate_topaz", true);

        topaz_min_vein_size = server
                .comment("Minimum size of Topaz Ore veins - default = 3")
                .defineInRange("oregen.topaz_ore.topaz_min_vein_size", 3, 0, 100);

        topaz_max_vein_size = server
                .comment("Maximum size of Topaz Ore veins - default = 8")
                .defineInRange("oregen.topaz_ore.topaz_max_vein_size", 8, 0, 100);

        topaz_chance = server
                .comment("Number of Topaz Ore veins generated in a chunk - default = 4")
                .defineInRange("oregen.topaz_ore.topaz_chance", 4, 0, 1000);

        topaz_min_height = server
                .comment("Minimum height for Topaz Ore generation - default = -64")
                .defineInRange("oregen.topaz_ore.topaz_min_height", -64, 0, 319);

        topaz_max_height = server
                .comment("Maximum height for Topaz Ore generation - default = 24")
                .defineInRange("oregen.topaz_ore.topaz_max_height", 24, 0, 319);

        server.comment("Amethyst Ore Generation");

        generate_amethyst = server
                .comment("Generate Amethyst Ore in the overworld - [true/false]")
                .define("oregen.amethyst_ore.generate_amethyst", true);

        amethyst_min_vein_size = server
                .comment("Minimum size of Amethyst Ore veins - default = 5")
                .defineInRange("oregen.amethyst_ore.amethyst_min_vein_size", 5, 0, 100);

        amethyst_max_vein_size = server
                .comment("Maximum size of Amethyst Ore veins - default = 8")
                .defineInRange("oregen.amethyst_ore.amethyst_max_vein_size", 8, 0, 100);

        amethyst_chance = server
                .comment("Number of Amethyst Ore veins generated in a chunk - default = 3")
                .defineInRange("oregen.amethyst_ore.amethyst_chance", 3, 0, 1000);

        amethyst_min_height = server
                .comment("Minimum height for Amethyst Ore generation - default = -64")
                .defineInRange("oregen.amethyst_ore.amethyst_min_height", -64, 0, 319);

        amethyst_max_height = server
                .comment("Maximum height for Amethyst Ore generation - default = 32")
                .defineInRange("oregen.amethyst_ore.amethyst_max_height", 32, 0, 319);

        server.comment("Quartz Ore Generation");

        generate_quartz = server
                .comment("Generate Quartz Ore in the overworld - [true/false]")
                .define("oregen.quartz_ore.generate_quartz", true);

        quartz_min_vein_size = server
                .comment("Minimum size of Quartz Ore veins - default = 3")
                .defineInRange("oregen.quartz_ore.quartz_min_vein_size", 3, 0, 100);

        quartz_max_vein_size = server
                .comment("Maximum size of Quartz Ore veins - default = 8")
                .defineInRange("oregen.quartz_ore.quartz_max_vein_size", 8, 0, 100);

        quartz_chance = server
                .comment("Number of Quartz Ore veins generated in a chunk - default = 4")
                .defineInRange("oregen.quartz_ore.quartz_chance", 4, 0, 1000);

        quartz_min_height = server
                .comment("Minimum height for Quartz Ore generation - default = -64")
                .defineInRange("oregen.quartz_ore.quartz_min_height", -64, 0, 319);

        quartz_max_height = server
                .comment("Maximum height for Quartz Ore generation - default = 48")
                .defineInRange("oregen.quartz_ore.quartz_max_height", 48, 0, 319);
    }
}
