package com.lailai.algorithm_repo.FactoryMethod;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
