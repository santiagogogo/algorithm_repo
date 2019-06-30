package com.lailai.algorithm_repo.Mediator;

import java.util.Date;

public class ChatRoom {

    public static void chat(String name,String msg){
        System.out.println(new Date()+" ==> "+name+":"+msg);
    }
}
