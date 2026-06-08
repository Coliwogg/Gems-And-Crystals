package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());
        add(ModBlocks.RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.TOPAZ_ORE.get(), (block) -> createOreDrop(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ.get()));
        add(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), ModItems.TOPAZ.get()));
        add(ModBlocks.AMETHYST_ORE.get(), (block) -> createOreDrop(ModBlocks.AMETHYST_ORE.get(), Items.AMETHYST_SHARD.asItem()));
        add(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), Items.AMETHYST_SHARD.asItem()));
        add(ModBlocks.QUARTZ_ORE.get(), (block) -> createOreDrop(ModBlocks.QUARTZ_ORE.get(), Items.QUARTZ.asItem()));
        add(ModBlocks.DEEPSLATE_QUARTZ_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_QUARTZ_ORE.get(), Items.QUARTZ.asItem()));
        add(ModBlocks.BUDDING_QUARTZ.get(), noDrop());
        add(ModBlocks.SMALL_QUARTZ_BUD.get(), noDrop());
        add(ModBlocks.MEDIUM_QUARTZ_BUD.get(), noDrop());
        add(ModBlocks.LARGE_QUARTZ_BUD.get(), noDrop());
        add(ModBlocks.QUARTZ_CLUSTER.get(),
                createSilkTouchDispatchTable(
                        ModBlocks.QUARTZ_CLUSTER.get(),
                        applyExplosionDecay(
                                ModBlocks.QUARTZ_CLUSTER.get(),
                                LootItem.lootTableItem(Items.QUARTZ)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))
                        )
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
