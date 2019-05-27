package com.test.autowire.byType;

public class Employee {
    private String city;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
