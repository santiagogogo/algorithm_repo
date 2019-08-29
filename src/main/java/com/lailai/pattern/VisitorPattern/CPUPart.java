package com.lailai.pattern.VisitorPattern;

public class CPUPart implements ComputerPart {
    @Override
    public void accept(ComputerPartVistor vistor) {
        vistor.visit(this);
    }
}
