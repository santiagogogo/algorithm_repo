package com.lailai.algorithm_repo.Mediator;

public class Client {
    public static void main(String[] args) {
        User a=new User("john");
        User sam = new User("sam");
        a.sendMsg("nice to meet u ,sam");
        sam.sendMsg("me too");
    }
}
