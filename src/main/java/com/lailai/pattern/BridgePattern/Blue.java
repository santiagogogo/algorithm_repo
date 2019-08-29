package com.lailai.pattern.BridgePattern;

public class Blue implements Color {
    @Override
    public void paint(String penType, String colorName) {
        System.out.println(penType+" blue color "+colorName);

    }
}
