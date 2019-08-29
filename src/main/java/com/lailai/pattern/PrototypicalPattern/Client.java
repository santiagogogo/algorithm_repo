package com.lailai.pattern.PrototypicalPattern;

public class Client {

    public static void main(String[] args) {
        Manager manager=new Manager();
        Product product=new MessageBox('*');
        Product p2=new UnderlineBox('~');
        manager.register("box",product);
        manager.register("line",p2);
        manager.create("box").use("hello world");
        manager.create("line").use("hello world");
    }
}
