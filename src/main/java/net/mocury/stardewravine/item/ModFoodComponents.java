package net.mocury.stardewravine.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent STARDROP = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();

}
