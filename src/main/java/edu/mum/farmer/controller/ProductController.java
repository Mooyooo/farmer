package edu.mum.farmer.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.entity.ProductState;
import edu.mum.farmer.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	public IProductService productService;

	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}
	
	@RequestMapping(value = {"/newProduct" })
	public String login(Model model) {
		return "newProduct";
	}

	@RequestMapping(value = "/product/{id}")
	public String getProduct(@PathVariable("id") long id, Model model) {
		Product p = productService.getProduct(id);
		model.addAttribute("product", p);
		return "product";
	}

	@RequestMapping(method = RequestMethod.POST, value = {"/newProduct"})
	public void addProduct(@RequestParam("file") List<MultipartFile> files, Product product) throws IOException {

		for (MultipartFile file : files) {
			product.addImage(file.getBytes());
		}
		
		product.setProductState(ProductState.CREATED);
		productService.addProduct(product);
		System.out.println("uploaded");
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@RequestMapping(value = "/products/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		productService.deleteProduct(id);
	}
}
