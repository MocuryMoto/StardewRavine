package net.mocury.stardewravine;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.component.ModDataComponentTypes;
import net.mocury.stardewravine.item.ModItemGroups;
import net.mocury.stardewravine.item.ModItems;
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

		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPRING_ONION, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPRING_ONION_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSNIP_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HORSERADISH, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HORSERADISH_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE, 0.33f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.KALE_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLUEBERRIES, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SALMONBERRY, 0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STRAWBERRY, 0.2f);
	}
}