package com.sda.design_patterns.Example.creational.builder;

public class Book {
    private String name;
    private int year;
    private String authtor;
    private boolean inLibrary;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", aughtor='" + authtor + '\'' +
                ", inLibrary=" + inLibrary +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String author;

        private int year;
        private boolean inLibrary = false;

        public Builder(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public Builder year(int value) {
            year = value;
            return this;
        }

        public Builder inLibrary(boolean value) {
            inLibrary = value;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    private Book(Builder builder) {
        name = builder.name;
        year = builder.year;
        authtor = builder.author;
        inLibrary = builder.inLibrary;
    }
}



