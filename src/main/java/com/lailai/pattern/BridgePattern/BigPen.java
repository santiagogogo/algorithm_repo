package com.lailai.pattern.BridgePattern;

public class BigPen extends Pen {
    @Override
    void draw(String name) {
        String penType="大号毛笔";
        color.paint(penType,name);
    }
}
