package com.sda.design_patterns.singelton;

public enum SingeltonEnum {

    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
