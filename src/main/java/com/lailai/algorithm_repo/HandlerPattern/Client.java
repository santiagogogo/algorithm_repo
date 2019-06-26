package com.lailai.algorithm_repo.HandlerPattern;

public class Client {

    public static void main(String[] args) {
        ConcreteHandler handler=new ConcreteHandler("tom");
        ConcreteHandler handler1 = new ConcreteHandler(handler);
        handler1.setMm("mimi");
        handler1.handleRequest("tom");
    }
}
