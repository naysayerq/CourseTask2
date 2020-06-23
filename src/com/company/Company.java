package com.company;

import java.util.List;

public class Company implements ICompanyService{


    private Company parent;       // parent for this company nullable, when there is no parent for this company
    private long employeesCount;


    public Company() {
    }


    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }


    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }


    @Override
    public String toString() {
        return "Company {" +
                "parent = " + parent +
                ", employeesCount = " + employeesCount +
                '}';
    }


    public Company getTopLevelParent(Company child) throws CloneNotSupportedException {
        Company a = child.getParent();
        for (int i = 0; i < 100; i++) {
            if (a != null){
                a = child.getParent();
            } else {
                return child.getParent();
            }
        }
        return a;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long EmployeeCountForCompanyAndChildren = company.getEmployeesCount();
        for (Company company1:companies){
            if (company == company1.getParent()){
                EmployeeCountForCompanyAndChildren += company1.getEmployeesCount();
            }
        }
        return EmployeeCountForCompanyAndChildren;
    }
}
