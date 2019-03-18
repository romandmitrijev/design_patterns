package com.sda.design_patterns.Example.structural.proxy;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Mahdad");
        access.grantInternetAccess();
    }
}
