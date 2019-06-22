package com.lailai.algorithm_repo.AdpatorPattern;

public class Adaptor implements Target{

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void req() {
        adaptee.specReq();

    }
}
