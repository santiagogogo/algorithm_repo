package com.lailai.algorithm_repo.AbstractFactory;

public class AkGun implements Gun {
    @Override
    public void shot() {
        System.out.println("AKGun shot you");
    }
}
