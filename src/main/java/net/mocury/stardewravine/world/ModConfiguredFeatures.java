package net.mocury.stardewravine.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.block.custom.BlueberryBushBlock;
import net.mocury.stardewravine.block.custom.CoffeeBushBlock;
import net.mocury.stardewravine.block.custom.SalmonberryBushBlock;
import net.mocury.stardewravine.block.custom.StrawberryBushBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("iridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_IRIDIUM_ORE_KEY = registerKey("nether_iridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_RADIONITE_ORE_KEY = registerKey("nether_radionite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIRE_QUARTZ_ORE_KEY = registerKey("fire_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CINDER_SHARD_ORE_KEY = registerKey("cinder_shard_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_KEY = registerKey("aquamarine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_TOPAZ_ORE_KEY = registerKey("nether_topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GEODE_ORE_KEY = registerKey("geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROZEN_GEODE_ORE_KEY = registerKey("frozen_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_FROZEN_GEODE_ORE_KEY = registerKey("end_frozen_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_MAGMA_GEODE_ORE_KEY = registerKey("nether_magma_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_OMNI_GEODE_ORE_KEY = registerKey("deepslate_omni_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_OMNI_GEODE_ORE_KEY = registerKey("end_omni_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_OMNI_GEODE_ORE_KEY = registerKey("nether_omni_geode_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ESPERITE_ORE_KEY = registerKey("esperite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARBLE_ORE_KEY = registerKey("marble_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOAPSTONE_ORE_KEY = registerKey("soapstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIMESTONE_ORE_KEY = registerKey("limestone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HEMATITE_ORE_KEY = registerKey("hematite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIXITE_ORE_KEY = registerKey("bixite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TERRASINE_ORE_KEY = registerKey("terrasine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FAIRY_ORE_KEY = registerKey("fairy_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUNARITE_ORE_KEY = registerKey("lunarite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registerKey("opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIRE_OPAL_ORE_KEY = registerKey("fire_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_OPAL_ORE_KEY = registerKey("end_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_FIRE_OPAL_ORE_KEY = registerKey("nether_fire_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_FIRE_OPAL_ORE_KEY = registerKey("end_fire_opal_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MYSTIC_KEY = registerKey("mystic");
    public static final RegistryKey<ConfiguredFeature<?, ?>> APRICOT_KEY = registerKey("apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_KEY = registerKey("orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POMEGRANATE_KEY = registerKey("pomegranate");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANGO_KEY = registerKey("mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BANANA_KEY = registerKey("banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_KEY = registerKey("peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIDDLEHEAD_KEY = registerKey("fiddlehead");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SALMONBERRY_BUSH_KEY = registerKey("salmonberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STRAWBERRY_BUSH_KEY = registerKey("strawberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COFFEE_BUSH_KEY = registerKey("coffee_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIDDLEHEAD_SAPLING_KEY = registerKey("fiddlehead_sapling");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest deepslateReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest netherReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest blackstoneReplaceables = new BlockMatchRuleTest(Blocks.BLACKSTONE);
        RuleTest overworldReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overworldIridiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.IRIDIUM_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherIridiumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_IRIDIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRadioniteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_RADIONITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherFireQuartzOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.FIRE_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherCinderShardOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.CINDER_SHARD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.AQUAMARINE_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TOPAZ_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.JADE_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RUBY_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherTopazOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGeodeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldFrozenGeodeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.FROZEN_GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_FROZEN_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endFrozenGeodeOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_FROZEN_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherMagmaGeodeOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_MAGMA_GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(basaltReplaceables, ModBlocks.BASALT_MAGMA_GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(blackstoneReplaceables, ModBlocks.BLACKSTONE_MAGMA_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOmniGeodeOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_OMNI_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endOmniGeodeOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_OMNI_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherOmniGeodeOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_OMNI_GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(basaltReplaceables, ModBlocks.BASALT_OMNI_GEODE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(blackstoneReplaceables, ModBlocks.BLACKSTONE_OMNI_GEODE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldEsperiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ESPERITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMarbleOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MARBLE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSoapstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SOAPSTONE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SOAPSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLimestoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LIMESTONE.getDefaultState()));
        List<OreFeatureConfig.Target> netherHematiteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RAW_HEMATITE.getDefaultState()));
        List<OreFeatureConfig.Target> netherBixiteOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, ModBlocks.BIXITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTerrasineOres =
                List.of(OreFeatureConfig.createTarget(overworldReplaceables, ModBlocks.TERRASINE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> endFairyOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_FAIRY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endLunariteOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_LUNARITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldFireOpalOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_FIRE_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherFireOpalOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_FIRE_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endOpalOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endFireOpalOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_FIRE_OPAL_ORE.getDefaultState()));



        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldIridiumOres, 3));
        register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherIridiumOres, 3));
        register(context, NETHER_RADIONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRadioniteOres, 3));
        register(context, FIRE_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherFireQuartzOres, 10));
        register(context, CINDER_SHARD_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCinderShardOres, 5));
        register(context, AQUAMARINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineOres, 8));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 8));
        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 8));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 8));
        register(context, NETHER_TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTopazOres, 10));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 10));
        register(context, GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGeodeOres, 6));
        register(context, FROZEN_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldFrozenGeodeOres, 5));
        register(context, END_FROZEN_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endFrozenGeodeOres, 7));
        register(context, NETHER_MAGMA_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMagmaGeodeOres, 7));
        register(context, DEEPSLATE_OMNI_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOmniGeodeOres, 3));
        register(context, END_OMNI_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endOmniGeodeOres, 6));
        register(context, NETHER_OMNI_GEODE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherOmniGeodeOres, 5));
        register(context, ESPERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldEsperiteOres, 64));
        register(context, MARBLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMarbleOres, 64));
        register(context, SOAPSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSoapstoneOres, 64));
        register(context, LIMESTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLimestoneOres, 64));
        register(context, HEMATITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherHematiteOres, 33));
        register(context, BIXITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBixiteOres, 33));
        register(context, TERRASINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTerrasineOres, 33));
        register(context, FAIRY_ORE_KEY, Feature.ORE, new OreFeatureConfig(endFairyOres, 9));
        register(context, LUNARITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endLunariteOres, 5));
        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 5));
        register(context, FIRE_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldFireOpalOres, 5));
        register(context, NETHER_FIRE_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherFireOpalOres, 6));
        register(context, END_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endOpalOres, 6));
        register(context, END_FIRE_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endFireOpalOres, 5));


        register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(5, 2, 2), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), //radius, ?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, MYSTIC_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MYSTIC_LOG),
                new StraightTrunkPlacer(6, 3, 3), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.MYSTIC_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(7), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, APRICOT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.APRICOT_LOG),
                new StraightTrunkPlacer(5, 2, 0), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.APRICOT_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ORANGE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ORANGE_LOG),
                new CherryTrunkPlacer(
                        4,
                        2,
                        1,
                        new WeightedListIntProvider(
                                DataPool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1).add(ConstantIntProvider.create(2), 1).add(ConstantIntProvider.create(3), 1).build()
                        ),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),                BlockStateProvider.of(ModBlocks.ORANGE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3), //radius, ?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, POMEGRANATE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.POMEGRANATE_LOG),
                new StraightTrunkPlacer(2, 2, 2), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.POMEGRANATE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), //radius, ?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, MANGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MANGO_LOG),
                new ForkingTrunkPlacer(5, 2, 2), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.MANGO_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), //radius, ?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BANANA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BANANA_LOG),
                new StraightTrunkPlacer(3, 1, 1), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.BANANA_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2), 3), //radius, offset?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, PEACH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PEACH_LOG),
                new CherryTrunkPlacer(
                        6,
                        2,
                        0,
                        new WeightedListIntProvider(
                                DataPool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1).add(ConstantIntProvider.create(2), 1).add(ConstantIntProvider.create(3), 1).build()
                        ),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(ModBlocks.PEACH_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FIDDLEHEAD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.FIDDLEHEAD_LOG),
                new StraightTrunkPlacer(5, 3, 2), //base height, random height, random height
                BlockStateProvider.of(ModBlocks.FIDDLEHEAD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), 3), //radius, offset?, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, SALMONBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SALMONBERRY_BUSH.getDefaultState().with(SalmonberryBushBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)));
        register(context, STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.STRAWBERRY_BUSH.getDefaultState().with(StrawberryBushBlock.AGE, 5))),
                        List.of(Blocks.GRASS_BLOCK)));
        register(context, COFFEE_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.COFFEE_BUSH.getDefaultState().with(CoffeeBushBlock.AGE, 5))),
                        List.of(Blocks.GRASS_BLOCK)));
        register(context, BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUEBERRY_BUSH.getDefaultState().with(BlueberryBushBlock.AGE, 4))),
                        List.of(Blocks.GRASS_BLOCK)));
        register(context, FIDDLEHEAD_SAPLING_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FIDDLEHEAD_SAPLING.getDefaultState())),
                        List.of(Blocks.GRASS_BLOCK)));
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(StardewRavine.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
