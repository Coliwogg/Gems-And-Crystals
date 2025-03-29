package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemsAndCrystals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /* Gems */
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.TOPAZ.get());

        /* Tools */
        handheldItem(ModItems.RUBY_SWORD);
        handheldItem(ModItems.RUBY_SHOVEL);
        handheldItem(ModItems.RUBY_PICKAXE);
        handheldItem(ModItems.RUBY_AXE);
        handheldItem(ModItems.RUBY_HOE);
        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_HOE);
        handheldItem(ModItems.EMERALD_SWORD);
        handheldItem(ModItems.EMERALD_SHOVEL);
        handheldItem(ModItems.EMERALD_PICKAXE);
        handheldItem(ModItems.EMERALD_AXE);
        handheldItem(ModItems.EMERALD_HOE);
        handheldItem(ModItems.TOPAZ_SWORD);
        handheldItem(ModItems.TOPAZ_SHOVEL);
        handheldItem(ModItems.TOPAZ_PICKAXE);
        handheldItem(ModItems.TOPAZ_AXE);
        handheldItem(ModItems.TOPAZ_HOE);
        handheldItem(ModItems.AMETHYST_SWORD);
        handheldItem(ModItems.AMETHYST_SHOVEL);
        handheldItem(ModItems.AMETHYST_PICKAXE);
        handheldItem(ModItems.AMETHYST_AXE);
        handheldItem(ModItems.AMETHYST_HOE);
        handheldItem(ModItems.QUARTZ_SWORD);
        handheldItem(ModItems.QUARTZ_SHOVEL);
        handheldItem(ModItems.QUARTZ_PICKAXE);
        handheldItem(ModItems.QUARTZ_AXE);
        handheldItem(ModItems.QUARTZ_HOE);

        /* Armor */
        trimmedArmorItem(ModItems.RUBY_HELMET);
        trimmedArmorItem(ModItems.RUBY_CHESTPLATE);
        trimmedArmorItem(ModItems.RUBY_LEGGINGS);
        trimmedArmorItem(ModItems.RUBY_BOOTS);
        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);
        trimmedArmorItem(ModItems.EMERALD_HELMET);
        trimmedArmorItem(ModItems.EMERALD_CHESTPLATE);
        trimmedArmorItem(ModItems.EMERALD_LEGGINGS);
        trimmedArmorItem(ModItems.EMERALD_BOOTS);
        trimmedArmorItem(ModItems.TOPAZ_HELMET);
        trimmedArmorItem(ModItems.TOPAZ_CHESTPLATE);
        trimmedArmorItem(ModItems.TOPAZ_LEGGINGS);
        trimmedArmorItem(ModItems.TOPAZ_BOOTS);
        trimmedArmorItem(ModItems.AMETHYST_HELMET);
        trimmedArmorItem(ModItems.AMETHYST_CHESTPLATE);
        trimmedArmorItem(ModItems.AMETHYST_LEGGINGS);
        trimmedArmorItem(ModItems.AMETHYST_BOOTS);
        trimmedArmorItem(ModItems.QUARTZ_HELMET);
        trimmedArmorItem(ModItems.QUARTZ_CHESTPLATE);
        trimmedArmorItem(ModItems.QUARTZ_LEGGINGS);
        trimmedArmorItem(ModItems.QUARTZ_BOOTS);

        /* Horse Armor */
        basicItem(ModItems.RUBY_HORSE_ARMOR.get());
        basicItem(ModItems.SAPPHIRE_HORSE_ARMOR.get());
        basicItem(ModItems.EMERALD_HORSE_ARMOR.get());
        basicItem(ModItems.TOPAZ_HORSE_ARMOR.get());
        basicItem(ModItems.AMETHYST_HORSE_ARMOR.get());
        basicItem(ModItems.QUARTZ_HORSE_ARMOR.get());

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID,"item/" + item.getId().getPath()));
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = GemsAndCrystals.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = "";
                if(armorItem.toString().contains("helmet")) {
                    armorType = "helmet";
                } else if(armorItem.toString().contains("chestplate")) {
                    armorType = "chestplate";
                } else if(armorItem.toString().contains("leggings")) {
                    armorType = "leggings";
                } else if(armorItem.toString().contains("boots")) {
                    armorType = "boots";
                }

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

}
