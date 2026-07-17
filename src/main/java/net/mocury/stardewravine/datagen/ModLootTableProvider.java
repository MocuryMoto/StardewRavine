package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.block.custom.*;
import net.mocury.stardewravine.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.AQUAMARINE_BLOCK);
        addDrop(ModBlocks.CHISELED_ESPERITE);
        addDrop(ModBlocks.CHISELED_SOAPSTONE);
        addDrop(ModBlocks.CHISELED_LIMESTONE);
        addDrop(ModBlocks.CHISELED_MARBLE);
        addDrop(ModBlocks.CINDER_SHARD_BLOCK);
        addDrop(ModBlocks.ESPERITE);
        addDrop(ModBlocks.ESPERITE_BRICKS);
        addDrop(ModBlocks.ESPERITE_PILLAR);
        addDrop(ModBlocks.HELVINE_BLOCK);
        addDrop(ModBlocks.POLISHED_HELVINE);
        addDrop(ModBlocks.IRIDIUM_BLOCK);
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.LIMESTONE);
        addDrop(ModBlocks.LIMESTONE_BRICKS);
        addDrop(ModBlocks.LIMESTONE_PILLAR);
        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_BRICKS);
        addDrop(ModBlocks.MARBLE_PILLAR);
        addDrop(ModBlocks.PEARL_BLOCK);
        addDrop(ModBlocks.POLISHED_ESPERITE);
        addDrop(ModBlocks.POLISHED_MARBLE);
        addDrop(ModBlocks.POLISHED_LIMESTONE);
        addDrop(ModBlocks.POLISHED_SOAPSTONE);
        addDrop(ModBlocks.PRISMATIC_SHARD_BLOCK);
        addDrop(ModBlocks.RADIONITE_BLOCK);
        addDrop(ModBlocks.RAW_RADIONITE_BLOCK);
        addDrop(ModBlocks.RAW_IRIDIUM_BLOCK);
        addDrop(ModBlocks.REFINED_QUARTZ_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SMOOTH_ESPERITE);
        addDrop(ModBlocks.SMOOTH_LIMESTONE);
        addDrop(ModBlocks.SMOOTH_MARBLE);
        addDrop(ModBlocks.SMOOTH_SOAPSTONE);
        addDrop(ModBlocks.SOAPSTONE);
        addDrop(ModBlocks.SOAPSTONE_BRICKS);
        addDrop(ModBlocks.SOAPSTONE_PILLAR);
        addDrop(ModBlocks.TOPAZ_BLOCK);
        addDrop(ModBlocks.ESPERITE_STAIRS);
        addDrop(ModBlocks.MARBLE_STAIRS);
        addDrop(ModBlocks.SOAPSTONE_STAIRS);
        addDrop(ModBlocks.LIMESTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_ESPERITE_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_STAIRS);
        addDrop(ModBlocks.POLISHED_SOAPSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        addDrop(ModBlocks.ESPERITE_WALL);
        addDrop(ModBlocks.MARBLE_WALL);
        addDrop(ModBlocks.SOAPSTONE_WALL);
        addDrop(ModBlocks.LIMESTONE_WALL);
        addDrop(ModBlocks.POLISHED_ESPERITE_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE_WALL);
        addDrop(ModBlocks.POLISHED_SOAPSTONE_WALL);
        addDrop(ModBlocks.POLISHED_LIMESTONE_WALL);
        addDrop(ModBlocks.SOAP_LIME_TILES);
        addDrop(ModBlocks.SOAP_ESPER_TILES);
        addDrop(ModBlocks.SOAP_MARBLE_TILES);
        addDrop(ModBlocks.MARBLE_LIME_TILES);
        addDrop(ModBlocks.MARBLE_ESPER_TILES);
        addDrop(ModBlocks.LIME_ESPER_TILES);

        addDrop(ModBlocks.LEMON_STONE_BLOCK);
        addDrop(ModBlocks.POLISHED_LEMON_STONE);
        addDrop(ModBlocks.TIGERS_EYE_BLOCK);
        addDrop(ModBlocks.POLISHED_TIGERS_EYE);
        addDrop(ModBlocks.KYANITE_BLOCK);
        addDrop(ModBlocks.POLISHED_KYANITE);
        addDrop(ModBlocks.PYRITE_BLOCK);
        addDrop(ModBlocks.POLISHED_PYRITE);
        addDrop(ModBlocks.FLUORAPATITE_BLOCK);
        addDrop(ModBlocks.POLISHED_FLUORAPATITE);
        addDrop(ModBlocks.JAGOITE_BLOCK);
        addDrop(ModBlocks.POLISHED_JAGOITE);
        addDrop(ModBlocks.CELESTINE_BLOCK);
        addDrop(ModBlocks.POLISHED_CELESTINE);
        addDrop(ModBlocks.GEMINITE_BLOCK);
        addDrop(ModBlocks.POLISHED_GEMINITE);
        addDrop(ModBlocks.JASPER_BLOCK);
        addDrop(ModBlocks.POLISHED_JASPER);
        addDrop(ModBlocks.AERINITE_BLOCK);
        addDrop(ModBlocks.POLISHED_AERINITE);
        addDrop(ModBlocks.ORPIMENT_BLOCK);
        addDrop(ModBlocks.POLISHED_ORPIMENT);
        addDrop(ModBlocks.DOLOMITE_BLOCK);
        addDrop(ModBlocks.POLISHED_DOLOMITE);
        addDrop(ModBlocks.JAMBORITE_BLOCK);
        addDrop(ModBlocks.POLISHED_JAMBORITE);
        addDrop(ModBlocks.NEKOITE_BLOCK);
        addDrop(ModBlocks.POLISHED_NEKOITE);
        addDrop(ModBlocks.NEPTUNITE_BLOCK);
        addDrop(ModBlocks.POLISHED_NEPTUNITE);
        addDrop(ModBlocks.LUNARITE_BLOCK);
        addDrop(ModBlocks.POLISHED_LUNARITE);
        addDrop(ModBlocks.RAW_HEMATITE);
        addDrop(ModBlocks.REFINED_HEMATITE);
        addDrop(ModBlocks.HEMATITE_ROSE);
        addDrop(ModBlocks.DESERT_ROSE);
        addDrop(ModBlocks.MALACHITE_BLOCK);
        addDrop(ModBlocks.POLISHED_MALACHITE);
        addDrop(ModBlocks.OPAL_BLOCK);
        addDrop(ModBlocks.SMOOTH_OPAL_BLOCK);
        addDrop(ModBlocks.OPAL_BONE_BLOCK);
        addDrop(ModBlocks.FIRE_OPAL_BLOCK);
        addDrop(ModBlocks.SMOOTH_FIRE_OPAL_BLOCK);
        addDrop(ModBlocks.FIRE_OPAL_BONE_BLOCK);

        addDrop(ModBlocks.SCROLL_BLOCK);
        addDrop(ModBlocks.RED_SCROLL);
        addDrop(ModBlocks.RED_SCROLL);
        addDrop(ModBlocks.ORANGE_SCROLL);
        addDrop(ModBlocks.YELLOW_SCROLL);
        addDrop(ModBlocks.LIME_SCROLL);
        addDrop(ModBlocks.GREEN_SCROLL);
        addDrop(ModBlocks.CYAN_SCROLL);
        addDrop(ModBlocks.LIGHT_BLUE_SCROLL);
        addDrop(ModBlocks.BLUE_SCROLL);
        addDrop(ModBlocks.PURPLE_SCROLL);
        addDrop(ModBlocks.MAGENTA_SCROLL);
        addDrop(ModBlocks.PINK_SCROLL);
        addDrop(ModBlocks.WHITE_SCROLL);
        addDrop(ModBlocks.LIGHT_GRAY_SCROLL);
        addDrop(ModBlocks.GRAY_SCROLL);
        addDrop(ModBlocks.BLACK_SCROLL);
        addDrop(ModBlocks.BROWN_SCROLL);


        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_SAPLING);
        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.MAPLE_TRAPDOOR);
        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, ModBlocks.MAPLE_SAPLING, 0.0625f));

        addDrop(ModBlocks.MYSTIC_LOG);
        addDrop(ModBlocks.MYSTIC_WOOD);
        addDrop(ModBlocks.STRIPPED_MYSTIC_LOG);
        addDrop(ModBlocks.STRIPPED_MYSTIC_WOOD);
        addDrop(ModBlocks.MYSTIC_PLANKS);
        addDrop(ModBlocks.MYSTIC_SAPLING);
        addDrop(ModBlocks.MYSTIC_STAIRS);
        addDrop(ModBlocks.MYSTIC_SLAB, slabDrops(ModBlocks.MYSTIC_SLAB));
        addDrop(ModBlocks.MYSTIC_BUTTON);
        addDrop(ModBlocks.MYSTIC_PRESSURE_PLATE);
        addDrop(ModBlocks.MYSTIC_FENCE);
        addDrop(ModBlocks.MYSTIC_FENCE_GATE);
        addDrop(ModBlocks.MYSTIC_DOOR, doorDrops(ModBlocks.MYSTIC_DOOR));
        addDrop(ModBlocks.MYSTIC_TRAPDOOR);
        addDrop(ModBlocks.MYSTIC_LEAVES, leavesDrops(ModBlocks.MYSTIC_LEAVES, ModBlocks.MYSTIC_SAPLING, 0.035f));

        addDrop(ModBlocks.APRICOT_LOG);
        addDrop(ModBlocks.APRICOT_WOOD);
        addDrop(ModBlocks.STRIPPED_APRICOT_LOG);
        addDrop(ModBlocks.STRIPPED_APRICOT_WOOD);
        addDrop(ModBlocks.APRICOT_PLANKS);
        addDrop(ModBlocks.APRICOT_SAPLING);
        addDrop(ModBlocks.APRICOT_STAIRS);
        addDrop(ModBlocks.APRICOT_SLAB, slabDrops(ModBlocks.APRICOT_SLAB));
        addDrop(ModBlocks.APRICOT_BUTTON);
        addDrop(ModBlocks.APRICOT_PRESSURE_PLATE);
        addDrop(ModBlocks.APRICOT_FENCE);
        addDrop(ModBlocks.APRICOT_FENCE_GATE);
        addDrop(ModBlocks.APRICOT_DOOR, doorDrops(ModBlocks.APRICOT_DOOR));
        addDrop(ModBlocks.APRICOT_TRAPDOOR);
        addDrop(ModBlocks.APRICOT_LEAVES, leavesDrops(ModBlocks.APRICOT_LEAVES, ModBlocks.APRICOT_SAPLING, 0.0625f));
        addDrop(ModBlocks.FRUITING_APRICOT_LEAVES, multipleOreDrops(ModBlocks.FRUITING_APRICOT_LEAVES, ModItems.APRICOT, 2, 4));

        addDrop(ModBlocks.ORANGE_LOG);
        addDrop(ModBlocks.ORANGE_WOOD);
        addDrop(ModBlocks.STRIPPED_ORANGE_LOG);
        addDrop(ModBlocks.STRIPPED_ORANGE_WOOD);
        addDrop(ModBlocks.ORANGE_PLANKS);
        addDrop(ModBlocks.ORANGE_SAPLING);
        addDrop(ModBlocks.ORANGE_STAIRS);
        addDrop(ModBlocks.ORANGE_SLAB, slabDrops(ModBlocks.ORANGE_SLAB));
        addDrop(ModBlocks.ORANGE_BUTTON);
        addDrop(ModBlocks.ORANGE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_FENCE);
        addDrop(ModBlocks.ORANGE_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_DOOR, doorDrops(ModBlocks.ORANGE_DOOR));
        addDrop(ModBlocks.ORANGE_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_LEAVES, leavesDrops(ModBlocks.ORANGE_LEAVES, ModBlocks.ORANGE_SAPLING, 0.0625f));
        addDrop(ModBlocks.FRUITING_ORANGE_LEAVES, multipleOreDrops(ModBlocks.FRUITING_ORANGE_LEAVES, ModItems.ORANGE, 1, 3));

        addDrop(ModBlocks.POMEGRANATE_LOG);
        addDrop(ModBlocks.POMEGRANATE_WOOD);
        addDrop(ModBlocks.STRIPPED_POMEGRANATE_LOG);
        addDrop(ModBlocks.STRIPPED_POMEGRANATE_WOOD);
        addDrop(ModBlocks.POMEGRANATE_PLANKS);
        addDrop(ModBlocks.POMEGRANATE_SAPLING);
        addDrop(ModBlocks.POMEGRANATE_STAIRS);
        addDrop(ModBlocks.POMEGRANATE_SLAB, slabDrops(ModBlocks.POMEGRANATE_SLAB));
        addDrop(ModBlocks.POMEGRANATE_BUTTON);
        addDrop(ModBlocks.POMEGRANATE_PRESSURE_PLATE);
        addDrop(ModBlocks.POMEGRANATE_FENCE);
        addDrop(ModBlocks.POMEGRANATE_FENCE_GATE);
        addDrop(ModBlocks.POMEGRANATE_DOOR, doorDrops(ModBlocks.POMEGRANATE_DOOR));
        addDrop(ModBlocks.POMEGRANATE_TRAPDOOR);
        addDrop(ModBlocks.POMEGRANATE_LEAVES, leavesDrops(ModBlocks.POMEGRANATE_LEAVES, ModBlocks.POMEGRANATE_SAPLING, 0.0625f));
        addDrop(ModBlocks.FRUITING_POMEGRANATE_LEAVES, multipleOreDrops(ModBlocks.FRUITING_POMEGRANATE_LEAVES, ModItems.POMEGRANATE, 2, 4));

        addDrop(ModBlocks.MANGO_LOG);
        addDrop(ModBlocks.MANGO_WOOD);
        addDrop(ModBlocks.STRIPPED_MANGO_LOG);
        addDrop(ModBlocks.STRIPPED_MANGO_WOOD);
        addDrop(ModBlocks.MANGO_PLANKS);
        addDrop(ModBlocks.MANGO_SAPLING);
        addDrop(ModBlocks.MANGO_STAIRS);
        addDrop(ModBlocks.MANGO_SLAB, slabDrops(ModBlocks.MANGO_SLAB));
        addDrop(ModBlocks.MANGO_BUTTON);
        addDrop(ModBlocks.MANGO_PRESSURE_PLATE);
        addDrop(ModBlocks.MANGO_FENCE);
        addDrop(ModBlocks.MANGO_FENCE_GATE);
        addDrop(ModBlocks.MANGO_DOOR, doorDrops(ModBlocks.MANGO_DOOR));
        addDrop(ModBlocks.MANGO_TRAPDOOR);
        addDrop(ModBlocks.MANGO_LEAVES, leavesDrops(ModBlocks.MANGO_LEAVES, ModBlocks.MANGO_SAPLING, 0.0625f));
        addDrop(ModBlocks.FRUITING_MANGO_LEAVES, multipleOreDrops(ModBlocks.FRUITING_MANGO_LEAVES, ModItems.MANGO, 1, 4));

        addDrop(ModBlocks.BANANA_LOG);
        addDrop(ModBlocks.BANANA_WOOD);
        addDrop(ModBlocks.STRIPPED_BANANA_LOG);
        addDrop(ModBlocks.STRIPPED_BANANA_WOOD);
        addDrop(ModBlocks.BANANA_PLANKS);
        addDrop(ModBlocks.BANANA_SAPLING);
        addDrop(ModBlocks.BANANA_STAIRS);
        addDrop(ModBlocks.BANANA_SLAB, slabDrops(ModBlocks.BANANA_SLAB));
        addDrop(ModBlocks.BANANA_BUTTON);
        addDrop(ModBlocks.BANANA_PRESSURE_PLATE);
        addDrop(ModBlocks.BANANA_FENCE);
        addDrop(ModBlocks.BANANA_FENCE_GATE);
        addDrop(ModBlocks.BANANA_DOOR, doorDrops(ModBlocks.BANANA_DOOR));
        addDrop(ModBlocks.BANANA_TRAPDOOR);
        addDrop(ModBlocks.BANANA_LEAVES, leavesDrops(ModBlocks.BANANA_LEAVES, ModBlocks.BANANA_SAPLING, 0.125f));
        addDrop(ModBlocks.FRUITING_BANANA_LEAVES, multipleOreDrops(ModBlocks.FRUITING_BANANA_LEAVES, ModItems.BANANA, 2, 3));

        addDrop(ModBlocks.PEACH_LOG);
        addDrop(ModBlocks.PEACH_WOOD);
        addDrop(ModBlocks.STRIPPED_PEACH_LOG);
        addDrop(ModBlocks.STRIPPED_PEACH_WOOD);
        addDrop(ModBlocks.PEACH_PLANKS);
        addDrop(ModBlocks.PEACH_SAPLING);
        addDrop(ModBlocks.PEACH_STAIRS);
        addDrop(ModBlocks.PEACH_SLAB, slabDrops(ModBlocks.PEACH_SLAB));
        addDrop(ModBlocks.PEACH_BUTTON);
        addDrop(ModBlocks.PEACH_PRESSURE_PLATE);
        addDrop(ModBlocks.PEACH_FENCE);
        addDrop(ModBlocks.PEACH_FENCE_GATE);
        addDrop(ModBlocks.PEACH_DOOR, doorDrops(ModBlocks.PEACH_DOOR));
        addDrop(ModBlocks.PEACH_TRAPDOOR);
        addDrop(ModBlocks.PEACH_LEAVES, leavesDrops(ModBlocks.PEACH_LEAVES, ModBlocks.PEACH_SAPLING, 0.0625f));
        addDrop(ModBlocks.FRUITING_PEACH_LEAVES, multipleOreDrops(ModBlocks.FRUITING_PEACH_LEAVES, ModItems.PEACH, 2, 3));

        addDrop(ModBlocks.FRUITING_CHERRY_LEAVES, multipleOreDrops(ModBlocks.FRUITING_CHERRY_LEAVES, ModItems.CHERRIES, 2, 5));

        addDrop(ModBlocks.FIDDLEHEAD_LOG);
        addDrop(ModBlocks.FIDDLEHEAD_WOOD);
        addDrop(ModBlocks.STRIPPED_FIDDLEHEAD_LOG);
        addDrop(ModBlocks.STRIPPED_FIDDLEHEAD_WOOD);
        addDrop(ModBlocks.FIDDLEHEAD_PLANKS);
        addDrop(ModBlocks.FIDDLEHEAD_SAPLING);
        addDrop(ModBlocks.FIDDLEHEAD_STAIRS);
        addDrop(ModBlocks.FIDDLEHEAD_SLAB, slabDrops(ModBlocks.FIDDLEHEAD_SLAB));
        addDrop(ModBlocks.FIDDLEHEAD_BUTTON);
        addDrop(ModBlocks.FIDDLEHEAD_PRESSURE_PLATE);
        addDrop(ModBlocks.FIDDLEHEAD_FENCE);
        addDrop(ModBlocks.FIDDLEHEAD_FENCE_GATE);
        addDrop(ModBlocks.FIDDLEHEAD_DOOR, doorDrops(ModBlocks.FIDDLEHEAD_DOOR));
        addDrop(ModBlocks.FIDDLEHEAD_TRAPDOOR);
        addDrop(ModBlocks.FIDDLEHEAD_LEAVES, leavesDrops(ModBlocks.FIDDLEHEAD_LEAVES, ModBlocks.FIDDLEHEAD_SAPLING, 0.33f));


        addDrop(ModBlocks.ESPERITE_SLAB, slabDrops(ModBlocks.ESPERITE_SLAB));
        addDrop(ModBlocks.MARBLE_SLAB, slabDrops(ModBlocks.MARBLE_SLAB));
        addDrop(ModBlocks.SOAPSTONE_SLAB, slabDrops(ModBlocks.SOAPSTONE_SLAB));
        addDrop(ModBlocks.LIMESTONE_SLAB, slabDrops(ModBlocks.LIMESTONE_SLAB));
        addDrop(ModBlocks.POLISHED_ESPERITE_SLAB, slabDrops(ModBlocks.POLISHED_ESPERITE_SLAB));
        addDrop(ModBlocks.POLISHED_MARBLE_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_SLAB));
        addDrop(ModBlocks.POLISHED_SOAPSTONE_SLAB, slabDrops(ModBlocks.POLISHED_SOAPSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_LIMESTONE_SLAB, slabDrops(ModBlocks.POLISHED_LIMESTONE_SLAB));

        addDrop(ModBlocks.AQUAMARINE_ORE, oreDrops(ModBlocks.AQUAMARINE_ORE, ModItems.AQUAMARINE));
        addDrop(ModBlocks.AQUAMARINE_DEEPSLATE_ORE, oreDrops(ModBlocks.AQUAMARINE_DEEPSLATE_ORE, ModItems.AQUAMARINE));
        addDrop(ModBlocks.JADE_ORE, oreDrops(ModBlocks.JADE_ORE, ModItems.JADE));
        addDrop(ModBlocks.JADE_DEEPSLATE_ORE, oreDrops(ModBlocks.JADE_DEEPSLATE_ORE, ModItems.JADE));
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.TOPAZ_DEEPSLATE_ORE, oreDrops(ModBlocks.TOPAZ_DEEPSLATE_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.NETHER_TOPAZ_ORE, oreDrops(ModBlocks.NETHER_TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.RUBY_DEEPSLATE_ORE, oreDrops(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, oreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NETHER_RADIONITE_ORE, oreDrops(ModBlocks.NETHER_RADIONITE_ORE, ModItems.RAW_RADIONITE));
        addDrop(ModBlocks.IRIDIUM_DEEPSLATE_ORE, oreDrops(ModBlocks.IRIDIUM_DEEPSLATE_ORE, ModItems.RAW_IRIDIUM));
        addDrop(ModBlocks.NETHER_IRIDIUM_ORE, oreDrops(ModBlocks.NETHER_IRIDIUM_ORE, ModItems.RAW_IRIDIUM));
        addDrop(ModBlocks.END_LUNARITE_ORE, oreDrops(ModBlocks.END_LUNARITE_ORE, ModItems.LUNARITE));
        addDrop(ModBlocks.CALCITE_MALACHITE_ORE, oreDrops(ModBlocks.CALCITE_MALACHITE_ORE, ModItems.MALACHITE));
        addDrop(ModBlocks.LIMESTONE_MALACHITE_ORE, oreDrops(ModBlocks.LIMESTONE_MALACHITE_ORE, ModItems.MALACHITE));
        addDrop(ModBlocks.OPAL_ORE, oreDrops(ModBlocks.OPAL_ORE, ModItems.OPAL));
        addDrop(ModBlocks.DEEPSLATE_OPAL_ORE, oreDrops(ModBlocks.DEEPSLATE_OPAL_ORE, ModItems.OPAL));
        addDrop(ModBlocks.END_OPAL_ORE, oreDrops(ModBlocks.END_OPAL_ORE, ModItems.OPAL));
        addDrop(ModBlocks.NETHER_FIRE_OPAL_ORE, oreDrops(ModBlocks.NETHER_FIRE_OPAL_ORE, ModItems.FIRE_OPAL));
        addDrop(ModBlocks.DEEPSLATE_FIRE_OPAL_ORE, oreDrops(ModBlocks.DEEPSLATE_FIRE_OPAL_ORE, ModItems.FIRE_OPAL));
        addDrop(ModBlocks.END_FIRE_OPAL_ORE, oreDrops(ModBlocks.END_FIRE_OPAL_ORE, ModItems.FIRE_OPAL));
        addDrop(ModBlocks.GEODE_ORE, oreDrops(ModBlocks.GEODE_ORE, ModItems.GEODE));
        addDrop(ModBlocks.DEEPSLATE_GEODE_ORE, oreDrops(ModBlocks.DEEPSLATE_GEODE_ORE, ModItems.GEODE));
        addDrop(ModBlocks.FROZEN_GEODE_ORE, oreDrops(ModBlocks.FROZEN_GEODE_ORE, ModItems.FROZEN_GEODE));
        addDrop(ModBlocks.DEEPSLATE_FROZEN_GEODE_ORE, oreDrops(ModBlocks.DEEPSLATE_FROZEN_GEODE_ORE, ModItems.FROZEN_GEODE));
        addDrop(ModBlocks.END_FROZEN_GEODE_ORE, oreDrops(ModBlocks.END_FROZEN_GEODE_ORE, ModItems.FROZEN_GEODE));
        addDrop(ModBlocks.NETHER_MAGMA_GEODE_ORE, oreDrops(ModBlocks.NETHER_MAGMA_GEODE_ORE, ModItems.MAGMA_GEODE));
        addDrop(ModBlocks.BLACKSTONE_MAGMA_GEODE_ORE, oreDrops(ModBlocks.BLACKSTONE_MAGMA_GEODE_ORE, ModItems.MAGMA_GEODE));
        addDrop(ModBlocks.BASALT_MAGMA_GEODE_ORE, oreDrops(ModBlocks.BASALT_MAGMA_GEODE_ORE, ModItems.MAGMA_GEODE));
        addDrop(ModBlocks.DEEPSLATE_OMNI_GEODE_ORE, oreDrops(ModBlocks.DEEPSLATE_OMNI_GEODE_ORE, ModItems.OMNI_GEODE));
        addDrop(ModBlocks.END_OMNI_GEODE_ORE, oreDrops(ModBlocks.END_OMNI_GEODE_ORE, ModItems.OMNI_GEODE));
        addDrop(ModBlocks.NETHER_OMNI_GEODE_ORE, oreDrops(ModBlocks.NETHER_OMNI_GEODE_ORE, ModItems.OMNI_GEODE));
        addDrop(ModBlocks.BLACKSTONE_OMNI_GEODE_ORE, oreDrops(ModBlocks.BLACKSTONE_OMNI_GEODE_ORE, ModItems.OMNI_GEODE));
        addDrop(ModBlocks.BASALT_OMNI_GEODE_ORE, oreDrops(ModBlocks.BASALT_OMNI_GEODE_ORE, ModItems.OMNI_GEODE));

        addDrop(ModBlocks.BIXITE, multipleOreDrops(ModBlocks.BIXITE, ModItems.BIXITE_CHUNK, 1,3));
        addDrop(ModBlocks.POLISHED_BIXITE);
        addDrop(ModBlocks.TERRASINE_BLOCK, multipleOreDrops(ModBlocks.TERRASINE_BLOCK, ModItems.TERRASINE, 1,3));
        addDrop(ModBlocks.POLISHED_TERRASINE);

        addDrop(ModBlocks.CINDER_SHARD_ORE, multipleOreDrops(ModBlocks.CINDER_SHARD_ORE, ModItems.CINDER_SHARD, 2,5));
        addDrop(ModBlocks.CINDER_CLUSTER, multipleOreDrops(ModBlocks.CINDER_CLUSTER, ModItems.CINDER_SHARD, 1,4));
        addDrop(ModBlocks.FIRE_QUARTZ_ORE, multipleOreDrops(ModBlocks.FIRE_QUARTZ_ORE, ModItems.FIRE_QUARTZ, 2,4));

        addDropWithSilkTouch(ModBlocks.LARGE_CINDER_BUD);
        addDropWithSilkTouch(ModBlocks.MEDIUM_CINDER_BUD);
        addDropWithSilkTouch(ModBlocks.SMALL_CINDER_BUD);

        addDrop(ModBlocks.FAIRY_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_FAIRY_ROSE);
        addDrop(ModBlocks.BLUE_JAZZ);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_JAZZ);
        addDrop(ModBlocks.CROCUS);
        addPottedPlantDrops(ModBlocks.POTTED_CROCUS);
        addDrop(ModBlocks.DAFFODIL);
        addPottedPlantDrops(ModBlocks.POTTED_DAFFODIL);
        addDrop(ModBlocks.SUMMER_SPANGLE);
        addPottedPlantDrops(ModBlocks.POTTED_SUMMER_SPANGLE);
        addDrop(ModBlocks.SWEET_PEA);
        addPottedPlantDrops(ModBlocks.POTTED_SWEET_PEA);
        addDrop(ModBlocks.AMARANTH);
        addDrop(ModBlocks.FAIRY_ROSE_BUSH);

        addDrop(ModBlocks.FAIRY_STONE_BLOCK);
        addDrop(ModBlocks.END_FAIRY_ORE, oreDrops(ModBlocks.END_FAIRY_ORE, ModItems.FAIRY_STONE));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GARLIC_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GarlicCropBlock.AGE, 4));
        this.addDrop(ModBlocks.GARLIC_CROP, this.cropDrops(ModBlocks.GARLIC_CROP, ModItems.GARLIC, ModItems.GARLIC_SEEDS, builder2));
        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.LEEK_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(LeekCropBlock.AGE, 3));
        this.addDrop(ModBlocks.LEEK_CROP, this.cropDrops(ModBlocks.LEEK_CROP, ModItems.LEEK, ModItems.LEEK, builder3));
        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.SPRING_ONION_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SpringOnionCropBlock.AGE, 3));
        this.addDrop(ModBlocks.SPRING_ONION_CROP, this.cropDrops(ModBlocks.SPRING_ONION_CROP, ModItems.SPRING_ONION, ModItems.SPRING_ONION, builder4));
        BlockStatePropertyLootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.PARSNIP_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ParsnipCropBlock.AGE, 5));
        this.addDrop(ModBlocks.PARSNIP_CROP, this.cropDrops(ModBlocks.PARSNIP_CROP, ModItems.PARSNIP, ModItems.PARSNIP_SEEDS, builder5));
        BlockStatePropertyLootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.HORSERADISH_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(HorseradishCropBlock.AGE, 3));
        this.addDrop(ModBlocks.HORSERADISH_CROP, this.cropDrops(ModBlocks.HORSERADISH_CROP, ModItems.HORSERADISH, ModItems.HORSERADISH, builder6));
        BlockStatePropertyLootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.RHUBARB_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(RhubarbCropBlock.AGE, 5));
        this.addDrop(ModBlocks.RHUBARB_CROP, this.cropDrops(ModBlocks.RHUBARB_CROP, ModItems.RHUBARB, ModItems.RHUBARB_SEEDS, builder7));
        BlockStatePropertyLootCondition.Builder builder8 = BlockStatePropertyLootCondition.builder(ModBlocks.KALE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(KaleCropBlock.AGE, 4));
        this.addDrop(ModBlocks.KALE_CROP, this.cropDrops(ModBlocks.KALE_CROP, ModItems.KALE, ModItems.KALE_SEEDS, builder8));
        BlockStatePropertyLootCondition.Builder builder9 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 5));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder9));
        BlockStatePropertyLootCondition.Builder builder10 = BlockStatePropertyLootCondition.builder(ModBlocks.GREEN_BEAN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GreenBeanCropBlock.AGE, 5));
        this.addDrop(ModBlocks.GREEN_BEAN_CROP, this.cropDrops(ModBlocks.GREEN_BEAN_CROP, ModItems.GREEN_BEAN, ModItems.GREEN_BEAN, builder10));
        BlockStatePropertyLootCondition.Builder builder11 = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(RiceCropBlock.AGE, 4));
        this.addDrop(ModBlocks.RICE_CROP, this.cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE_SEEDS, builder11));
        BlockStatePropertyLootCondition.Builder builder12 = BlockStatePropertyLootCondition.builder(ModBlocks.RED_CABBAGE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(RedCabbageCropBlock.AGE, 5));
        this.addDrop(ModBlocks.RED_CABBAGE_CROP, this.cropDrops(ModBlocks.RED_CABBAGE_CROP, ModItems.RED_CABBAGE, ModItems.RED_CABBAGE_SEEDS, builder12));
        BlockStatePropertyLootCondition.Builder builder13 = BlockStatePropertyLootCondition.builder(ModBlocks.STARFRUIT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(StarfruitCropBlock.AGE, 5));
        this.addDrop(ModBlocks.STARFRUIT_CROP, this.cropDrops(ModBlocks.STARFRUIT_CROP, ModItems.STARFRUIT, ModItems.STARFRUIT_SEEDS, builder13));
        BlockStatePropertyLootCondition.Builder builder14 = BlockStatePropertyLootCondition.builder(ModBlocks.HOPS_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(HopsCropBlock.AGE, 5));
        this.addDrop(ModBlocks.HOPS_CROP, this.cropDrops(ModBlocks.HOPS_CROP, ModItems.HOPS, ModItems.HOPS, builder14));
        BlockStatePropertyLootCondition.Builder builder15 = BlockStatePropertyLootCondition.builder(ModBlocks.RADISH_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(RadishCropBlock.AGE, 4));
        this.addDrop(ModBlocks.RADISH_CROP, this.cropDrops(ModBlocks.RADISH_CROP, ModItems.RADISHES, ModItems.RADISH_SEEDS, builder15));
        BlockStatePropertyLootCondition.Builder builder16 = BlockStatePropertyLootCondition.builder(ModBlocks.CHILI_PEPPER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ChiliPepperCropBlock.AGE, 6));
        this.addDrop(ModBlocks.CHILI_PEPPER_CROP, this.cropDrops(ModBlocks.CHILI_PEPPER_CROP, ModItems.CHILI_PEPPER, ModItems.CHILI_PEPPER_SEEDS, builder16));
        BlockStatePropertyLootCondition.Builder builder17 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, 6));
        this.addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder17));
        BlockStatePropertyLootCondition.Builder builder18 = BlockStatePropertyLootCondition.builder(ModBlocks.SUMMER_SQUASH_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SummerSquashCropBlock.AGE, 5));
        this.addDrop(ModBlocks.SUMMER_SQUASH_CROP, this.cropDrops(ModBlocks.SUMMER_SQUASH_CROP, ModItems.SUMMER_SQUASH, ModItems.SUMMER_SQUASH_SEEDS, builder18));
        BlockStatePropertyLootCondition.Builder builder19 = BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GrapeCropBlock.AGE, 5));
        this.addDrop(ModBlocks.GRAPE_CROP, this.cropDrops(ModBlocks.GRAPE_CROP, ModItems.GRAPES, ModItems.GRAPES, builder19));
        BlockStatePropertyLootCondition.Builder builder20 = BlockStatePropertyLootCondition.builder(ModBlocks.ARTICHOKE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ArtichokeCropBlock.AGE, 5));
        this.addDrop(ModBlocks.ARTICHOKE_CROP, this.cropDrops(ModBlocks.ARTICHOKE_CROP, ModItems.ARTICHOKE, ModItems.ARTICHOKE_SEEDS, builder20));
        BlockStatePropertyLootCondition.Builder builder21 = BlockStatePropertyLootCondition.builder(ModBlocks.BOK_CHOY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BokChoyCropBlock.AGE, 4));
        this.addDrop(ModBlocks.BOK_CHOY_CROP, this.cropDrops(ModBlocks.BOK_CHOY_CROP, ModItems.BOK_CHOY, ModItems.BOK_CHOY_SEEDS, builder21));
        BlockStatePropertyLootCondition.Builder builder22 = BlockStatePropertyLootCondition.builder(ModBlocks.BROCCOLI_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BroccoliCropBlock.AGE, 4));
        this.addDrop(ModBlocks.BROCCOLI_CROP, this.cropDrops(ModBlocks.BROCCOLI_CROP, ModItems.BROCCOLI, ModItems.BROCCOLI_SEEDS, builder22));
        BlockStatePropertyLootCondition.Builder builder23 = BlockStatePropertyLootCondition.builder(ModBlocks.EGGPLANT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(EggplantCropBlock.AGE, 5));
        this.addDrop(ModBlocks.EGGPLANT_CROP, this.cropDrops(ModBlocks.EGGPLANT_CROP, ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS, builder23));
        BlockStatePropertyLootCondition.Builder builder24 = BlockStatePropertyLootCondition.builder(ModBlocks.YAM_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(YamCropBlock.AGE, 4));
        this.addDrop(ModBlocks.YAM_CROP, this.cropDrops(ModBlocks.YAM_CROP, ModItems.YAM, ModItems.YAM, builder24));
        BlockStatePropertyLootCondition.Builder builder25 = BlockStatePropertyLootCondition.builder(ModBlocks.ANCIENT_FRUIT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(AncientFruitCropBlock.AGE, 8));
        this.addDrop(ModBlocks.ANCIENT_FRUIT_CROP, this.cropDrops(ModBlocks.ANCIENT_FRUIT_CROP, ModItems.ANCIENT_FRUIT, ModItems.ANCIENT_FRUIT_SEEDS, builder25));
        BlockStatePropertyLootCondition.Builder builder26 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CornCropBlock.AGE, 8));
        this.addDrop(ModBlocks.CORN_CROP, this.cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder26));
        BlockStatePropertyLootCondition.Builder builder27 = BlockStatePropertyLootCondition.builder(ModBlocks.SWEET_GEM_BERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SweetGemBerryCropBlock.AGE, 7));
        this.addDrop(ModBlocks.SWEET_GEM_BERRY_CROP, this.cropDrops(ModBlocks.SWEET_GEM_BERRY_CROP, ModItems.SWEET_GEM_BERRY, ModItems.RARE_SEED, builder27));

        this.addDrop(ModBlocks.BLUEBERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                                .pool(LootPool.builder().conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.BLUEBERRY_BUSH)
                                                                .properties(StatePredicate.Builder.create().exactMatch(BlueberryBushBlock.AGE, 4)))
                                                .with(ItemEntry.builder(ModItems.BLUEBERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.SALMONBERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                                .pool(LootPool.builder().conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.SALMONBERRY_BUSH)
                                                                .properties(StatePredicate.Builder.create().exactMatch(SalmonberryBushBlock.AGE, 3)))
                                                .with(ItemEntry.builder(ModItems.SALMONBERRY))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 5.0F))) //how many items drop
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.STRAWBERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                                .pool(LootPool.builder().conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY_BUSH)
                                                                .properties(StatePredicate.Builder.create().exactMatch(StrawberryBushBlock.AGE, 5)))
                                                .with(ItemEntry.builder(ModItems.STRAWBERRY))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 4.0F))) //how many items drop
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.COFFEE_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                                .pool(LootPool.builder().conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.COFFEE_BUSH)
                                                                .properties(StatePredicate.Builder.create().exactMatch(CoffeeBushBlock.AGE, 5)))
                                                .with(ItemEntry.builder(ModItems.COFFEE_BEANS))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 6.0F))) //how many items drop
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.SPICE_BERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                        .pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.SPICE_BERRY_BUSH)
                                                .properties(StatePredicate.Builder.create().exactMatch(SpiceBerryBushBlock.AGE, 3)))
                                .with(ItemEntry.builder(ModItems.SPICE_BERRY))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 5.0F))) //how many items drop
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.CRANBERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                        .pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.CRANBERRY_BUSH)
                                                .properties(StatePredicate.Builder.create().exactMatch(CranberryBushBlock.AGE, 5)))
                                .with(ItemEntry.builder(ModItems.CRANBERRIES))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F))) //how many items drop
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
        this.addDrop(ModBlocks.BLACKBERRY_BUSH,
                block -> this.applyExplosionDecay(block, LootTable.builder()
                        .pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.BLACKBERRY_BUSH)
                                                .properties(StatePredicate.Builder.create().exactMatch(BlackberryBushBlock.AGE, 3)))
                                .with(ItemEntry.builder(ModItems.BLACKBERRY))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 5.0F))) //how many items drop
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));


        addDrop(ModBlocks.PETRIFIED_SLIME_BLOCK);
        addDrop(ModBlocks.GHOST_CRYSTAL_BLOCK, multipleOreDrops(ModBlocks.GHOST_CRYSTAL_BLOCK, ModItems.GHOST_CRYSTAL, 2, 5));
        addDropWithSilkTouch(ModBlocks.GHOST_GLASS);

        addDrop(ModBlocks.CRYSTAL_COBBLESTONE);
        addDrop(ModBlocks.CRYSTAL_COBBLESTONE_SLAB, slabDrops(ModBlocks.CRYSTAL_COBBLESTONE_SLAB));
        addDrop(ModBlocks.CRYSTAL_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.CRYSTAL_COBBLESTONE_WALL);
        addDrop(ModBlocks.CRYSTAL_TILES);

        addDrop(ModBlocks.REFINERY);
        addDrop(ModBlocks.CRYSTALARIUM);

        addDrop(ModBlocks.HELVINE_TILES);
        addDrop(ModBlocks.LEMON_STONE_TILES);
        addDrop(ModBlocks.TIGERS_EYE_TILES);
        addDrop(ModBlocks.KYANITE_TILES);
        addDrop(ModBlocks.PYRITE_TILES);
        addDrop(ModBlocks.FLUORAPATITE_TILES);
        addDrop(ModBlocks.JAGOITE_TILES);
        addDrop(ModBlocks.CELESTINE_TILES);
        addDrop(ModBlocks.GEMINITE_TILES);
        addDrop(ModBlocks.JASPER_TILES);
        addDrop(ModBlocks.AERINITE_TILES);
        addDrop(ModBlocks.ORPIMENT_TILES);
        addDrop(ModBlocks.DOLOMITE_TILES);
        addDrop(ModBlocks.JAMBORITE_TILES);
        addDrop(ModBlocks.NEKOITE_TILES);
        addDrop(ModBlocks.NEPTUNITE_TILES);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
