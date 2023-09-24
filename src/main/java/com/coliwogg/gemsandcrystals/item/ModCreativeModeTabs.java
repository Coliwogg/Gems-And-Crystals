package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemsAndCrystals.MOD_ID);
    public static RegistryObject<CreativeModeTab> GEMS_AND_CRYSTALS_TAB = CREATIVE_MODE_TABS.register("gemsandcrystals_tab", () ->
           CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                   .title(Component.translatable("creativemodetab.gemsandcrystals_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
