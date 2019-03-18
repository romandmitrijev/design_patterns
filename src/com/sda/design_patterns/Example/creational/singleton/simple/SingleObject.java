package com.sda.design_patterns.Example.creational.singleton.simple;

public class SingleObject {


    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

}