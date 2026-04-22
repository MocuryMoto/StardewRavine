package net.mocury.stardewravine.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.custom.BuddingCinderShardBlock;
import net.mocury.stardewravine.block.custom.CinderClusterBlock;
import net.mocury.stardewravine.block.custom.CinderShardBlock;

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
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block AQUAMARINE_DEEPSLATE_ORE = registerBlock("aquamarine_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block TOPAZ_DEEPSLATE_ORE = registerBlock("topaz_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_TOPAZ_ORE = registerBlock("nether_topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block JADE_DEEPSLATE_ORE = registerBlock("jade_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 4),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block REFINED_QUARTZ_BLOCK = registerBlock("refined_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block",
            new Block(AbstractBlock.Settings.create().strength(6f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block",
            new Block(AbstractBlock.Settings.create().strength(6f).requiresTool()));
    public static final Block IRIDIUM_DEEPSLATE_ORE = registerBlock("iridium_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 7),
                    AbstractBlock.Settings.create().strength(8f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_IRIDIUM_ORE = registerBlock("nether_iridium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 6),
                    AbstractBlock.Settings.create().strength(7f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block ESPERITE = registerBlock("esperite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_ESPERITE = registerBlock("polished_esperite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_ESPERITE = registerBlock("smooth_esperite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ESPERITE_BRICKS = registerBlock("esperite_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_MARBLE = registerBlock("smooth_marble",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SOAPSTONE = registerBlock("soapstone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_SOAPSTONE = registerBlock("polished_soapstone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_SOAPSTONE = registerBlock("smooth_soapstone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SOAPSTONE_BRICKS = registerBlock("soapstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_LIMESTONE = registerBlock("polished_limestone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_LIMESTONE = registerBlock("smooth_limestone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PEARL_BLOCK = registerBlock("pearl_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block BUDDING_CINDER_SHARD_BLOCK = registerBlock("budding_cinder_shard_block",
            new BuddingCinderShardBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CINDER_SHARD_BLOCK = registerBlock("cinder_shard_block",
            new CinderShardBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CINDER_CLUSTER = registerBlock("cinder_cluster",
            new CinderClusterBlock(0,0, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block LARGE_CINDER_BUD = registerBlock("large_cinder_bud",
            new CinderClusterBlock(0,0, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block MEDIUM_CINDER_BUD = registerBlock("medium_cinder_bud",
            new CinderClusterBlock(0,0, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SMALL_CINDER_BUD = registerBlock("small_cinder_bud",
            new CinderClusterBlock(0,0, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CINDER_SHARD_ORE = registerBlock("cinder_shard_ore",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

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
            entries.add(ModBlocks.REFINED_QUARTZ_BLOCK);
            entries.add(ModBlocks.IRIDIUM_BLOCK);
            entries.add(ModBlocks.RAW_IRIDIUM_BLOCK);
            entries.add(ModBlocks.ESPERITE);
            entries.add(ModBlocks.POLISHED_ESPERITE);
            entries.add(ModBlocks.SMOOTH_ESPERITE);
            entries.add(ModBlocks.ESPERITE_BRICKS);
            entries.add(ModBlocks.MARBLE);
            entries.add(ModBlocks.POLISHED_MARBLE);
            entries.add(ModBlocks.SMOOTH_MARBLE);
            entries.add(ModBlocks.MARBLE_BRICKS);
            entries.add(ModBlocks.SOAPSTONE);
            entries.add(ModBlocks.POLISHED_SOAPSTONE);
            entries.add(ModBlocks.SMOOTH_SOAPSTONE);
            entries.add(ModBlocks.SOAPSTONE_BRICKS);
            entries.add(ModBlocks.LIMESTONE);
            entries.add(ModBlocks.POLISHED_LIMESTONE);
            entries.add(ModBlocks.SMOOTH_LIMESTONE);
            entries.add(ModBlocks.LIMESTONE_BRICKS);
        });
    }
}
