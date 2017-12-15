package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Client;

public interface IClientService {
	public List<Client> getAllCustomers();

	public Client getCustomer(long id);

	public void addCustomer(Client customer);

	public void updateCustomer(Client customer);

	public void deleteCustomer(long id);
}
