package com.lailai.pattern.DecoratorPattern;

public class Decorator implements Person {
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }
    @Override
    public void wear() {
        person.wear();
    }
}
