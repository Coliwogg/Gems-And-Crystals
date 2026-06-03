package com.coliwogg.gemsandcrystals.trim;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> RUBY =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"));

    public static final ResourceKey<TrimMaterial> SAPPHIRE =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"));

    public static final ResourceKey<TrimMaterial> TOPAZ =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, ModItems.RUBY.get(), Style.EMPTY.withColor(TextColor.parseColor("#f62217").getOrThrow()), "ruby");
        register(context, SAPPHIRE, ModItems.SAPPHIRE.get(), Style.EMPTY.withColor(TextColor.parseColor("#0067bc").getOrThrow()), "sapphire");
        register(context, TOPAZ, ModItems.TOPAZ.get(), Style.EMPTY.withColor(TextColor.parseColor("#f9c032").getOrThrow()), "topaz");
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item, Style style, String name) {
        TrimMaterial trimmaterial = new TrimMaterial(MaterialAssetGroup.create(name),
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.identifier())).withStyle(style));
        context.register(trimKey, trimmaterial);
    }
}
