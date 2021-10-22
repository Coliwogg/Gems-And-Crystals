package com.coliwogg.gemsandcrystals.init;


import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.objects.blocks.ModOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemsandCrystals.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(GemsandCrystals.TAB)));
    }

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new ModOre(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new ModOre(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new ModOre(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new ModOre(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_ORE = BLOCKS.register("quartz_ore", () -> new ModOre(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
