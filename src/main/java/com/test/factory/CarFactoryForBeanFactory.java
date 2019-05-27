package com.test.factory;

public class CarFactoryForBeanFactory {
    public ICar getCars() {
        return new Nissan();
        //return new Toyota();
    }
}

