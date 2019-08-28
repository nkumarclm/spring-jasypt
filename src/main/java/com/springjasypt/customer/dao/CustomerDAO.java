package com.springjasypt.customer.dao;

import com.springjasypt.customer.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}




