package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput) {
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> output) {
        output.accept(ModArmorMaterials.RUBY_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"), false)
                .build());
        output.accept(ModArmorMaterials.SAPPHIRE_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"), false)
                .build());
        output.accept(ModArmorMaterials.EMERALD_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"), false)
                .build());
        output.accept(ModArmorMaterials.TOPAZ_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"), false)
                .build());
        output.accept(ModArmorMaterials.AMETHYST_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"), false)
                .build());
        output.accept(ModArmorMaterials.QUARTZ_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"), false)
                .build());
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Gems and Crystals Equipment Definitions";
    }
}
