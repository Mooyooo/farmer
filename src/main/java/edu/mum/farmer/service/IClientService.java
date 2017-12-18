package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Client;

public interface IClientService {
	public List<Client> getAllClients();

	public Client getClient(long id);

	public void addClient(Client client);

	public void updateClient(Client client);

	public void deleteClient(long id);
	
	public Client getClientByUsername(String username);

}
