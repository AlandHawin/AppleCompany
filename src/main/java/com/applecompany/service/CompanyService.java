package com.applecompany.service;

import com.applecompany.domain.Company;

import java.util.List;

public interface CompanyService {


//    List<String> namesOfCompany();
//    List<Company> namesOfCompanyWithYear();

    Company save(Company company);
    Company update(Company company);
    void delete(Long id);
    Company getById(Long id);
    List<Company> getAll();

}
