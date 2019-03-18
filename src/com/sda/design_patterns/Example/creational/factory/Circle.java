package com.sda.design_patterns.Example.creational.factory;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw method from Circle object");
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}