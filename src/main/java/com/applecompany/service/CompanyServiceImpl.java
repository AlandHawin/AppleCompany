package com.applecompany.service;

import com.applecompany.CompanyRepository.CompanyRepo;
import com.applecompany.domain.Company;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService{
     @Autowired
     private final CompanyRepo companyRepo;
//    public List<String> namesOfCompany(){
//
//        List<String> names = new LinkedList<>();
//        names.add("Apploo");
//        names.add("Applie");
//        names.add("Apple");
//       return names;
//    }
//
//    public List<Company> namesOfCompanyWithYear(){
//        List<Company> names = new LinkedList<>();
//        Company company1 = new Company();
//        Company company2 = new Company();
//        Company company3 = new Company();
//        names.add(company1);
//        names.add(company2);
//        names.add(company3);
//        return names;
//    }

    @Override
    public Company save(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public Company update(Company company) {
        Company company1 = getById(company.getId());
        company1.setNameOfCompany(company.getNameOfCompany());
        company1.setBusinessOfCompany(company.getBusinessOfCompany());
        company1.setNationalIdCompany(company.getNationalIdCompany());
        company1.setCompanyRegistrationNumber(company.getCompanyRegistrationNumber());
        company1.setTypeOfCompanyStock(company.getTypeOfCompanyStock());
        company1.setEstablishedYear(company.getEstablishedYear());
        company1.setNumberBoardOfDirectors(company.getNumberBoardOfDirectors());
        company1.setProduct(company.getProduct());
        company1.setId(company.getId());

        return companyRepo.save(company1);
    }

    @Override
    public void delete(Long id) {
        companyRepo.delete(getById(id));
    }

    @Override
    public Company getById(Long id) {
        Optional<Company> company = companyRepo.findById(id);
        if (!company.isPresent()){
            throw new RuntimeException("not found");
        }
        return company.get();
    }

    @Override
    public List<Company> getAll() {
        return (List<Company> )companyRepo.findAll();
    }
}
