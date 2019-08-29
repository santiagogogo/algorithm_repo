package com.lailai.pattern.PrototypicalPattern;

public interface Product extends Cloneable {
    public void use(String p);
    public Product createClone();
}
