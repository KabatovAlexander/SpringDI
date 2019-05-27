package com.test.collections.Set.si;

import com.test.collections.Assortment;
import com.test.collections.ISomeShop;

import java.util.Set;

public class Reebok implements ISomeShop {
    private Set<Assortment> assortment;

    public void setAssortment(Set<Assortment> assortment) {
        System.out.println("Inside Reebok setter.");
        this.assortment = assortment;
    }

    public void sold() {
        System.out.println("Reebok assortment was sold: " + assortment.toString());
    }
}
