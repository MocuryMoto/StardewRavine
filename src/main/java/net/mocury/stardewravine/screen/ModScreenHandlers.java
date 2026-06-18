package net.mocury.stardewravine.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.screen.custom.CrystalariumScreenHandler;
import net.mocury.stardewravine.screen.custom.RefineryScreenHandler;

public class ModScreenHandlers {
    public static final ScreenHandlerType<RefineryScreenHandler> REFINERY_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(StardewRavine.MOD_ID, "refinery_screen_handler"),
                    new ExtendedScreenHandlerType<>(RefineryScreenHandler::new, BlockPos.PACKET_CODEC));
    public static final ScreenHandlerType<CrystalariumScreenHandler> CRYSTALARIUM_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(StardewRavine.MOD_ID, "crystalarium_screen_handler"),
                    new ExtendedScreenHandlerType<>(CrystalariumScreenHandler::new, BlockPos.PACKET_CODEC));


    public static void registerScreenHandlers() {
        StardewRavine.LOGGER.info("Registering Screen Handlers for " + StardewRavine.MOD_ID);
    }
}
