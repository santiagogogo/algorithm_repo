package com.lailai.pattern.DecoratorPattern;

public class Client {

    public static void main(String[] args) {
        Person p=new Wang();
        ShirtDecorator shirtDecorator = new ShirtDecorator(new ShoeDecorator(p));
        shirtDecorator.wear();
    }
}
