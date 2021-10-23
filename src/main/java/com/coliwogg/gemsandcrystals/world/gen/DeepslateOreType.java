package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.config.OreGenConfig;
import com.coliwogg.gemsandcrystals.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum DeepslateOreType {
    DEEPSLATE_RUBY(Lazy.of(BlockInit.DEEPSLATE_RUBY_ORE), OreGenConfig.ruby_size.get(), OreGenConfig.ruby_min_height.get(), OreGenConfig.ruby_max_height.get()),
    DEEPSLATE_SAPPHIRE(Lazy.of(BlockInit.DEEPSLATE_SAPPHIRE_ORE), OreGenConfig.ruby_size.get(), OreGenConfig.ruby_min_height.get(), OreGenConfig.ruby_max_height.get()),
    DEEPSLATE_TOPAZ(Lazy.of(BlockInit.DEEPSLATE_TOPAZ_ORE), OreGenConfig.topaz_size.get(), OreGenConfig.topaz_min_height.get(), OreGenConfig.topaz_max_height.get()),
    DEEPSLATE_QUARTZ(Lazy.of(BlockInit.DEEPSLATE_QUARTZ_ORE), OreGenConfig.quartz_size.get(), OreGenConfig.quartz_min_height.get(), OreGenConfig.quartz_max_height.get());


    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    DeepslateOreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
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

    public static DeepslateOreType get(Block block) {
        for (DeepslateOreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
