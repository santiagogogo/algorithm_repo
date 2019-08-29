package com.lailai.pattern.TemplateMethodPattern;

public class CookA extends Cook {
    @Override
    protected void pourVeg() {
        System.out.println("倒白菜");
    }
}
