package edu.mum.farmer.entity;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	private String username;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private String phone;
	@Embedded
	private Address address;

	protected Client() {

	}

	public Client(String firstname, String lastname, String username, Date birthDate, String phone, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.birthDate = birthDate;
		this.phone = phone;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
