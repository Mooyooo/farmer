package edu.mum.farmer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.farmer.entity.Customer;
import edu.mum.farmer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable long id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public void updateCustomer(@PathVariable long id, Customer customer) {
		customerService.updateCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers{id}")
	public void delete(@PathVariable long id) {
		customerService.deleteCustomer(id);
	}
}
