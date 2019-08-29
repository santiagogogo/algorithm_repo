package com.lailai.pattern.FacadePattern;

public class Computer {

    private CPU cpu;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
    }

    public void start(){
        System.out.println("computer start...");
        cpu.start();
        disk.start();
    }

    public void shutdown(){
        System.out.println("computer shutdown...");
        cpu.shutdown();
        disk.shutdown();
    }
}
