package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@NamedQuery(
        name = "CompanyFacade.findCompanyByName",
        query = "FROM Company WHERE name LIKE :%NAME%"
)

@NamedQuery(
        name = "CompanyFacade.findEmployeeByName",
        query = "FROM Employee WHERE name LIKE :%NAME%"
)

@Service
public class CompanyFacade {

    private EntityManager entityManager;

    private List companies;

    private List employees;


    @Bean
    public List<Company> findCompanyByName() {
        Query q = entityManager.createNamedQuery("CompanyFacade.findCompanyByName");

        companies = q.getResultList();
        return companies;
    }

    @Bean
    public List<Employee> findEmployeeByName() {
        Query q = entityManager.createNamedQuery("CompanyFacade.findEmployeeByName");

        employees = q.getResultList();
        return employees;
    }
}
