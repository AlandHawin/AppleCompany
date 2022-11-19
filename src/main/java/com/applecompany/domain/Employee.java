package com.applecompany.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    String firstName;
    String lastName;
    String nationalCode;
    Long salary;

    public Employee(String firstName, String lastName, String nationalCode, Long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", salary=" + salary +
                '}';
    }
}
