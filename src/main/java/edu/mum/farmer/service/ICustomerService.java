package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomers();

	public Customer getCustomer(long id);

	public void addCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(long id);
}
