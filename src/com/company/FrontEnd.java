package com.company;

public class FrontEnd extends Developer{

    public FrontEnd() {
    }

    public FrontEnd(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "FrontEnd {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
