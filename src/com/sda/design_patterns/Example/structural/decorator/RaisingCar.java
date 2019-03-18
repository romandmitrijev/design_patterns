package com.sda.design_patterns.Example.structural.decorator;

public class RaisingCar implements Car {

    @Override
    public void create() {
        System.out.println("Car: Raising");
    }
}