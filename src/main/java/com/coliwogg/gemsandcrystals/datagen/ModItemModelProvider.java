package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemsAndCrystals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /* Gems */
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.TOPAZ);

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
        simpleItem(ModItems.RUBY_HELMET);
        simpleItem(ModItems.RUBY_CHESTPLATE);
        simpleItem(ModItems.RUBY_LEGGINGS);
        simpleItem(ModItems.RUBY_BOOTS);
        simpleItem(ModItems.SAPPHIRE_HELMET);
        simpleItem(ModItems.SAPPHIRE_CHESTPLATE);
        simpleItem(ModItems.SAPPHIRE_LEGGINGS);
        simpleItem(ModItems.SAPPHIRE_BOOTS);
        simpleItem(ModItems.EMERALD_HELMET);
        simpleItem(ModItems.EMERALD_CHESTPLATE);
        simpleItem(ModItems.EMERALD_LEGGINGS);
        simpleItem(ModItems.EMERALD_BOOTS);
        simpleItem(ModItems.TOPAZ_HELMET);
        simpleItem(ModItems.TOPAZ_CHESTPLATE);
        simpleItem(ModItems.TOPAZ_LEGGINGS);
        simpleItem(ModItems.TOPAZ_BOOTS);
        simpleItem(ModItems.AMETHYST_HELMET);
        simpleItem(ModItems.AMETHYST_CHESTPLATE);
        simpleItem(ModItems.AMETHYST_LEGGINGS);
        simpleItem(ModItems.AMETHYST_BOOTS);
        simpleItem(ModItems.QUARTZ_HELMET);
        simpleItem(ModItems.QUARTZ_CHESTPLATE);
        simpleItem(ModItems.QUARTZ_LEGGINGS);
        simpleItem(ModItems.QUARTZ_BOOTS);

        /* Horse Armor */
        simpleItem(ModItems.RUBY_HORSE_ARMOR);
        simpleItem(ModItems.SAPPHIRE_HORSE_ARMOR);
        simpleItem(ModItems.EMERALD_HORSE_ARMOR);
        simpleItem(ModItems.TOPAZ_HORSE_ARMOR);
        simpleItem(ModItems.AMETHYST_HORSE_ARMOR);
        simpleItem(ModItems.QUARTZ_HORSE_ARMOR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemsAndCrystals.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(GemsAndCrystals.MOD_ID, "item/" + item.getId().getPath()));
    }
}
