package com.coliwogg.gemsandcrystals.init;


import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.objects.blocks.ModOre;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemsandCrystals.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(GemsandCrystals.TAB)));
    }

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new ModOre(Block.Properties.of(Material.STONE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new ModOre(Block.Properties.copy(RUBY_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new ModOre(Block.Properties.of(Material.STONE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new ModOre(Block.Properties.copy(SAPPHIRE_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", () -> new ModOre(Block.Properties.of(Material.STONE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));
    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", () -> new ModOre(Block.Properties.copy(TOPAZ_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new ModOre(Block.Properties.of(Material.STONE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore", () -> new ModOre(Block.Properties.copy(AMETHYST_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> QUARTZ_ORE = registerBlock("quartz_ore", () -> new ModOre(Block.Properties.of(Material.STONE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 5)));
    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore", () -> new ModOre(Block.Properties.copy(TOPAZ_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
