package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, GemsAndCrystals.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.TOPAZ_ORE.get(),
                        ModBlocks.DEEPSLATE_TOPAZ_ORE.get(),
                        ModBlocks.TOPAZ_BLOCK.get(),
                        ModBlocks.AMETHYST_ORE.get(),
                        ModBlocks.DEEPSLATE_AMETHYST_ORE.get(),
                        ModBlocks.QUARTZ_ORE.get(),
                        ModBlocks.DEEPSLATE_QUARTZ_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.TOPAZ_ORE.get(),
                        ModBlocks.DEEPSLATE_TOPAZ_ORE.get(),
                        ModBlocks.TOPAZ_BLOCK.get(),
                        ModBlocks.AMETHYST_ORE.get(),
                        ModBlocks.DEEPSLATE_AMETHYST_ORE.get(),
                        ModBlocks.QUARTZ_ORE.get(),
                        ModBlocks.DEEPSLATE_QUARTZ_ORE.get());
    }
}
