package com.applecompany.controller;

import com.applecompany.domain.Company;
import com.applecompany.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLDataException;
import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("/Company")
@AllArgsConstructor
public class CompanyController {
    @Autowired
   private final CompanyService service;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Company company){
            service.save(company);
            return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Company company){
        service.save(company);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        Company company = service.getById(id);
        return ResponseEntity.ok(company);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Company>> getAll(){
        List<Company> companyList = service.getAll();
        return ResponseEntity.ok(companyList);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }









//    @GetMapping("/namesOfCompany")
//    public ResponseEntity <List<String>> getNamesOfCompany(){
//       List<String> names =  companyService.namesOfCompany();
//        return ResponseEntity.ok(names);
//    }
//
//
//    @GetMapping("/NamesOfCompanyWithYears")
//    public ResponseEntity <List<Company>> getNamesOfCompanyWithYears(){
//        List<Company> names =  companyService.namesOfCompanyWithYear();
//        return ResponseEntity.ok(names);
//    }
}
