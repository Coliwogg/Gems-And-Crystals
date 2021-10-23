package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ToolStatConfig {

    public static ForgeConfigSpec.IntValue ruby_harvest_level;
    public static ForgeConfigSpec.IntValue ruby_max_uses;
    public static ForgeConfigSpec.DoubleValue ruby_efficiency;
    public static ForgeConfigSpec.DoubleValue ruby_attack_damage;
    public static ForgeConfigSpec.IntValue ruby_enchantability;

    public static ForgeConfigSpec.IntValue sapphire_harvest_level;
    public static ForgeConfigSpec.IntValue sapphire_max_uses;
    public static ForgeConfigSpec.DoubleValue sapphire_efficiency;
    public static ForgeConfigSpec.DoubleValue sapphire_attack_damage;
    public static ForgeConfigSpec.IntValue sapphire_enchantability;

    public static ForgeConfigSpec.IntValue emerald_harvest_level;
    public static ForgeConfigSpec.IntValue emerald_max_uses;
    public static ForgeConfigSpec.DoubleValue emerald_efficiency;
    public static ForgeConfigSpec.DoubleValue emerald_attack_damage;
    public static ForgeConfigSpec.IntValue emerald_enchantability;

    public static ForgeConfigSpec.IntValue topaz_harvest_level;
    public static ForgeConfigSpec.IntValue topaz_max_uses;
    public static ForgeConfigSpec.DoubleValue topaz_efficiency;
    public static ForgeConfigSpec.DoubleValue topaz_attack_damage;
    public static ForgeConfigSpec.IntValue topaz_enchantability;

    public static ForgeConfigSpec.IntValue amethyst_harvest_level;
    public static ForgeConfigSpec.IntValue amethyst_max_uses;
    public static ForgeConfigSpec.DoubleValue amethyst_efficiency;
    public static ForgeConfigSpec.DoubleValue amethyst_attack_damage;
    public static ForgeConfigSpec.IntValue amethyst_enchantability;

    public static ForgeConfigSpec.IntValue quartz_harvest_level;
    public static ForgeConfigSpec.IntValue quartz_max_uses;
    public static ForgeConfigSpec.DoubleValue quartz_efficiency;
    public static ForgeConfigSpec.DoubleValue quartz_attack_damage;
    public static ForgeConfigSpec.IntValue quartz_enchantability;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {
        server.comment("Ruby Tool and Weapon Stats");
        ruby_harvest_level = server
                .comment("Harvest Level of Ruby Tools")
                .defineInRange("toolstats.ruby.ruby_harvest_level", 3, 0, 4);
        ruby_max_uses = server
                .comment("Max Uses of Ruby Tools")
                .defineInRange("toolstats.ruby.ruby_max_uses", 900, 0, 1000);
        ruby_efficiency = server
                .comment("Efficiency of Ruby Tools")
                .defineInRange("toolstats.ruby.ruby_efficiency", 9.0F, 0.0F, 100.0F);
        ruby_attack_damage = server
                .comment("Attack Damage of Ruby Tools")
                .defineInRange("toolstats.ruby.ruby_attack_damage", 4.0F, 0.0F, 100.0F);
        ruby_enchantability = server
                .comment("Enchantability of Ruby Tools")
                .defineInRange("toolstats.ruby.ruby_enchantability", 12, 0, 100);

        server.comment("Sapphire Tool and Weapon Stats");
        sapphire_harvest_level = server
                .comment("Harvest Level of Sapphire Tools")
                .defineInRange("toolstats.sapphire.sapphire_harvest_level", 3, 0, 4);
        sapphire_max_uses = server
                .comment("Max Uses of Sapphire Tools")
                .defineInRange("toolstats.sapphire.sapphire_max_uses", 900, 0, 1000);
        sapphire_efficiency = server
                .comment("Efficiency of Sapphire Tools")
                .defineInRange("toolstats.sapphire.sapphire_efficiency", 9.0F, 0.0F, 100.0F);
        sapphire_attack_damage = server
                .comment("Attack Damage of Sapphire Tools")
                .defineInRange("toolstats.sapphire.sapphire_attack_damage", 4.0F, 0.0F, 100.0F);
        sapphire_enchantability = server
                .comment("Enchantability of Sapphire Tools")
                .defineInRange("toolstats.sapphire.sapphire_enchantability", 12, 0, 100);

        server.comment("Emerald Tool and Weapon Stats");
        emerald_harvest_level = server
                .comment("Harvest Level of Emerald Tools")
                .defineInRange("toolstats.emerald.emerald_harvest_level", 3, 0, 4);
        emerald_max_uses = server
                .comment("Max Uses of Emerald Tools")
                .defineInRange("toolstats.emerald.emerald_max_uses", 850, 0, 1000);
        emerald_efficiency = server
                .comment("Efficiency of Emerald Tools")
                .defineInRange("toolstats.emerald.emerald_efficiency", 8.5F, 0.0F, 100.0F);
        emerald_attack_damage = server
                .comment("Attack Damage of Emerald Tools")
                .defineInRange("toolstats.emerald.emerald_attack_damage", 3.5F, 0.0F, 100.0F);
        emerald_enchantability = server
                .comment("Enchantability of Emerald Tools")
                .defineInRange("toolstats.emerald.emerald_enchantability", 11, 0, 100);

        server.comment("Topaz Tool and Weapon Stats");
        topaz_harvest_level = server
                .comment("Harvest Level of Topaz Tools")
                .defineInRange("toolstats.topaz.topaz_harvest_level", 2, 0, 4);
        topaz_max_uses = server
                .comment("Max Uses of Topaz Tools")
                .defineInRange("toolstats.topaz.topaz_max_uses", 775, 0, 1000);
        topaz_efficiency = server
                .comment("Efficiency of Topaz Tools")
                .defineInRange("toolstats.topaz.topaz_efficiency", 8.0F, 0.0F, 100.0F);
        topaz_attack_damage = server
                .comment("Attack Damage of Topaz Tools")
                .defineInRange("toolstats.topaz.topaz_attack_damage", 2.7F, 0.0F, 100.0F);
        topaz_enchantability = server
                .comment("Enchantability of Topaz Tools")
                .defineInRange("toolstats.topaz.topaz_enchantability", 9, 0, 100);

        server.comment("Amethyst Tool and Weapon Stats");

        amethyst_harvest_level = server
                .comment("Harvest Level of Amethyst Tools")
                .defineInRange("toolstats.amethyst.amethyst_harvest_level", 2, 0, 4);
        amethyst_max_uses = server
                .comment("Max Uses of Amethyst Tools")
                .defineInRange("toolstats.amethyst.amethyst_max_uses", 750, 0, 1000);
        amethyst_efficiency = server
                .comment("Efficiency of Amethyst Tools")
                .defineInRange("toolstats.amethyst.amethyst_efficiency", 8.0F, 0.0F, 100.0F);
        amethyst_attack_damage = server
                .comment("Attack Damage of Amethyst Tools")
                .defineInRange("toolstats.amethyst.amethyst_attack_damage", 2.3F, 0.0F, 100.0F);
        amethyst_enchantability = server
                .comment("Enchantability of Amethyst Tools")
                .defineInRange("toolstats.amethyst.amethyst_enchantability", 9, 0, 100);

        server.comment("Quartz Tool and Weapon Stats");
        quartz_harvest_level = server
                .comment("Harvest Level of Quartz Tools")
                .defineInRange("toolstats.quartz.quartz_harvest_level", 2, 0, 4);
        quartz_max_uses = server
                .comment("Max Uses of Quartz Tools")
                .defineInRange("toolstats.quartz.quartz_max_uses", 400, 0, 1000);
        quartz_efficiency = server
                .comment("Efficiency of Quartz Tools")
                .defineInRange("toolstats.quartz.quartz_efficiency", 7.0F, 0.0F, 100.0F);
        quartz_attack_damage = server
                .comment("Attack Damage of Quartz Tools")
                .defineInRange("toolstats.quartz.quartz_attack_damage", 2.3F, 0.0F, 100.0F);
        quartz_enchantability = server
                .comment("Enchantability of Quartz Tools")
                .defineInRange("toolstats.quartz.quartz_enchantability", 9, 0, 100);

    }
}
