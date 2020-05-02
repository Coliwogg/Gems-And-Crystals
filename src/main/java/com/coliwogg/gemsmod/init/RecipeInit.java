package com.coliwogg.gemsmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeInit {
	public static void init() {
		GameRegistry.addSmelting(BlockInit.RUBY_ORE, new ItemStack(ItemInit.RUBY, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.SAPPHIRE_ORE, new ItemStack(ItemInit.SAPPHIRE, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.TOPAZ_ORE, new ItemStack(ItemInit.TOPAZ, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.AMETHYST_ORE, new ItemStack(ItemInit.AMETHYST, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.AMETHYST_ORE, new ItemStack(ItemInit.AMETHYST, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.QUARTZ_ORE, new ItemStack(Items.QUARTZ, 1), 1.5F);
	}
}
