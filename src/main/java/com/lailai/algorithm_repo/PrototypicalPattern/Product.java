package com.lailai.algorithm_repo.PrototypicalPattern;

public interface Product extends Cloneable {
    public void use(String p);
    public Product createClone();
}
