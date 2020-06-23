package com.company;

public class Lawyer extends Chief{

    public Lawyer() {
    }

    public Lawyer(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "Lawyer {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
