package edu.mum.farmer.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private long id;
	@NotEmpty(message = "*Please provide your username")
	@Column(unique = true)
	private String username;
	@Column(name = "password")
	// @Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	private String password;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<Role>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void addRole(Role role) {
		this.roles.add(role);
	}

	public void addRemove(Role role) {
		this.roles.remove(role);
	}

	@Override
	public String toString() {
		return "username:"+username+" password:"+password+" roles:"+roles.stream()
        .map( Role::getName )
        .collect( Collectors.joining("," ) );
	}
}
