package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> AQUAMARINE_SMELTABLES = List.of(ModBlocks.AQUAMARINE_ORE, ModBlocks.AQUAMARINE_DEEPSLATE_ORE);
        offerSmelting(exporter, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE, 0.25f, 100, "stardew_ravine");
        List<ItemConvertible> JADE_SMELTABLES = List.of(ModBlocks.JADE_ORE, ModBlocks.JADE_DEEPSLATE_ORE);
        offerSmelting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE, 0.25f, 100, "stardew_ravine");
        List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.TOPAZ_DEEPSLATE_ORE, ModBlocks.NETHER_TOPAZ_ORE);
        offerSmelting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 0.25f, 100, "stardew_ravine");
        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.RUBY_DEEPSLATE_ORE, ModBlocks.NETHER_RUBY_ORE);
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "stardew_ravine");
        List<ItemConvertible> IRIDIUM_SMELTABLES = List.of(ModBlocks.IRIDIUM_DEEPSLATE_ORE, ModBlocks.NETHER_IRIDIUM_ORE, ModItems.RAW_IRIDIUM);
        offerSmelting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 1f, 200, "stardew_ravine");
        offerBlasting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 1f, 100, "stardew_ravine");
        List<ItemConvertible> RADIONITE_SMELTABLES = List.of(ModBlocks.NETHER_RADIONITE_ORE, ModItems.RAW_RADIONITE);
        offerSmelting(exporter, RADIONITE_SMELTABLES, RecipeCategory.MISC, ModItems.RADIONITE_INGOT, 1f, 200, "stardew_ravine");
        offerBlasting(exporter, RADIONITE_SMELTABLES, RecipeCategory.MISC, ModItems.RADIONITE_INGOT, 1f, 100, "stardew_ravine");
        List<ItemConvertible> REFINED_QUARTZ_SMELTABLES = List.of(Items.QUARTZ);
        offerSmelting(exporter, REFINED_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.REFINED_QUARTZ, 0.1f, 200, "stardew_ravine");
        offerBlasting(exporter, REFINED_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.REFINED_QUARTZ, 0.1f, 100, "stardew_ravine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AQUAMARINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HELVINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HELVINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PEARL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMATIC_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMATIC_SHARD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRIDIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_IRIDIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RADIONITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RADIONITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RADIONITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RADIONITE_BLOCK);
    }
}
