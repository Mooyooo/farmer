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
	ClientRepository clientRepository;

	public List<Client> getAllClients() {
		List<Client> customers = new ArrayList<>();
		clientRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Client getClient(long id) {
		return clientRepository.findOne(id);
	}

	public void addClient(Client customer) {
		clientRepository.save(customer);
	}

	public void deleteClient(long id) {
		clientRepository.delete(id);
	}

	public void updateClient(Client customer) {
		clientRepository.save(customer);
	}
	
	public Client getClientByUsername(String username) {
		return clientRepository.getClientByUsername(username);
	}
}
