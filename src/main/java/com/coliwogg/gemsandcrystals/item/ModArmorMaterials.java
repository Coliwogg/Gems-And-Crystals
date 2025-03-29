package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> RUBY;
    public static final Holder<ArmorMaterial> SAPPHIRE;
    public static final Holder<ArmorMaterial> EMERALD;
    public static final Holder<ArmorMaterial> TOPAZ;
    public static final Holder<ArmorMaterial> AMETHYST;
    public static final Holder<ArmorMaterial> QUARTZ;

    static {
        RUBY = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 3);
            attribute.put(ArmorItem.Type.LEGGINGS, 6);
            attribute.put(ArmorItem.Type.CHESTPLATE, 8);
            attribute.put(ArmorItem.Type.HELMET, 3);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0.1f, () -> ModItems.RUBY.get());
        SAPPHIRE = register("sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 3);
            attribute.put(ArmorItem.Type.LEGGINGS, 6);
            attribute.put(ArmorItem.Type.CHESTPLATE, 8);
            attribute.put(ArmorItem.Type.HELMET, 3);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0.1f, () -> ModItems.SAPPHIRE.get());
        EMERALD = register("emerald", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 2);
            attribute.put(ArmorItem.Type.LEGGINGS, 6);
            attribute.put(ArmorItem.Type.CHESTPLATE, 8);
            attribute.put(ArmorItem.Type.HELMET, 3);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5f, 0.1f, () -> Items.EMERALD);
        TOPAZ = register("topaz", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 2);
            attribute.put(ArmorItem.Type.LEGGINGS, 6);
            attribute.put(ArmorItem.Type.CHESTPLATE, 8);
            attribute.put(ArmorItem.Type.HELMET, 3);
            attribute.put(ArmorItem.Type.BODY, 11);
        }), 13, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> ModItems.TOPAZ.get());
        AMETHYST = register("amethyst", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 2);
            attribute.put(ArmorItem.Type.LEGGINGS, 5);
            attribute.put(ArmorItem.Type.CHESTPLATE, 6);
            attribute.put(ArmorItem.Type.HELMET, 2);
            attribute.put(ArmorItem.Type.BODY, 7);
        }), 12, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Items.AMETHYST_SHARD);
        QUARTZ = register("quartz", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 1);
            attribute.put(ArmorItem.Type.LEGGINGS, 3);
            attribute.put(ArmorItem.Type.CHESTPLATE, 5);
            attribute.put(ArmorItem.Type.HELMET, 2);
            attribute.put(ArmorItem.Type.BODY, 7);
        }), 10, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Items.QUARTZ);


    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}