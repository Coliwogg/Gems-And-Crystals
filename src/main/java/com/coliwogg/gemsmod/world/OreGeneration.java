package com.coliwogg.gemsmod.world;

import com.coliwogg.gemsmod.init.BlockInit;
import com.coliwogg.gemsmod.util.handlers.ConfigHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(ConfigHandler.rubyOreGeneration)
			generateOre(BlockInit.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 14, random.nextInt(3) + 1, 3);

		if(ConfigHandler.sapphireOreGeneration)
			generateOre(BlockInit.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 14, random.nextInt(3) + 1, 3);

		if(ConfigHandler.topazOreGeneration)
			generateOre(BlockInit.TOPAZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 32, random.nextInt(4) + 1, 4);

		if(ConfigHandler.amethystOreGeneration)
			generateOre(BlockInit.AMETHYST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 32, random.nextInt(4) + 1, 4);

		if(ConfigHandler.quartzOreGeneration)
			generateOre(BlockInit.QUARTZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 40, random.nextInt(5) + 2, 6);
	}

	private void generateOre(IBlockState state, World world, Random random, int x, int z, int minY, int maxY, int size, int chance) {
		int deltaY = maxY - minY;
		for (int i = 0; i < chance; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(state, size);
			generator.generate(world, random, pos);
		}
	}
}
