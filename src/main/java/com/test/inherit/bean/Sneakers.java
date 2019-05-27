package com.test.inherit.bean;

public class Sneakers{

    private Size size;

    public Sneakers(int size) {
        System.out.println("In Sneakers constructor.");

    }

    public Size getSize() {
        System.out.println("Into Sneakers getter");
        return size;
    }

    public String isClean() {
        System.out.println("Into isClean");
        return "Sneakers.isClean";
    }

    public int breakIn(int size) { //разнашиваются
        System.out.println("Into breakIn");
        return size + 1;
    }

}
