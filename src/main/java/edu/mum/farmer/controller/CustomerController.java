package edu.mum.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.entity.Client;
import edu.mum.farmer.service.IClientService;
import edu.mum.farmer.service.IProductService;

@Controller
// @RestController
public class CustomerController {

	@Autowired
	public IClientService customerService;

	@Autowired
	public IProductService productService;

	@RequestMapping("/customers")
	public String getAllCustomers(Model model) {
		// public List<Client> getAllCustomers(Model model) {
		model.addAttribute("customers", customerService.getAllClients());
		// return customerService.getAllCustomers();
		return "customerList";
	}

	@RequestMapping("/customers/{id}")
	public Client getCustomer(@PathVariable long id) {
		return customerService.getClient(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public void updateCustomer(@PathVariable long id, Client customer) {
		customerService.updateClient(customer);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Client customer) {
		customerService.addClient(customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers{id}")
	public void delete(@PathVariable long id) {
		customerService.deleteClient(id);
	}

	@RequestMapping("/approvedProducts")
	public String interstProduct(Model model) {
		model.addAttribute("approvedProducts", productService.getProductByProductState());
		return "approvedProducts";
	}
}
