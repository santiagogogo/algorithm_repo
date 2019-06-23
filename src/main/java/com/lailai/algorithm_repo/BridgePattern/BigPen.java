package com.lailai.algorithm_repo.BridgePattern;

public class BigPen extends Pen {
    @Override
    void draw(String name) {
        String penType="大号毛笔";
        color.paint(penType,name);
    }
}
