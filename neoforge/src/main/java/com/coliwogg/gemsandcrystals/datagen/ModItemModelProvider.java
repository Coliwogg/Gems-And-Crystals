package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.Constants;
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
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;
import java.util.function.Supplier;

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
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /* Gems */
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.TOPAZ.get());

        /* Tools */
        handheldItem(ModItems.RUBY_SWORD.get());
        handheldItem(ModItems.RUBY_SHOVEL.get());
        handheldItem(ModItems.RUBY_PICKAXE.get());
        handheldItem(ModItems.RUBY_AXE.get());
        handheldItem(ModItems.RUBY_HOE.get());
        handheldItem(ModItems.SAPPHIRE_SWORD.get());
        handheldItem(ModItems.SAPPHIRE_SHOVEL.get());
        handheldItem(ModItems.SAPPHIRE_PICKAXE.get());
        handheldItem(ModItems.SAPPHIRE_AXE.get());
        handheldItem(ModItems.SAPPHIRE_HOE.get());
        handheldItem(ModItems.EMERALD_SWORD.get());
        handheldItem(ModItems.EMERALD_SHOVEL.get());
        handheldItem(ModItems.EMERALD_PICKAXE.get());
        handheldItem(ModItems.EMERALD_AXE.get());
        handheldItem(ModItems.EMERALD_HOE.get());
        handheldItem(ModItems.TOPAZ_SWORD.get());
        handheldItem(ModItems.TOPAZ_SHOVEL.get());
        handheldItem(ModItems.TOPAZ_PICKAXE.get());
        handheldItem(ModItems.TOPAZ_AXE.get());
        handheldItem(ModItems.TOPAZ_HOE.get());
        handheldItem(ModItems.AMETHYST_SWORD.get());
        handheldItem(ModItems.AMETHYST_SHOVEL.get());
        handheldItem(ModItems.AMETHYST_PICKAXE.get());
        handheldItem(ModItems.AMETHYST_AXE.get());
        handheldItem(ModItems.AMETHYST_HOE.get());
        handheldItem(ModItems.QUARTZ_SWORD.get());
        handheldItem(ModItems.QUARTZ_SHOVEL.get());
        handheldItem(ModItems.QUARTZ_PICKAXE.get());
        handheldItem(ModItems.QUARTZ_AXE.get());
        handheldItem(ModItems.QUARTZ_HOE.get());

        /* Armor */
        trimmedArmorItem("ruby_helmet", ModItems.RUBY_HELMET);
        trimmedArmorItem("ruby_chestplate", ModItems.RUBY_CHESTPLATE);
        trimmedArmorItem("ruby_leggings", ModItems.RUBY_LEGGINGS);
        trimmedArmorItem("ruby_boots", ModItems.RUBY_BOOTS);
        trimmedArmorItem("sapphire_helmet", ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem("sapphire_chestplate", ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem("sapphire_leggings", ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem("sapphire_boots", ModItems.SAPPHIRE_BOOTS);
        trimmedArmorItem("emerald_helmet", ModItems.EMERALD_HELMET);
        trimmedArmorItem("emerald_chestplate", ModItems.EMERALD_CHESTPLATE);
        trimmedArmorItem("emerald_leggings", ModItems.EMERALD_LEGGINGS);
        trimmedArmorItem("emerald_boots", ModItems.EMERALD_BOOTS);
        trimmedArmorItem("topaz_helmet", ModItems.TOPAZ_HELMET);
        trimmedArmorItem("topaz_chestplate", ModItems.TOPAZ_CHESTPLATE);
        trimmedArmorItem("topaz_leggings", ModItems.TOPAZ_LEGGINGS);
        trimmedArmorItem("topaz_boots", ModItems.TOPAZ_BOOTS);
        trimmedArmorItem("amethyst_helmet", ModItems.AMETHYST_HELMET);
        trimmedArmorItem("amethyst_chestplate", ModItems.AMETHYST_CHESTPLATE);
        trimmedArmorItem("amethyst_leggings", ModItems.AMETHYST_LEGGINGS);
        trimmedArmorItem("amethyst_boots", ModItems.AMETHYST_BOOTS);
        trimmedArmorItem("quartz_helmet", ModItems.QUARTZ_HELMET);
        trimmedArmorItem("quartz_chestplate", ModItems.QUARTZ_CHESTPLATE);
        trimmedArmorItem("quartz_leggings", ModItems.QUARTZ_LEGGINGS);
        trimmedArmorItem("quartz_boots", ModItems.QUARTZ_BOOTS);

        /* Horse Armor */
        basicItem(ModItems.RUBY_HORSE_ARMOR.get());
        basicItem(ModItems.SAPPHIRE_HORSE_ARMOR.get());
        basicItem(ModItems.EMERALD_HORSE_ARMOR.get());
        basicItem(ModItems.TOPAZ_HORSE_ARMOR.get());
        basicItem(ModItems.AMETHYST_HORSE_ARMOR.get());
        basicItem(ModItems.QUARTZ_HORSE_ARMOR.get());
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(String itemName, Supplier<Item> itemSupplier) {
        final String MOD_ID = Constants.MOD_ID;

        if(itemSupplier.get() instanceof ArmorItem armorItem) {
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

                String trimPath = "minecraft:item/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String modelName = itemName + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                ResourceLocation overlayModel = GemsAndCrystals.identifier("item/" + modelName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(modelName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", Constants.MOD_ID + ":item/" + itemName)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                getBuilder(itemName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(
                                overlayModel.getNamespace() + ":item/" + overlayModel.getPath()
                        ))
                        .predicate(mcLoc("trim_type"), trimValue)
                        .end()
                        .texture("layer0", Constants.MOD_ID + ":item/" + itemName);
            });
        }
    }
}
