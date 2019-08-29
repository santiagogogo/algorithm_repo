package com.lailai.pattern.TemplateMethodPattern;

public class Client {

    public static void main(String[] args) {
        Cook cookA = new CookA();
        cookA.cooke();
        Cook cookB = new CookB();
        cookB.cooke();
    }
}
