package com.sda.design_patterns.Example.creational.factory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
