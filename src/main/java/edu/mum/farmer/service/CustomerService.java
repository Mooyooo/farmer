package edu.mum.farmer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Customer;
import edu.mum.farmer.repository.CustomerRepository;

@Service
public class CustomerService  implements ICustomerService{

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Customer getCustomer(long id) {
		return customerRepository.findOne(id);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(long id) {
		customerRepository.delete(id);
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
}
