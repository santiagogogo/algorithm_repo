package com.lailai.pattern.VisitorPattern;

public interface ComputerPart {
    void accept(ComputerPartVistor vistor);
}
