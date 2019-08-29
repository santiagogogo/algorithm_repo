package com.lailai.pattern.ProxyPattern;

public class Client {

    public static void main(String[] args) {
        /**
         * CGLIB动态代理
         */
        BookProxyLib bookLib=new BookProxyLib();
        BookProxy proxy= (BookProxy) bookLib.getInstance(new BookProxyImp());
        proxy.add();
        /**
         * JDK动态代理
         */
        BookProxyImp bookProxyImp=new BookProxyImp();
        BookProxyHandler handler=new BookProxyHandler(bookProxyImp);
        BookProxy instance = (BookProxy) handler.getInstance();
        instance.add();

    }
}
