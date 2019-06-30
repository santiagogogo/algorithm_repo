package com.lailai.algorithm_repo.CommandPattern;

public class TVShutdown implements TVControl {
    private TVReceiver tvReceiver;

    public TVShutdown(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void action() {
        System.out.println("send tv shutdown");
        tvReceiver.execute();
    }
}
