package com.lailai.pattern.BuilderPattern;

import lombok.Data;

@Data
public abstract class AbstractMealBuilder {
    public abstract void buildFood();
    public abstract void buildDrink();
    public abstract Meal getMeal();
}
