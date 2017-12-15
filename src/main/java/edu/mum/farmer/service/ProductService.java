package edu.mum.farmer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.entity.ProductState;
import edu.mum.farmer.repository.ProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getProduct(long id) {
		return productRepository.findOne(id);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.delete(id);
	}

	@Override
	public List<Product> getProductByProductState() {
		return productRepository.getProductByProductState(ProductState.APPROVED);
	}

}
