package com.coliwogg.gemsandcrystals.init;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.config.ArmorStatConfig;
import com.coliwogg.gemsandcrystals.config.ToolStatConfig;
import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemsandCrystals.MOD_ID);

    /* Items */
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(GemsandCrystals.TAB)));
    /* Tools */
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5.0F, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY,2,2.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTier.SAPPHIRE, 5.0F, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTier.SAPPHIRE, 2, 2.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTier.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTier.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModItemTier.EMERALD, 5.5F, -2.9F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModItemTier.EMERALD, 1, 1.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModItemTier.EMERALD, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModItemTier.EMERALD, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModItemTier.EMERALD, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModItemTier.TOPAZ, 5.3F, -3.03F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModItemTier.TOPAZ, 1, -0.3F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModItemTier.TOPAZ, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModItemTier.TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModItemTier.TOPAZ, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModItemTier.AMETHYST, 5.7F, -3.07F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModItemTier.AMETHYST, 1, -0.7F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModItemTier.AMETHYST, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModItemTier.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModItemTier.AMETHYST, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModItemTier.QUARTZ, 6.5F, -3.15F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModItemTier.QUARTZ, 1, -1.5F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModItemTier.QUARTZ, 1, -2.8F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModItemTier.QUARTZ, 1.5F, -3.0F, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModItemTier.QUARTZ, 3, -2.4F, new Item.Properties().tab(GemsandCrystals.TAB)));

    /* Armor */
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.HEAD, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.CHEST, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.LEGS, new Item.Properties().tab(GemsandCrystals.TAB)));
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.FEET, new Item.Properties().tab(GemsandCrystals.TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public enum ModItemTier implements Tier {
        // int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
        RUBY(ToolStatConfig.ruby_harvest_level.get(), ToolStatConfig.ruby_max_uses.get(), ToolStatConfig.ruby_efficiency.get().floatValue(), ToolStatConfig.ruby_attack_damage.get().floatValue(), ToolStatConfig.ruby_enchantability.get(), () -> {
            return Ingredient.of(RegistryHandler.RUBY.get());
        }),
        SAPPHIRE(ToolStatConfig.sapphire_harvest_level.get(), ToolStatConfig.sapphire_max_uses.get(), ToolStatConfig.sapphire_efficiency.get().floatValue(), ToolStatConfig.sapphire_attack_damage.get().floatValue(), ToolStatConfig.sapphire_enchantability.get(), () -> {
            return Ingredient.of(RegistryHandler.SAPPHIRE.get());
        }),
        EMERALD(ToolStatConfig.emerald_harvest_level.get(), ToolStatConfig.emerald_max_uses.get(), ToolStatConfig.emerald_efficiency.get().floatValue(), ToolStatConfig.emerald_attack_damage.get().floatValue(), ToolStatConfig.emerald_enchantability.get(), () -> {
            return Ingredient.of(Items.EMERALD);
        }),
        TOPAZ(ToolStatConfig.topaz_harvest_level.get(), ToolStatConfig.topaz_max_uses.get(), ToolStatConfig.topaz_efficiency.get().floatValue(), ToolStatConfig.topaz_attack_damage.get().floatValue(), ToolStatConfig.topaz_enchantability.get(), () -> {
            return Ingredient.of(RegistryHandler.TOPAZ.get());
        }),
        AMETHYST(ToolStatConfig.amethyst_harvest_level.get(), ToolStatConfig.amethyst_max_uses.get(), ToolStatConfig.amethyst_efficiency.get().floatValue(), ToolStatConfig.amethyst_attack_damage.get().floatValue(), ToolStatConfig.amethyst_enchantability.get(), () -> {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }),
        QUARTZ(ToolStatConfig.quartz_harvest_level.get(), ToolStatConfig.quartz_max_uses.get(), ToolStatConfig.quartz_efficiency.get().floatValue(), ToolStatConfig.quartz_attack_damage.get().floatValue(), ToolStatConfig.quartz_enchantability.get(), () -> {
            return Ingredient.of(Items.QUARTZ);
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Supplier<Ingredient> repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getUses() {
            return this.maxUses;
        }

        @Override
        public float getSpeed() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamageBonus() {
            return this.attackDamage;
        }

        @Override
        public int getLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantmentValue() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairMaterial.get();
        }
    }

    public enum ModArmorMaterial implements ArmorMaterial {

        // String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, String soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn
        RUBY(GemsandCrystals.MOD_ID + ":ruby", ArmorStatConfig.ruby_max_damage_factor_in.get(), new int[]{ArmorStatConfig.ruby_boots_strength.get(), ArmorStatConfig.ruby_leggings_strength.get(), ArmorStatConfig.ruby_chestplate_strength.get(), ArmorStatConfig.ruby_helmet_strength.get()}, ArmorStatConfig.ruby_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(RegistryHandler.RUBY.get());
        }),

        SAPPHIRE(GemsandCrystals.MOD_ID + ":sapphire", ArmorStatConfig.sapphire_max_damage_factor_in.get(), new int[]{ArmorStatConfig.sapphire_boots_strength.get(), ArmorStatConfig.sapphire_leggings_strength.get(), ArmorStatConfig.sapphire_chestplate_strength.get(), ArmorStatConfig.sapphire_helmet_strength.get()}, ArmorStatConfig.sapphire_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(RegistryHandler.SAPPHIRE.get());
        }),

        EMERALD(GemsandCrystals.MOD_ID + ":emerald", ArmorStatConfig.emerald_max_damage_factor_in.get(), new int[]{ArmorStatConfig.emerald_boots_strength.get(), ArmorStatConfig.emerald_leggings_strength.get(), ArmorStatConfig.emerald_chestplate_strength.get(), ArmorStatConfig.emerald_helmet_strength.get()}, ArmorStatConfig.emerald_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(Items.EMERALD);
        }),

        TOPAZ(GemsandCrystals.MOD_ID + ":topaz", ArmorStatConfig.topaz_max_damage_factor_in.get(), new int[]{ArmorStatConfig.topaz_boots_strength.get(), ArmorStatConfig.topaz_leggings_strength.get(), ArmorStatConfig.topaz_chestplate_strength.get(), ArmorStatConfig.topaz_helmet_strength.get()}, ArmorStatConfig.topaz_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(RegistryHandler.TOPAZ.get());
        }),

        AMETHYST(GemsandCrystals.MOD_ID + ":amethyst", ArmorStatConfig.amethyst_max_damage_factor_in.get(), new int[]{ArmorStatConfig.amethyst_boots_strength.get(), ArmorStatConfig.amethyst_leggings_strength.get(), ArmorStatConfig.amethyst_chestplate_strength.get(), ArmorStatConfig.amethyst_helmet_strength.get()}, ArmorStatConfig.amethyst_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }),

        QUARTZ(GemsandCrystals.MOD_ID + ":quartz", ArmorStatConfig.quartz_max_damage_factor_in.get(), new int[]{ArmorStatConfig.quartz_boots_strength.get(), ArmorStatConfig.quartz_leggings_strength.get(), ArmorStatConfig.quartz_chestplate_strength.get(), ArmorStatConfig.quartz_helmet_strength.get()}, ArmorStatConfig.quartz_armor_enchantability.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.of(Items.QUARTZ);
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final Supplier<Ingredient> repairMaterial;

        ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = repairMaterialIn;
        }

        @Override
        public int getDurabilityForSlot(EquipmentSlot slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairMaterial.get();
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

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    }
}
