package com.lailai.algorithm_repo.BuilderPattern;

import lombok.Data;

@Data
public class MealBBuilder extends AbstractMealBuilder{
    Meal meal=new Meal();

    @Override
    public void buildFood() {
        meal.setFood("牛肉汉堡");

    }

    @Override
    public void buildDrink() {
        meal.setDrink("可口可乐");

    }

    @Override
    public Meal getMeal(){
        return meal;
    }
}
