package edu.mum.farmer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.entity.ProductState;
import edu.mum.farmer.service.IProductService;

@RestController
public class AdminController {

	@Autowired
	private IProductService service;

	@RequestMapping("/admin")
	public List<Product> getProducts() {
		return service.getAllProducts();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/admin/approve")
	public void approveProduct(Product p) {
		p.setProductState(ProductState.APPROVED);
		service.updateProduct(p);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/admin/reject")
	public void rejectProduct(Product p) {
		p.setProductState(ProductState.REJECTED);
		service.updateProduct(p);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/delete/{id}")
	public void deleteProduct(@RequestParam long id, Product p) {
		service.deleteProduct(id);
	}

}
