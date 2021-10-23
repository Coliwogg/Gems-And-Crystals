package com.coliwogg.gemsandcrystals.objects.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ModOre extends Block {
	private final UniformInt xpRange;

	public ModOre(Properties properties, UniformInt xpRange) {
		super(properties);
		this.xpRange = xpRange;
	}

	@Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? this.xpRange.sample(RANDOM) : 0;
	}
}
