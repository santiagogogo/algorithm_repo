package com.lailai.test;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author santiago.ge
 * @description:
 * @date 2021/7/16
 */
public class Test {


    public static void main(String[] args) {
        Person person = PersonConfig.getFullCardByType("st");
        person.eat();
    }
}
