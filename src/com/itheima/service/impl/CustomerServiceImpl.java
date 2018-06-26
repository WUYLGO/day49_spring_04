package com.itheima.service.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public Customer findById(Long id) {
        Customer customer = customerDao.findById(id);

        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> list = customerDao.findAll();

        return list;
    }
    @Override
    public void update1(long l){
        Customer customer = customerDao.findById(2L);
        customer.setCust_name("你妹的");

    }
}