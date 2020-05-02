package com.coliwogg.gemsmod.util.compat;

import com.coliwogg.gemsmod.init.BlockInit;
import com.coliwogg.gemsmod.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void registerOres() {
		OreDictionary.registerOre("gemRuby", ItemInit.RUBY);
		OreDictionary.registerOre("gemSapphire", ItemInit.SAPPHIRE);
		OreDictionary.registerOre("gemTopaz", ItemInit.TOPAZ);
		OreDictionary.registerOre("gemAmethyst", ItemInit.AMETHYST);

		OreDictionary.registerOre("oreRuby", BlockInit.RUBY_ORE);
		OreDictionary.registerOre("oreSapphire", BlockInit.SAPPHIRE_ORE);
		OreDictionary.registerOre("oreTopaz", BlockInit.TOPAZ_ORE);
		OreDictionary.registerOre("oreAmethyst", BlockInit.AMETHYST_ORE);
		OreDictionary.registerOre("oreQuartz", BlockInit.QUARTZ_ORE);
	}
}
