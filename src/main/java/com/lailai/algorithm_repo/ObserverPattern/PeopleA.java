package com.lailai.algorithm_repo.ObserverPattern;

public class PeopleA implements People {
    @Override
    public void update(News news) {
        System.out.println(news.getContent()+"《==,这条新闻太狗币，狗日的小编");
    }
}
