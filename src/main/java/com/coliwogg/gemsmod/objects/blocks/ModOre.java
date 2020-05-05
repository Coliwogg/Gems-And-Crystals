package com.coliwogg.gemsmod.objects.blocks;

import com.coliwogg.gemsmod.init.BlockInit;
import com.coliwogg.gemsmod.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class ModOre extends BlockBase {

    public ModOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHardness(3.0F);
        setResistance(3.0F);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (this == BlockInit.RUBY_ORE) {
            return ItemInit.RUBY;
        } else if (this == BlockInit.SAPPHIRE_ORE) {
            return ItemInit.SAPPHIRE;
        } else if (this == BlockInit.TOPAZ_ORE) {
            return ItemInit.TOPAZ;
        } else if (this == BlockInit.AMETHYST_ORE) {
            return ItemInit.AMETHYST;
        } else {
            return this == BlockInit.QUARTZ_ORE ? Items.QUARTZ : Item.getItemFromBlock(this);
        }
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState) this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;
            if (i < 0)
                i = 0;
            return this.quantityDropped(random) * (i + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;
            if (this == BlockInit.RUBY_ORE) {
                i = MathHelper.getInt(rand, 3, 7);
            } else if (this == BlockInit.SAPPHIRE_ORE) {
                i = MathHelper.getInt(rand, 3, 7);
            } else if (this == BlockInit.TOPAZ_ORE) {
                i = MathHelper.getInt(rand, 3, 7);
            } else if (this == BlockInit.AMETHYST_ORE) {
                i = MathHelper.getInt(rand, 2, 5);
            } else if (this == BlockInit.QUARTZ_ORE) {
                i = MathHelper.getInt(rand, 2, 5);
            }

            return i;
        }
        return 0;
    }

}
