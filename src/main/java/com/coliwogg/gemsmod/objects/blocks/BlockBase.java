package com.coliwogg.gemsmod.objects.blocks;

import com.coliwogg.gemsmod.GemsandCrystals;
import com.coliwogg.gemsmod.init.BlockInit;
import com.coliwogg.gemsmod.init.ItemInit;
import com.coliwogg.gemsmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GemsandCrystals.GemsandCrystalsTab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        GemsandCrystals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
