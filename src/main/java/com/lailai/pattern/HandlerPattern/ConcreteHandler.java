package com.lailai.pattern.HandlerPattern;

public class ConcreteHandler extends Handler {

    private String mm;

    public ConcreteHandler(String mm) {
        this.mm = mm;
    }

    public ConcreteHandler(Handler handler) {
        successor = handler;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    @Override
    void handleRequest(String name) {
        if (this.mm.equalsIgnoreCase(name)) {
            System.out.println("handle you");
        } else {
            System.out.println("pass to net one");
            successor.handleRequest(name);
        }
    }
}
