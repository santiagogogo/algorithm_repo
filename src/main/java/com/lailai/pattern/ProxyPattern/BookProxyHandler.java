package com.lailai.pattern.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookProxyHandler implements InvocationHandler {

    private Object target;

    public BookProxyHandler(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start2");
        method.invoke(target,args);
        System.out.println("end2");
        return null;
    }
}
