package com.lailai.algorithm_repo.SimpleFactoryPattern;

public class MainClass {

    public static void main(String[] args){
        Fruit apple = FruitFactory.getInstance("com.lailai.algorithm_repo.SimpleFactoryPattern.Banana");
        apple.get();
    }
}
