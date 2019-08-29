package com.lailai.pattern.SingletonPattern;

public class SingleInstance {

    /**
     *  懒汉单例-双重加锁检查
     */
    private volatile static SingleInstance singleInstance;

    public SingleInstance() {
    }

    public static SingleInstance getInstance(){
        if(null==singleInstance){
            synchronized (SingleInstance.class){
                if(null==singleInstance){
                    singleInstance=new SingleInstance();
                    return singleInstance;
                }
            }
        }
        return singleInstance;
    }
}