package com.lailai.pattern.BuilderPattern;

public class MealDirector {
    AbstractMealBuilder abstractMealBuilder;

    public MealDirector(AbstractMealBuilder builder) {
        abstractMealBuilder = builder;
    }

    public Meal construct() {
        abstractMealBuilder.buildDrink();
        abstractMealBuilder.buildFood();
        return abstractMealBuilder.getMeal();
    }

}
