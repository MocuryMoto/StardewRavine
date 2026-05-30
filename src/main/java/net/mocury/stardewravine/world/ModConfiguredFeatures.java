package net.mocury.stardewravine.world;

import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
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
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> overworldIridiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.IRIDIUM_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherIridiumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_IRIDIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRadioniteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_RADIONITE_ORE.getDefaultState()));


        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldIridiumOres, 3));
        register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherIridiumOres, 3));
        register(context, NETHER_RADIONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRadioniteOres, 3));


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
