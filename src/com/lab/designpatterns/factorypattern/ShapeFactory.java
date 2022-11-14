package com.lab.designpatterns.factorypattern;

public class ShapeFactory {
    private static ShapeFactory INSTANCE;
    
    public static ShapeFactory newInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ShapeFactory();
        }
        
        return INSTANCE;
    }
    
    public Shape createShape(ShapeType shapeType) {
        Shape shape = null;
        switch(shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
        }
        
        return shape;
    }

}
