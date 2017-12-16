package edu.mum.farmer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	public IProductService productService;

	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "/product/{id}")
	public String getProduct(@PathVariable("id") long id, Model model) {
		Product p = productService.getProduct(id);
		model.addAttribute("product", p);
		return "product";
	}

	@RequestMapping(value = "/products/add")
	public void addProduct(@PathVariable("id") Product product) {
		productService.addProduct(product);
	}

	@RequestMapping(value = "/product/update")
	public void updateProduct(@PathVariable("id") long id, Product product) {
		productService.addProduct(product);
	}

	@RequestMapping(value = "/products/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		productService.deleteProduct(id);
	}
}
