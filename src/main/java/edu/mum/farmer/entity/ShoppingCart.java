package edu.mum.farmer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue
	private long id;

	@ElementCollection
	private List<Product> products = new ArrayList<>();

	protected ShoppingCart() {

	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
