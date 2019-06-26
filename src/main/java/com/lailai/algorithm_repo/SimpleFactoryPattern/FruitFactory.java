package com.lailai.algorithm_repo.SimpleFactoryPattern;

public class FruitFactory {


    public static Fruit getInstance(String type) {
        try {
            return (Fruit) Class.forName(type).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
