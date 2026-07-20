package net.mocury.stardewravine.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.mocury.stardewravine.StardewRavine;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> OPALESCENT = registerStatusEffect("opalescent",
            new OpalescentEffect(StatusEffectCategory.BENEFICIAL, 0xbcffff));
    public static final RegistryEntry<StatusEffect> GILDED = registerStatusEffect("gilded",
            new OpalescentEffect(StatusEffectCategory.BENEFICIAL, 0xc22595));
    public static final RegistryEntry<StatusEffect> CRUSADER = registerStatusEffect("crusader",
            new OpalescentEffect(StatusEffectCategory.BENEFICIAL, 0xeadb84));
    public static final RegistryEntry<StatusEffect> SLIME_CHARMER = registerStatusEffect("slime_charmer",
            new OpalescentEffect(StatusEffectCategory.BENEFICIAL, 0x80bf70));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(StardewRavine.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        StardewRavine.LOGGER.info("Registering mod effects for " + StardewRavine.MOD_ID);
    }
}
