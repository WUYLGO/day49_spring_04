package com.itheima.web.action;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    Customer customer=new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }

    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String save(){
//        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        System.out.println(customerService);
        System.out.println(customer);
        customerService.save(customer);
        return SUCCESS;
    }

}
