package com.lailai.algorithm_repo.FactoryMethodPattern;


public class MainClass {

    public static void main(String[] args){
        FruitFactory appleFactory = new AppleFactory();
        Fruit fruit = appleFactory.getFruit();
        fruit.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit fruit2 = bananaFactory.getFruit();
        fruit2.get();
    }
}
