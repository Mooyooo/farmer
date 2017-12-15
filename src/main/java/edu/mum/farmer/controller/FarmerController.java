package edu.mum.farmer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.service.IProductService;

@RestController
public class FarmerController {
	@Autowired
	public IProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
	
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable long id) {
		return productService.getProduct(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/product/{id}")
	public void updateProduct(@PathVariable long id, Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="products{id}")
	public void delete(@PathVariable long id) {
		productService.deleteProduct(id);
	}
}
