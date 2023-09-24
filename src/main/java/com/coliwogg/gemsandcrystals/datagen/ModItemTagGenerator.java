package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, GemsAndCrystals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
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
    }
}
