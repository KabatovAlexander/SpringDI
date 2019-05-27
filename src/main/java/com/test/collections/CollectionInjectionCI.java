package com.test.collections;

import com.test.collections.List.ci.Adidas;
import com.test.collections.Map.ci.Lonsdale;
import com.test.collections.Set.ci.Puma;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjectionCI {
    List<Adidas> list;
    Set<Puma> set;
    Map<Integer, Lonsdale> map;

    public CollectionInjectionCI(List<Adidas> list, Set<Puma> set, Map<Integer, Lonsdale> map) {
        this.list = list;
        this.set = set;

    }

    public void setList(List<Adidas> list) {
        this.list = list;
    }

    public void setSet(Set<Puma> set) {
        this.set = set;
    }

    public void setMap(Map<Integer, Lonsdale> map) {
        this.map = map;
    }
}
