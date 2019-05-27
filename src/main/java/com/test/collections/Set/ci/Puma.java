package com.test.collections.Set.ci;

import com.test.collections.Assortment;
import com.test.collections.ISomeShop;

import java.util.Set;

public class Puma implements ISomeShop {

    private Set<Assortment> assortment;

    public Puma(Set<Assortment> assortment) {
        System.out.println("Inside Puma constructor.");
        this.assortment = assortment;
    }

    public void sold() {
        System.out.println("Puma assortment was sold: " + assortment.toString());
    }
}
