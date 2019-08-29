package com.lailai.pattern.EnumPractice;

public enum EnumDemo {
    //LAI1,LAI2,LAI3;
    LAI11("ni",1),LAI21("bb",2),LAI31("mm",3);
    private String name;
    private int key;

    EnumDemo(String name, int key) {
        this.name = name;
        this.key = key;
    }


    public static void main(String[] args) {
        for (EnumDemo demo:EnumDemo.values()){
            System.out.println(demo.name);
        }

    }
    /**
     * Java中的枚举的实现机制?
     *
     * 1.枚举类本质上是通过普通类实现的，只不过编译器做了处理，每个枚举类都是继承自enum，同事添加value和values方法
     * 2.每个枚举常量都是public static final字符串，通过内部类实现，继承自enum
     * 3.每个内部类都通过静态块初始化，在类加载期间初始化。
     * 4.同时把clone readObject writeObject 三个方法定义为final,同时实现时抛出异常，保证了每个枚举类型和枚举常量不可变，可利用枚举类这两个特性来实现线程安全的实例
     *
     *
     */

}
