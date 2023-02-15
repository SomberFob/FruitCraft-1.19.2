package net.somberfob.fruitcraft.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties ORANGE = (new FoodProperties.Builder()).nutrition(3).saturationMod(2F).build();
    public static final FoodProperties PEAR = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).build();
    public static final FoodProperties AVOCADO_OPEN = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).build();
}