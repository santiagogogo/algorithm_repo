package com.lailai.algorithm_repo.BuilderPattern;

public class Cilent {
    public static void main(String[] args) {
        AbstractMealBuilder a=new MealBBuilder();
        MealDirector director=new MealDirector(a);
        Meal construct = director.construct();

        System.out.println(construct.toString());
    }


}
