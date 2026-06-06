package com.in;

public class ColorFactory extends AbstractClass{
    Shape shape = null;
    public Shape getShape(String type){
        return shape;
    }
    Color color = null;
    public Color getColor(String type){
        if(type.equals("Blue")){
            color = new Blue();
        }
        else if(type.equals("Green")){
            color = new Green();
        }
        else if(type.equals("Red")){
            color = new Red();
        }
        return color;
    }
}
