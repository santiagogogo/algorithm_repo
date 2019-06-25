package com.lailai.algorithm_repo.ProxyPattern;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BookProxyLib implements MethodInterceptor {

    private Object target;

    /**
     * Enhancer中有几个常用的方法, setSuperClass和setCallback, 设置好了SuperClass后, 可以使用create制作代理对象了
     *
     * Enhancer enhancer = new Enhancer();
     * enhancer.setSuperclass(EnhancerDemo.class);
     * enhancer.setCallback(new MethodInterceptorImpl());
     *
     * EnhancerDemo demo = (EnhancerDemo) enhancer.create();
     */
    public  Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());//设置要生成的代理对象
        enhancer.setCallback(this);//设置方法拦截后的回调
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start");//前置通知
        methodProxy.invokeSuper(o,objects);
        System.out.println("over");//后置通知
        return null;
    }
}
