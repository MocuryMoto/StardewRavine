package net.mocury.stardewravine.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

public class ModRecipes {
    public static final RecipeSerializer<RefineryRecipe> REFINERY_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(StardewRavine.MOD_ID, "refinery"),
                    new RefineryRecipe.Serializer());
    public static final RecipeType<RefineryRecipe> REFINERY_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(StardewRavine.MOD_ID, "refinery"), new RecipeType<RefineryRecipe>() {
                @Override
                public String toString() {return "refinery";
                }});

    public static final RecipeSerializer<CrystalariumRecipe> CRYSTALARIUM_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(StardewRavine.MOD_ID, "crystalarium"),
                    new CrystalariumRecipe.Serializer());
    public static final RecipeType<CrystalariumRecipe> CRYSTALARIUM_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(StardewRavine.MOD_ID, "crystalarium"), new RecipeType<CrystalariumRecipe>() {
                @Override
                public String toString() {return "crystalarium";
                }});

    public static void registerRecipes() {
        StardewRavine.LOGGER.info("Registering Custom Recipes for " + StardewRavine.MOD_ID);
    }
}
