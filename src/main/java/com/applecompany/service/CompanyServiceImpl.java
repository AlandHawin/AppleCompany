package com.applecompany.service;

import com.applecompany.domain.Company;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{
    public List<String> namesOfCompany(){

        List<String> names = new LinkedList<>();
        names.add("Apploo");
        names.add("Applie");
        names.add("Apple");
       return names;
    }

    public List<Company> namesOfCompanyWithYear(){
        List<Company> names = new LinkedList<>();
        Company company1 = new Company("Applloo",2015);
        Company company2 = new Company("Appllie",2019);
        Company company3 = new Company("Applle",2022);
        names.add(company1);
        names.add(company2);
        names.add(company3);
        return names;
    }
}
