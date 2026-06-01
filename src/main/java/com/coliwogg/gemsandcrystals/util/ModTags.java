package com.coliwogg.gemsandcrystals.util;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> RUBY_REPAIRABLE = createTag("ruby_repairable");
        public static final TagKey<Item> SAPPHIRE_REPAIRABLE = createTag("sapphire_repairable");
        public static final TagKey<Item> EMERALD_REPAIRABLE = createTag("emerald_repairable");
        public static final TagKey<Item> TOPAZ_REPAIRABLE = createTag("topaz_repairable");
        public static final TagKey<Item> AMETHYST_REPAIRABLE = createTag("amethyst_repairable");
        public static final TagKey<Item> QUARTZ_REPAIRABLE = createTag("quartz_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name));
        }
    }
}
