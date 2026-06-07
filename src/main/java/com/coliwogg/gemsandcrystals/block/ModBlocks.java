package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.custom.BuddingQuartzBlock;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GemsAndCrystals.MOD_ID);

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            (properties) -> new Block(properties.requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            (properties) -> new Block(properties.requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            (properties) -> new Block(properties.requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(3, 7), properties.mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> BUDDING_QUARTZ = registerBlock("budding_quartz",
            (properties) -> new BuddingQuartzBlock(properties.mapColor(MapColor.QUARTZ).strength(1.5F).randomTicks().noOcclusion().sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> QUARTZ_CLUSTER = registerBlock("quartz_cluster",
            (properties -> new AmethystClusterBlock(7.0F, 10.0F, properties.mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5).pushReaction(PushReaction.DESTROY))));
    public static final DeferredBlock<Block> LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud",
            (properties -> new AmethystClusterBlock(5.0F, 10.0F, properties.mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4).pushReaction(PushReaction.DESTROY))));
    public static final DeferredBlock<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud",
            (properties -> new AmethystClusterBlock(4.0F, 10.0F, properties.mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 2).pushReaction(PushReaction.DESTROY))));
    public static final DeferredBlock<Block> SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud",
            (properties -> new AmethystClusterBlock(3.0F, 8.0F, properties.mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 1).pushReaction(PushReaction.DESTROY))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }}
