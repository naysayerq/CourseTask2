/**
 *
 * @classname : Main
 *
 * @version 1.0
 *
 * @author Andriy Skryp
 *
 *   Final course task.
 *
 *   2.         COMPANY Service implementation
 *
 *  1. Create a test set of companies in your main class.
 *  2. Take for this set IT-companies: Chief, Lawyer, Developer
 *   (Design,  Front-end, Back-end, DevOps). See attach.
 *  3. Take into account 4 different cases for a company
 *    (on-top, on bottom, in the node, out of chain).
 *  4. Test all this cases in your main class.
 *  5. Implement the interface in a class CompanyService.
 *
 * */


package entity;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        // 1. Create a test set of companies in your main class.

        // Creating object of class CompanyServiceImpl

        CompanyServiceImpl service = new CompanyServiceImpl();


        // 2. Take for this set IT-companies: Chief, Lawyer, Developer
        //  (Design,  Front-end, Back-end, DevOps). See attach.


        // 3. Take into account 4 different cases for a company
        // *    (on-top, on bottom, in the node, out of chain).


        // Creating few objects of our "tree"

        Chief chief = new Chief(null, 3L);
        Lawyer lawyer = new Lawyer(chief, 5L);
        Developer developer = new Developer(chief, 12L);
        BackEnd backEnd = new BackEnd(developer, 4L);
        FrontEnd frontEnd = new FrontEnd(developer, 6L);
        DevOps devOps = new DevOps(backEnd, 2L);
        Design design = new Design(frontEnd, 3L);
        Accounting accounting = new Accounting(null, 5L);


        // Creating list of companies (ArrayList)

        List<Company> companies = new ArrayList<>();
        companies.add(chief);
        companies.add(lawyer);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(frontEnd);
        companies.add(devOps);
        companies.add(design);
        companies.add(accounting);



        // 4. Test all this cases in your main class.

        System.out.println("Top level parent is: "
                + service.getTopLevelParent(backEnd));

        System.out.println("Top level parent is: "
                + service.getTopLevelParent(devOps));

        System.out.println("Top level parent is: "
                + service.getTopLevelParent(accounting));

        System.out.println("Top level parent is: "
                + service.getTopLevelParent(chief));

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        System.out.println("Employee count for company and children: "
                + service.getEmployeeCountForCompanyAndChildren(design, companies));

        System.out.println("Employee count for company and children: "
                + service.getEmployeeCountForCompanyAndChildren(accounting, companies));

        System.out.println("Employee count for company and children: "
                + service.getEmployeeCountForCompanyAndChildren(developer, companies));

        System.out.println("Employee count for company and children: "
                + service.getEmployeeCountForCompanyAndChildren(chief, companies));


        /*                                OUTCOME

                Top level parent is: Chief {parent = null, employeesCount = 3}
                Top level parent is: Chief {parent = null, employeesCount = 3}
                Top level parent is: null
                Top level parent is: null

                -------------------------------

                Employee count for company and children: 3
                Employee count for company and children: 5
                Employee count for company and children: 22
                Employee count for company and children: 20
                
         */


    }
}


