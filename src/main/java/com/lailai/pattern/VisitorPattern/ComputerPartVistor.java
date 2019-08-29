package com.lailai.pattern.VisitorPattern;

public interface ComputerPartVistor {
    void visit(ComputerPart part);
    void visit(MousePart part);
    void visit(CPUPart part);
}
