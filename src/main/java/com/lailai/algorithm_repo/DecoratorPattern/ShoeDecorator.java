package com.lailai.algorithm_repo.DecoratorPattern;

public class ShoeDecorator implements Person {
    private Person person;

    public ShoeDecorator(Person person) {
        this.person = person;
    }

    void setPerson(Person p){
        this.person=p;
    }
    @Override
    public void wear() {
        person.wear();
        System.out.println("穿鞋");

    }
}
