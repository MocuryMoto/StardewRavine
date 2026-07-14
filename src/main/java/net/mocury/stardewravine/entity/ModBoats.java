package net.mocury.stardewravine.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.block.ModBlocks;
import net.mocury.stardewravine.item.ModItems;

public class ModBoats {
    public static final Identifier MAPLE_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "maple_boat");
    public static final Identifier MAPLE_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "maple_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAPLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAPLE_BOAT_ID);

    public static final Identifier MYSTIC_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "mystic_boat");
    public static final Identifier MYSTIC_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "mystic_chest_boat");
    public static final RegistryKey<TerraformBoatType> MYSTIC_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MYSTIC_BOAT_ID);

    public static final Identifier FIDDLEHEAD_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "fiddlehead_boat");
    public static final Identifier FIDDLEHEAD_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "fiddlehead_chest_boat");
    public static final RegistryKey<TerraformBoatType> FIDDLEHEAD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(FIDDLEHEAD_BOAT_ID);

    public static final Identifier APRICOT_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "apricot_boat");
    public static final Identifier APRICOT_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "apricot_chest_boat");
    public static final RegistryKey<TerraformBoatType> APRICOT_BOAT_KEY = TerraformBoatTypeRegistry.createKey(APRICOT_BOAT_ID);

    public static final Identifier ORANGE_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "orange_boat");
    public static final Identifier ORANGE_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "orange_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_BOAT_ID);

    public static final Identifier POMEGRANATE_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "pomegranate_boat");
    public static final Identifier POMEGRANATE_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "pomegranate_chest_boat");
    public static final RegistryKey<TerraformBoatType> POMEGRANATE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(POMEGRANATE_BOAT_ID);

    public static final Identifier MANGO_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "mango_boat");
    public static final Identifier MANGO_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "mango_chest_boat");
    public static final RegistryKey<TerraformBoatType> MANGO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MANGO_BOAT_ID);

    public static final Identifier BANANA_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "banana_boat");
    public static final Identifier BANANA_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "banana_chest_boat");
    public static final RegistryKey<TerraformBoatType> BANANA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BANANA_BOAT_ID);

    public static final Identifier PEACH_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "peach_boat");
    public static final Identifier PEACH_CHEST_BOAT_ID = Identifier.of(StardewRavine.MOD_ID, "peach_chest_boat");
    public static final RegistryKey<TerraformBoatType> PEACH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PEACH_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType mapleBoat = new TerraformBoatType.Builder()
                .item(ModItems.MAPLE_BOAT)
                .chestItem(ModItems.MAPLE_CHEST_BOAT)
                .planks(ModBlocks.MAPLE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAPLE_BOAT_KEY, mapleBoat);

        TerraformBoatType mysticBoat = new TerraformBoatType.Builder()
                .item(ModItems.MYSTIC_BOAT)
                .chestItem(ModItems.MYSTIC_CHEST_BOAT)
                .planks(ModBlocks.MYSTIC_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MYSTIC_BOAT_KEY, mysticBoat);

        TerraformBoatType fiddleheadBoat = new TerraformBoatType.Builder()
                .item(ModItems.FIDDLEHEAD_BOAT)
                .chestItem(ModItems.FIDDLEHEAD_CHEST_BOAT)
                .planks(ModBlocks.FIDDLEHEAD_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, FIDDLEHEAD_BOAT_KEY, fiddleheadBoat);

        TerraformBoatType apricotBoat = new TerraformBoatType.Builder()
                .item(ModItems.APRICOT_BOAT)
                .chestItem(ModItems.APRICOT_CHEST_BOAT)
                .planks(ModBlocks.APRICOT_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, APRICOT_BOAT_KEY, apricotBoat);

        TerraformBoatType orangeBoat = new TerraformBoatType.Builder()
                .item(ModItems.ORANGE_BOAT)
                .chestItem(ModItems.ORANGE_CHEST_BOAT)
                .planks(ModBlocks.ORANGE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ORANGE_BOAT_KEY, orangeBoat);

        TerraformBoatType pomegranateBoat = new TerraformBoatType.Builder()
                .item(ModItems.POMEGRANATE_BOAT)
                .chestItem(ModItems.POMEGRANATE_CHEST_BOAT)
                .planks(ModBlocks.POMEGRANATE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, POMEGRANATE_BOAT_KEY, pomegranateBoat);

        TerraformBoatType mangoBoat = new TerraformBoatType.Builder()
                .item(ModItems.MANGO_BOAT)
                .chestItem(ModItems.MANGO_CHEST_BOAT)
                .planks(ModBlocks.MANGO_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MANGO_BOAT_KEY, mangoBoat);

        TerraformBoatType bananaBoat = new TerraformBoatType.Builder()
                .item(ModItems.BANANA_BOAT)
                .chestItem(ModItems.BANANA_CHEST_BOAT)
                .planks(ModBlocks.BANANA_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BANANA_BOAT_KEY, bananaBoat);

        TerraformBoatType peachBoat = new TerraformBoatType.Builder()
                .item(ModItems.PEACH_BOAT)
                .chestItem(ModItems.PEACH_CHEST_BOAT)
                .planks(ModBlocks.PEACH_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PEACH_BOAT_KEY, peachBoat);

    }
}
