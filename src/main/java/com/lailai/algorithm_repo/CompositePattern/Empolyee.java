package com.lailai.algorithm_repo.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Empolyee {
    String name;
    int sal;
    String dpet;
    List<Empolyee> list=new ArrayList<Empolyee>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDpet() {
        return dpet;
    }

    public void setDpet(String dpet) {
        this.dpet = dpet;
    }

    public List<Empolyee> getList() {
        return list;
    }

    public void setList(List<Empolyee> list) {
        this.list = list;
    }

    public Empolyee(String name, int sal, String dpet) {
        this.name = name;
        this.sal = sal;
        this.dpet = dpet;
    }

    public void add(Empolyee e){
        list.add(e);

    }

    private void remove(Empolyee e){
        list.remove(e);
    }


    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", dpet='" + dpet + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Empolyee ceo=new Empolyee("john",100000,"CEO");
        Empolyee headSale=new Empolyee("mary",50000,"sale");
        Empolyee headMarket=new Empolyee("eric",50000,"market");
        Empolyee saleA=new Empolyee("tt",10000,"sale");
        Empolyee saleB=new Empolyee("mm",10000,"sale");
        Empolyee marketA=new Empolyee("wlp",10000,"market");
        Empolyee marketB=new Empolyee("gdl",10000,"market");
        ceo.add(headSale);
        ceo.add(headMarket);
        headMarket.add(marketA);
        headMarket.add(marketB);
        headSale.add(saleA);
        headSale.add(saleB);
        System.out.println(ceo);
        for (Empolyee e: ceo.getList()){
            System.out.println(e);
            for (Empolyee empolyee:e.getList()){
                System.out.println(empolyee);
            }
        }


    }
}
