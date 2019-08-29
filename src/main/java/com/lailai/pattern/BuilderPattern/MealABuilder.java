package com.lailai.pattern.BuilderPattern;

public class MealABuilder extends AbstractMealBuilder {
    Meal meal=new Meal();
    @Override
    public void buildFood() {

        meal.setFood("鸡肉堡");
    }

    @Override
    public void buildDrink() {

        meal.setDrink("柠檬汁");
    }

    @Override
    public Meal getMeal(){
        return meal;
    }
}
