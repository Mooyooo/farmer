package edu.mum.farmer.entity;

import java.util.Date;

public class Customer extends User {

	protected Customer() {
		super();
	}

	public Customer(String firstname, String lastname, String username, String password, Date birthDate, String phone,
			Address address) {
		super(firstname, lastname, username, password, birthDate, phone, address);
		// TODO Auto-generated constructor stub
	}

}