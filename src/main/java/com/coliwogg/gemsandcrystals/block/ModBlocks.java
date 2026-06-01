package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
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
