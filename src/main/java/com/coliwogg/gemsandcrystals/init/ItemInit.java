package com.coliwogg.gemsandcrystals.init;

import java.util.function.Supplier;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.GemsandCrystals.GemsandCrystalsItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = GemsandCrystals.MOD_ID, bus = Bus.MOD)
@ObjectHolder(GemsandCrystals.MOD_ID)
public class ItemInit {
	// Gems/Crystals
	public static final Item RUBY = null;
	public static final Item SAPPHIRE = null;
	public static final Item EMERALD = null;
	public static final Item AMETHYST = null;
	public static final Item TOPAZ = null;
	public static final Item QUARTZ = null;
	
	// Ruby Tools
	public static final Item RUBY_AXE = null;
	public static final Item RUBY_HOE = null;
	public static final Item RUBY_PICKAXE = null;
	public static final Item RUBY_SHOVEL = null;
	public static final Item RUBY_SWORD = null;
	
	// Sapphire Tools
	public static final Item SAPPHIRE_AXE = null;
	public static final Item SAPPHIRE_HOE = null;
	public static final Item SAPPHIRE_PICKAXE = null;
	public static final Item SAPPHIRE_SHOVEL = null;
	public static final Item SAPPHIRE_SWORD = null;
	
	// Emerald Tools
	public static final Item EMERALD_AXE = null;
	public static final Item EMERALD_HOE = null;
	public static final Item EMERALD_PICKAXE = null;
	public static final Item EMERALD_SHOVEL = null;
	public static final Item EMERALD_SWORD = null;
	
	// Amethyst Tools
	public static final Item AMETHYST_AXE = null;
	public static final Item AMETHYST_HOE = null;
	public static final Item AMETHYST_PICKAXE = null;
	public static final Item AMETHYST_SHOVEL = null;
	public static final Item AMETHYST_SWORD = null;
	
	// Topaz Tools
	public static final Item TOPAZ_AXE = null;
	public static final Item TOPAZ_HOE = null;
	public static final Item TOPAZ_PICKAXE = null;
	public static final Item TOPAZ_SHOVEL = null;
	public static final Item TOPAZ_SWORD = null;
	
	// Quartz Tools
	public static final Item QUARTZ_AXE = null;
	public static final Item QUARTZ_HOE = null;
	public static final Item QUARTZ_PICKAXE = null;
	public static final Item QUARTZ_SHOVEL = null;
	public static final Item QUARTZ_SWORD = null;
		
	
	// Ruby Armor
	public static final Item RUBY_HELMET = null;
	public static final Item RUBY_CHESTPLATE = null;
	public static final Item RUBY_LEGGINGS = null;
	public static final Item RUBY_BOOTS = null;
	
	// Sapphire Armor
	public static final Item SAPPHIRE_HELMET = null;
	public static final Item SAPPHIRE_CHESTPLATE = null;
	public static final Item SAPPHIRE_LEGGINGS = null;
	public static final Item SAPPHIRE_BOOTS = null;
	
	// Emerald Armor
	public static final Item EMERALD_HELMET = null;
	public static final Item EMERALD_CHESTPLATE = null;
	public static final Item EMERALD_LEGGINGS = null;
	public static final Item EMERALD_BOOTS = null;
	
	// Amethyst Armor
	public static final Item AMETHYST_HELMET = null;
	public static final Item AMETHYST_CHESTPLATE = null;
	public static final Item AMETHYST_LEGGINGS = null;
	public static final Item AMETHYST_BOOTS = null;
	
	// Topaz Armor
	public static final Item TOPAZ_HELMET = null;
	public static final Item TOPAZ_CHESTPLATE = null;
	public static final Item TOPAZ_LEGGINGS = null;
	public static final Item TOPAZ_BOOTS = null;
	
	// Quartz Armor
	public static final Item QUARTZ_HELMET = null;
	public static final Item QUARTZ_CHESTPLATE = null;
	public static final Item QUARTZ_LEGGINGS = null;
	public static final Item QUARTZ_BOOTS = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		// Gems/Crystals
		event.getRegistry().register(new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby"));
		event.getRegistry().register(new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire"));
		event.getRegistry().register(new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst"));
		event.getRegistry().register(new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz"));		
		
		// Tools
		event.getRegistry().register(new SwordItem(ModItemTier.RUBY, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.RUBY, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.RUBY, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.RUBY, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.RUBY, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_hoe"));
		
		event.getRegistry().register(new SwordItem(ModItemTier.SAPPHIRE, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.SAPPHIRE, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.SAPPHIRE, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.SAPPHIRE, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.SAPPHIRE, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_hoe"));
		
		event.getRegistry().register(new SwordItem(ModItemTier.EMERALD, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.EMERALD, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.EMERALD, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.EMERALD, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.EMERALD, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_hoe"));
		
		event.getRegistry().register(new SwordItem(ModItemTier.AMETHYST, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.AMETHYST, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.AMETHYST, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.AMETHYST, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.AMETHYST, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_hoe"));
		
		event.getRegistry().register(new SwordItem(ModItemTier.TOPAZ, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.TOPAZ, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TOPAZ, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.TOPAZ, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.TOPAZ, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_hoe"));
		
		event.getRegistry().register(new SwordItem(ModItemTier.QUARTZ, 7, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.QUARTZ, 4, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.QUARTZ, 2, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.QUARTZ, 11, 3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.QUARTZ, 5.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_hoe"));
		
		// Armor
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("ruby_boots"));
		
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("sapphire_boots"));
		
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("emerald_boots"));
		
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("amethyst_boots"));

		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("topaz_boots"));

		event.getRegistry().register(new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)).setRegistryName("quartz_boots"));


	}
	
	public enum ModItemTier implements IItemTier {
		// int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
		RUBY(4, 900, 10.0F, 4.0F, 12, () -> {
			return Ingredient.fromItems(ItemInit.RUBY);
		}),
		
		SAPPHIRE(4, 900, 10.0F, 4.0F, 11, () -> {
			return Ingredient.fromItems(ItemInit.SAPPHIRE);
		}),
		
		EMERALD(4, 850,  10.0F, 4.0F, 10, () -> {
			return Ingredient.fromItems(ItemInit.EMERALD);
		}),
		
		AMETHYST(4, 775,  10.0F, 4.0F, 10, () -> {
			return Ingredient.fromItems(ItemInit.AMETHYST);
		}),
		
		TOPAZ(4, 750,  10.0F, 4.0F, 10, () -> {
			return Ingredient.fromItems(ItemInit.TOPAZ);
		}),
		
		QUARTZ(4, 400,  10.0F, 4.0F, 10, () -> {
			return Ingredient.fromItems(ItemInit.QUARTZ);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	
	public enum ModArmorMaterial implements IArmorMaterial {
		RUBY(GemsandCrystals.MOD_ID + ":ruby", 12, new int[] {3, 6, 8, 3}, 450, "item.armor.equip_diamond", 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.RUBY);
		}),
		
		SAPPHIRE(GemsandCrystals.MOD_ID + ":sapphire", 11, new int[] {3, 6, 8, 3}, 450, "item.armor.equip_diamond", 3.0F, () -> {
			return Ingredient.fromItems(ItemInit.SAPPHIRE);
		}),
		
		EMERALD(GemsandCrystals.MOD_ID + ":emerald", 11, new int[] {3, 5, 7, 4}, 425, "item.armor.equip_diamond", 2.5F, () -> {
			return Ingredient.fromItems(ItemInit.EMERALD);
		}),
		
		AMETHYST(GemsandCrystals.MOD_ID + ":amethyst", 14, new int[] {2, 5, 8, 4}, 375, "item.armor.equip_diamond", 1.0F, () -> {
			return Ingredient.fromItems(ItemInit.AMETHYST);
		}),
		
		TOPAZ(GemsandCrystals.MOD_ID + ":topaz", 13, new int[] {2, 5, 8, 4}, 375, "item.armor.equip_diamond", 1.0F, () -> {
			return Ingredient.fromItems(ItemInit.TOPAZ);
		}),
		
		QUARTZ(GemsandCrystals.MOD_ID + ":quartz", 13, new int[] {2, 5, 7, 3}, 325, "item.armor.equip_diamond", 0.0F, () -> {
			return Ingredient.fromItems(ItemInit.QUARTZ);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final String soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, String soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return new SoundEvent(new ResourceLocation(this.soundEvent));
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}
	}
}
