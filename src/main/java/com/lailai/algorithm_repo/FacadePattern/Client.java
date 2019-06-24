package com.lailai.algorithm_repo.FacadePattern;

public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.start();
        computer.shutdown();
    }
}