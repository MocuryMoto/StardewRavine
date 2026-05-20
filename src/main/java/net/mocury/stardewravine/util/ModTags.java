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
        public static final TagKey<Block> MAPLE_LOGS = createTag("maple_logs");
        public static final TagKey<Block> MYSTIC_LOGS = createTag("mystic_logs");
        public static final TagKey<Block> APRICOT_LOGS = createTag("apricot_logs");
        public static final TagKey<Block> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Block> POMEGRANATE_LOGS = createTag("pomegranate_logs");
        public static final TagKey<Block> MANGO_LOGS = createTag("mango_logs");
        public static final TagKey<Block> BANANA_LOGS = createTag("banana_logs");
        public static final TagKey<Block> PEACH_LOGS = createTag("peach_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(StardewRavine.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CRYSTALARIUM_ITEMS = createTag("crystalarium_items");
        public static final TagKey<Item> MAPLE_LOGS = createTag("maple_logs");
        public static final TagKey<Item> MYSTIC_LOGS = createTag("mystic_logs");
        public static final TagKey<Item> APRICOT_LOGS = createTag("apricot_logs");
        public static final TagKey<Item> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Item> POMEGRANATE_LOGS = createTag("pomegranate_logs");
        public static final TagKey<Item> MANGO_LOGS = createTag("mango_logs");
        public static final TagKey<Item> BANANA_LOGS = createTag("banana_logs");
        public static final TagKey<Item> PEACH_LOGS = createTag("peach_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(StardewRavine.MOD_ID, name));
        }
    }

}
