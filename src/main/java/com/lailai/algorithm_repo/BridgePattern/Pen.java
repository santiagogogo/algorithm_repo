package com.lailai.algorithm_repo.BridgePattern;

public abstract class Pen {
    protected Color color;
    void setColor(Color color){
        this.color=color;
    }
    abstract void draw(String name);
}
