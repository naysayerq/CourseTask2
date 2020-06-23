/**
 *
 * @classname : Design
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

public class Design extends FrontEnd {

    // empty constructor

    public Design() {
    }

    // full constructor

    public Design(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    // toString()

    @Override
    public String toString() {
        return "Design {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
