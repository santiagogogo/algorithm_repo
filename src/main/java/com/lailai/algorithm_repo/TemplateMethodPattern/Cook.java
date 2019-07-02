package com.lailai.algorithm_repo.TemplateMethodPattern;

public abstract class Cook {

    final void cooke(){
         pourOil();
         heatOil();
         pourVeg();
         fry();
    }

    protected abstract void pourVeg();

    private void fry() {
        System.out.println("烹饪");
    }

    private void heatOil() {
        System.out.println("热油");
    }

    private void pourOil() {
        System.out.println("倒油");
    }
}
