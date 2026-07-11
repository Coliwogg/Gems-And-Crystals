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
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE.get()),
                        ModBlocks.getRK(ModBlocks.RUBY_BLOCK.get()),
                        ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()),
                        ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK.get()),
                        ModBlocks.getRK(ModBlocks.TOPAZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.TOPAZ_BLOCK.get()),
                        ModBlocks.getRK(ModBlocks.AMETHYST_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()),
                        ModBlocks.getRK(ModBlocks.QUARTZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.BUDDING_QUARTZ.get()),
                        ModBlocks.getRK(ModBlocks.QUARTZ_CLUSTER.get()),
                        ModBlocks.getRK(ModBlocks.LARGE_QUARTZ_BUD.get()),
                        ModBlocks.getRK(ModBlocks.MEDIUM_QUARTZ_BUD.get()),
                        ModBlocks.getRK(ModBlocks.SMALL_QUARTZ_BUD.get()));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE.get()),
                        ModBlocks.getRK(ModBlocks.RUBY_BLOCK.get()),
                        ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()),
                        ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK.get()));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.TOPAZ_BLOCK.get()),
                        ModBlocks.getRK(ModBlocks.AMETHYST_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_AMETHYST_ORE.get()),
                        ModBlocks.getRK(ModBlocks.QUARTZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.DEEPSLATE_QUARTZ_ORE.get()),
                        ModBlocks.getRK(ModBlocks.BUDDING_QUARTZ.get()));
    }
}
