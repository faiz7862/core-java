package com.in;

public class FactoryProducer {
    public AbstractClass getFactory(String type) {
        FactoryProducer factoryProducer = null;

        if(type.equals("Shape")){
            return new ShapeFactory();
        }
        else{
            return new ColorFactory();
        }
        
    }
}
