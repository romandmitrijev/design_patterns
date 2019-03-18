package com.sda.design_patterns.Example.creational.factory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill method from Red object");
    }
}
