/**
 *
 * @classname : Developer
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

public class Developer extends Chief {

    // empty constructor

    public Developer() {
    }

    // full constructor

    public Developer(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    // toString

    @Override
    public String toString() {
        return "Developer {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
