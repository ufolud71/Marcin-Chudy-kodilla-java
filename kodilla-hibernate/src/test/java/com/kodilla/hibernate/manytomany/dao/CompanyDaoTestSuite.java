package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company c1 = new Company("Company 1");
        Company c2 = new Company("Company 2");
        Company c3 = new Company("Sony");

        c1.getEmployees().add(johnSmith);
        c2.getEmployees().add(stephanieClarckson);
        c2.getEmployees().add(lindaKovalsky);
        c3.getEmployees().add(johnSmith);
        c3.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(c1);
        johnSmith.getCompanies().add(c3);
        stephanieClarckson.getCompanies().add(c2);
        lindaKovalsky.getCompanies().add(c2);
        lindaKovalsky.getCompanies().add(c3);

        //When
        companyDao.save(c1);
        int c1Id = c1.getId();
        companyDao.save(c2);
        int c2Id = c2.getId();
        companyDao.save(c3);
        int c3Id = c3.getId();

        //Then
        Assert.assertNotEquals(0, c1Id);
        Assert.assertNotEquals(0, c2Id);
        Assert.assertNotEquals(0, c3Id);

        //CleanUp
        try {
            companyDao.deleteById(c1Id);
            companyDao.deleteById(c2Id);
            companyDao.deleteById(c3Id);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int id = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int id2 = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int id3 = lindaKovalsky.getId();

        //When
        List<Employee> employeesLastName = employeeDao.findByLastname("Kovalsky");

        //Then
        try {
            Assert.assertEquals(1, employeesLastName.size());
        }
        finally {
            employeeDao.deleteById(id);
            employeeDao.deleteById(id2);
            employeeDao.deleteById(id3);
        }
    }

    @Test
    public void testFindByThreeCharsPrefix() {
        //Given
        Company c1 = new Company("Company1");
        Company c2 = new Company("Company2");
        Company c3 = new Company("Sony");

        companyDao.save(c1);
        int id = c1.getId();
        companyDao.save(c2);
        int id2 = c2.getId();
        companyDao.save(c3);
        int id3 = c3.getId();

        //When
        List<Company> companiesStartingWith = companyDao.findByThreeCharsPrefix("Com");

        //Then
        Assert.assertEquals(2, companiesStartingWith.size());

        //CleanUp
        try {
            companyDao.deleteById(id);
            companyDao.deleteById(id2);
            companyDao.deleteById(id3);
        } catch (Exception e) {
            //Nothing
        }
    }
}