package com.lailai.pattern.StatePattern;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    void change(){
        state.change(this);
    }

    /**
     * 状态模式
     * @param args
     */
    public static void main(String[] args) {
        State stateA = new StateA();
        Context context = new Context(stateA);
        context.change();
        context.change();
        context.change();
    }
}
