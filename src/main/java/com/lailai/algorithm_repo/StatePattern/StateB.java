package com.lailai.algorithm_repo.StatePattern;

public class StateB implements State {
    @Override
    public void change(Context context) {
        System.out.println("this is stateB");
        context.setState(new StateA());
    }
}
