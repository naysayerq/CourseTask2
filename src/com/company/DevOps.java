package com.company;

public class DevOps extends BackEnd{

    public DevOps() {
    }

    public DevOps(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "DevOps {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
