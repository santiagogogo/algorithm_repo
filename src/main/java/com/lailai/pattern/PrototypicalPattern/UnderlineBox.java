package com.lailai.pattern.PrototypicalPattern;

public class UnderlineBox implements Product {
    private char x;

    public UnderlineBox(char x) {
        this.x = x;
    }

    @Override
    public void use(String p) {
        int length=p.getBytes().length;
        System.out.println(p);
        for (int i=0;i<length;i++){
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
