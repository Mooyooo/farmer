package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Product;

public interface IProductService {
	public List<Product> getAllProducts();

	public Product getProduct(long id);

	public void addProduct(Product p);

	public void updateProduct(Product p);

	public void deleteProduct(long id);
	
	public void approveProduct(long id);
	
	public void rejectProduct(long id);

	public List<Product> getProductByProductState();
}
