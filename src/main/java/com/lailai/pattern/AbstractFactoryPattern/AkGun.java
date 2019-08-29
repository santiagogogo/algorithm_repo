package com.lailai.pattern.AbstractFactoryPattern;

public class AkGun implements Gun {
    @Override
    public void shot() {
        System.out.println("AKGun shot you");
    }
}
