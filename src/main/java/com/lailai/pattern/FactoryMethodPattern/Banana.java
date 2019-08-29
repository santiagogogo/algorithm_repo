package com.lailai.pattern.FactoryMethodPattern;


public class Banana implements Fruit {

    private String name;

    public void get(){
        System.out.println("收集香蕉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
