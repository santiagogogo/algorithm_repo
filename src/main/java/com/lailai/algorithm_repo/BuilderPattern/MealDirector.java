package com.lailai.algorithm_repo.BuilderPattern;

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
