package com.lailai.algorithm_repo.Mediator;

public class User {
    private String name;

    void sendMsg(String msg){
        ChatRoom.chat(name,msg);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
