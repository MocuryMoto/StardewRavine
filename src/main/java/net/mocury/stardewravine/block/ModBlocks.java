package net.mocury.stardewravine.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.custom.*;
import net.mocury.stardewravine.world.tree.ModSaplingGenerators;

import static net.minecraft.block.Blocks.*;

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

    public static final Block FAIRY_ROSE = registerBlock("fairy_rose",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 10.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_FAIRY_ROSE = registerBlock("potted_fairy_rose", createFlowerPotBlock(FAIRY_ROSE));
    public static final Block BLUE_JAZZ = registerBlock("blue_jazz",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 5.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BLUE_JAZZ = registerBlock("potted_blue_jazz", createFlowerPotBlock(BLUE_JAZZ));
    public static final Block DAFFODIL = registerBlock("daffodil",
            new FlowerBlock(StatusEffects.NAUSEA, 7.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DAFFODIL = registerBlock("potted_daffodil", createFlowerPotBlock(DAFFODIL));
    public static final Block SWEET_PEA = registerBlock("sweet_pea",
            new FlowerBlock(StatusEffects.MINING_FATIGUE, 10.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SWEET_PEA = registerBlock("potted_sweet_pea", createFlowerPotBlock(SWEET_PEA));
    public static final Block SUMMER_SPANGLE = registerBlock("summer_spangle",
            new FlowerBlock(StatusEffects.HASTE, 10.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SUMMER_SPANGLE = registerBlock("potted_summer_spangle", createFlowerPotBlock(SUMMER_SPANGLE));
    public static final Block CROCUS = registerBlock("crocus",
            new FlowerBlock(StatusEffects.RESISTANCE, 5.0F,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CROCUS = registerBlock("potted_crocus", createFlowerPotBlock(CROCUS));
    public static final Block AMARANTH = registerBlock("amaranth",
            new TallFlowerBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FAIRY_ROSE_BUSH = registerBlock("fairy_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FAIRY_STONE_BLOCK = registerBlock("fairy_stone_block",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block END_FAIRY_ORE = registerBlock("end_fairy_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BIXITE = registerBlock("bixite",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BASALT)));
    public static final Block POLISHED_BIXITE = registerBlock("polished_bixite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).sounds(BlockSoundGroup.METAL)));
    public static final Block TERRASINE_BLOCK = registerBlock("terrasine_block",
            new Block(AbstractBlock.Settings.create().strength(1.5f)));
    public static final Block POLISHED_TERRASINE = registerBlock("polished_terrasine",
            new Block(AbstractBlock.Settings.create().strength(1.5f)));


    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem("garlic_crop",
            new GarlicCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LEEK_CROP = registerBlockWithoutBlockItem("leek_crop",
            new LeekCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPRING_ONION_CROP = registerBlockWithoutBlockItem("spring_onion_crop",
            new SpringOnionCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PARSNIP_CROP = registerBlockWithoutBlockItem("parsnip_crop",
            new ParsnipCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HORSERADISH_CROP = registerBlockWithoutBlockItem("horseradish_crop",
            new HorseradishCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RHUBARB_CROP = registerBlockWithoutBlockItem("rhubarb_crop",
            new RhubarbCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block KALE_CROP = registerBlockWithoutBlockItem("kale_crop",
            new KaleCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.create()
                    .ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SALMONBERRY_BUSH = registerBlockWithoutBlockItem("salmonberry_bush",
            new SalmonberryBushBlock(AbstractBlock.Settings.create()
                    .ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutBlockItem("strawberry_bush",
            new StrawberryBushBlock(AbstractBlock.Settings.create()
                    .ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            new SaplingBlock(ModSaplingGenerators.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block MAPLE_DOOR = registerBlock("maple_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block MYSTIC_LOG = registerBlock("mystic_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block MYSTIC_WOOD = registerBlock("mystic_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MYSTIC_LOG = registerBlock("stripped_mystic_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MYSTIC_WOOD = registerBlock("stripped_mystic_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block MYSTIC_PLANKS = registerBlock("mystic_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block MYSTIC_LEAVES = registerBlock("mystic_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block MYSTIC_SAPLING = registerBlock("mystic_sapling",
            new SaplingBlock(ModSaplingGenerators.MYSTIC, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block MYSTIC_STAIRS = registerBlock("mystic_stairs",
            new StairsBlock(ModBlocks.MYSTIC_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MYSTIC_SLAB = registerBlock("mystic_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MYSTIC_BUTTON = registerBlock("mystic_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block MYSTIC_PRESSURE_PLATE = registerBlock("mystic_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block MYSTIC_FENCE = registerBlock("mystic_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block MYSTIC_FENCE_GATE = registerBlock("mystic_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block MYSTIC_DOOR = registerBlock("mystic_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block MYSTIC_TRAPDOOR = registerBlock("mystic_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block APRICOT_LOG = registerBlock("apricot_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block APRICOT_WOOD = registerBlock("apricot_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_APRICOT_LOG = registerBlock("stripped_apricot_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_APRICOT_WOOD = registerBlock("stripped_apricot_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block APRICOT_PLANKS = registerBlock("apricot_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block APRICOT_LEAVES = registerBlock("apricot_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block APRICOT_SAPLING = registerBlock("apricot_sapling",
            new SaplingBlock(ModSaplingGenerators.APRICOT, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block APRICOT_STAIRS = registerBlock("apricot_stairs",
            new StairsBlock(ModBlocks.APRICOT_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block APRICOT_SLAB = registerBlock("apricot_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block APRICOT_BUTTON = registerBlock("apricot_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block APRICOT_PRESSURE_PLATE = registerBlock("apricot_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block APRICOT_FENCE = registerBlock("apricot_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block APRICOT_FENCE_GATE = registerBlock("apricot_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block APRICOT_DOOR = registerBlock("apricot_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block APRICOT_TRAPDOOR = registerBlock("apricot_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block ORANGE_LOG = registerBlock("orange_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
    public static final Block ORANGE_WOOD = registerBlock("orange_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling",
            new SaplingBlock(ModSaplingGenerators.ORANGE, AbstractBlock.Settings.copy(Blocks.CHERRY_SAPLING)));
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            new StairsBlock(ModBlocks.ORANGE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            new ButtonBlock(BlockSetType.CHERRY, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_PRESSURE_PLATE)));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CHERRY_FENCE)));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(CHERRY_FENCE_GATE)));
    public static final Block ORANGE_DOOR = registerBlock("orange_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_DOOR)));
    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_TRAPDOOR)));

    public static final Block POMEGRANATE_LOG = registerBlock("pomegranate_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block POMEGRANATE_WOOD = registerBlock("pomegranate_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_POMEGRANATE_LOG = registerBlock("stripped_pomegranate_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_POMEGRANATE_WOOD = registerBlock("stripped_pomegranate_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            new SaplingBlock(ModSaplingGenerators.POMEGRANATE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POMEGRANATE_STAIRS = registerBlock("pomegranate_stairs",
            new StairsBlock(ModBlocks.POMEGRANATE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block POMEGRANATE_SLAB = registerBlock("pomegranate_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block POMEGRANATE_BUTTON = registerBlock("pomegranate_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block POMEGRANATE_PRESSURE_PLATE = registerBlock("pomegranate_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block POMEGRANATE_FENCE = registerBlock("pomegranate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block POMEGRANATE_FENCE_GATE = registerBlock("pomegranate_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block POMEGRANATE_DOOR = registerBlock("pomegranate_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block POMEGRANATE_TRAPDOOR = registerBlock("pomegranate_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block MANGO_LOG = registerBlock("mango_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block MANGO_WOOD = registerBlock("mango_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block MANGO_PLANKS = registerBlock("mango_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block MANGO_SAPLING = registerBlock("mango_sapling",
            new SaplingBlock(ModSaplingGenerators.MANGO, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block MANGO_STAIRS = registerBlock("mango_stairs",
            new StairsBlock(ModBlocks.MANGO_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGO_SLAB = registerBlock("mango_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGO_BUTTON = registerBlock("mango_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block MANGO_PRESSURE_PLATE = registerBlock("mango_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block MANGO_FENCE = registerBlock("mango_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block MANGO_FENCE_GATE = registerBlock("mango_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block MANGO_DOOR = registerBlock("mango_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block MANGO_TRAPDOOR = registerBlock("mango_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block BANANA_LOG = registerBlock("banana_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block BANANA_WOOD = registerBlock("banana_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BANANA_LOG = registerBlock("stripped_banana_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BANANA_WOOD = registerBlock("stripped_banana_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BANANA_PLANKS = registerBlock("banana_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BANANA_LEAVES = registerBlock("banana_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block BANANA_SAPLING = registerBlock("banana_sapling",
            new SaplingBlock(ModSaplingGenerators.BANANA, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block BANANA_STAIRS = registerBlock("banana_stairs",
            new StairsBlock(ModBlocks.BANANA_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BANANA_SLAB = registerBlock("banana_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BANANA_BUTTON = registerBlock("banana_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(OAK_BUTTON)));
    public static final Block BANANA_PRESSURE_PLATE = registerBlock("banana_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)));
    public static final Block BANANA_FENCE = registerBlock("banana_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)));
    public static final Block BANANA_FENCE_GATE = registerBlock("banana_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(OAK_FENCE_GATE)));
    public static final Block BANANA_DOOR = registerBlock("banana_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR)));
    public static final Block BANANA_TRAPDOOR = registerBlock("banana_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR)));

    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
    public static final Block PEACH_WOOD = registerBlock("peach_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_PEACH_WOOD = registerBlock("stripped_peach_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block PEACH_PLANKS = registerBlock("peach_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block PEACH_LEAVES = registerBlock("peach_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));
    public static final Block PEACH_SAPLING = registerBlock("peach_sapling",
            new SaplingBlock(ModSaplingGenerators.PEACH, AbstractBlock.Settings.copy(Blocks.CHERRY_SAPLING)));
    public static final Block PEACH_STAIRS = registerBlock("peach_stairs",
            new StairsBlock(ModBlocks.PEACH_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block PEACH_SLAB = registerBlock("peach_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block PEACH_BUTTON = registerBlock("peach_button",
            new ButtonBlock(BlockSetType.CHERRY, 30, AbstractBlock.Settings.copy(CHERRY_BUTTON)));
    public static final Block PEACH_PRESSURE_PLATE = registerBlock("peach_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_PRESSURE_PLATE)));
    public static final Block PEACH_FENCE = registerBlock("peach_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CHERRY_FENCE)));
    public static final Block PEACH_FENCE_GATE = registerBlock("peach_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(CHERRY_FENCE_GATE)));
    public static final Block PEACH_DOOR = registerBlock("peach_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_DOOR)));
    public static final Block PEACH_TRAPDOOR = registerBlock("peach_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_TRAPDOOR)));

    public static final Block FIDDLEHEAD_LOG = registerBlock("fiddlehead_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
    public static final Block FIDDLEHEAD_WOOD = registerBlock("fiddlehead_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_FIDDLEHEAD_LOG = registerBlock("stripped_fiddlehead_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_FIDDLEHEAD_WOOD = registerBlock("stripped_fiddlehead_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block FIDDLEHEAD_PLANKS = registerBlock("fiddlehead_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block FIDDLEHEAD_LEAVES = registerBlock("fiddlehead_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));
    public static final Block FIDDLEHEAD_SAPLING = registerBlock("fiddlehead_sapling",
            new SaplingBlock(ModSaplingGenerators.FIDDLEHEAD, AbstractBlock.Settings.copy(CHERRY_SAPLING)));
    public static final Block FIDDLEHEAD_STAIRS = registerBlock("fiddlehead_stairs",
            new StairsBlock(ModBlocks.FIDDLEHEAD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block FIDDLEHEAD_SLAB = registerBlock("fiddlehead_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block FIDDLEHEAD_BUTTON = registerBlock("fiddlehead_button",
            new ButtonBlock(BlockSetType.CHERRY, 30, AbstractBlock.Settings.copy(CHERRY_BUTTON)));
    public static final Block FIDDLEHEAD_PRESSURE_PLATE = registerBlock("fiddlehead_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_PRESSURE_PLATE)));
    public static final Block FIDDLEHEAD_FENCE = registerBlock("fiddlehead_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CHERRY_FENCE)));
    public static final Block FIDDLEHEAD_FENCE_GATE = registerBlock("fiddlehead_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(CHERRY_FENCE_GATE)));
    public static final Block FIDDLEHEAD_DOOR = registerBlock("fiddlehead_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_DOOR)));
    public static final Block FIDDLEHEAD_TRAPDOOR = registerBlock("fiddlehead_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(CHERRY_TRAPDOOR)));

    public static final Block FRUITING_APRICOT_LEAVES = registerBlock("fruiting_apricot_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES)));
    public static final Block FRUITING_ORANGE_LEAVES = registerBlock("fruiting_orange_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(CHERRY_LEAVES)));
    public static final Block FRUITING_POMEGRANATE_LEAVES = registerBlock("fruiting_pomegranate_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES)));
    public static final Block FRUITING_MANGO_LEAVES = registerBlock("fruiting_mango_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES)));
    public static final Block FRUITING_BANANA_LEAVES = registerBlock("fruiting_banana_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES)));
    public static final Block FRUITING_PEACH_LEAVES = registerBlock("fruiting_peach_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(CHERRY_LEAVES)));
    public static final Block FRUITING_CHERRY_LEAVES = registerBlock("fruiting_cherry_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(CHERRY_LEAVES)));


    public static final Block PETRIFIED_SLIME_BLOCK = registerBlock("petrified_slime_block",
            new Block(AbstractBlock.Settings.create().strength(3f).nonOpaque()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StardewRavine.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
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
