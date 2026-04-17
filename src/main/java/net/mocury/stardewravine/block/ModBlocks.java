package net.mocury.stardewravine.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

public class ModBlocks {
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block PRISMATIC_SHARD_BLOCK = registerBlock("prismatic_shard_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RADIONITE_BLOCK = registerBlock("radionite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_RADIONITE_BLOCK = registerBlock("raw_radionite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block NETHER_RADIONITE_ORE = registerBlock("nether_radionite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StardewRavine.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(StardewRavine.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StardewRavine.LOGGER.info("Registering Mod Blocks for "+StardewRavine.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PRISMATIC_SHARD_BLOCK);
            entries.add(ModBlocks.AQUAMARINE_BLOCK);
            entries.add(ModBlocks.TOPAZ_BLOCK);
            entries.add(ModBlocks.JADE_BLOCK);
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.RADIONITE_BLOCK);
            entries.add(ModBlocks.RAW_RADIONITE_BLOCK);
            entries.add(ModBlocks.NETHER_RADIONITE_ORE);
        });
    }
}
