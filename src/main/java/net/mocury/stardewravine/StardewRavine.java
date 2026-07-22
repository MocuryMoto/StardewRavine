package net.mocury.stardewravine;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.block.entity.ModBlockEntities;
import net.mocury.stardewravine.component.ModDataComponentTypes;
import net.mocury.stardewravine.effect.ModEffects;
import net.mocury.stardewravine.entity.ModBoats;
import net.mocury.stardewravine.item.ModItemGroups;
import net.mocury.stardewravine.item.ModItems;
import net.mocury.stardewravine.potion.ModPotions;
import net.mocury.stardewravine.recipe.ModRecipes;
import net.mocury.stardewravine.util.ModLootTableModifiers;
import net.mocury.stardewravine.villager.ModVillagers;
import net.mocury.stardewravine.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StardewRavine implements ModInitializer {
	public static final String MOD_ID = "stardewravine";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();

		ModDataComponentTypes.registerDataComponentTypes();

		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();

		ModBlockEntities.registerBlockEntities();
		ModRecipes.registerRecipes();

		ModBoats.registerBoats();

		ModPotions.registerPotions();
		ModEffects.registerEffects();

		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPRING_ONION, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HORSERADISH, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLUEBERRIES, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SALMONBERRY, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STRAWBERRY, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_BEAN, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_BEAN_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RICE, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RICE_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RED_CABBAGE, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RED_CABBAGE_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STARFRUIT, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STARFRUIT_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HOPS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HOPS_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RADISHES, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RADISH_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHILI_PEPPER, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHILI_PEPPER_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SUMMER_SQUASH, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SUMMER_SQUASH_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.COFFEE_BEANS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHERRIES, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.APRICOT, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ORANGE, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.POMEGRANATE, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MANGO, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BANANA, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PEACH, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MIXED_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPICE_BERRY, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GRAPES, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GRAPE_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ARTICHOKE, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ARTICHOKE_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BOK_CHOY, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BOK_CHOY_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BROCCOLI, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BROCCOLI_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.YAM, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CRANBERRIES, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACKBERRY, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HAZELNUT, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PLUM, 0.5f);

		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.MYSTIC_LOG, ModBlocks.STRIPPED_MYSTIC_LOG);
		StrippableBlockRegistry.register(ModBlocks.MYSTIC_WOOD, ModBlocks.STRIPPED_MYSTIC_WOOD);
		StrippableBlockRegistry.register(ModBlocks.APRICOT_LOG, ModBlocks.STRIPPED_APRICOT_LOG);
		StrippableBlockRegistry.register(ModBlocks.APRICOT_WOOD, ModBlocks.STRIPPED_APRICOT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.POMEGRANATE_LOG, ModBlocks.STRIPPED_POMEGRANATE_LOG);
		StrippableBlockRegistry.register(ModBlocks.POMEGRANATE_WOOD, ModBlocks.STRIPPED_POMEGRANATE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.MANGO_LOG, ModBlocks.STRIPPED_MANGO_LOG);
		StrippableBlockRegistry.register(ModBlocks.MANGO_WOOD, ModBlocks.STRIPPED_MANGO_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BANANA_LOG, ModBlocks.STRIPPED_BANANA_LOG);
		StrippableBlockRegistry.register(ModBlocks.BANANA_WOOD, ModBlocks.STRIPPED_BANANA_WOOD);
		StrippableBlockRegistry.register(ModBlocks.PEACH_LOG, ModBlocks.STRIPPED_PEACH_LOG);
		StrippableBlockRegistry.register(ModBlocks.PEACH_WOOD, ModBlocks.STRIPPED_PEACH_WOOD);
		StrippableBlockRegistry.register(ModBlocks.FIDDLEHEAD_LOG, ModBlocks.STRIPPED_FIDDLEHEAD_LOG);
		StrippableBlockRegistry.register(ModBlocks.FIDDLEHEAD_WOOD, ModBlocks.STRIPPED_FIDDLEHEAD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MYSTIC_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MYSTIC_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MYSTIC_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MYSTIC_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MYSTIC_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MYSTIC_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.APRICOT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.APRICOT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_APRICOT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_APRICOT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.APRICOT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.APRICOT_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ORANGE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ORANGE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POMEGRANATE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POMEGRANATE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POMEGRANATE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POMEGRANATE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POMEGRANATE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POMEGRANATE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANGO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANGO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BANANA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BANANA_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BANANA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BANANA_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BANANA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BANANA_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEACH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEACH_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PEACH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PEACH_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEACH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEACH_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIDDLEHEAD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIDDLEHEAD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIDDLEHEAD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIDDLEHEAD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIDDLEHEAD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIDDLEHEAD_LEAVES, 30, 60);


		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.AQUAMARINE, Potions.WATER_BREATHING); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.TOPAZ, Potions.FIRE_RESISTANCE); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.JADE, Potions.LEAPING); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.RUBY, Potions.REGENERATION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.MALACHITE, ModPotions.NAUSEA_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.HELVINE, ModPotions.ABSORPTION_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.LEMON_STONE, Potions.SWIFTNESS); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.TIGERS_EYE, Potions.STRENGTH); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.KYANITE, ModPotions.DOLPHINS_GRACE_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.PYRITE, ModPotions.RESISTANCE_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.FLUORAPATITE, ModPotions.SATURATION_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.JAGOITE, Potions.SLOWNESS); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.CELESTINE, Potions.NIGHT_VISION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.GEMINITE, Potions.OOZING); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.JASPER, ModPotions.HASTE_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.AERINITE, Potions.SLOW_FALLING); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.ORPIMENT, Potions.POISON); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.DOLOMITE, Potions.INVISIBILITY); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.JAMBORITE, Potions.LUCK); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.NEKOITE, Potions.WEAVING); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.NEPTUNITE, ModPotions.DARKNESS_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.LUNARITE, ModPotions.LEVITATION_POTION); });

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.NIGHT_VISION, Items.FERMENTED_SPIDER_EYE, ModPotions.BLINDNESS_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.SATURATION_POTION, Items.FERMENTED_SPIDER_EYE, ModPotions.HUNGER_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.HASTE_POTION, Items.FERMENTED_SPIDER_EYE, ModPotions.MINING_FATIGUE_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.LUCK, Items.FERMENTED_SPIDER_EYE, ModPotions.BAD_LUCK_POTION); });


		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.OPAL, ModPotions.OPALESCENT_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.FIRE_OPAL, ModPotions.GILDED_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.EARTH_CRYSTAL, ModPotions.CRUSADER_POTION); });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.THICK, ModItems.PETRIFIED_SLIME, ModPotions.SLIME_CHARMER_POTION); });

	}
}