package com.coliwogg.gemsandcrystals.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockBase extends Block {
    public BlockBase() {
        super(Block.Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
        );
    }
}
