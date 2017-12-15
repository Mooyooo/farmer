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
public class AdminController {

	@Autowired
	private IProductService service;

	@RequestMapping(value = "/admin")
	public String getProducts(Model model) {
		List<Product> products = service.getAllProducts();
		model.addAttribute("products", products);
		return "admin";
	}

	@RequestMapping(value = "/admin/approve/{id}")
	public String approveProduct(@PathVariable("id") long id, Model model) {		
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/reject/{id}")
	public String rejectProduct(@PathVariable("id") long id, Model model) {
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/delete/{id}")
	public String deleteProduct(@PathVariable("id") long id, Model model) {
		service.deleteProduct(id);
		return "redirect:/admin";
	}

}
