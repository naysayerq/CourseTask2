package com.company;

public class BackEnd extends Developer{

    public BackEnd() {
    }

    public BackEnd(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "BackEnd {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
