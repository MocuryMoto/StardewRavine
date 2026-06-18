package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;
import net.mocury.stardewravine.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.CRYSTALARIUM_ITEMS)
                .add(ModItems.AQUAMARINE)
                .add(ModItems.TOPAZ)
                .add(ModItems.JADE)
                .add(ModItems.RUBY)
                .add(ModItems.FIRE_QUARTZ)
                .add(ModItems.HELVINE)
                .add(ModItems.LEMON_STONE)
                .add(ModItems.TIGERS_EYE)
                .add(ModItems.KYANITE)
                .add(ModItems.PYRITE)
                .add(ModItems.FLUORAPATITE)
                .add(ModItems.JAGOITE)
                .add(ModItems.CELESTINE)
                .add(ModItems.GEMINITE)
                .add(ModItems.JASPER)
                .add(ModItems.AERINITE)
                .add(ModItems.ORPIMENT)
                .add(ModItems.DOLOMITE)
                .add(ModItems.JAMBORITE)
                .add(ModItems.NEKOITE)
                .add(ModItems.NEPTUNITE)
                .add(ModItems.LUNARITE)
                .add(ModItems.MALACHITE)
                .add(ModItems.OPAL)
                .add(ModItems.FIRE_OPAL)
                .add(ModItems.BIXITE_CHUNK)
                .add(ModItems.EARTH_CRYSTAL)
                .add(Items.EMERALD)
                .add(Items.DIAMOND)
                .add(Items.LAPIS_LAZULI)
                .add(Items.QUARTZ)
                .add(Items.AMETHYST_SHARD)
        ;

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.IRIDIUM_SWORD)
                .add(ModItems.NETHER_IRIDIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.IRIDIUM_PICKAXE)
                .add(ModItems.NETHER_IRIDIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.IRIDIUM_SHOVEL)
                .add(ModItems.NETHER_IRIDIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.IRIDIUM_AXE)
                .add(ModItems.NETHER_IRIDIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.IRIDIUM_HOE)
                .add(ModItems.NETHER_IRIDIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.IRIDIUM_HELMET)
                .add(ModItems.IRIDIUM_CHESTPLATE)
                .add(ModItems.IRIDIUM_LEGGINGS)
                .add(ModItems.IRIDIUM_BOOTS)
                .add(ModItems.NETHER_IRIDIUM_HELMET)
                .add(ModItems.NETHER_IRIDIUM_CHESTPLATE)
                .add(ModItems.NETHER_IRIDIUM_LEGGINGS)
                .add(ModItems.NETHER_IRIDIUM_BOOTS)
        ;

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.IRIDIUM_INGOT)
                .add(ModItems.RADIONITE_INGOT)
                .add(ModItems.AQUAMARINE)
                .add(ModItems.TOPAZ)
                .add(ModItems.JADE)
                .add(ModItems.RUBY)
                .add(ModItems.FIRE_QUARTZ)
                .add(ModItems.REFINED_QUARTZ)
                .add(ModItems.CINDER_SHARD)
                .add(ModItems.HELVINE)
                .add(ModItems.LEMON_STONE)
                .add(ModItems.TIGERS_EYE)
                .add(ModItems.KYANITE)
                .add(ModItems.PYRITE)
                .add(ModItems.FLUORAPATITE)
                .add(ModItems.JAGOITE)
                .add(ModItems.CELESTINE)
                .add(ModItems.GEMINITE)
                .add(ModItems.JASPER)
                .add(ModItems.AERINITE)
                .add(ModItems.ORPIMENT)
                .add(ModItems.DOLOMITE)
                .add(ModItems.JAMBORITE)
                .add(ModItems.NEKOITE)
                .add(ModItems.NEPTUNITE)
                .add(ModItems.LUNARITE)
                .add(ModItems.MALACHITE)
                .add(ModItems.OPAL)
                .add(ModItems.FIRE_OPAL)
        ;

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())
                .add(ModBlocks.MYSTIC_LOG.asItem())
                .add(ModBlocks.STRIPPED_MYSTIC_LOG.asItem())
                .add(ModBlocks.MYSTIC_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MYSTIC_WOOD.asItem())
                .add(ModBlocks.APRICOT_LOG.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_LOG.asItem())
                .add(ModBlocks.APRICOT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_WOOD.asItem())
                .add(ModBlocks.ORANGE_LOG.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_LOG.asItem())
                .add(ModBlocks.ORANGE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_WOOD.asItem())
                .add(ModBlocks.POMEGRANATE_LOG.asItem())
                .add(ModBlocks.STRIPPED_POMEGRANATE_LOG.asItem())
                .add(ModBlocks.POMEGRANATE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POMEGRANATE_WOOD.asItem())
                .add(ModBlocks.MANGO_LOG.asItem())
                .add(ModBlocks.STRIPPED_MANGO_LOG.asItem())
                .add(ModBlocks.MANGO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MANGO_WOOD.asItem())
                .add(ModBlocks.BANANA_LOG.asItem())
                .add(ModBlocks.STRIPPED_BANANA_LOG.asItem())
                .add(ModBlocks.BANANA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BANANA_WOOD.asItem())
                .add(ModBlocks.PEACH_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEACH_LOG.asItem())
                .add(ModBlocks.PEACH_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.asItem())
        ;

        getOrCreateTagBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.MYSTIC_LOGS)
                .add(ModBlocks.MYSTIC_LOG.asItem())
                .add(ModBlocks.STRIPPED_MYSTIC_LOG.asItem())
                .add(ModBlocks.MYSTIC_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MYSTIC_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.APRICOT_LOGS)
                .add(ModBlocks.APRICOT_LOG.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_LOG.asItem())
                .add(ModBlocks.APRICOT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.ORANGE_LOGS)
                .add(ModBlocks.ORANGE_LOG.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_LOG.asItem())
                .add(ModBlocks.ORANGE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.POMEGRANATE_LOGS)
                .add(ModBlocks.POMEGRANATE_LOG.asItem())
                .add(ModBlocks.STRIPPED_POMEGRANATE_LOG.asItem())
                .add(ModBlocks.POMEGRANATE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POMEGRANATE_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.MANGO_LOGS)
                .add(ModBlocks.MANGO_LOG.asItem())
                .add(ModBlocks.STRIPPED_MANGO_LOG.asItem())
                .add(ModBlocks.MANGO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MANGO_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.BANANA_LOGS)
                .add(ModBlocks.BANANA_LOG.asItem())
                .add(ModBlocks.STRIPPED_BANANA_LOG.asItem())
                .add(ModBlocks.BANANA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BANANA_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.PEACH_LOGS)
                .add(ModBlocks.PEACH_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEACH_LOG.asItem())
                .add(ModBlocks.PEACH_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.FIDDLEHEAD_LOGS)
                .add(ModBlocks.FIDDLEHEAD_LOG.asItem())
                .add(ModBlocks.STRIPPED_FIDDLEHEAD_LOG.asItem())
                .add(ModBlocks.FIDDLEHEAD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_FIDDLEHEAD_WOOD.asItem())
        ;
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.MYSTIC_PLANKS.asItem())
                .add(ModBlocks.APRICOT_PLANKS.asItem())
                .add(ModBlocks.ORANGE_PLANKS.asItem())
                .add(ModBlocks.POMEGRANATE_PLANKS.asItem())
                .add(ModBlocks.MANGO_PLANKS.asItem())
                .add(ModBlocks.BANANA_PLANKS.asItem())
                .add(ModBlocks.PEACH_PLANKS.asItem())
                .add(ModBlocks.FIDDLEHEAD_PLANKS.asItem())
        ;
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.TOPAZ)
                .add(ModBlocks.TOPAZ_BLOCK.asItem())
        ;
    }
}
