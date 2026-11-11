package com.coliwogg.gemsandcrystals.trim;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> RUBY =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"));

    public static final ResourceKey<TrimMaterial> SAPPHIRE =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"));

    public static final ResourceKey<TrimMaterial> TOPAZ =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, Style.EMPTY.withColor(TextColor.parseColor("#f62217").getOrThrow()), ModTrimMaterials.Palette.RUBY);
        register(context, SAPPHIRE, Style.EMPTY.withColor(TextColor.parseColor("#0067bc").getOrThrow()), Palette.SAPPHIRE);
        register(context, TOPAZ, Style.EMPTY.withColor(TextColor.parseColor("#f9c032").getOrThrow()), Palette.TOPAZ);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> registryKey, Style hoverTextStyle, ModTrimMaterials.Palette palette) {
        Component description = Component.translatable(Util.makeDescriptionId("trim_material", registryKey.identifier())).withStyle(hoverTextStyle);
        context.register(registryKey, new TrimMaterial(palette.id(), description));
    }

    public enum Palette {
        RUBY("ruby"),
        SAPPHIRE("sapphire"),
        TOPAZ("topaz");

        private final String suffix;
        private final Identifier id;

        Palette(String name) {
            this.suffix = name;
            this.id = Identifier.withDefaultNamespace("trim/" + name);
        }

        public String suffix() {
            return this.suffix;
        }

        public Identifier id() {
            return this.id;
        }
    }
}
