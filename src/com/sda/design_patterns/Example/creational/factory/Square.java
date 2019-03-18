package com.sda.design_patterns.Example.creational.factory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw method of Square object");
    }

    @Override
    public int calculateArea() {
        return 0;
    }

}
