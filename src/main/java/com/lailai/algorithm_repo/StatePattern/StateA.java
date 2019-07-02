package com.lailai.algorithm_repo.StatePattern;

public class StateA implements State {
    @Override
    public void change(Context context) {
        System.out.println("this is stateA");
        context.setState(new StateB());
    }
}
