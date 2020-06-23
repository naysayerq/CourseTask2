/**
 *
 * @classname : Chief
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

import entity.Company;

public class Chief extends Company {

    public Chief() {
    }

    public Chief(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    @Override
    public String toString() {
        return "Chief {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
