package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET.get(), ModItems.RUBY_CHESTPLATE.get(), ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY_BOOTS.get(),
                        ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE_BOOTS.get(),
                        ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get(),
                        ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ_CHESTPLATE.get(), ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ_BOOTS.get(),
                        ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get(),
                        ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY.get())
                .add(ModItems.SAPPHIRE.get())
                .add(ModItems.TOPAZ.get());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get())
                .add(ModItems.SAPPHIRE_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.TOPAZ_SWORD.get())
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.QUARTZ_SWORD.get());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get())
                .add(ModItems.SAPPHIRE_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.TOPAZ_PICKAXE.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.QUARTZ_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get())
                .add(ModItems.SAPPHIRE_SHOVEL.get())
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.TOPAZ_SHOVEL.get())
                .add(ModItems.AMETHYST_SHOVEL.get())
                .add(ModItems.QUARTZ_SHOVEL.get());

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get())
                .add(ModItems.SAPPHIRE_AXE.get())
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.TOPAZ_AXE.get())
                .add(ModItems.AMETHYST_AXE.get())
                .add(ModItems.QUARTZ_AXE.get());

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get())
                .add(ModItems.SAPPHIRE_HOE.get())
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.TOPAZ_HOE.get())
                .add(ModItems.AMETHYST_HOE.get())
                .add(ModItems.QUARTZ_HOE.get());

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get());

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get());

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get());

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get());

    }
}
