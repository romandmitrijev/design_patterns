package com.sda.design_patterns.singelton;

public class EnumDemo {
    public static void main(String[] args) {
        SingeltonEnum singeltonEnum = SingeltonEnum.INSTANCE;
        System.out.println(singeltonEnum.getValue());
        singeltonEnum.setValue(2);

        SingeltonEnum singeltonEnum1 = SingeltonEnum.INSTANCE;
        System.out.println(singeltonEnum1.getValue());

    }
}
