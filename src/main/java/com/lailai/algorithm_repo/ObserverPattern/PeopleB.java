package com.lailai.algorithm_repo.ObserverPattern;

public class PeopleB implements People {
    @Override
    public void update(News news) {
        System.out.println(news.getContent()+"《==,标题党，小编吃屎");
    }
}
