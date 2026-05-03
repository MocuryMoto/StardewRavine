package net.mocury.stardewravine.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
    public static final Block PEARL_BLOCK = registerBlock("pearl_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block HELVINE_BLOCK = registerBlock("helvine_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_HELVINE = registerBlock("polished_helvine",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LEMON_STONE_BLOCK = registerBlock("lemon_stone_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_LEMON_STONE = registerBlock("polished_lemon_stone",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block TIGERS_EYE_BLOCK = registerBlock("tigers_eye_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_TIGERS_EYE = registerBlock("polished_tigers_eye",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block KYANITE_BLOCK = registerBlock("kyanite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_KYANITE = registerBlock("polished_kyanite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PYRITE_BLOCK = registerBlock("pyrite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_PYRITE = registerBlock("polished_pyrite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FLUORAPATITE_BLOCK = registerBlock("fluorapatite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_FLUORAPATITE = registerBlock("polished_fluorapatite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block JAGOITE_BLOCK = registerBlock("jagoite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_JAGOITE = registerBlock("polished_jagoite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block CELESTINE_BLOCK = registerBlock("celestine_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_CELESTINE = registerBlock("polished_celestine",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GEMINITE_BLOCK = registerBlock("geminite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_GEMINITE = registerBlock("polished_geminite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block JASPER_BLOCK = registerBlock("jasper_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_JASPER = registerBlock("polished_jasper",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block AERINITE_BLOCK = registerBlock("aerinite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_AERINITE = registerBlock("polished_aerinite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ORPIMENT_BLOCK = registerBlock("orpiment_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_ORPIMENT = registerBlock("polished_orpiment",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DOLOMITE_BLOCK = registerBlock("dolomite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_DOLOMITE = registerBlock("polished_dolomite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block JAMBORITE_BLOCK = registerBlock("jamborite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_JAMBORITE = registerBlock("polished_jamborite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NEKOITE_BLOCK = registerBlock("nekoite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_NEKOITE = registerBlock("polished_nekoite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NEPTUNITE_BLOCK = registerBlock("neptunite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_NEPTUNITE = registerBlock("polished_neptunite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LUNARITE_BLOCK = registerBlock("lunarite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_LUNARITE = registerBlock("polished_lunarite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block END_LUNARITE_ORE = registerBlock("end_lunarite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RAW_HEMATITE = registerBlock("raw_hematite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block REFINED_HEMATITE = registerBlock("refined_hematite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block HEMATITE_ROSE = registerBlock("hematite_rose",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DESERT_ROSE = registerBlock("desert_rose",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MALACHITE_BLOCK = registerBlock("malachite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POLISHED_MALACHITE = registerBlock("polished_malachite",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block CALCITE_MALACHITE_ORE = registerBlock("calcite_malachite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block LIMESTONE_MALACHITE_ORE = registerBlock("limestone_malachite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));

    public static final Block OPAL_BLOCK = registerBlock("opal_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_OPAL_BLOCK = registerBlock("smooth_opal_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OPAL_BONE_BLOCK = registerBlock("opal_bone_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block END_OPAL_ORE = registerBlock("end_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(2.5f).requiresTool()));
    public static final Block DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block FIRE_OPAL_BLOCK = registerBlock("fire_opal_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SMOOTH_FIRE_OPAL_BLOCK = registerBlock("smooth_fire_opal_block",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FIRE_OPAL_BONE_BLOCK = registerBlock("fire_opal_bone_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NETHER_FIRE_OPAL_ORE = registerBlock("nether_fire_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block END_FIRE_OPAL_ORE = registerBlock("end_fire_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(2.5f).requiresTool()));
    public static final Block DEEPSLATE_FIRE_OPAL_ORE = registerBlock("deepslate_fire_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block ESPERITE = registerBlock("esperite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_ESPERITE = registerBlock("polished_esperite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SMOOTH_ESPERITE = registerBlock("smooth_esperite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPERITE_BRICKS = registerBlock("esperite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPERITE_PILLAR = registerBlock("esperite_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block CHISELED_ESPERITE = registerBlock("chiseled_esperite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPERITE_SLAB = registerBlock("esperite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPERITE_STAIRS = registerBlock("esperite_stairs",
            new StairsBlock(ModBlocks.ESPERITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPERITE_WALL = registerBlock("esperite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_ESPERITE_SLAB = registerBlock("polished_esperite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_ESPERITE_STAIRS = registerBlock("polished_esperite_stairs",
            new StairsBlock(ModBlocks.POLISHED_ESPERITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_ESPERITE_WALL = registerBlock("polished_esperite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SMOOTH_MARBLE = registerBlock("smooth_marble",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_PILLAR = registerBlock("marble_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block CHISELED_MARBLE = registerBlock("chiseled_marble",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(ModBlocks.MARBLE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_WALL = registerBlock("marble_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE = registerBlock("soapstone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_SOAPSTONE = registerBlock("polished_soapstone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SMOOTH_SOAPSTONE = registerBlock("smooth_soapstone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE_BRICKS = registerBlock("soapstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE_PILLAR = registerBlock("soapstone_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block CHISELED_SOAPSTONE = registerBlock("chiseled_soapstone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE_SLAB = registerBlock("soapstone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE_STAIRS = registerBlock("soapstone_stairs",
            new StairsBlock(ModBlocks.SOAPSTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAPSTONE_WALL = registerBlock("soapstone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_SOAPSTONE_SLAB = registerBlock("polished_soapstone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_SOAPSTONE_STAIRS = registerBlock("polished_soapstone_stairs",
            new StairsBlock(ModBlocks.POLISHED_SOAPSTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_SOAPSTONE_WALL = registerBlock("polished_soapstone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_LIMESTONE = registerBlock("polished_limestone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SMOOTH_LIMESTONE = registerBlock("smooth_limestone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE_PILLAR = registerBlock("limestone_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block CHISELED_LIMESTONE = registerBlock("chiseled_limestone",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new StairsBlock(ModBlocks.LIMESTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            new StairsBlock(ModBlocks.POLISHED_LIMESTONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block POLISHED_LIMESTONE_WALL = registerBlock("polished_limestone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));

    public static final Block SOAP_LIME_TILES = registerBlock("soap_lime_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIME_SOAP_TILES = registerBlock("lime_soap_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAP_ESPER_TILES = registerBlock("soap_esper_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPER_SOAP_TILES = registerBlock("esper_soap_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SOAP_MARBLE_TILES = registerBlock("soap_marble_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_SOAP_TILES = registerBlock("marble_soap_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_LIME_TILES = registerBlock("marble_lime_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIME_MARBLE_TILES = registerBlock("lime_marble_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block MARBLE_ESPER_TILES = registerBlock("marble_esper_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPER_MARBLE_TILES = registerBlock("esper_marble_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block LIME_ESPER_TILES = registerBlock("lime_esper_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block ESPER_LIME_TILES = registerBlock("esper_lime_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));

    public static final Block FIRE_QUARTZ_BLOCK = registerBlock("fire_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block SMOOTH_FIRE_QUARTZ_BLOCK = registerBlock("smooth_fire_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block FIRE_QUARTZ_BRICKS = registerBlock("fire_quartz_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block FIRE_QUARTZ_PILLAR = registerBlock("fire_quartz_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block CHISELED_FIRE_QUARTZ  = registerBlock("chiseled_fire_quartz",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block FIRE_QUARTZ_SLAB = registerBlock("fire_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block FIRE_QUARTZ_STAIRS = registerBlock("fire_quartz_stairs",
            new StairsBlock(ModBlocks.FIRE_QUARTZ_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool()));
    public static final Block FIRE_QUARTZ_ORE = registerBlock("fire_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block BUDDING_CINDER_SHARD_BLOCK = registerBlock("budding_cinder_shard_block",
            new BuddingCinderShardBlock(AbstractBlock.Settings.create().ticksRandomly().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block CINDER_SHARD_BLOCK = registerBlock("cinder_shard_block",
            new CinderShardBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CINDER_CLUSTER = registerBlock("cinder_cluster",
            new CinderClusterBlock(7.0f,3.0f, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public static final Block LARGE_CINDER_BUD = registerBlock("large_cinder_bud",
            new CinderClusterBlock(5.0f,3.0f, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD)));
    public static final Block MEDIUM_CINDER_BUD = registerBlock("medium_cinder_bud",
            new CinderClusterBlock(4.0f,3.0f, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)));
    public static final Block SMALL_CINDER_BUD = registerBlock("small_cinder_bud",
            new CinderClusterBlock(3.0f,4.0f, AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)));
    public static final Block CINDER_SHARD_ORE = registerBlock("cinder_shard_ore",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block SCROLL_BLOCK = registerBlock("scroll_block",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block RED_SCROLL = registerBlock("red_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block ORANGE_SCROLL = registerBlock("orange_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block YELLOW_SCROLL = registerBlock("yellow_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block LIME_SCROLL = registerBlock("lime_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block GREEN_SCROLL = registerBlock("green_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block CYAN_SCROLL = registerBlock("cyan_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block LIGHT_BLUE_SCROLL = registerBlock("light_blue_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block BLUE_SCROLL = registerBlock("blue_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block PURPLE_SCROLL = registerBlock("purple_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block MAGENTA_SCROLL = registerBlock("magenta_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block PINK_SCROLL = registerBlock("pink_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block WHITE_SCROLL = registerBlock("white_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block LIGHT_GRAY_SCROLL = registerBlock("light_gray_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block GRAY_SCROLL = registerBlock("gray_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block BLACK_SCROLL = registerBlock("black_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));
    public static final Block BROWN_SCROLL = registerBlock("brown_scroll",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));

    public static final Block MARBLE_LAPIS_ORE = registerBlock("marble_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block LIMESTONE_LAPIS_ORE = registerBlock("limestone_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block PYRITE_LAPIS_ORE = registerBlock("pyrite_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block GEODE_ORE = registerBlock("geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DEEPSLATE_GEODE_ORE = registerBlock("deepslate_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block FROZEN_GEODE_ORE = registerBlock("frozen_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DEEPSLATE_FROZEN_GEODE_ORE = registerBlock("deepslate_frozen_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block END_FROZEN_GEODE_ORE = registerBlock("end_frozen_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block NETHER_MAGMA_GEODE_ORE = registerBlock("nether_magma_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block BLACKSTONE_MAGMA_GEODE_ORE = registerBlock("blackstone_magma_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block BASALT_MAGMA_GEODE_ORE = registerBlock("basalt_magma_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));
    public static final Block DEEPSLATE_OMNI_GEODE_ORE = registerBlock("deepslate_omni_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block END_OMNI_GEODE_ORE = registerBlock("end_omni_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block NETHER_OMNI_GEODE_ORE = registerBlock("nether_omni_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block BLACKSTONE_OMNI_GEODE_ORE = registerBlock("blackstone_omni_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block BASALT_OMNI_GEODE_ORE = registerBlock("basalt_omni_geode_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));

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
            entries.add(ModBlocks.ESPERITE_PILLAR);
            entries.add(ModBlocks.CHISELED_ESPERITE);
            entries.add(ModBlocks.MARBLE);
            entries.add(ModBlocks.POLISHED_MARBLE);
            entries.add(ModBlocks.SMOOTH_MARBLE);
            entries.add(ModBlocks.MARBLE_BRICKS);
            entries.add(ModBlocks.MARBLE_PILLAR);
            entries.add(ModBlocks.CHISELED_MARBLE);
            entries.add(ModBlocks.SOAPSTONE);
            entries.add(ModBlocks.POLISHED_SOAPSTONE);
            entries.add(ModBlocks.SMOOTH_SOAPSTONE);
            entries.add(ModBlocks.SOAPSTONE_BRICKS);
            entries.add(ModBlocks.SOAPSTONE_PILLAR);
            entries.add(ModBlocks.CHISELED_SOAPSTONE);
            entries.add(ModBlocks.LIMESTONE);
            entries.add(ModBlocks.POLISHED_LIMESTONE);
            entries.add(ModBlocks.SMOOTH_LIMESTONE);
            entries.add(ModBlocks.LIMESTONE_BRICKS);
            entries.add(ModBlocks.LIMESTONE_PILLAR);
            entries.add(ModBlocks.CHISELED_LIMESTONE);
        });
    }
}
