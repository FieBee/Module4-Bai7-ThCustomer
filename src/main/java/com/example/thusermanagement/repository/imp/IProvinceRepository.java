package com.example.thusermanagement.repository.imp;


import com.example.thusermanagement.model.Customer;
import com.example.thusermanagement.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province,Long> {

}
