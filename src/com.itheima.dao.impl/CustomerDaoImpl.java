package com.itheima.dao.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
//    private HibernateTemplate hibernateTemplate;
//
//    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//        this.hibernateTemplate = hibernateTemplate;
//    }

    @Override
    public void save(Customer customer) {
        getHibernateTemplate().save(customer);
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer);
        getHibernateTemplate().update(customer);
        System.out.println("结束...........");

    }

    @Override
    public void delete(Customer customer) {
        getHibernateTemplate().delete(customer);
    }

    @Override
    public Customer findById(Long id) {
        Customer customer = getHibernateTemplate().get(Customer.class, id);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> list   = (List<Customer>) getHibernateTemplate().findByNamedQuery("findAllCustomer");
        return list;
    }
}
