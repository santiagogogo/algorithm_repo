package com.lailai.algorithm_repo.CommandPattern;

public class Man {

    private TVControl tvControl;

    public Man(TVControl tvControl) {
        this.tvControl = tvControl;
    }

    void handle(){
        tvControl.action();
    }
}
