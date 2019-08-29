package com.lailai.pattern.FlyWeightPattern;

public class ConcreteFlyWeight implements FlyWeight {
    private String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void action(String exStatus) {
        System.out.println(name+" is "+exStatus);
    }
}
