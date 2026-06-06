package com.in;

public class ShapeFactory extends AbstractClass{
    Shape shape = null;
    public Shape getShape(String type){
        if(type.equals("Circle")){
            shape = new Circle();
        }
        else if(type.equals("Square")){
            shape = new Square();
        }
        else if(type.equals("Rectangle")){
            shape = new Rectangle();
        }
        return shape;
    }
    // Color color = null;
    public Color getColor(String type){
        return null;
    }
}
