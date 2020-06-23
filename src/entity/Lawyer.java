/**
 *
 * @classname : Lawyer
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

public class Lawyer extends Chief {

    // empty constructor

    public Lawyer() {
    }

    // full constructor

    public Lawyer(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    // toString

    @Override
    public String toString() {
        return "Lawyer {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
