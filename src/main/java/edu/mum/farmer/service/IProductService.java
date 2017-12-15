package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Product;

public interface IProductService {
	public List<Product> getAllProducts();

	public Product getProduct(long id);

	public void addProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(long id);
}
