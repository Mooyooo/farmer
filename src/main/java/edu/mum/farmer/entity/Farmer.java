package edu.mum.farmer.entity;

import java.util.Date;

public class Farmer extends User {

	protected Farmer() {
		super();
	}

	public Farmer(String firstname, String lastname, String username, String password, Date birthDate, String phone,
			Address address) {
		super(firstname, lastname, username, password, birthDate, phone, address);
		// TODO Auto-generated constructor stub
	}

}
