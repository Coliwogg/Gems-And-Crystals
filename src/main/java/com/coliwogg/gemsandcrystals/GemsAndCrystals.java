package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModCreativeModeTabs;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GemsAndCrystals.MOD_ID)
public class GemsAndCrystals {
    public static final String MOD_ID = "gemsandcrystals";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GemsAndCrystals() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.TOPAZ);
        }

        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_BLOCK);
        }

        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.TOPAZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE);
            event.accept(ModBlocks.AMETHYST_ORE);
            event.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE);
            event.accept(ModBlocks.QUARTZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE);
        }

        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.EMERALD_SWORD);
            event.accept(ModItems.TOPAZ_SWORD);
            event.accept(ModItems.AMETHYST_SWORD);
            event.accept(ModItems.QUARTZ_SWORD);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.QUARTZ_AXE);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.EMERALD_HELMET);
            event.accept(ModItems.EMERALD_CHESTPLATE);
            event.accept(ModItems.EMERALD_LEGGINGS);
            event.accept(ModItems.EMERALD_BOOTS);
            event.accept(ModItems.TOPAZ_HELMET);
            event.accept(ModItems.TOPAZ_CHESTPLATE);
            event.accept(ModItems.TOPAZ_LEGGINGS);
            event.accept(ModItems.TOPAZ_BOOTS);
            event.accept(ModItems.AMETHYST_HELMET);
            event.accept(ModItems.AMETHYST_CHESTPLATE);
            event.accept(ModItems.AMETHYST_LEGGINGS);
            event.accept(ModItems.AMETHYST_BOOTS);
            event.accept(ModItems.QUARTZ_HELMET);
            event.accept(ModItems.QUARTZ_CHESTPLATE);
            event.accept(ModItems.QUARTZ_LEGGINGS);
            event.accept(ModItems.QUARTZ_BOOTS);
            event.accept(ModItems.RUBY_HORSE_ARMOR);
            event.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
            event.accept(ModItems.EMERALD_HORSE_ARMOR);
            event.accept(ModItems.TOPAZ_HORSE_ARMOR);
            event.accept(ModItems.AMETHYST_HORSE_ARMOR);
            event.accept(ModItems.QUARTZ_HORSE_ARMOR);
        }

        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.TOPAZ_SHOVEL);
            event.accept(ModItems.TOPAZ_PICKAXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.TOPAZ_HOE);
            event.accept(ModItems.AMETHYST_SHOVEL);
            event.accept(ModItems.AMETHYST_PICKAXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.AMETHYST_HOE);
            event.accept(ModItems.QUARTZ_SHOVEL);
            event.accept(ModItems.QUARTZ_PICKAXE);
            event.accept(ModItems.QUARTZ_AXE);
            event.accept(ModItems.QUARTZ_HOE);
        }

        if (event.getTab() == ModCreativeModeTabs.GEMS_AND_CRYSTALS_TAB) {
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.TOPAZ);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.TOPAZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE);
            event.accept(ModBlocks.AMETHYST_ORE);
            event.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE);
            event.accept(ModBlocks.QUARTZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE);
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.EMERALD_SWORD);
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.TOPAZ_SWORD);
            event.accept(ModItems.TOPAZ_SHOVEL);
            event.accept(ModItems.TOPAZ_PICKAXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.TOPAZ_HOE);
            event.accept(ModItems.AMETHYST_SWORD);
            event.accept(ModItems.AMETHYST_SHOVEL);
            event.accept(ModItems.AMETHYST_PICKAXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.AMETHYST_HOE);
            event.accept(ModItems.QUARTZ_SWORD);
            event.accept(ModItems.QUARTZ_SHOVEL);
            event.accept(ModItems.QUARTZ_PICKAXE);
            event.accept(ModItems.QUARTZ_AXE);
            event.accept(ModItems.QUARTZ_HOE);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.EMERALD_HELMET);
            event.accept(ModItems.EMERALD_CHESTPLATE);
            event.accept(ModItems.EMERALD_LEGGINGS);
            event.accept(ModItems.EMERALD_BOOTS);
            event.accept(ModItems.TOPAZ_HELMET);
            event.accept(ModItems.TOPAZ_CHESTPLATE);
            event.accept(ModItems.TOPAZ_LEGGINGS);
            event.accept(ModItems.TOPAZ_BOOTS);
            event.accept(ModItems.AMETHYST_HELMET);
            event.accept(ModItems.AMETHYST_CHESTPLATE);
            event.accept(ModItems.AMETHYST_LEGGINGS);
            event.accept(ModItems.AMETHYST_BOOTS);
            event.accept(ModItems.QUARTZ_HELMET);
            event.accept(ModItems.QUARTZ_CHESTPLATE);
            event.accept(ModItems.QUARTZ_LEGGINGS);
            event.accept(ModItems.QUARTZ_BOOTS);
            event.accept(ModItems.RUBY_HORSE_ARMOR);
            event.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
            event.accept(ModItems.EMERALD_HORSE_ARMOR);
            event.accept(ModItems.TOPAZ_HORSE_ARMOR);
            event.accept(ModItems.AMETHYST_HORSE_ARMOR);
            event.accept(ModItems.QUARTZ_HORSE_ARMOR);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
