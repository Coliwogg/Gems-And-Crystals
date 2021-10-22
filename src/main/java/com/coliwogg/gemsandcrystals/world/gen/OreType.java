package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.config.OreGenConfig;
import com.coliwogg.gemsandcrystals.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    RUBY(Lazy.of(BlockInit.RUBY_ORE), OreGenConfig.ruby_size.get(), OreGenConfig.ruby_min_height.get(), OreGenConfig.ruby_max_height.get()),
    SAPPHIRE(Lazy.of(BlockInit.SAPPHIRE_ORE), OreGenConfig.sapphire_size.get(), OreGenConfig.sapphire_min_height.get(), OreGenConfig.sapphire_max_height.get()),
    TOPAZ(Lazy.of(BlockInit.TOPAZ_ORE), OreGenConfig.topaz_size.get(), OreGenConfig.topaz_min_height.get(), OreGenConfig.topaz_max_height.get()),
    AMETHYST(Lazy.of(BlockInit.AMETHYST_ORE), OreGenConfig.amethyst_size.get(), OreGenConfig.amethyst_min_height.get(), OreGenConfig.amethyst_max_height.get()),
    QUARTZ(Lazy.of(BlockInit.QUARTZ_ORE), OreGenConfig.quartz_size.get(), OreGenConfig.quartz_min_height.get(), OreGenConfig.quartz_max_height.get()),



    ;

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
