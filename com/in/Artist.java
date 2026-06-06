package com.in;

public class Artist {
    public static void main(String[] args) {
        FactoryProducer fp = new FactoryProducer();
        AbstractClass ac = fp.getFactory("Shape");
        Shape s = ac.getShape("Circle");
        s.draw();

        AbstractClass ac2 = fp.getFactory("Color");
        Color c = ac2.getColor("Red");
        c.fill();
    }

}
