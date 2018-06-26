package com.itheima.service;

import com.itheima.domain.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
    public Customer findById(Long id);
    public List<Customer> findAll();

    void update1(long l);
}
