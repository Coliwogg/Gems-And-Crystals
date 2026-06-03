package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, GemsAndCrystals.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.RUBY_REPAIRABLE)
                .add(ModItems.RUBY.get());

        tag(ModTags.Items.SAPPHIRE_REPAIRABLE)
                .add(ModItems.SAPPHIRE.get());

        tag(ModTags.Items.EMERALD_REPAIRABLE)
                .add(Items.EMERALD);

        tag(ModTags.Items.TOPAZ_REPAIRABLE)
                .add(ModItems.TOPAZ.get());

        tag(ModTags.Items.AMETHYST_REPAIRABLE)
                .add(Items.AMETHYST_SHARD);

        tag(ModTags.Items.QUARTZ_REPAIRABLE)
                .add(Items.QUARTZ);

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

    }
}
