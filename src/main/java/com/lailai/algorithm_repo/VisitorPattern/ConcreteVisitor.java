package com.lailai.algorithm_repo.VisitorPattern;

public class ConcreteVisitor implements ComputerPartVistor {
    @Override
    public void visit(ComputerPart part) {
        System.out.println("visit computer");

    }
    @Override
    public void visit(MousePart part) {
        System.out.println("visit mouse");

    }
    @Override
    public void visit(CPUPart part) {
        System.out.println("visit cpu");
    }


    public static void main(String[] args) {
        ConcreteVisitor visitor=new ConcreteVisitor();
        Computer computer=new Computer();
        computer.accept(visitor);
    }

}
