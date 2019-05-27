package com.test.object.ci;

import org.springframework.beans.factory.annotation.Autowired;

public class LionLife implements AnimalLocation {

    private AnimalType type;

    @Autowired
    public LionLife(AnimalType type) {
        System.out.println("Inside LionLife constructor.");
        this.type = type;
    }

    public void location() {
        System.out.println("Lion lives in desert.");
        type.type();
    }

}
