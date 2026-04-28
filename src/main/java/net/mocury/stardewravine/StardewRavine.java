package net.mocury.stardewravine;

import net.fabricmc.api.ModInitializer;

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
	}
}