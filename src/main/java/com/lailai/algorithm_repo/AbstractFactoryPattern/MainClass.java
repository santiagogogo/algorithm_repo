package com.lailai.algorithm_repo.AbstractFactoryPattern;

public class MainClass {

    public static void main(String[] args){
        Factory factory=new AkFactory();
        factory.getBullet().load();
        factory.getGun().shot();
    }
}
