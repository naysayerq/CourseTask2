package com.company;

public class Design extends FrontEnd{

    public Design() {
    }

    public Design(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "Design {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
