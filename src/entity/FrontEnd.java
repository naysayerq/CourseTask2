/**
 *
 * @classname : FrontEnd
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

public class FrontEnd extends Developer {

    // empty constructor

    public FrontEnd() {
    }

    // full constructor with super parameters

    public FrontEnd(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    // toString

    @Override
    public String toString() {
        return "FrontEnd {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
