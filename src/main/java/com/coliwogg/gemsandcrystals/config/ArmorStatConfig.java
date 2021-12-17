package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ArmorStatConfig {

    public static ForgeConfigSpec.IntValue ruby_boots_strength;
    public static ForgeConfigSpec.IntValue ruby_leggings_strength;
    public static ForgeConfigSpec.IntValue ruby_chestplate_strength;
    public static ForgeConfigSpec.IntValue ruby_helmet_strength;
    public static ForgeConfigSpec.IntValue ruby_armor_enchantability;
    public static ForgeConfigSpec.IntValue ruby_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue ruby_max_damage_factor_in;

    public static ForgeConfigSpec.IntValue sapphire_boots_strength;
    public static ForgeConfigSpec.IntValue sapphire_leggings_strength;
    public static ForgeConfigSpec.IntValue sapphire_chestplate_strength;
    public static ForgeConfigSpec.IntValue sapphire_helmet_strength;
    public static ForgeConfigSpec.IntValue sapphire_armor_enchantability;
    public static ForgeConfigSpec.IntValue sapphire_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue sapphire_max_damage_factor_in;

    public static ForgeConfigSpec.IntValue emerald_boots_strength;
    public static ForgeConfigSpec.IntValue emerald_leggings_strength;
    public static ForgeConfigSpec.IntValue emerald_chestplate_strength;
    public static ForgeConfigSpec.IntValue emerald_helmet_strength;
    public static ForgeConfigSpec.IntValue emerald_armor_enchantability;
    public static ForgeConfigSpec.IntValue emerald_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue emerald_max_damage_factor_in;

    public static ForgeConfigSpec.IntValue topaz_boots_strength;
    public static ForgeConfigSpec.IntValue topaz_leggings_strength;
    public static ForgeConfigSpec.IntValue topaz_chestplate_strength;
    public static ForgeConfigSpec.IntValue topaz_helmet_strength;
    public static ForgeConfigSpec.IntValue topaz_armor_enchantability;
    public static ForgeConfigSpec.IntValue topaz_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue topaz_max_damage_factor_in;

    public static ForgeConfigSpec.IntValue amethyst_boots_strength;
    public static ForgeConfigSpec.IntValue amethyst_leggings_strength;
    public static ForgeConfigSpec.IntValue amethyst_chestplate_strength;
    public static ForgeConfigSpec.IntValue amethyst_helmet_strength;
    public static ForgeConfigSpec.IntValue amethyst_armor_enchantability;
    public static ForgeConfigSpec.IntValue amethyst_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue amethyst_max_damage_factor_in;

    public static ForgeConfigSpec.IntValue quartz_boots_strength;
    public static ForgeConfigSpec.IntValue quartz_leggings_strength;
    public static ForgeConfigSpec.IntValue quartz_chestplate_strength;
    public static ForgeConfigSpec.IntValue quartz_helmet_strength;
    public static ForgeConfigSpec.IntValue quartz_armor_enchantability;
    public static ForgeConfigSpec.IntValue quartz_armor_knockback_resistance;
    public static ForgeConfigSpec.IntValue quartz_max_damage_factor_in;


    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {

        server.comment("Ruby Armor Stats");
        ruby_max_damage_factor_in = server
                .comment("Max Damage Factor In of Ruby Armour")
                .defineInRange("armorstats.ruby.ruby_max_damage_factor_in", 35, 0, 100);
        ruby_boots_strength = server
                .comment("Armour Strength of Ruby Boots")
                .defineInRange("armorstats.ruby.ruby_boots_strength", 4, 0, 100);
        ruby_leggings_strength = server
                .comment("Armour Strength of Ruby Leggings")
                .defineInRange("armorstats.ruby.ruby_leggings_strength", 7, 0, 100);
        ruby_chestplate_strength = server
                .comment("Armour Strength of Ruby Chestplate")
                .defineInRange("armorstats.ruby.ruby_chestplate_strength", 9, 0, 100);
        ruby_helmet_strength = server
                .comment("Armour Strength of Ruby Helmet")
                .defineInRange("armorstats.ruby.ruby_helmet_strength", 4, 0, 100);
        ruby_armor_enchantability = server
                .comment("Enchantability of Ruby Armour")
                .defineInRange("armorstats.ruby.ruby_armor_enchantability", 11, 0, 100);
        ruby_armor_knockback_resistance = server
                .comment("Knockback Resistance of Ruby Armour")
                .defineInRange("armorstats.ruby.ruby_armor_knockback_resistance", 0, 0, 100);


        server.comment("Sapphire Armor Stats");
        sapphire_max_damage_factor_in = server
                .comment("Max Damage Factor In of Sapphire Armour")
                .defineInRange("armorstats.sapphire.sapphire_max_damage_factor_in", 35, 0, 100);
        sapphire_boots_strength = server
                .comment("Armour Strength of Sapphire Boots")
                .defineInRange("armorstats.sapphire.sapphire_boots_strength", 4, 0, 100);
        sapphire_leggings_strength = server
                .comment("Armour Strength of Sapphire Leggings")
                .defineInRange("armorstats.sapphire.sapphire_leggings_strength", 7, 0, 100);
        sapphire_chestplate_strength = server
                .comment("Armour Strength of Sapphire Chestplate")
                .defineInRange("armorstats.sapphire.sapphire_chestplate_strength", 9, 0, 100);
        sapphire_helmet_strength = server
                .comment("Armour Strength of Sapphire Helmet")
                .defineInRange("armorstats.sapphire.sapphire_helmet_strength", 4, 0, 100);
        sapphire_armor_enchantability = server
                .comment("Enchantability of Sapphire Armour")
                .defineInRange("armorstats.sapphire.sapphire_armor_enchantability", 11, 0, 100);
        sapphire_armor_knockback_resistance = server
                .comment("Knockback Resistance of Sapphire Armour")
                .defineInRange("armorstats.sapphire.sapphire_armor_knockback_resistance", 0, 0, 100);

        server.comment("Emerald Armor Stats");
        emerald_max_damage_factor_in = server
                .comment("Max Damage Factor In of Emerald Armour")
                .defineInRange("armorstats.emerald.emerald_max_damage_factor_in", 33, 0, 100);
        emerald_boots_strength = server
                .comment("Armour Strength of Emerald Boots")
                .defineInRange("armorstats.emerald.emerald_boots_strength", 4, 0, 100);
        emerald_leggings_strength = server
                .comment("Armour Strength of Emerald Leggings")
                .defineInRange("armorstats.emerald.emerald_leggings_strength", 6, 0, 100);
        emerald_chestplate_strength = server
                .comment("Armour Strength of Emerald Chestplate")
                .defineInRange("armorstats.emerald.emerald_chestplate_strength", 9, 0, 100);
        emerald_helmet_strength = server
                .comment("Armour Strength of Emerald Helmet")
                .defineInRange("armorstats.emerald.emerald_helmet_strength", 3, 0, 100);
        emerald_armor_enchantability = server
                .comment("Enchantability of Emerald Armour")
                .defineInRange("armorstats.emerald.emerald_armor_enchantability", 10, 0, 100);
        emerald_armor_knockback_resistance = server
                .comment("Knockback Resistance of Emerald Armour")
                .defineInRange("armorstats.emerald.emerald_armor_knockback_resistance", 0, 0, 100);

        server.comment("Topaz Armor Stats");
        topaz_max_damage_factor_in = server
                .comment("Max Damage Factor In of Topaz Armour")
                .defineInRange("armorstats.topaz.topaz_max_damage_factor_in", 20, 0, 100);
        topaz_boots_strength = server
                .comment("Armour Strength of Topaz Boots")
                .defineInRange("armorstats.topaz.topaz_boots_strength", 2, 0, 100);
        topaz_leggings_strength = server
                .comment("Armour Strength of Topaz Leggings")
                .defineInRange("armorstats.topaz.topaz_leggings_strength", 6, 0, 100);
        topaz_chestplate_strength = server
                .comment("Armour Strength of Topaz Chestplate")
                .defineInRange("armorstats.topaz.topaz_chestplate_strength", 7, 0, 100);
        topaz_helmet_strength = server
                .comment("Armour Strength of Topaz Helmet")
                .defineInRange("armorstats.topaz.topaz_helmet_strength", 2, 0, 100);
        topaz_armor_enchantability = server
                .comment("Enchantability of Topaz Armour")
                .defineInRange("armorstats.topaz.topaz_armor_enchantability", 9, 0, 100);
        topaz_armor_knockback_resistance = server
                .comment("Knockback Resistance of Topaz Armour")
                .defineInRange("armorstats.topaz.topaz_armor_knockback_resistance", 0, 0, 100);

        amethyst_max_damage_factor_in = server
                .comment("Max Damage Factor In of Amethyst Armour")
                .defineInRange("armorstats.amethyst.amethyst_max_damage_factor_in", 17, 0, 100);
        amethyst_boots_strength = server
                .comment("Armour Strength of Amethyst Boots")
                .defineInRange("armorstats.amethyst.amethyst_boots_strength", 3, 0, 100);
        amethyst_leggings_strength = server
                .comment("Armour Strength of Amethyst Leggings")
                .defineInRange("armorstats.amethyst.amethyst_leggings_strength", 5, 0, 100);
        amethyst_chestplate_strength = server
                .comment("Armour Strength of Amethyst Chestplate")
                .defineInRange("armorstats.amethyst.amethyst_chestplate_strength", 6, 0, 100);
        amethyst_helmet_strength = server
                .comment("Armour Strength of Amethyst Helmet")
                .defineInRange("armorstats.amethyst.amethyst_helmet_strength", 3, 0, 100);
        amethyst_armor_enchantability = server
                .comment("Enchantability of Amethyst Armour")
                .defineInRange("armorstats.amethyst.amethyst_armor_enchantability", 9, 0, 100);
        amethyst_armor_knockback_resistance = server
                .comment("Knockback Resistance of Amethyst Armour")
                .defineInRange("armorstats.amethyst.amethyst_armor_knockback_resistance", 0, 0, 100);

        server.comment("Quartz Armor Stats");
        quartz_max_damage_factor_in = server
                .comment("Max Damage Factor In of Quartz Armour")
                .defineInRange("armorstats.quartz.quartz_max_damage_factor_in", 10, 0, 100);
        quartz_boots_strength = server
                .comment("Armour Strength of Quartz Boots")
                .defineInRange("armorstats.quartz.quartz_boots_strength", 1, 0, 100);
        quartz_leggings_strength = server
                .comment("Armour Strength of Quartz Leggings")
                .defineInRange("armorstats.quartz.quartz_leggings_strength", 4, 0, 100);
        quartz_chestplate_strength = server
                .comment("Armour Strength of Quartz Chestplate")
                .defineInRange("armorstats.quartz.quartz_chestplate_strength", 5, 0, 100);
        quartz_helmet_strength = server
                .comment("Armour Strength of Quartz Helmet")
                .defineInRange("armorstats.quartz.quartz_helmet_strength", 2, 0, 100);
        quartz_armor_enchantability = server
                .comment("Enchantability of Quartz Armour")
                .defineInRange("armorstats.quartz.quartz_armor_enchantability", 12, 0, 100);
        quartz_armor_knockback_resistance = server
                .comment("Knockback Resistance of Quartz Armour")
                .defineInRange("armorstats.quartz.quartz_armor_knockback_resistance", 0, 0, 100);


    }

}
