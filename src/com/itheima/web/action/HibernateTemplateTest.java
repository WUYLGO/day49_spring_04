package com.itheima.web.action;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class HibernateTemplateTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void save() {
        Customer customer = new Customer();
        customer.setCust_name("李四呵呵");
        customer.setCust_phone("13123123212");
        customerService.save(customer);
    }

    @Test
    public void update(){
        Customer customer = new Customer();
        customer.setCust_id(1L);
        customer.setCust_name("小丸子");
        customer.setCust_mobile("22222222");
        customerService.update(customer);
        System.out.println("搞定.................");
    }

    @Test
    //快照更新---->必须在service层中查询后更新,因为service层会结束事务,那么在session关闭之后无法使用快照更新;
    public void updateByShoot(){
        customerService.update1(2L);
    }

    @Test
    public void delete(){
        Customer customer = customerService.findById(2L);
        customerService.delete(customer);

    }

    @Test
    public void findById(){
        Customer customer = customerService.findById(3L);
        System.out.println(customer);
    }

    @Test
    public  void findAll(){
        List<Customer> all = customerService.findAll();
        for(Customer customer:all){
            System.out.println(customer);
        }
    }


}
