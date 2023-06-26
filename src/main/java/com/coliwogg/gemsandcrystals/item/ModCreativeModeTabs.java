package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemsAndCrystals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab GEMS_AND_CRYSTALS_TAB;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
        GEMS_AND_CRYSTALS_TAB = event.registerCreativeModeTab(new ResourceLocation(GemsAndCrystals.MOD_ID, "gemsandcrystals_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY.get()))
                        .title(Component.translatable("creativemodetab.gemsandcrystals_tab")));
    }
}
