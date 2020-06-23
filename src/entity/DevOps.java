/**
 *
 * @classname : DevOps
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


package entity;

public class DevOps extends BackEnd {


    // empty constructor

    public DevOps() {
    }


    // full constructor with super parameters

    public DevOps(Company parent, long employeesCount) {
        super(parent, employeesCount);
    }

    // toString()

    @Override
    public String toString() {
        return "DevOps {" +
                "parent = " + super.getParent() +
                ", employeesCount = " + super.getEmployeesCount() +
                '}';
    }
}
