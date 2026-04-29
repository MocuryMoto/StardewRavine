package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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
        List<ItemConvertible> REFINED_QUARTZ_SMELTABLES = List.of(ModItems.FIRE_QUARTZ, Items.QUARTZ);
        offerSmelting(exporter, REFINED_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.REFINED_QUARTZ, 0.1f, 200, "stardew_ravine");
        offerBlasting(exporter, REFINED_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.REFINED_QUARTZ, 0.1f, 100, "stardew_ravine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AQUAMARINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PEARL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMATIC_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMATIC_SHARD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRIDIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_IRIDIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RADIONITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RADIONITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RADIONITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RADIONITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HELVINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HELVINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEMON_STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEMON_STONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIGERS_EYE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIGERS_EYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.KYANITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KYANITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PYRITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PYRITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLUORAPATITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORAPATITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JAGOITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JAGOITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CELESTINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GEMINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEMINITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JASPER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JASPER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AERINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AERINITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORPIMENT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORPIMENT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DOLOMITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOLOMITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JAMBORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JAMBORITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NEKOITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEKOITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NEPTUNITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEPTUNITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_SWORD)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_SHOVEL)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_AXE)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_HOE)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_HELMET)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE, ModBlocks.ESPERITE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ESPERITE, ModBlocks.POLISHED_ESPERITE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_BRICKS, ModBlocks.SMOOTH_ESPERITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_SLAB, ModBlocks.ESPERITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_SLAB, ModBlocks.POLISHED_ESPERITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_WALL, ModBlocks.ESPERITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_WALL, ModBlocks.POLISHED_ESPERITE);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ESPERITE, ModBlocks.ESPERITE_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_PILLAR, 2)
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.ESPERITE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.ESPERITE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.POLISHED_ESPERITE)
                .criterion(hasItem(ModBlocks.POLISHED_ESPERITE), conditionsFromItem(ModBlocks.POLISHED_ESPERITE))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_STAIRS, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_SLAB, ModBlocks.ESPERITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_WALL, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_STAIRS, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_SLAB, ModBlocks.ESPERITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_WALL, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ESPERITE, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_BRICKS, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_PILLAR, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ESPERITE, ModBlocks.ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_STAIRS, ModBlocks.POLISHED_ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_SLAB, ModBlocks.POLISHED_ESPERITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ESPERITE_WALL, ModBlocks.POLISHED_ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ESPERITE, ModBlocks.POLISHED_ESPERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPERITE_BRICKS, ModBlocks.POLISHED_ESPERITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE, ModBlocks.MARBLE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_MARBLE, ModBlocks.POLISHED_MARBLE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICKS, ModBlocks.SMOOTH_MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MARBLE, ModBlocks.MARBLE_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, 2)
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.POLISHED_MARBLE)
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_STAIRS, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.MARBLE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_MARBLE, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICKS, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_MARBLE, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.POLISHED_MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_MARBLE, ModBlocks.POLISHED_MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICKS, ModBlocks.POLISHED_MARBLE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE, ModBlocks.SOAPSTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOAPSTONE, ModBlocks.POLISHED_SOAPSTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_BRICKS, ModBlocks.SMOOTH_SOAPSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_SLAB, ModBlocks.SOAPSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_SLAB, ModBlocks.POLISHED_SOAPSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_WALL, ModBlocks.SOAPSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_WALL, ModBlocks.POLISHED_SOAPSTONE);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SOAPSTONE, ModBlocks.SOAPSTONE_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_PILLAR, 2)
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.SOAPSTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.SOAPSTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.POLISHED_SOAPSTONE)
                .criterion(hasItem(ModBlocks.POLISHED_SOAPSTONE), conditionsFromItem(ModBlocks.POLISHED_SOAPSTONE))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_STAIRS, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_SLAB, ModBlocks.SOAPSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_WALL, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_STAIRS, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_SLAB, ModBlocks.SOAPSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_WALL, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOAPSTONE, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_BRICKS, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_PILLAR, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SOAPSTONE, ModBlocks.SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_STAIRS, ModBlocks.POLISHED_SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_SLAB, ModBlocks.POLISHED_SOAPSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SOAPSTONE_WALL, ModBlocks.POLISHED_SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOAPSTONE, ModBlocks.POLISHED_SOAPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAPSTONE_BRICKS, ModBlocks.POLISHED_SOAPSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE, ModBlocks.LIMESTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_LIMESTONE, ModBlocks.POLISHED_LIMESTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS, ModBlocks.SMOOTH_LIMESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_SLAB, ModBlocks.LIMESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_SLAB, ModBlocks.POLISHED_LIMESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_WALL, ModBlocks.POLISHED_LIMESTONE);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_LIMESTONE, ModBlocks.LIMESTONE_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_PILLAR, 2)
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.LIMESTONE)
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.LIMESTONE)
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.POLISHED_LIMESTONE)
                .criterion(hasItem(ModBlocks.POLISHED_LIMESTONE), conditionsFromItem(ModBlocks.POLISHED_LIMESTONE))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_STAIRS, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_SLAB, ModBlocks.LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_STAIRS, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_SLAB, ModBlocks.LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_WALL, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_LIMESTONE, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_PILLAR, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_LIMESTONE, ModBlocks.LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_STAIRS, ModBlocks.POLISHED_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_SLAB, ModBlocks.POLISHED_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_WALL, ModBlocks.POLISHED_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_LIMESTONE, ModBlocks.POLISHED_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS, ModBlocks.POLISHED_LIMESTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_HELVINE, ModBlocks.HELVINE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LEMON_STONE, ModBlocks.LEMON_STONE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TIGERS_EYE, ModBlocks.TIGERS_EYE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_KYANITE, ModBlocks.KYANITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PYRITE, ModBlocks.PYRITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLUORAPATITE, ModBlocks.FLUORAPATITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_JAGOITE, ModBlocks.JAGOITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CELESTINE, ModBlocks.CELESTINE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GEMINITE, ModBlocks.GEMINITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_JASPER, ModBlocks.JASPER_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_AERINITE, ModBlocks.AERINITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ORPIMENT, ModBlocks.ORPIMENT_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DOLOMITE, ModBlocks.DOLOMITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_JAMBORITE, ModBlocks.JAMBORITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEKOITE, ModBlocks.NEKOITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEPTUNITE, ModBlocks.NEPTUNITE_BLOCK);

        List<ItemConvertible> FIRE_QUARTZ_BLOCK_SMELTABLES = List.of(ModBlocks.FIRE_QUARTZ_BLOCK);
        offerSmelting(exporter, FIRE_QUARTZ_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SMOOTH_FIRE_QUARTZ_BLOCK, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, FIRE_QUARTZ_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SMOOTH_FIRE_QUARTZ_BLOCK, 0.25f, 100, "stardew_ravine");
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_BRICKS, ModBlocks.FIRE_QUARTZ_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_SLAB, ModBlocks.FIRE_QUARTZ_BLOCK);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_QUARTZ, ModBlocks.FIRE_QUARTZ_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_PILLAR, 2)
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.FIRE_QUARTZ_BLOCK)
                .criterion(hasItem(ModBlocks.FIRE_QUARTZ_BLOCK), conditionsFromItem(ModBlocks.FIRE_QUARTZ_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.FIRE_QUARTZ_BLOCK)
                .criterion(hasItem(ModBlocks.FIRE_QUARTZ_BLOCK), conditionsFromItem(ModBlocks.FIRE_QUARTZ_BLOCK))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_STAIRS, ModBlocks.FIRE_QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_SLAB, ModBlocks.FIRE_QUARTZ_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_QUARTZ_BLOCK, ModBlocks.FIRE_QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_PILLAR, ModBlocks.FIRE_QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_QUARTZ, ModBlocks.FIRE_QUARTZ_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_QUARTZ_BLOCK, ModItems.FIRE_QUARTZ);

    }
}
