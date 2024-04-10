package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;
import java.util.List;

/*
  @author   antihetman
  @project   TDD_Labs
  @class  CompanyServiceImplTest
  @version  1.0.0 
  @since 4/10/24 - 13.40
*/class CompanyServiceImplTest {

    private final Company main = new Company(null,2);
    private final Company book = new Company(main,3);
    private final Company manager = new Company(main,4);
    private final Company developer = new Company(manager,8);
    private final Company design = new Company(manager,6);
    private final Company lawyer = new Company(null,1);
    private final Company testers = new Company(null,0);

    private final List<Company> companyList= List.of(main,book,manager,developer, lawyer, testers,design);

    private final ICompanyService companyService = new CompanyServiceImpl();


    @Test
    public void whenCompanyIsNullThenThrowException()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()->{ companyService
                .getTopLevelParent(null);
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("company is null",exception.getMessage());

    }

    @Test
    public void whenCompanyHasNoParentItIsOnTop()
    {
        Company result = companyService
                .getTopLevelParent(main);
       Assertions.assertEquals(main, result);
    }

    @Test
    public void whenCompanyIsSingleItIsOnTop()
    {
        Company result = companyService
                .getTopLevelParent(lawyer);
        Assertions.assertEquals(lawyer, result);
    }

    @Test
    public void whenCompanyNextToTheTop()
    {
        Company result = companyService
                .getTopLevelParent(book);
        Assertions.assertEquals(main, result);
    }

    @Test
    public void whenCompanyHasSomeAmountOfStepsToTheTop()
    {
        Company result = companyService
                .getTopLevelParent(developer);
        Assertions.assertEquals(main, result);
    }

    //TESTS FOR getEmployeeCountForCompanyAndChildren//

    @Test
    public void whenCompanyHasASingleWorker(){

        long result = companyService
                .getEmployeeCountForCompanyAndChildren(lawyer,companyList);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void whenCompanyInTheTopOfChainThenThereMightBe23Workers()
    {
        long result = companyService
                .getEmployeeCountForCompanyAndChildren(main,companyList);
        Assertions.assertEquals(23, result);
    }
    @Test
    public void whenCompanyIsThePartOfChainThenThereMightBeMoreWorkersThen0()
    {
        long result = companyService.
                getEmployeeCountForCompanyAndChildren(manager,companyList);
        Assertions.assertNotEquals(0,result);
    }

    @Test
    public void whenCompanyHasNoWorkersThenThrowException()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            companyService.getEmployeeCountForCompanyAndChildren(testers,companyList);
        }) ;
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("company has no workers", exception.getMessage());
    }

    @Test
    public void whenCompanyIsNullThenTrowException()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {companyService
                .getEmployeeCountForCompanyAndChildren(null,companyList);
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("company is null", exception.getMessage());
    }

    @Test
    public void whenCompanyListIsNullThenTrowException()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {companyService
                .getEmployeeCountForCompanyAndChildren(main,null);
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("list of companies is null", exception.getMessage());
    }

}