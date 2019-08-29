package com.lailai.pattern.FactoryMethodPattern;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
