package com.applecompany.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Company {
    String name;
    int year;

    public Company(String name,int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
