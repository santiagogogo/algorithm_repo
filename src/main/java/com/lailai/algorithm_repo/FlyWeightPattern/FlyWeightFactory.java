package com.lailai.algorithm_repo.FlyWeightPattern;

import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

    private ConcurrentHashMap<String,FlyWeight> map=new ConcurrentHashMap<String,FlyWeight>();

    public FlyWeight get(String key){
        if (map.get(key)==null){
            synchronized (map){
                FlyWeight flyWeight=map.get(key);
                if (flyWeight==null){
                    flyWeight=new ConcreteFlyWeight(key);
                    map.put(key,flyWeight);
                }
            }
        }
        return map.get(key);

    }
}
