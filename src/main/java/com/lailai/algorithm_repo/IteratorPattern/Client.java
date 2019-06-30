package com.lailai.algorithm_repo.IteratorPattern;

/**
 * @Author gedelai
 * @Description 迭代器模式
 * @Date 2019-06-30
 **/
public class Client {

    public static void main(String[] args) {
        NameRepo repo=new NameRepo();
        for (Iterator iterator=repo.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
