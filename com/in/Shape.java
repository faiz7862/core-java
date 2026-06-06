package com.in;

public interface Shape {
    void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.print("Rectangle drawn ");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.print("Square drawn ");
    }
}
class Circle implements Shape{
    public void draw(){
        System.out.print("Circle drawn ");
    }
}