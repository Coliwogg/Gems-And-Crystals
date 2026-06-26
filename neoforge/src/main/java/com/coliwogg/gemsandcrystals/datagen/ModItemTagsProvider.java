package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.Constants;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET.get(),
                        ModItems.RUBY_CHESTPLATE.get(),
                        ModItems.RUBY_LEGGINGS.get(),
                        ModItems.RUBY_BOOTS.get(),
                        ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.SAPPHIRE_BOOTS.get(),
                        ModItems.EMERALD_HELMET.get(),
                        ModItems.EMERALD_CHESTPLATE.get(),
                        ModItems.EMERALD_LEGGINGS.get(),
                        ModItems.EMERALD_BOOTS.get(),
                        ModItems.TOPAZ_HELMET.get(),
                        ModItems.TOPAZ_CHESTPLATE.get(),
                        ModItems.TOPAZ_LEGGINGS.get(),
                        ModItems.TOPAZ_BOOTS.get(),
                        ModItems.AMETHYST_HELMET.get(),
                        ModItems.AMETHYST_CHESTPLATE.get(),
                        ModItems.AMETHYST_LEGGINGS.get(),
                        ModItems.AMETHYST_BOOTS.get(),
                        ModItems.QUARTZ_HELMET.get(),
                        ModItems.QUARTZ_CHESTPLATE.get(),
                        ModItems.QUARTZ_LEGGINGS.get(),
                        ModItems.QUARTZ_BOOTS.get());

        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY.get(),
                        ModItems.SAPPHIRE.get(),
                        ModItems.TOPAZ.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get())
                .add(ModItems.SAPPHIRE_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.TOPAZ_SWORD.get())
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.QUARTZ_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get())
                .add(ModItems.SAPPHIRE_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.TOPAZ_PICKAXE.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.QUARTZ_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get())
                .add(ModItems.SAPPHIRE_SHOVEL.get())
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.TOPAZ_SHOVEL.get())
                .add(ModItems.AMETHYST_SHOVEL.get())
                .add(ModItems.QUARTZ_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get())
                .add(ModItems.SAPPHIRE_AXE.get())
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.TOPAZ_AXE.get())
                .add(ModItems.AMETHYST_AXE.get())
                .add(ModItems.QUARTZ_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get())
                .add(ModItems.SAPPHIRE_HOE.get())
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.TOPAZ_HOE.get())
                .add(ModItems.AMETHYST_HOE.get())
                .add(ModItems.QUARTZ_HOE.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get());
    }
}
