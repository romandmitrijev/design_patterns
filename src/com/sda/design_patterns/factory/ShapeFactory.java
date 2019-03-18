package com.sda.design_patterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return  null;
        }
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("rectangle")){

        }
        return null;
    }
}

