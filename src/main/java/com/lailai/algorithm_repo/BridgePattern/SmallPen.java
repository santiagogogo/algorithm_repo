package com.lailai.algorithm_repo.BridgePattern;

public class SmallPen extends Pen {
    @Override
    void draw(String name) {
        String penType="小号毛笔";
        color.paint(penType,name);
    }
}
