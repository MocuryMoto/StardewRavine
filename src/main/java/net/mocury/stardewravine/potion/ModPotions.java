package net.mocury.stardewravine.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.ModStatus;
import net.mocury.stardewravine.StardewRavine;
import net.mocury.stardewravine.effect.ModEffects;

public class ModPotions {
    public static final RegistryEntry<Potion> ABSORPTION_POTION = registerPotion("absorption_potion",
            new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 0)));
    public static final RegistryEntry<Potion> BLINDNESS_POTION = registerPotion("blindness_potion",
            new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 1800, 0)));
    public static final RegistryEntry<Potion> HASTE_POTION = registerPotion("haste_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, 1800, 0)));
    public static final RegistryEntry<Potion> HUNGER_POTION = registerPotion("hunger_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 1800, 0)));
    public static final RegistryEntry<Potion> MINING_FATIGUE_POTION = registerPotion("mining_fatigue_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1800, 0)));
    public static final RegistryEntry<Potion> NAUSEA_POTION = registerPotion("nausea_potion",
            new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 1800, 0)));
    public static final RegistryEntry<Potion> RESISTANCE_POTION = registerPotion("resistance_potion",
            new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0)));
    public static final RegistryEntry<Potion> SATURATION_POTION = registerPotion("saturation_potion",
            new Potion(new StatusEffectInstance(StatusEffects.SATURATION, 1800, 0)));
    public static final RegistryEntry<Potion> LEVITATION_POTION = registerPotion("levitation_potion",
            new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 1800, 0)));
    public static final RegistryEntry<Potion> DOLPHINS_GRACE_POTION = registerPotion("dolphins_grace_potion",
            new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1800, 0)));
    public static final RegistryEntry<Potion> DARKNESS_POTION = registerPotion("darkness_potion",
            new Potion(new StatusEffectInstance(StatusEffects.DARKNESS, 1800, 0)));
    public static final RegistryEntry<Potion> BAD_LUCK_POTION = registerPotion("bad_luck_potion",
            new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 1800, 0)));

    public static final RegistryEntry<Potion> OPALESCENT_POTION = registerPotion("opalescent_potion",
            new Potion(new StatusEffectInstance(ModEffects.OPALESCENT, 1800, 0)));
    public static final RegistryEntry<Potion> GILDED_POTION = registerPotion("gilded_potion",
            new Potion(new StatusEffectInstance(ModEffects.GILDED, 1800, 0)));
    public static final RegistryEntry<Potion> CRUSADER_POTION = registerPotion("crusader_potion",
            new Potion(new StatusEffectInstance(ModEffects.CRUSADER, 1800, 0)));
    public static final RegistryEntry<Potion> SLIME_CHARMER_POTION = registerPotion("slime_charmer_potion",
            new Potion(new StatusEffectInstance(ModEffects.SLIME_CHARMER, 1800, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion){
        return Registry.registerReference(Registries.POTION, Identifier.of(StardewRavine.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        StardewRavine.LOGGER.info("Registering Potions for " + StardewRavine.MOD_ID);
    }
}
