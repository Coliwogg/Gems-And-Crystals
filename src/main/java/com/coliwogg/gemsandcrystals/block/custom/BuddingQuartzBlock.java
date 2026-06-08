package com.coliwogg.gemsandcrystals.block.custom;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;

public class BuddingQuartzBlock extends Block {
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingQuartzBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        if (random.nextInt(5) != 0) return;

        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos targetPos = pos.relative(direction);
        BlockState targetState = level.getBlockState(targetPos);

        Block block = null;

        if (canGrowInto(targetState)) {
            block = ModBlocks.SMALL_QUARTZ_BUD.get();
        } else if (targetState.is(ModBlocks.SMALL_QUARTZ_BUD.get()) && targetState.getValue(BlockStateProperties.FACING) == direction) {
            block = ModBlocks.MEDIUM_QUARTZ_BUD.get();
        } else if (targetState.is(ModBlocks.MEDIUM_QUARTZ_BUD.get()) && targetState.getValue(BlockStateProperties.FACING) == direction) {
            block = ModBlocks.LARGE_QUARTZ_BUD.get();
        } else if (targetState.is(ModBlocks.LARGE_QUARTZ_BUD.get()) && targetState.getValue(BlockStateProperties.FACING) == direction) {
            block = ModBlocks.QUARTZ_CLUSTER.get();
        }

        if (block != null) {
            BlockState newState = block.defaultBlockState().setValue(BlockStateProperties.FACING, direction).setValue(BlockStateProperties.WATERLOGGED, targetState.getFluidState().getType() == Fluids.WATER);
            level.setBlockAndUpdate(targetPos, newState);
        }
    }

    private boolean canGrowInto(BlockState state) {
        return state.isAir() || (state.is(Blocks.WATER) && state.getFluidState().getAmount() == 8);
    }
}