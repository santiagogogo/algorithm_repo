package com.lailai.pattern.ProxyPattern;

public class BookProxyImp implements BookProxy {
    @Override
    public void add() {
        System.out.println("add book.");
    }
}
