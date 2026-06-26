package com.coliwogg.gemsandcrystals.platform.services;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IRegistryHelper {

    Supplier<Item> registerItem(String name, Supplier<Item> item);

    Supplier<Block> registerBlock(String name, Supplier<Block> block);

    Supplier<Item> registerBlockItem(String name, Supplier<Block> block);

    Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<CreativeModeTab> tab);

    CreativeModeTab.Builder tabBuilder();

}
