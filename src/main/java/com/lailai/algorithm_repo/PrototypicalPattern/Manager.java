package com.lailai.algorithm_repo.PrototypicalPattern;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,Product> map=new HashMap<String,Product>();
    public void register(String s,Product p){
        map.put(s,p);
    }
    public Product create(String s){
        return map.get(s).createClone();
    }
}
