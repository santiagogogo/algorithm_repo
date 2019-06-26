package com.lailai.algorithm_repo.FactoryMethodPattern;

public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
