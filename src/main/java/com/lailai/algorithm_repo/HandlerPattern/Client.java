package com.lailai.algorithm_repo.HandlerPattern;
/**
 * @Author gedelai
 * @Description 职责链
 * @Date 2019-06-30
 **/
public class Client {

    public static void main(String[] args) {
        ConcreteHandler handler=new ConcreteHandler("tom");
        ConcreteHandler handler1 = new ConcreteHandler(handler);
        handler1.setMm("mimi");
        handler1.handleRequest("tom");
    }
}
