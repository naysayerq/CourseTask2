/**
 *
 * @classname : CompanyServiceImpl
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 * */


    // 5. Implement the interface in a class CompanyService.

package entity;

import interfaces.ICompanyService;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {


    /**
     *  @param child - company for which we are searching the top level parent
     *  (parent of parent of ...)
     *
     *  @return top level parent
     *
     */

    @Override
    public Company getTopLevelParent(Company child) throws CloneNotSupportedException {
        Company a = child;
        while (a.getParent() != null){
            a = a.getParent();
        }
        if (child.getParent() == null){
            return child.getParent();
        }
        return a;
    }


    /**
     *
     *  @param company  - company for which we are searching the count of employees
     *  (count of this company employees +
     *  count employees of all children and their children employees )
     *
     *  @param companies  - list of all available companies
     *
     *  @return count of employees
     *
     */

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long EmployeeCountForCompanyAndChildren = company.getEmployeesCount();
        for (Company company1 : companies) {
            if (company == company1.getParent()) {
                EmployeeCountForCompanyAndChildren += company1.getEmployeesCount();
            }
        }
        return EmployeeCountForCompanyAndChildren;

    }
}

