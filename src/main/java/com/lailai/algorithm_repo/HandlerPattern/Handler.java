package com.lailai.algorithm_repo.HandlerPattern;

public abstract class Handler {
    protected Handler successor;
    abstract void handleRequest(String name);
}
