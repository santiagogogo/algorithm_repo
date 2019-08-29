package com.lailai.pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject {
    private News news;
    private List<People> list=new ArrayList<People>();

    public void add(People people){
        list.add(people);
    }
    void update(News news){
        this.news=news;
        for (People p:list){
            p.update(news);
        }
    }

    public static void main(String[] args) {
        News news = new News("胶州女孩小王肚子突然变大，原因竟是这个...");
        NewsSubject subject=new NewsSubject();
        subject.add(new PeopleA());
        subject.add(new PeopleB());
        subject.update(news);
    }
}
