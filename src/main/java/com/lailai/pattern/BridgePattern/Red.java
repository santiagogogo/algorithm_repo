package com.lailai.pattern.BridgePattern;

public class Red implements Color {
    @Override
    public void paint(String penType, String colorName) {
        System.out.println(penType+" red color "+colorName);

    }
}
