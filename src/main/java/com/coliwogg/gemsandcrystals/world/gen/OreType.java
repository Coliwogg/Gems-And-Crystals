package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.config.OreGenConfig;
import com.coliwogg.gemsandcrystals.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    RUBY(Lazy.of(BlockInit.RUBY_ORE), Lazy.of(BlockInit.DEEPSLATE_RUBY_ORE), OreGenConfig.ruby_min_vein_size.get(), OreGenConfig.ruby_max_vein_size.get(), OreGenConfig.ruby_min_height.get(), OreGenConfig.ruby_max_height.get(), OreGenConfig.generate_ruby.get()),
    SAPPHIRE(Lazy.of(BlockInit.SAPPHIRE_ORE), Lazy.of(BlockInit.DEEPSLATE_SAPPHIRE_ORE), OreGenConfig.sapphire_min_vein_size.get(), OreGenConfig.sapphire_max_vein_size.get(), OreGenConfig.sapphire_min_height.get(), OreGenConfig.sapphire_max_height.get(), OreGenConfig.generate_sapphire.get()),
    TOPAZ(Lazy.of(BlockInit.TOPAZ_ORE), Lazy.of(BlockInit.DEEPSLATE_TOPAZ_ORE), OreGenConfig.topaz_min_vein_size.get(), OreGenConfig.topaz_max_vein_size.get(), OreGenConfig.topaz_min_height.get(), OreGenConfig.topaz_max_height.get(), OreGenConfig.generate_topaz.get()),
    AMETHYST(Lazy.of(BlockInit.AMETHYST_ORE), Lazy.of(BlockInit.DEEPSLATE_AMETHYST_ORE), OreGenConfig.amethyst_min_vein_size.get(), OreGenConfig.amethyst_max_vein_size.get(), OreGenConfig.amethyst_min_height.get(), OreGenConfig.amethyst_max_height.get(), OreGenConfig.generate_amethyst.get()),
    QUARTZ(Lazy.of(BlockInit.QUARTZ_ORE), Lazy.of(BlockInit.DEEPSLATE_QUARTZ_ORE), OreGenConfig.quartz_min_vein_size.get(), OreGenConfig.quartz_max_vein_size.get(), OreGenConfig.quartz_min_height.get(), OreGenConfig.quartz_max_height.get(), OreGenConfig.generate_quartz.get());

    private final Lazy<Block> block;
    private final Lazy<Block> deepslateBlock;
    private final int minVeinSize;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final boolean generateOreToggle;

    OreType(Lazy<Block> block, Lazy<Block> deepslateBlock, int minVeinSize, int maxVeinSize, int minHeight, int maxHeight, boolean generateOreToggle) {
        this.block = block;
        this.deepslateBlock = deepslateBlock;
        this.minVeinSize = minVeinSize;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.generateOreToggle = generateOreToggle;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public Lazy<Block> getDeepslateBlock() {
        return deepslateBlock;
    }

    public int getMinVeinSize() {
        return minVeinSize;
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

    public boolean getGenerateOreToggle() {
        return generateOreToggle;
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
