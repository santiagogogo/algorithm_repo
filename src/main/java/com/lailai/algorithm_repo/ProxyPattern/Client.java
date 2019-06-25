package com.lailai.algorithm_repo.ProxyPattern;

public class Client {

    public static void main(String[] args) {
        BookLib bookLib=new BookLib();
        BookProxy proxy= (BookProxy) bookLib.getInstance(new BookProxyImp());
        proxy.add();

    }
}
