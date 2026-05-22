package net.mocury.stardewravine.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator MAPLE = new SaplingGenerator(StardewRavine.MOD_ID + ":maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator MYSTIC = new SaplingGenerator(StardewRavine.MOD_ID + ":mystic",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MYSTIC_KEY), Optional.empty());
    public static final SaplingGenerator APRICOT = new SaplingGenerator(StardewRavine.MOD_ID + ":apricot",
            Optional.empty(), Optional.of(ModConfiguredFeatures.APRICOT_KEY), Optional.empty());
    public static final SaplingGenerator ORANGE = new SaplingGenerator(StardewRavine.MOD_ID + ":orange",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ORANGE_KEY), Optional.empty());
    public static final SaplingGenerator POMEGRANATE = new SaplingGenerator(StardewRavine.MOD_ID + ":pomegranate",
            Optional.empty(), Optional.of(ModConfiguredFeatures.POMEGRANATE_KEY), Optional.empty());
    public static final SaplingGenerator MANGO = new SaplingGenerator(StardewRavine.MOD_ID + ":mango",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MANGO_KEY), Optional.empty());
    public static final SaplingGenerator BANANA = new SaplingGenerator(StardewRavine.MOD_ID + ":banana",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BANANA_KEY), Optional.empty());
    public static final SaplingGenerator PEACH = new SaplingGenerator(StardewRavine.MOD_ID + ":peach",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PEACH_KEY), Optional.empty());
    public static final SaplingGenerator FIDDLEHEAD = new SaplingGenerator(StardewRavine.MOD_ID + ":fiddlehead",
            Optional.empty(), Optional.of(ModConfiguredFeatures.FIDDLEHEAD_KEY), Optional.empty());
}
