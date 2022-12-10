package com.applecompany.controller;

import com.applecompany.domain.Company;
import com.applecompany.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/namesOfCompany")
    public ResponseEntity <List<String>> getNamesOfCompany(){
       List<String> names =  companyService.namesOfCompany();
        return ResponseEntity.ok(names);
    }


    @GetMapping("/NamesOfCompanyWithYears")
    public ResponseEntity <List<Company>> getNamesOfCompanyWithYears(){
        List<Company> names =  companyService.namesOfCompanyWithYear();
        return ResponseEntity.ok(names);
    }
}
