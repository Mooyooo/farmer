package edu.mum.farmer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String description;
	private String productName;
	private double price;

	@Enumerated(EnumType.ORDINAL)
	private ProductState productState;

	@ElementCollection
	private List<byte[]> images = new ArrayList<>();

	protected Product() {

	}

	public Product(String description, String productName, double price) {
		super();
		this.description = description;
		this.productName = productName;
		this.price = price;
		this.productState = ProductState.CREATED;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductState getProductState() {
		return this.productState;
	}

	public void setProductState(ProductState state) {
		this.productState = state;
	}

	public List<byte[]> getImages() {
		return images;
	}

	public void addImage(byte[] image) {
		this.images.add(image);
	}

}
