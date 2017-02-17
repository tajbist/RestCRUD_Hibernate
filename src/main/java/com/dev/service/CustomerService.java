package com.dev.service;

import com.dev.dao.CustomerDAO;
import com.dev.domain.Customer;

import java.util.List;

/**
 * Created by Oops on 2/16/2017.
 */
public class CustomerService {

    private List<Customer> cust = CustomerDAO.getCust();

   /* public CustomerService() {
        cust.put(1L, new Customer(1, "Rachit", "rachit@gmail.com", "328389933"));
        cust.put(2L, new Customer(1, "Rachit", "rachit@gmail.com", "328389933"));
        cust.put(3L, new Customer(1, "Rachit", "rachit@gmail.com", "328389933"));
        cust.put(4L, new Customer(1, "Rachit", "rachit@gmail.com", "328389933"));
        cust.put(5L, new Customer(1, "Rachit", "rachit@gmail.com", "328389933"));
    }*/

    public List<Customer> getAll() {
        return cust;
    }

    public Customer save(Customer customer) {
        return customer;
    }

    public Customer update(Customer customer) {
        return customer;
    }

    public Customer get(Customer customer) {
        return customer;
    }

    public Customer remove(Customer customer) {
        return customer;
    }
}
