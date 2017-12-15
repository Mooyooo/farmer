package edu.mum.farmer.entity;

import java.util.Date;

public class Admin extends User {

	protected Admin() {
		super();
	}

	public Admin(String firstname, String lastname, String username, String password, Date birthDate, String phone,
			Address address) {
		super(firstname, lastname, username, password, birthDate, phone, address);
		// TODO Auto-generated constructor stub
	}

	public void approveProduct(long produtctId) {

	}

	public void rejectProduct(long productId) {

	}

	public void deleteProduct(long productId) {

	}

}
