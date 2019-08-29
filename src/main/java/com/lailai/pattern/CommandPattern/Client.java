package com.lailai.pattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        TVStart tvStart = new TVStart(new TVReceiver());
        Man man = new Man(tvStart);
        man.handle();
        TVShutdown tvShutdown = new TVShutdown(new TVReceiver());
        man = new Man(tvShutdown);
        man.handle();
    }
}
