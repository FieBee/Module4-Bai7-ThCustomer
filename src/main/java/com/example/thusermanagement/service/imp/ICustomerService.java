package com.example.thusermanagement.service.imp;

import com.example.thusermanagement.model.Customer;
import com.example.thusermanagement.model.Province;
import com.example.thusermanagement.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
