package com.sda.design_patterns.Example.creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        AbstractFactory abstractShapeFactory = FactoryProducer.getFactory("shape");
        Shape shape3 = abstractShapeFactory.getShape("corctle");
        shape3.draw();

        AbstractFactory abstractColorFactory = FactoryProducer.getFactory("color");
        Color color1 = abstractColorFactory.getColor("red");
        color1.fill();
    }
}