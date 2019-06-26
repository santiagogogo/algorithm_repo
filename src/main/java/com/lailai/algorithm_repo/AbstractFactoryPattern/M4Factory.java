package com.lailai.algorithm_repo.AbstractFactoryPattern;

public class M4Factory implements Factory {
    @Override
    public Bullet getBullet() {
        return new M4Bullet();
    }

    @Override
    public Gun getGun() {
        return new M4Gun();
    }
}
