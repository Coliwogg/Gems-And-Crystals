package com.coliwogg.gemsandcrystals.objects.blocks;

import java.util.Random;

import com.coliwogg.gemsandcrystals.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class ModOre extends Block {

	public ModOre(Properties properties) {
		super(properties);
	}

	private int getExperience(Random rand) {
		if (this == BlockInit.RUBY_ORE.get()) {
			return MathHelper.nextInt(rand, 3, 7);
		} else if (this == BlockInit.SAPPHIRE_ORE.get()) {
			return MathHelper.nextInt(rand, 3, 7);
		} else if (this == BlockInit.TOPAZ_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else if (this == BlockInit.AMETHYST_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else {
			return this == BlockInit.QUARTZ_ORE.get() ? MathHelper.nextInt(rand, 2, 5) : 0;
		}
	}

	@Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? this.getExperience(RANDOM) : 0;
	}
}
