package com.test.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjectionSI {
    List list;
    Set set;
    Map map;

    public void setList(List list) {

        this.list = list;
    }

    public void setSet(Set set) {

        this.set = set;
    }

    public void setMap(Map map) {

        this.map = map;
    }

    public List getList() {
        System.out.println("List: " + list);
        return list;
    }

    public Set getSet() {
        System.out.println("Set: "+ set);
        return set;
    }

    public Map getMap() {
        System.out.println("Map: "+ map);
        return map;
    }
}
