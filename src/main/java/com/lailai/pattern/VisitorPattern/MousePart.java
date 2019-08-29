package com.lailai.pattern.VisitorPattern;

public class MousePart implements ComputerPart {
    @Override
    public void accept(ComputerPartVistor vistor) {
        vistor.visit(this);
    }
}
