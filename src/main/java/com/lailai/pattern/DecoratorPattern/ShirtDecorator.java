package com.lailai.pattern.DecoratorPattern;


public class ShirtDecorator extends Decorator {


    public ShirtDecorator(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿T恤");

    }
}
