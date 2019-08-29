package com.lailai.pattern.SimpleFactoryPattern;

public class MainClass {

    public static void main(String[] args){
        Fruit apple = FruitFactory.getInstance("Banana");
        apple.get();
    }
}
