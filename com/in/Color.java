package com.in;

public interface Color {
    void fill();
}

class Red implements Color{
    public void fill(){
        System.out.println("Red color filled");
    }
}
class Green implements Color{
    public void fill(){
        System.out.println("Green color filled");
    }
}
class Blue implements Color{
    public void fill(){
        System.out.println("Blue color filled");
    }
}