package com.test.collections.List.ci;

import com.test.collections.Assortment;
import com.test.collections.ISomeShop;

import java.util.List;

public class Adidas implements ISomeShop {

    List<Assortment> assortment;

    public Adidas(List<Assortment> assortment) {
        System.out.println("Inside Adidas constructor.");
        this.assortment = assortment;
    }

    public void sold() {
        System.out.println("Adidas assortment was sold:" + assortment.toString());
    }

}
