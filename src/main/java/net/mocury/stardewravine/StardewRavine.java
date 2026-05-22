package net.mocury.stardewravine;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.component.ModDataComponentTypes;
import net.mocury.stardewravine.item.ModItemGroups;
import net.mocury.stardewravine.item.ModItems;
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

		ModDataComponentTypes.registerDataComponentTypes();

		ModWorldGeneration.generateModWorldGen();

		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPRING_ONION, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HORSERADISH, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLUEBERRIES, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SALMONBERRY, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STRAWBERRY, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHERRIES, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.APRICOT, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ORANGE, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.POMEGRANATE, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MANGO, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BANANA, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PEACH, 0.2f);

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
	}
}