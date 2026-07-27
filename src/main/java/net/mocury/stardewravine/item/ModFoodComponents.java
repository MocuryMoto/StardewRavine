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
    public static final FoodComponent SWEET_GEM_BERRY = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();

    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent LEEK = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent SPRING_ONION = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent PARSNIP = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent HORSERADISH = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent RHUBARB = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent KALE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();
    public static final FoodComponent GREEN_BEAN = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent RICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent RED_CABBAGE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();
    public static final FoodComponent STARFRUIT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodComponent HOPS = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent RADISHES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2F).build();
    public static final FoodComponent CHILI_PEPPER = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodComponent SUMMER_SQUASH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2F).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodComponent ARTICHOKE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2F).build();
    public static final FoodComponent BOK_CHOY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2F).build();
    public static final FoodComponent BROCCOLI = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2F).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2F).build();
    public static final FoodComponent YAM = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();

    public static final FoodComponent STARDEW_MELON_SLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build();
    public static final FoodComponent POWDERMELON_SLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build();


    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent SALMONBERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent COFFEE_BEANS = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent SPICE_BERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent CRANBERRIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent BLACKBERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent HAZELNUT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();
    public static final FoodComponent PLUM = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();



    public static final FoodComponent APRICOT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build();
    public static final FoodComponent POMEGRANATE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build();
    public static final FoodComponent MANGO = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent CHERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).snack().build();

    public static final FoodComponent MAPLE_SYRUP = new FoodComponent.Builder().nutrition(6).saturationModifier(0.1F).build();

}
