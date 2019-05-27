package com.test.collections;

public class Assortment {
    private String name;
    private double price;

    public Assortment(String name, double price) {
        System.out.println("Assortment constructor.");
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
