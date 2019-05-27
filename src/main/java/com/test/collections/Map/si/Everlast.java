package com.test.collections.Map.si;

import com.test.collections.Assortment;
import com.test.collections.ISomeShop;
import java.util.Map;

public class Everlast implements ISomeShop {
    private Map assortment;

    public void setAssortment(Map assortment) {
        this.assortment = assortment;
    }

    public void sold() {
        System.out.println("Everlast assortment was sold: " + assortment.toString());
    }
}
