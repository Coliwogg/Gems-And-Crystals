package com.coliwogg.gemsandcrystals.objects.tools;

import com.coliwogg.gemsandcrystals.config.ToolStatConfig;
import com.coliwogg.gemsandcrystals.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
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
        return Ingredient.of(RegistryHandler.AMETHYST.get());
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
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

}
