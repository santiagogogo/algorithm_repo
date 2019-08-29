package com.lailai.pattern.FactoryMethodPattern;

public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
