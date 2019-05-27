package com.test.factory;

public class CarFactory {
    public static ICar getCars() {
        //return new Nissan();
        return new Toyota();
    }
}
