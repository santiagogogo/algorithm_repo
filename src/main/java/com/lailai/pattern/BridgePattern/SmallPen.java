package com.lailai.pattern.BridgePattern;

public class SmallPen extends Pen {
    @Override
    void draw(String name) {
        String penType="小号毛笔";
        color.paint(penType,name);
    }
}
