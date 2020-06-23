/**
 *
 * @classname : BackEnd
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

import entity.Company;
import entity.Developer;

public class BackEnd extends Developer {

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
