package com.coliwogg.gemsandcrystals.objects.tools;

import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    RUBY(3, 900, 9.0F, 4.0F, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY.get());
    }),
    SAPPHIRE(3, 900, 9.0F, 4.0F, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.SAPPHIRE.get());
    }),
    EMERALD(3, 850, 8.5F, 3.5F, 11, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    TOPAZ(2, 775, 8.0F, 2.7F, 9, () -> {
        return Ingredient.fromItems(RegistryHandler.TOPAZ.get());
    }),
    AMETHYST(2, 775, 8.0F, 2.3F, 9, () -> {
        return Ingredient.fromItems(RegistryHandler.AMETHYST.get());
    }),
    QUARTZ(2, 400, 7.0F, 1.5F, 7, () -> {
        return Ingredient.fromItems(Items.QUARTZ);
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
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
