package com.test.autowire.byName;

public class Department {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employee=" + employee +
                '}';
    }
}
