package com.applecompany.CompanyRepository;

import com.applecompany.domain.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<Company,Long> {



}
