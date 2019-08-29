package com.lailai.pattern.VisitorPattern;



public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{
                new MousePart(),new CPUPart()
        };
    }

    @Override
    public void accept(ComputerPartVistor vistor) {
        for (ComputerPart part:parts){
            part.accept(vistor);
        }
        vistor.visit(this);
    }
}
