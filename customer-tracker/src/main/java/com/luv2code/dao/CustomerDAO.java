package com.luv2code.dao;

import com.luv2code.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomerById(int customerId);

    public void deleteCustomer(Customer theCustomer);
}
