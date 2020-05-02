package com.coliwogg.gemsmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlock extends BlockBase {
    public ModBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(6.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
