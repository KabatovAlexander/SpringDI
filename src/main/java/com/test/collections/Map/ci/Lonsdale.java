package com.test.collections.Map.ci;

import com.test.collections.ISomeShop;
import org.springframework.context.annotation.Bean;

import java.util.Map;

public class Lonsdale implements ISomeShop {

    private Map<Integer, Lonsdale> assortment;

    public Lonsdale(Map assortment) {
        this.assortment = assortment;
    }

    @Bean
    public Map<Integer, Lonsdale> getAssortmentLonsdale() {
        return assortment;
    }

    public void sold() {
        System.out.println("Lonsdale assortment was sold: " + assortment.toString());
    }
}
