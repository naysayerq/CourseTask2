/**
 *
 * @classname : Accounting
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */

package entity;

import entity.Company;

public class Accounting extends Company {


    // empty constructor

    public Accounting() {
    }


    // full constructor

    public Accounting(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }


    // toString

    @Override
    public String toString() {
        return "Accounting {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
