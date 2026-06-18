package net.mocury.stardewravine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;
import net.mocury.stardewravine.util.ModTags;

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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LUNARITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUNARITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MALACHITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MALACHITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OPAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK);

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
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LUNARITE, ModBlocks.LUNARITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MALACHITE, ModBlocks.MALACHITE_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_OPAL_BLOCK, ModBlocks.OPAL_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_OPAL_BLOCK, ModBlocks.FIRE_OPAL_BLOCK);

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


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAP_LIME_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.SOAPSTONE)
                .input('O', ModBlocks.LIMESTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_SOAP_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.LIMESTONE)
                .input('O', ModBlocks.SOAPSTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAP_ESPER_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.SOAPSTONE)
                .input('O', ModBlocks.ESPERITE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPER_SOAP_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.ESPERITE)
                .input('O', ModBlocks.SOAPSTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOAP_MARBLE_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.SOAPSTONE)
                .input('O', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SOAP_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.MARBLE)
                .input('O', ModBlocks.SOAPSTONE)
                .criterion(hasItem(ModBlocks.SOAPSTONE), conditionsFromItem(ModBlocks.SOAPSTONE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_LIME_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.MARBLE)
                .input('O', ModBlocks.LIMESTONE)
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_MARBLE_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.LIMESTONE)
                .input('O', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_ESPER_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.MARBLE)
                .input('O', ModBlocks.ESPERITE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPER_MARBLE_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.ESPERITE)
                .input('O', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_ESPER_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.LIMESTONE)
                .input('O', ModBlocks.ESPERITE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ESPER_LIME_TILES, 4)
                .pattern("XO")
                .pattern("OX")
                .input('X', ModBlocks.ESPERITE)
                .input('O', ModBlocks.LIMESTONE)
                .criterion(hasItem(ModBlocks.ESPERITE), conditionsFromItem(ModBlocks.ESPERITE))
                .criterion(hasItem(ModBlocks.LIMESTONE), conditionsFromItem(ModBlocks.LIMESTONE))
                .offerTo(exporter);

        List<ItemConvertible> HEMATITE_SMELTABLES = List.of(ModBlocks.RAW_HEMATITE);
        offerSmelting(exporter, HEMATITE_SMELTABLES, RecipeCategory.MISC, ModBlocks.REFINED_HEMATITE, 0.25f, 200, "stardew_ravine");
        offerBlasting(exporter, HEMATITE_SMELTABLES, RecipeCategory.MISC, ModBlocks.REFINED_HEMATITE, 0.25f, 100, "stardew_ravine");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HEMATITE_ROSE, 4)
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.REFINED_HEMATITE)
                .criterion(hasItem(ModBlocks.REFINED_HEMATITE), conditionsFromItem(ModBlocks.REFINED_HEMATITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SCROLL_BLOCK, 1)
                .pattern("XXX")
                .pattern("OOO")
                .pattern("XXX")
                .input('X', Items.PAPER)
                .input('O', Items.LEATHER)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RED_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.RED_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.ORANGE_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.YELLOW_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIME_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.LIME_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.CYAN_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLUE_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.BLUE_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.MAGENTA_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.PINK_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.WHITE_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.GRAY_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.BLACK_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BROWN_SCROLL)
                .input(ModBlocks.SCROLL_BLOCK)
                .input(Items.BROWN_DYE)
                .criterion(hasItem(ModBlocks.SCROLL_BLOCK), conditionsFromItem(ModBlocks.SCROLL_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 1)
                .input(ModBlocks.CROCUS)
                .criterion(hasItem(ModBlocks.CROCUS), conditionsFromItem(ModBlocks.CROCUS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 1)
                .input(ModBlocks.SWEET_PEA)
                .criterion(hasItem(ModBlocks.SWEET_PEA), conditionsFromItem(ModBlocks.SWEET_PEA))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "purple_dye_from_sweet_pea"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE, 1)
                .input(ModBlocks.SUMMER_SPANGLE)
                .criterion(hasItem(ModBlocks.SUMMER_SPANGLE), conditionsFromItem(ModBlocks.SUMMER_SPANGLE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE, 1)
                .input(ModBlocks.DAFFODIL)
                .criterion(hasItem(ModBlocks.DAFFODIL), conditionsFromItem(ModBlocks.DAFFODIL))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE, 1)
                .input(ModBlocks.BLUE_JAZZ)
                .criterion(hasItem(ModBlocks.BLUE_JAZZ), conditionsFromItem(ModBlocks.BLUE_JAZZ))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 2)
                .input(ModBlocks.AMARANTH)
                .criterion(hasItem(ModBlocks.AMARANTH), conditionsFromItem(ModBlocks.AMARANTH))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "purple_dye_from_amaranth"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAIRY_DUST, 1)
                .input(ModBlocks.FAIRY_ROSE)
                .criterion(hasItem(ModBlocks.FAIRY_ROSE), conditionsFromItem(ModBlocks.FAIRY_ROSE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAIRY_DUST, 2)
                .input(ModBlocks.FAIRY_ROSE_BUSH)
                .criterion(hasItem(ModBlocks.FAIRY_ROSE_BUSH), conditionsFromItem(ModBlocks.FAIRY_ROSE_BUSH))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "fairy_dust_from_fairy_rose_bush"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAIRY_DUST, 4)
                .input(ModItems.FAIRY_STONE)
                .criterion(hasItem(ModItems.FAIRY_STONE), conditionsFromItem(ModItems.FAIRY_STONE))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "fairy_dust_from_fairy_stone"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAIRY_STONE, 1)
                .pattern(" X ")
                .pattern("XOX")
                .pattern(" X ")
                .input('X', ModItems.FAIRY_DUST)
                .input('O', ModTags.Items.CRYSTALARIUM_ITEMS)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "fairy_stone_from_fairy_dust"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FAIRY_STONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_STONE_BLOCK);
        List<ItemConvertible> FAIRY_STONE_SMELTABLES = List.of(ModBlocks.END_FAIRY_ORE);
        offerSmelting(exporter, FAIRY_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.FAIRY_STONE, 1f, 200, "stardew_ravine");
        offerBlasting(exporter, FAIRY_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.FAIRY_STONE, 1f, 100, "stardew_ravine");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_COPPER, 1)
                .input(Items.COPPER_BLOCK)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_copper_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_CHISELED_COPPER, 1)
                .input(Items.CHISELED_COPPER)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_chiseled_copper_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_COPPER_BULB, 1)
                .input(Items.COPPER_BULB)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_copper_bulb_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_COPPER_DOOR, 1)
                .input(Items.COPPER_DOOR)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_copper_door_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_COPPER_GRATE, 1)
                .input(Items.COPPER_GRATE)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_copper_grate_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_COPPER_TRAPDOOR, 1)
                .input(Items.COPPER_TRAPDOOR)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_copper_trapdoor_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_CUT_COPPER, 1)
                .input(Items.CUT_COPPER)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_cut_copper_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_CUT_COPPER_STAIRS, 1)
                .input(Items.CUT_COPPER_STAIRS)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_cut_copper_stairs_from_fairy_dust"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OXIDIZED_CUT_COPPER_SLAB, 1)
                .input(Items.CUT_COPPER_SLAB)
                .input(ModItems.FAIRY_DUST)
                .criterion(hasItem(ModItems.FAIRY_DUST), conditionsFromItem(ModItems.FAIRY_DUST))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "oxidized_cut_copper_slab_from_fairy_dust"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE, 1)
                .input(ModItems.BLUEBERRIES)
                .criterion(hasItem(ModItems.BLUEBERRIES), conditionsFromItem(ModItems.BLUEBERRIES))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "blue_dye_from_blueberries"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE, 1)
                .input(ModItems.SALMONBERRY)
                .criterion(hasItem(ModItems.SALMONBERRY), conditionsFromItem(ModItems.SALMONBERRY))
                .offerTo(exporter, Identifier.of(StardewRavine.MOD_ID, "orange_dye_from_salmonberry"));

        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIXITE, ModItems.BIXITE_CHUNK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BIXITE, ModBlocks.BIXITE);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRASINE_BLOCK, ModItems.TERRASINE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TERRASINE, ModBlocks.TERRASINE_BLOCK);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARLIC_SEEDS, 1)
                .input(ModItems.GARLIC)
                .criterion(hasItem(ModItems.GARLIC), conditionsFromItem(ModItems.GARLIC))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PARSNIP_SEEDS, 1)
                .input(ModItems.PARSNIP)
                .criterion(hasItem(ModItems.PARSNIP), conditionsFromItem(ModItems.PARSNIP))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RHUBARB_SEEDS, 1)
                .input(ModItems.RHUBARB)
                .criterion(hasItem(ModItems.RHUBARB), conditionsFromItem(ModItems.RHUBARB))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KALE_SEEDS, 1)
                .input(ModItems.KALE)
                .criterion(hasItem(ModItems.KALE), conditionsFromItem(ModItems.KALE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER_SEEDS, 2)
                .input(ModItems.CAULIFLOWER)
                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_BEAN_SEEDS, 1)
                .input(ModItems.GREEN_BEAN)
                .input(ModItems.TRELLIS)
                .criterion(hasItem(ModItems.GREEN_BEAN), conditionsFromItem(ModItems.GREEN_BEAN))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RICE_SEEDS, 1)
                .input(ModItems.RICE)
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.RICE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_CABBAGE_SEEDS, 2)
                .input(ModItems.RED_CABBAGE)
                .criterion(hasItem(ModItems.RED_CABBAGE), conditionsFromItem(ModItems.RED_CABBAGE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STARFRUIT_SEEDS, 3)
                .input(ModItems.STARFRUIT)
                .criterion(hasItem(ModItems.STARFRUIT), conditionsFromItem(ModItems.STARFRUIT))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOPS_SEEDS, 1)
                .input(ModItems.HOPS)
                .input(ModItems.TRELLIS)
                .criterion(hasItem(ModItems.HOPS), conditionsFromItem(ModItems.HOPS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADISH_SEEDS, 3)
                .input(ModItems.RADISHES)
                .criterion(hasItem(ModItems.RADISHES), conditionsFromItem(ModItems.RADISHES))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHILI_PEPPER_SEEDS, 1)
                .input(ModItems.CHILI_PEPPER)
                .criterion(hasItem(ModItems.CHILI_PEPPER), conditionsFromItem(ModItems.CHILI_PEPPER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOMATO_SEEDS, 1)
                .input(ModItems.TOMATO)
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUMMER_SQUASH_SEEDS, 2)
                .input(ModItems.SUMMER_SQUASH)
                .criterion(hasItem(ModItems.SUMMER_SQUASH), conditionsFromItem(ModItems.SUMMER_SQUASH))
                .offerTo(exporter);


        offerPlanksRecipe(exporter, ModBlocks.MAPLE_PLANKS, ModTags.Items.MAPLE_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.MAPLE_WOOD, ModBlocks.MAPLE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.MAPLE_PLANKS)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_SLAB, ModBlocks.MAPLE_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAPLE_BUTTON, 1)
                .input(ModBlocks.MAPLE_PLANKS)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.MAPLE_PRESSURE_PLATE, ModBlocks.MAPLE_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAPLE_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.MAPLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAPLE_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.MAPLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAPLE_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.MAPLE_PLANKS)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAPLE_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.MAPLE_PLANKS)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.MYSTIC_PLANKS, ModTags.Items.MYSTIC_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.MYSTIC_WOOD, ModBlocks.MYSTIC_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_MYSTIC_WOOD, ModBlocks.STRIPPED_MYSTIC_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYSTIC_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.MYSTIC_PLANKS)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYSTIC_SLAB, ModBlocks.MYSTIC_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MYSTIC_BUTTON, 1)
                .input(ModBlocks.MYSTIC_PLANKS)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.MYSTIC_PRESSURE_PLATE, ModBlocks.MYSTIC_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MYSTIC_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.MYSTIC_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MYSTIC_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.MYSTIC_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MYSTIC_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.MYSTIC_PLANKS)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MYSTIC_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.MYSTIC_PLANKS)
                .criterion(hasItem(ModBlocks.MYSTIC_PLANKS), conditionsFromItem(ModBlocks.MYSTIC_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.APRICOT_PLANKS, ModTags.Items.APRICOT_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.APRICOT_WOOD, ModBlocks.APRICOT_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_APRICOT_WOOD, ModBlocks.STRIPPED_APRICOT_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.APRICOT_PLANKS)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_SLAB, ModBlocks.APRICOT_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.APRICOT_BUTTON, 1)
                .input(ModBlocks.APRICOT_PLANKS)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.APRICOT_PRESSURE_PLATE, ModBlocks.APRICOT_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.APRICOT_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.APRICOT_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.APRICOT_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.APRICOT_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.APRICOT_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.APRICOT_PLANKS)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.APRICOT_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.APRICOT_PLANKS)
                .criterion(hasItem(ModBlocks.APRICOT_PLANKS), conditionsFromItem(ModBlocks.APRICOT_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.ORANGE_PLANKS, ModTags.Items.ORANGE_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.ORANGE_WOOD, ModBlocks.ORANGE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SLAB, ModBlocks.ORANGE_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_BUTTON, 1)
                .input(ModBlocks.ORANGE_PLANKS)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.ORANGE_PRESSURE_PLATE, ModBlocks.ORANGE_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(hasItem(ModBlocks.ORANGE_PLANKS), conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.POMEGRANATE_PLANKS, ModTags.Items.POMEGRANATE_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.POMEGRANATE_WOOD, ModBlocks.POMEGRANATE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_POMEGRANATE_WOOD, ModBlocks.STRIPPED_POMEGRANATE_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POMEGRANATE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.POMEGRANATE_PLANKS)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POMEGRANATE_SLAB, ModBlocks.POMEGRANATE_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.POMEGRANATE_BUTTON, 1)
                .input(ModBlocks.POMEGRANATE_PLANKS)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.POMEGRANATE_PRESSURE_PLATE, ModBlocks.POMEGRANATE_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.POMEGRANATE_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.POMEGRANATE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.POMEGRANATE_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.POMEGRANATE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.POMEGRANATE_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.POMEGRANATE_PLANKS)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.POMEGRANATE_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.POMEGRANATE_PLANKS)
                .criterion(hasItem(ModBlocks.POMEGRANATE_PLANKS), conditionsFromItem(ModBlocks.POMEGRANATE_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.MANGO_PLANKS, ModTags.Items.MANGO_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.MANGO_WOOD, ModBlocks.MANGO_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_MANGO_WOOD, ModBlocks.STRIPPED_MANGO_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGO_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.MANGO_PLANKS)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGO_SLAB, ModBlocks.MANGO_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MANGO_BUTTON, 1)
                .input(ModBlocks.MANGO_PLANKS)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.MANGO_PRESSURE_PLATE, ModBlocks.MANGO_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MANGO_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.MANGO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MANGO_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.MANGO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MANGO_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.MANGO_PLANKS)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MANGO_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.MANGO_PLANKS)
                .criterion(hasItem(ModBlocks.MANGO_PLANKS), conditionsFromItem(ModBlocks.MANGO_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.BANANA_PLANKS, ModTags.Items.BANANA_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.BANANA_WOOD, ModBlocks.BANANA_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_BANANA_WOOD, ModBlocks.STRIPPED_BANANA_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BANANA_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.BANANA_PLANKS)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BANANA_SLAB, ModBlocks.BANANA_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BANANA_BUTTON, 1)
                .input(ModBlocks.BANANA_PLANKS)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.BANANA_PRESSURE_PLATE, ModBlocks.BANANA_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BANANA_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.BANANA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BANANA_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.BANANA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BANANA_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.BANANA_PLANKS)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BANANA_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.BANANA_PLANKS)
                .criterion(hasItem(ModBlocks.BANANA_PLANKS), conditionsFromItem(ModBlocks.BANANA_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.PEACH_PLANKS, ModTags.Items.PEACH_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.PEACH_WOOD, ModBlocks.PEACH_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_PEACH_WOOD, ModBlocks.STRIPPED_PEACH_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.PEACH_PLANKS)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_SLAB, ModBlocks.PEACH_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PEACH_BUTTON, 1)
                .input(ModBlocks.PEACH_PLANKS)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.PEACH_PRESSURE_PLATE, ModBlocks.PEACH_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PEACH_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.PEACH_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PEACH_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.PEACH_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PEACH_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.PEACH_PLANKS)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PEACH_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.PEACH_PLANKS)
                .criterion(hasItem(ModBlocks.PEACH_PLANKS), conditionsFromItem(ModBlocks.PEACH_PLANKS))
                .offerTo(exporter);

        offerPlanksRecipe(exporter, ModBlocks.FIDDLEHEAD_PLANKS, ModTags.Items.FIDDLEHEAD_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.FIDDLEHEAD_WOOD, ModBlocks.FIDDLEHEAD_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_FIDDLEHEAD_WOOD, ModBlocks.STRIPPED_FIDDLEHEAD_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIDDLEHEAD_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.FIDDLEHEAD_PLANKS)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIDDLEHEAD_SLAB, ModBlocks.FIDDLEHEAD_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FIDDLEHEAD_BUTTON, 1)
                .input(ModBlocks.FIDDLEHEAD_PLANKS)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.FIDDLEHEAD_PRESSURE_PLATE, ModBlocks.FIDDLEHEAD_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FIDDLEHEAD_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.FIDDLEHEAD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FIDDLEHEAD_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.FIDDLEHEAD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FIDDLEHEAD_DOOR, 3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.FIDDLEHEAD_PLANKS)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FIDDLEHEAD_TRAPDOOR, 2)
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.FIDDLEHEAD_PLANKS)
                .criterion(hasItem(ModBlocks.FIDDLEHEAD_PLANKS), conditionsFromItem(ModBlocks.FIDDLEHEAD_PLANKS))
                .offerTo(exporter);


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PETRIFIED_SLIME, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PETRIFIED_SLIME_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GHOST_CRYSTAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_CRYSTAL_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GHOST_GLASS, 2)
                .pattern(" C ")
                .pattern("CGC")
                .pattern(" C ")
                .input('C', ModItems.GHOST_CRYSTAL)
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ModItems.GHOST_CRYSTAL), conditionsFromItem(ModItems.GHOST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TRELLIS, 2)
                .pattern("CGC")
                .pattern("CGC")
                .input('C', Items.STICK)
                .input('G', Items.STRING)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.REFINERY, 1)
                .pattern("IFI")
                .pattern("F F")
                .pattern("IRI")
                .input('I', Items.IRON_INGOT)
                .input('F', ModItems.FIRE_QUARTZ)
                .input('R', Blocks.REDSTONE_BLOCK)
                .criterion(hasItem(ModItems.FIRE_QUARTZ), conditionsFromItem(ModItems.FIRE_QUARTZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALARIUM, 1)
                .pattern("IQI")
                .pattern("QOQ")
                .pattern("IRI")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('Q', ModBlocks.REFINED_QUARTZ_BLOCK)
                .input('R', ModBlocks.RADIONITE_BLOCK)
                .input('O', ModBlocks.REFINERY)
                .criterion(hasItem(ModBlocks.REFINERY), conditionsFromItem(ModBlocks.REFINERY))
                .offerTo(exporter);

    }
}
