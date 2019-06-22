package com.lailai.algorithm_repo.PrototypicalPattern;

public class MessageBox implements Product {
    private char x;

    public MessageBox(char x) {
        this.x = x;
    }

    @Override
    public void use(String p) {
        int length=p.getBytes().length;
        for (int i=0;i<length+2;i++){
            System.out.print(x);
        }
        System.out.println("");
        System.out.print(x);
        System.out.print(p);
        System.out.println(x);
        for (int i=0;i<length+2;i++){
            System.out.print(x);
        }
        System.out.println("");
    }


    @Override
    public Product createClone() {
        Product product=null;
        try {
            product=(Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
