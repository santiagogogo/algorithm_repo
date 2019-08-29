package com.lailai.pattern.FactoryMethodPattern;

public class Apple implements Fruit {

    private String name;

    public void get(){
        System.out.println("收集苹果");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
