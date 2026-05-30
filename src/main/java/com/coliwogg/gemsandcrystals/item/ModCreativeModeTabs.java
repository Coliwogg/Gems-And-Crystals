package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemsAndCrystals.MOD_ID);
    public static Supplier<CreativeModeTab> GEMS_AND_CRYSTALS_TAB = CREATIVE_MODE_TABS.register("gemsandcrystals_tab", () ->
           CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                   .title(Component.translatable("creativemodetab.gemsandcrystals_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
