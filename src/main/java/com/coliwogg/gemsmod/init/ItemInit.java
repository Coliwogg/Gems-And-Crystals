package com.coliwogg.gemsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.coliwogg.gemsmod.objects.items.ItemBase;
import com.coliwogg.gemsmod.objects.items.armor.ArmorBase;
import com.coliwogg.gemsmod.objects.items.tools.ToolAxe;
import com.coliwogg.gemsmod.objects.items.tools.ToolHoe;
import com.coliwogg.gemsmod.objects.items.tools.ToolPickaxe;
import com.coliwogg.gemsmod.objects.items.tools.ToolSpade;
import com.coliwogg.gemsmod.objects.items.tools.ToolSword;
import com.coliwogg.gemsmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<>();

	/* Tool Materials */
	public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 900, 9.0F, 4.0F, 12);
	public static final Item.ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 3, 900, 4.0F, 4.0F, 12);
	public static final Item.ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 850, 8.5F, 3.5F, 11);
	public static final Item.ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 2, 775, 8.0F, 2.7F, 9);
	public static final Item.ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 2, 775, 8.0F, 2.3F, 9);
	public static final Item.ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_quartz", 2, 400, 7.0F, 1.5F, 7);

	/* Armor Materials */
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MODID + ":ruby", 14,
			new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MODID + ":sapphire", 14,
			new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MODID + ":emerald", 13,
			new int[]{4, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_TOPAZ = EnumHelper.addArmorMaterial("armor_material_topaz", Reference.MODID + ":topaz", 12,
			new int[]{2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MODID + ":amethyst", 12,
			new int[]{3, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_QUARTZ = EnumHelper.addArmorMaterial("armor_material_quartz", Reference.MODID + ":quartz", 11,
			new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	/* Items */
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item AMETHYST = new ItemBase("amethyst");

	/* Tools */
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);

	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);

	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);

	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SHOVEL = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);

	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);

	public static final ItemAxe QUARTZ_AXE = new ToolAxe("quartz_axe", MATERIAL_QUARTZ);
	public static final ItemHoe QUARTZ_HOE = new ToolHoe("quartz_hoe", MATERIAL_QUARTZ);
	public static final ItemPickaxe QUARTZ_PICKAXE = new ToolPickaxe("quartz_pickaxe", MATERIAL_QUARTZ);
	public static final ItemSpade QUARTZ_SHOVEL = new ToolSpade("quartz_shovel", MATERIAL_QUARTZ);
	public static final ItemSword QUARTZ_SWORD = new ToolSword("quartz_sword", MATERIAL_QUARTZ);

	/* Armor */
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);

	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);

	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);

	public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item TOPAZ_CHESTPLATE = new ArmorBase("topaz_chestplate", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item TOPAZ_LEGGINGS = new ArmorBase("topaz_leggings", ARMOR_MATERIAL_TOPAZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.FEET);

	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);

	public static final Item QUARTZ_HELMET = new ArmorBase("quartz_helmet", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item QUARTZ_CHESTPLATE = new ArmorBase("quartz_chestplate", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item QUARTZ_LEGGINGS = new ArmorBase("quartz_leggings", ARMOR_MATERIAL_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item QUARTZ_BOOTS = new ArmorBase("quartz_boots", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.FEET);
}
