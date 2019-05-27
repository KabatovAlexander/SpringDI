package com.test.inherit.bean;

public class Size {
    private int size;

    public Size(int size) {
        System.out.println("In Size Constructor.");
        this.size = size;
    }

    public int getSizeS() {
        System.out.println("In Size getter.");
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
