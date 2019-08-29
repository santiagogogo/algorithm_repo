package com.lailai.pattern.MemoPattern;

import java.util.ArrayList;
import java.util.List;

public class Taker {
    List<Memo> list=new ArrayList<Memo>();

    public void add(Memo sts){
        list.add(sts);
    }

    public Memo  get(int idx){
        return list.get(idx);
    }

    public static void main(String[] args) {
        Original a=new Original("ugly");
        Taker taker=new Taker();
        taker.add(a.saveToMemo(a));
        a.setSts("cool");
        taker.add(a.saveToMemo(a));
        a.setSts("niubi");

        String sts0=taker.get(0).getSts();
        String sts1=taker.get(1).getSts();
        String now=a.getSts();
        System.out.println("sts0="+sts0+" sts1="+sts1+" now="+now);

    }
}
