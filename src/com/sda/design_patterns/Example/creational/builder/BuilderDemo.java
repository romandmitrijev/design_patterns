package com.sda.design_patterns.Example.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .build();
        System.out.println(pizza);

//        StringBuilder stringBuilder =  new StringBuilder();
//        stringBuilder.append("helloo").append("This").append("is").append("test");

        Pizza pizza2 = new Pizza.Builder(3)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

//        System.out.println(pizza2);

        Book book = new Book.Builder("Some name", "Some Author")
                .year(2019)
                .inLibrary(true)
                .build();

        System.out.println(book);
    }
}
