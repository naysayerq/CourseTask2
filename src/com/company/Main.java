package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        CompanyServiceImpl service = new CompanyServiceImpl();

        Chief chief = new Chief(null, 3L);
        Lawyer lawyer = new Lawyer(chief, 5L);
        Developer developer = new Developer(chief, 12L);
        BackEnd backEnd = new BackEnd(developer, 4L);
        FrontEnd frontEnd = new FrontEnd(developer, 6L);
        DevOps devOps = new DevOps(backEnd, 2L);
        Design design = new Design(frontEnd, 3L);
        Accounting accounting = new Accounting(null, 5L);


        List<Company> companies = new ArrayList<>();
        companies.add(chief);
        companies.add(lawyer);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(frontEnd);
        companies.add(devOps);
        companies.add(design);
        companies.add(accounting);



        System.out.println("Top level parent is: "
                + service.getTopLevelParent(devOps));

        System.out.println("Employee count for company and children: "
                + service.getEmployeeCountForCompanyAndChildren(developer, companies));



    }
}


