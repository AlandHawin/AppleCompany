package com.applecompany.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Setter
@Getter
@Data
@Entity
public class Company {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name ="NameOfCompany")
    private String nameOfCompany;

    @NotNull
    @Column(name ="EstablishedYear")
    @Temporal(TemporalType.TIMESTAMP)
    private Date establishedYear;

    @NotNull
    @Column(name ="NumberOfEmployees")
    private Integer numberOfEmployees;

    @NotNull
    @Column(name ="BusinessOfCompany")
    @Enumerated(EnumType.STRING)
    private BusinessOfCompany businessOfCompany;

    @NotNull
    @Column(name ="Product")
    private String product;

    @NotNull
    @Column(name ="TypeOfCompanyStock")
    @Enumerated(EnumType.STRING)
    private TypeOfCompanyStock typeOfCompanyStock;

    @NotNull
    @Column(name ="NationalIdCompany",unique = true)
    private String nationalIdCompany;

    @NotNull
    @Column(name ="CompanyRegistrationNumber")
    private Integer companyRegistrationNumber;

    @NotNull
    @Column(name ="NumberBoardOfDirectors")
    private Integer numberBoardOfDirectors;



}
