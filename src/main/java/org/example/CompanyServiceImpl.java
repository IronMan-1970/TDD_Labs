package org.example;/*
  @author   antihetman
  @project   TDD_Labs
  @class  ICompanyServiceImpl
  @version  1.0.0 
  @since 4/10/24 - 13.39
*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CompanyServiceImpl implements ICompanyService {


    @Override
    public Company getTopLevelParent(Company child) {

        if (child == null) throw new IllegalArgumentException("company is null");
        if(child.getParent() == null) return child;
        while (child.getParent() != null) child = child.getParent();
        return child;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        if (companies == null) throw new IllegalArgumentException("list of companies is null");
        if (company == null) throw new IllegalArgumentException("company is null");
        if (companies.isEmpty()) throw new IllegalArgumentException("list of companies is empty");
        if (company.getEmployeesCount() == 0) throw new IllegalArgumentException("company has no workers");
        List<Company> companiesTemp = new ArrayList<>(companies);
       int count = 0;
       Company tempCompany = company;
       while (companiesTemp.contains(company)){
           Company finalTempCompany = tempCompany;
           tempCompany = companiesTemp.stream().filter(er -> er.getParent() == finalTempCompany)
               .findAny().orElse(null);
           if (tempCompany == null) {
               count += finalTempCompany.getEmployeesCount();
               companiesTemp.remove(finalTempCompany);
               tempCompany = company;
           }

       };

       return count;
    }
}
