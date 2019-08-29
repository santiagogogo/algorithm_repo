package com.lailai.datastruct;

import java.util.Arrays;

/**
 * @Author gedelai
 * @Description //TODO
 * @Date 2019-08-28
 * 使用数组实现栈
 * 自己实现一个栈，要求这个栈具有push()、pop()（返回栈顶元素并出栈）、peek() （返回栈顶元素不出栈）、isEmpty()、size()这些基本的方法。
 *
 * 提示：每次入栈之前先判断栈的容量是否够用，如果不够用就用Arrays.copyOf()进行扩容；
 **/
public class MyStack {
    private int[] storage;//储存
    private int count;//数量
    private int cap;//容量
    private static final int FACTOR =2;

    public MyStack() {
        this.storage = new int[8];
        this.count = 0;
        this.cap = 8;
    }
    public MyStack(int initCap) {
        this.storage = new int[initCap];
        this.count = 0;
        this.cap = initCap;
    }

    public void push (int value){
        if (count==cap){
            enlarge();
        }
        storage[count]=value;
        count++;
    }

    private void enlarge() {
        int newCap=cap*FACTOR;
        storage = Arrays.copyOf(storage, newCap);
        cap=newCap;
    }

    public int pop(){
        count--;
        if (count<0){
            throw new IllegalArgumentException();
        }
        return storage[count];
    }

    public int peek(){
        if (count<1){
            throw new IllegalArgumentException();
        }
        return storage[count-1];
    }

    public boolean isEmpty(){
        if (count==0){
            return true;
        }
        return false;
    }
    public int size(){
        return count;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());//8
        System.out.println(myStack.size());//8
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.isEmpty());//true
        myStack.pop();//报错：java.lang.IllegalArgumentException: Stack is empty.
    }

}
