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

    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent LEEK = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent SPRING_ONION = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent PARSNIP = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent HORSERADISH = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent RHUBARB = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent KALE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();

    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.15F).snack().build();
    public static final FoodComponent SALMONBERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.15F).snack().build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.15F).snack().build();

    public static final FoodComponent APRICOT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build();
    public static final FoodComponent POMEGRANATE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build();
    public static final FoodComponent MANGO = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent CHERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).snack().build();

    public static final FoodComponent MAPLE_SYRUP = new FoodComponent.Builder().nutrition(6).saturationModifier(0.1F).build();

}
