package com.lailai.algorithm_repo.AdpatorPattern;

public class Client {

    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Target adaptor=new Adaptor(adaptee);
        adaptor.req();
    }

}
