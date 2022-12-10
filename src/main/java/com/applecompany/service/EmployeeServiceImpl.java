package com.applecompany.service;

import com.applecompany.domain.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee calculateSalaryInToman(Employee employee) {
        employee.setSalaryToman(employee.getSalary()*38000);
        return employee;
    }
}
