package net.mocury.stardewravine.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_IRIDIUM_ORE_PLACED_KEY = registerKey("nether_iridium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_RADIONITE_ORE_PLACED_KEY = registerKey("nether_radionite_ore_placed");
    public static final RegistryKey<PlacedFeature> FIRE_QUARTZ_ORE_PLACED_KEY = registerKey("fire_quartz_ore_placed");
    public static final RegistryKey<PlacedFeature> CINDER_SHARD_ORE_PLACED_KEY = registerKey("cinder_shard_ore_placed");
    public static final RegistryKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY = registerKey("aquamarine_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_TOPAZ_ORE_PLACED_KEY = registerKey("nether_topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> GEODE_ORE_PLACED_KEY = registerKey("geode_ore_placed");
    public static final RegistryKey<PlacedFeature> FROZEN_GEODE_ORE_PLACED_KEY = registerKey("frozen_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> END_FROZEN_GEODE_ORE_PLACED_KEY = registerKey("end_frozen_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_MAGMA_GEODE_ORE_PLACED_KEY = registerKey("nether_magma_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_OMNI_GEODE_ORE_PLACED_KEY = registerKey("deepslate_omni_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> END_OMNI_GEODE_ORE_PLACED_KEY = registerKey("end_omni_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_OMNI_GEODE_ORE_PLACED_KEY = registerKey("nether_omni_geode_ore_placed");
    public static final RegistryKey<PlacedFeature> ESPERITE_ORE_PLACED_KEY = registerKey("esperite_ore_placed");
    public static final RegistryKey<PlacedFeature> MARBLE_ORE_PLACED_KEY = registerKey("marble_ore_placed");
    public static final RegistryKey<PlacedFeature> SOAPSTONE_ORE_PLACED_KEY = registerKey("soapstone_ore_placed");
    public static final RegistryKey<PlacedFeature> LIMESTONE_ORE_PLACED_KEY = registerKey("limestone_ore_placed");
    public static final RegistryKey<PlacedFeature> HEMATITE_ORE_PLACED_KEY = registerKey("hematite_ore_placed");
    public static final RegistryKey<PlacedFeature> BIXITE_ORE_PLACED_KEY = registerKey("bixite_ore_placed");
    public static final RegistryKey<PlacedFeature> TERRASINE_ORE_PLACED_KEY = registerKey("terrasine_ore_placed");
    public static final RegistryKey<PlacedFeature> FAIRY_ORE_PLACED_KEY = registerKey("fairy_ore_placed");
    public static final RegistryKey<PlacedFeature> LUNARITE_ORE_PLACED_KEY = registerKey("lunarite_ore_placed");
    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");
    public static final RegistryKey<PlacedFeature> END_OPAL_ORE_PLACED_KEY = registerKey("end_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> FIRE_OPAL_ORE_PLACED_KEY = registerKey("fire_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> END_FIRE_OPAL_ORE_PLACED_KEY = registerKey("end_fire_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_FIRE_OPAL_ORE_PLACED_KEY = registerKey("nether_fire_opal_ore_placed");

    public static final RegistryKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");
    public static final RegistryKey<PlacedFeature> APRICOT_PLACED_KEY = registerKey("apricot_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_PLACED_KEY = registerKey("orange_placed");
    public static final RegistryKey<PlacedFeature> POMEGRANATE_PLACED_KEY = registerKey("pomegranate_placed");
    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");
    public static final RegistryKey<PlacedFeature> BANANA_PLACED_KEY = registerKey("banana_placed");
    public static final RegistryKey<PlacedFeature> PEACH_PLACED_KEY = registerKey("peach_placed");
    public static final RegistryKey<PlacedFeature> FIDDLEHEAD_PLACED_KEY = registerKey("fiddlehead_placed");

    public static final RegistryKey<PlacedFeature> SALMONBERRY_BUSH_PLACED_KEY = registerKey("salmonberry_bush_placed");
    public static final RegistryKey<PlacedFeature> STRAWBERRY_BUSH_PLACED_KEY = registerKey("strawberry_bush_placed");
    public static final RegistryKey<PlacedFeature> COFFEE_BUSH_PLACED_KEY = registerKey("coffee_bush_placed");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH_PLACED_KEY = registerKey("blueberry_bush_placed");
    public static final RegistryKey<PlacedFeature> FIDDLEHEAD_SAPLING_PLACED_KEY = registerKey("fiddlehead_sapling_placed");
    public static final RegistryKey<PlacedFeature> SPICE_BERRY_BUSH_PLACED_KEY = registerKey("spice_berry_bush_placed");
    public static final RegistryKey<PlacedFeature> BLACKBERRY_BUSH_PLACED_KEY = registerKey("blackberry_bush_placed");
    public static final RegistryKey<PlacedFeature> CRANBERRY_BUSH_PLACED_KEY = registerKey("cranberry_bush_placed");
    public static final RegistryKey<PlacedFeature> HAZELNUT_BUSH_PLACED_KEY = registerKey("hazelnut_bush_placed");
    public static final RegistryKey<PlacedFeature> PLUM_BUSH_PLACED_KEY = registerKey("plum_bush_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRIDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(-40))));
        register(context, NETHER_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IRIDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(90), YOffset.fixed(130))));
        register(context, NETHER_RADIONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RADIONITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(90), YOffset.fixed(130))));
        register(context, FIRE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIRE_QUARTZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(5), YOffset.fixed(120))));
        register(context, CINDER_SHARD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CINDER_SHARD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(5), YOffset.fixed(120))));
        register(context, AQUAMARINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AQUAMARINE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(64))));
        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))));
        register(context, JADE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JADE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(32))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(48))));
        register(context, NETHER_TOPAZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TOPAZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(40), YOffset.fixed(120))));
        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(20), YOffset.fixed(130))));
        register(context, GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(20, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(300))));
        register(context, FROZEN_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FROZEN_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(64))));
        register(context, END_FROZEN_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_FROZEN_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(10), YOffset.fixed(64))));
        register(context, NETHER_MAGMA_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_MAGMA_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(127))));
        register(context, DEEPSLATE_OMNI_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_OMNI_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-70), YOffset.fixed(-20))));
        register(context, END_OMNI_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_OMNI_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(48))));
        register(context, NETHER_OMNI_GEODE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_OMNI_GEODE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(48))));
        register(context, ESPERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ESPERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, MARBLE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MARBLE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256))));
        register(context, SOAPSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SOAPSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));
        register(context, LIMESTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIMESTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, HEMATITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HEMATITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, BIXITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BIXITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, TERRASINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TERRASINE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, FAIRY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FAIRY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(32), YOffset.fixed(82))));
        register(context, LUNARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LUNARITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(32), YOffset.fixed(56))));
        register(context, OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(56))));
        register(context, FIRE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIRE_OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-56), YOffset.fixed(-32))));
        register(context, END_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(56))));
        register(context, END_FIRE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_FIRE_OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(56))));
        register(context, NETHER_FIRE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_FIRE_OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(56))));



        register(context, MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.MAPLE_SAPLING));
        register(context, APRICOT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.APRICOT_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.025f, 1), ModBlocks.APRICOT_SAPLING));
        register(context, ORANGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 2), ModBlocks.ORANGE_SAPLING));
        register(context, POMEGRANATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POMEGRANATE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.05f, 1), ModBlocks.POMEGRANATE_SAPLING));
        register(context, MANGO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MANGO_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.MANGO_SAPLING));
        register(context, BANANA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BANANA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.BANANA_SAPLING));
        register(context, PEACH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.05f, 1), ModBlocks.PEACH_SAPLING));
        register(context, FIDDLEHEAD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIDDLEHEAD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.05f, 1), ModBlocks.FIDDLEHEAD_SAPLING));

        register(context, SALMONBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SALMONBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, STRAWBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STRAWBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, COFFEE_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COFFEE_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FIDDLEHEAD_SAPLING_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIDDLEHEAD_SAPLING_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SPICE_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SPICE_BERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLACKBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CRANBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRANBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, HAZELNUT_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HAZELNUT_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PLUM_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PLUM_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(StardewRavine.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
