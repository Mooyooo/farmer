package edu.mum.farmer.dao;

import org.hibernate.SessionFactory;

public class CustomerDAO implements ICustomerDAO {

	private SessionFactory sf;

	public CustomerDAO(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub

	}

}
