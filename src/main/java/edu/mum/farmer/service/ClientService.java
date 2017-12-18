package edu.mum.farmer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Client;
import edu.mum.farmer.repository.ClientRepository;

@Service
public class ClientService implements IClientService {

	@Autowired
	ClientRepository customerRepository;

	public List<Client> getAllCustomers() {
		List<Client> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Client getCustomer(long id) {
		return customerRepository.findOne(id);
	}

	public void addCustomer(Client customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(long id) {
		customerRepository.delete(id);
	}

	public void updateCustomer(Client customer) {
		customerRepository.save(customer);
	}
	
	public Client getClientByUsername(String username) {
		return customerRepository.getClientByUsername(username);
	}
}
