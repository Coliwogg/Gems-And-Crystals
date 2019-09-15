package com.coliwogg.gemsandcrystals.blocks;

import java.util.Random;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {

	public RubyOre() {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE));
		setRegistryName(GemsAndCrystals.MOD_ID, "ruby_ore");
	}
	
	@Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? MathHelper.nextInt(new Random(), 2, 4) : 0;
    }
	
	@Override
	public int getHarvestLevel(BlockState state) {
		return 2;
	}
}
