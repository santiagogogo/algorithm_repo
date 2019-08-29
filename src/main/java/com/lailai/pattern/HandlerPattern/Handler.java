package com.lailai.pattern.HandlerPattern;

public abstract class Handler {
    protected Handler successor;
    abstract void handleRequest(String name);
}
