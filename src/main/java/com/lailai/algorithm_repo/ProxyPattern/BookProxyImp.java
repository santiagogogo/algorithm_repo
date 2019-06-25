package com.lailai.algorithm_repo.ProxyPattern;

public class BookProxyImp implements BookProxy {
    @Override
    public void add() {
        System.out.println("add book.");
    }
}
