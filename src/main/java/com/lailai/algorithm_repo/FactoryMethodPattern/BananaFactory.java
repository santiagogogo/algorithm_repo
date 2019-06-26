package com.lailai.algorithm_repo.FactoryMethodPattern;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
