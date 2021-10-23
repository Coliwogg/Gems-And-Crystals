package com.coliwogg.gemsandcrystals.objects.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockBase extends Block {
    public BlockBase() {
        super(Block.Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.METAL)
        );
    }
}
