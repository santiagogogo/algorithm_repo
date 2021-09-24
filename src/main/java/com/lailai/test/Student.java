package com.lailai.test;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author santiago.ge
 * @description:
 * @date 2021/7/16
 */
public class Student implements Person{

    Map map= Maps.newHashMap();

    public static Map map2= Maps.newHashMap();

    static {
        map2.put("b","bc");
    }

    public void init(){
        map.put("a","ac");

    }
    @Override
    public boolean eat() {
        System.out.println("didichi");
        System.out.println(map.get("a"));
        System.out.println(map2.get("b"));
        return false;
    }
}
