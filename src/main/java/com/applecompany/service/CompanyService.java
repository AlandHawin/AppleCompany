package com.applecompany.service;

import com.applecompany.domain.Company;

import java.util.List;

public interface CompanyService {
    List<String> namesOfCompany();
    List<Company> namesOfCompanyWithYear();
}
