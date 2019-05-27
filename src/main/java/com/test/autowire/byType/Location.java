package com.test.autowire.byType;

public class Location {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Location{" +
                "employee=" + employee +
                '}';
    }
}
