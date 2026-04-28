package net.mocury.stardewravine.component;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(StardewRavine.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        StardewRavine.LOGGER.info("Registering Data Component Types for "+ StardewRavine.MOD_ID);
    }
}
