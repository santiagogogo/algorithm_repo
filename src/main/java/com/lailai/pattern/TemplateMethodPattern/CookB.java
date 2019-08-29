package com.lailai.pattern.TemplateMethodPattern;

public class CookB extends Cook {
    @Override
    protected void pourVeg() {
        System.out.println("倒韭菜");
    }
}
