package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.Constants;
import com.coliwogg.gemsandcrystals.platform.Services;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class ModBlocks {

    public static final Supplier<Block> RUBY_BLOCK = Services.REGISTRY.registerBlock("ruby_block", 
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.METAL)));
    public static final Supplier<Block> SAPPHIRE_BLOCK = Services.REGISTRY.registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.METAL)));
    public static final Supplier<Block> TOPAZ_BLOCK = Services.REGISTRY.registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.METAL)));
    public static final Supplier<Block> RUBY_ORE = Services.REGISTRY.registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Supplier<Block> DEEPSLATE_RUBY_ORE = Services.REGISTRY.registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(RUBY_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final Supplier<Block> SAPPHIRE_ORE = Services.REGISTRY.registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Supplier<Block> DEEPSLATE_SAPPHIRE_ORE = Services.REGISTRY.registerBlock("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(SAPPHIRE_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final Supplier<Block> TOPAZ_ORE = Services.REGISTRY.registerBlock("topaz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Supplier<Block> DEEPSLATE_TOPAZ_ORE = Services.REGISTRY.registerBlock("deepslate_topaz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(TOPAZ_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final Supplier<Block> AMETHYST_ORE = Services.REGISTRY.registerBlock("amethyst_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Supplier<Block> DEEPSLATE_AMETHYST_ORE = Services.REGISTRY.registerBlock("deepslate_amethyst_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(AMETHYST_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final Supplier<Block> QUARTZ_ORE = Services.REGISTRY.registerBlock("quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Supplier<Block> DEEPSLATE_QUARTZ_ORE = Services.REGISTRY.registerBlock("deepslate_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(QUARTZ_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

    public static void registerModBlocks() {
        Constants.LOG.info("Registering Mod Blocks for " + Constants.MOD_ID);
    }
}
