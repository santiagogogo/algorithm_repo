package com.lailai.pattern.DecoratorPattern;

public class ShoeDecorator extends Decorator {

    public ShoeDecorator(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿鞋");

    }
}
