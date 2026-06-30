package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, GemsAndCrystals.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.RUBY_REPAIRABLE)
                .add(ModItems.RUBY.get());

        tag(ModTags.Items.SAPPHIRE_REPAIRABLE)
                .add(ModItems.SAPPHIRE.get());

        tag(ModTags.Items.EMERALD_REPAIRABLE)
                .add(Items.EMERALD);

        tag(ModTags.Items.TOPAZ_REPAIRABLE)
                .add(ModItems.TOPAZ.get());

        tag(ModTags.Items.AMETHYST_REPAIRABLE)
                .add(Items.AMETHYST_SHARD);

        tag(ModTags.Items.QUARTZ_REPAIRABLE)
                .add(Items.QUARTZ);

        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY.get(),
                        ModItems.SAPPHIRE.get(),
                        ModItems.TOPAZ.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get())
                .add(ModItems.SAPPHIRE_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.TOPAZ_SWORD.get())
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.QUARTZ_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get())
                .add(ModItems.SAPPHIRE_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.TOPAZ_PICKAXE.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.QUARTZ_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get())
                .add(ModItems.SAPPHIRE_SHOVEL.get())
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.TOPAZ_SHOVEL.get())
                .add(ModItems.AMETHYST_SHOVEL.get())
                .add(ModItems.QUARTZ_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get())
                .add(ModItems.SAPPHIRE_AXE.get())
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.TOPAZ_AXE.get())
                .add(ModItems.AMETHYST_AXE.get())
                .add(ModItems.QUARTZ_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get())
                .add(ModItems.SAPPHIRE_HOE.get())
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.TOPAZ_HOE.get())
                .add(ModItems.AMETHYST_HOE.get())
                .add(ModItems.QUARTZ_HOE.get());

        tag(ItemTags.SPEARS)
                .add(ModItems.RUBY_SPEAR.get())
                .add(ModItems.SAPPHIRE_SPEAR.get())
                .add(ModItems.EMERALD_SPEAR.get())
                .add(ModItems.TOPAZ_SPEAR.get())
                .add(ModItems.AMETHYST_SPEAR.get())
                .add(ModItems.QUARTZ_SPEAR.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get());
    }
}
