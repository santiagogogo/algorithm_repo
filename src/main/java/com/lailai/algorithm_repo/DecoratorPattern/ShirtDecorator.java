package com.lailai.algorithm_repo.DecoratorPattern;

public class ShirtDecorator implements Person {
    private Person person;

    public ShirtDecorator(Person person) {
        this.person = person;
    }

    void setPerson(Person p){
        this.person=p;
    }
    @Override
    public void wear() {
        person.wear();
        System.out.println("穿T恤");

    }
}
