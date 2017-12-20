package edu.mum.farmer.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	private long currentId;
	
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "/product/{id}")
	public String getProduct(@PathVariable("id") long id, Model model) {
		Product p = productService.getProduct(id);
		model.addAttribute("product", p);
		return "product";
	}
	
	@RequestMapping(value = {"/newProduct" })
	public String showAddProductForm(Model model) {
		return "newProductForm";
	}

	@RequestMapping(method = RequestMethod.POST, value = {"/newProduct"})
	public String addProduct(@RequestParam("file") List<MultipartFile> files, Product product) throws IOException {
		System.out.println("Add new product");
		product.setProductState(ProductState.CREATED);
		for (MultipartFile file : files) {
			String fileBase64String = new String(Base64.getEncoder().encode(file.getBytes()));
			product.addImage(fileBase64String);
		}
		productService.addProduct(product);
		return "redirect:/newProduct";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/updateProduct"})
	public String updateProduct(@RequestParam("file") List<MultipartFile> files, Product product) throws IOException {
		System.out.println("Update product");
		
		Product p = productService.getProduct(currentId);
		p.setProductName(product.getProductName());
		p.setDescription(product.getDescription());
		p.setPrice(product.getPrice());
		p.getImages().clear();
		for (MultipartFile file : files) {
			String fileBase64String = new String(Base64.getEncoder().encode(file.getBytes()));
			p.addImage(fileBase64String);
		}
		productService.updateProduct(p);
		return "redirect:/product/"+currentId;
	}
	
	@RequestMapping(value = {"/updateProduct" })
	public String showUpdateProductForm(Model model) {
		Product p = productService.getProduct(currentId);
		model.addAttribute("product", p);
		return "updateProductForm";
	}
	
	@RequestMapping(value = {"product/{id}/update"})
	public String onClickUpdateProduct(@PathVariable("id") long id) {
		currentId = id;
		return "redirect:/updateProduct";
	}

	@RequestMapping(value = "/product/{id}/delete")
	public String deleteProduct(@PathVariable("id") long id, Model model) {
		productService.deleteProduct(id);
		return "redirect:/admin";
	}
	
	@RequestMapping("/approvedProducts")
	public String interstProduct(Model model) {
		model.addAttribute("approvedProducts", productService.getProductByProductState());
		return "approvedProducts";
	}
}
