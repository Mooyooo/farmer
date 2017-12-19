package edu.mum.farmer.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.entity.Address;
import edu.mum.farmer.entity.Client;
import edu.mum.farmer.entity.Role;
import edu.mum.farmer.entity.ShoppingCart;
import edu.mum.farmer.entity.User;
import edu.mum.farmer.service.IClientService;
import edu.mum.farmer.service.IUserService;

@Controller
public class ClientController {

	@Autowired
	public IClientService cs;

	@Autowired
	public IUserService us;

	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
	public String createUser(Model model) {
		System.out.println("Create user page called!");
		return "newUser";
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(User user, Client client, Address address, BindingResult bindingResult, String userType,
			Model model) {
		ShoppingCart cart = new ShoppingCart();
		Role role;
		role = us.getRoleByName(userType);
		cart.setAddedDate(new Date());
		client.setShoppingCart(cart);
		client.setAddress(address);
		user.addRole(role);
		cs.addClient(client);
		us.createUser(user);
		return "redirect:/login";
	}

	@RequestMapping(value = "/user/{id}")
	public String getProduct(@PathVariable("id") long id, Model model) {
		Client client = cs.getClient(id);
		model.addAttribute("UserInfo", client);
		return "userDetail";
	}

	@RequestMapping(value="/users" ,method=RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("users", cs.getAllClients());
		return "users";
	}

	@RequestMapping(value = "/users/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		Client client = cs.getClient(id);
		us.delete(us.getUserByUsername(client.getUsername()));
		cs.deleteClient(id);
		return "redirect:/users";
	}
}
