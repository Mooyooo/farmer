package edu.mum.farmer.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	@NotEmpty(message = "*Please provide your username")
	@Column(unique=true)
	private String username;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private String phone;
	private String email;
	@Embedded
	private Address address;

	@OneToOne(cascade=CascadeType.PERSIST)
	private ShoppingCart shoppingCart;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public String toString() {
		return "\nfirstname:" + firstname + "\nlastame:" + lastname + "\nusername:" + username + "\nbirthDate:"
				+ birthDate + "\nphone:" + phone + "\nemail:" + email
		+address.toString();

	}

}
