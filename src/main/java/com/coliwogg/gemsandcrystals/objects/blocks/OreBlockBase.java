package com.coliwogg.gemsandcrystals.objects.blocks;

import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class OreBlockBase extends OreBlock {
    public OreBlockBase() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 3.0F)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
        );
    }

    protected int getExperience(Random rand) {
        if (this == RegistryHandler.RUBY_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == RegistryHandler.SAPPHIRE_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == RegistryHandler.TOPAZ_ORE.get()) {
            return MathHelper.nextInt(rand, 2, 5);
        } else if (this == RegistryHandler.AMETHYST_ORE.get()) {
            return MathHelper.nextInt(rand, 2, 5);
        } else {
            return this == RegistryHandler.QUARTZ_ORE.get() ? MathHelper.nextInt(rand, 2, 5) : 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}
