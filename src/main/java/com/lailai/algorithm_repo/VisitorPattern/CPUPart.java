package com.lailai.algorithm_repo.VisitorPattern;

public class CPUPart implements ComputerPart {
    @Override
    public void accept(ComputerPartVistor vistor) {
        vistor.visit(this);
    }
}
