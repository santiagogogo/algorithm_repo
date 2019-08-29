package com.lailai.pattern.CommandPattern;

public class TVStart implements TVControl {
    private TVReceiver tvReceiver;

    public TVStart(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void action() {
        System.out.println("send tv start");
        tvReceiver.execute();
    }
}
