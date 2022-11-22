package com.applecompany.controller;

import com.applecompany.domain.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {


    /*
    * example: http://localhost:8080/Employee/fullName/Kami/salami
    * */
    @GetMapping("/fullName/{name}/{lastName}")
    public ResponseEntity<String> getName(@PathVariable String name,@PathVariable String lastName){
String fullName = name + " " + lastName;
        return ResponseEntity.ok(fullName);
    }




    /*
    * example http://localhost:8080/Employee/fullName2?name=Kami&lastName=salami
    *
    *
    * */
    @GetMapping("/fullName2")
    public ResponseEntity<String> getName2(@RequestParam String name,@RequestParam String lastName){
        String fullName = name + " " + lastName;
        return ResponseEntity.ok(fullName);
    }

    @PostMapping("/AddEmployee")
    public ResponseEntity<Employee> add(@RequestBody Employee employee){
        System.out.println(employee.toString());
        return ResponseEntity.ok(employee);
    }

    @PostMapping("/CalculateSalary")
    public ResponseEntity<Employee> salary(@RequestBody Employee employee){
         employee.setSalaryToman(employee.getSalary() * 36000);
        return ResponseEntity.ok(employee);
    }


}
