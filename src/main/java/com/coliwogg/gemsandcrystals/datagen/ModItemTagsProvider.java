package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, GemsAndCrystals.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.RUBY_REPAIRABLE)
                .add(ModItems.getRK(ModItems.RUBY.get()));

        tag(ModTags.Items.SAPPHIRE_REPAIRABLE)
                .add(ModItems.getRK(ModItems.SAPPHIRE.get()));

        tag(ModTags.Items.EMERALD_REPAIRABLE)
                .add(ItemIds.EMERALD);

        tag(ModTags.Items.TOPAZ_REPAIRABLE)
                .add(ModItems.getRK(ModItems.TOPAZ.get()));

        tag(ModTags.Items.AMETHYST_REPAIRABLE)
                .add(ItemIds.AMETHYST_SHARD);

        tag(ModTags.Items.QUARTZ_REPAIRABLE)
                .add(ItemIds.QUARTZ);

        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.getRK(ModItems.RUBY.get()),
                        ModItems.getRK(ModItems.SAPPHIRE.get()),
                        ModItems.getRK(ModItems.TOPAZ.get()));

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_HELMET.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_HELMET.get()))
                .add(ModItems.getRK(ModItems.EMERALD_HELMET.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_HELMET.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_HELMET.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_HELMET.get()))
                .add(ModItems.getRK(ModItems.RUBY_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.EMERALD_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.RUBY_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.EMERALD_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.RUBY_BOOTS.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_BOOTS.get()))
                .add(ModItems.getRK(ModItems.EMERALD_BOOTS.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_BOOTS.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_BOOTS.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_BOOTS.get()));

        tag(ItemTags.SWORDS)
                .add(ModItems.getRK(ModItems.RUBY_SWORD.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SWORD.get()))
                .add(ModItems.getRK(ModItems.EMERALD_SWORD.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_SWORD.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_SWORD.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_SWORD.get()));

        tag(ItemTags.PICKAXES)
                .add(ModItems.getRK(ModItems.RUBY_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.EMERALD_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_PICKAXE.get()));

        tag(ItemTags.SHOVELS)
                .add(ModItems.getRK(ModItems.RUBY_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.EMERALD_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_SHOVEL.get()));

        tag(ItemTags.AXES)
                .add(ModItems.getRK(ModItems.RUBY_AXE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_AXE.get()))
                .add(ModItems.getRK(ModItems.EMERALD_AXE.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_AXE.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_AXE.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_AXE.get()));

        tag(ItemTags.HOES)
                .add(ModItems.getRK(ModItems.RUBY_HOE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_HOE.get()))
                .add(ModItems.getRK(ModItems.EMERALD_HOE.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_HOE.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_HOE.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_HOE.get()));

        tag(ItemTags.SPEARS)
                .add(ModItems.getRK(ModItems.RUBY_SPEAR.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SPEAR.get()))
                .add(ModItems.getRK(ModItems.EMERALD_SPEAR.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_SPEAR.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_SPEAR.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_SPEAR.get()));

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_HELMET.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_HELMET.get()))
                .add(ModItems.getRK(ModItems.EMERALD_HELMET.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_HELMET.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_HELMET.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_HELMET.get()));

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.EMERALD_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_CHESTPLATE.get()));

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.EMERALD_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_LEGGINGS.get()));

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_BOOTS.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_BOOTS.get()))
                .add(ModItems.getRK(ModItems.EMERALD_BOOTS.get()))
                .add(ModItems.getRK(ModItems.TOPAZ_BOOTS.get()))
                .add(ModItems.getRK(ModItems.AMETHYST_BOOTS.get()))
                .add(ModItems.getRK(ModItems.QUARTZ_BOOTS.get()));
    }
}
