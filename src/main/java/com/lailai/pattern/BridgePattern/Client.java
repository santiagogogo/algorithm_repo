package com.lailai.pattern.BridgePattern;

public class Client {

    public static void main(String[] args) {
        Color color=new Blue();
        Pen pen=new BigPen();
        pen.setColor(color);
        pen.draw("大西瓜");
    }
}
