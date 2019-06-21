package com.lailai.algorithm_repo.SimpleFactory;

public class MainClass {

    public static void main(String[] args){
        Fruit apple = FruitFactory.getInstance("com.lailai.algorithm_repo.SimpleFactory.Banana");
        apple.get();
    }
}
