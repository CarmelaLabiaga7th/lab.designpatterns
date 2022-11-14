package com.lab.designpatterns.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.newInstance();
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.show();
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.show();
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        square.show();
    }

}
