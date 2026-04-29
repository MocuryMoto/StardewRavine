package net.mocury.stardewravine.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_IRIDIUM_TOOL = createTag("needs_iridium_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRIDIUM_TOOL = createTag("incorrect_for_iridium_tool");
        public static final TagKey<Block> NEEDS_NETHER_IRIDIUM_TOOL = createTag("needs_nether_iridium_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHER_IRIDIUM_TOOL = createTag("incorrect_for_nether_iridium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(StardewRavine.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CRYSTALARIUM_ITEMS = createTag("crystalarium_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(StardewRavine.MOD_ID, name));
        }
    }

}
