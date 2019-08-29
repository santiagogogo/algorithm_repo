package com.lailai.pattern.AbstractFactoryPattern;

public class AkFactory implements Factory {
    @Override
    public Bullet getBullet() {
        return new AkBullet();
    }

    @Override
    public Gun getGun() {
        return new AkGun();
    }
}
