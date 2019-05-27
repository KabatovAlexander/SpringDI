package com.test.collections.List.si;

import com.test.collections.ISomeShop;
import com.test.collections.Assortment;

import java.util.List;

public class Nike implements ISomeShop {

    List<Assortment> assortment;

    public void setAssortment(List<Assortment> assortment) {
        System.out.println("Inside Nike setter.");
        this.assortment = assortment;
    }

    public void sold() {
        System.out.println("Nike assortment was sold: " + assortment.toString());
    }
}
