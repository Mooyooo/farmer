package edu.mum.farmer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ShoppingCart {

	@ElementCollection
	@OneToMany
	private List<Product> products = new ArrayList<>();

	protected ShoppingCart() {

	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

}
