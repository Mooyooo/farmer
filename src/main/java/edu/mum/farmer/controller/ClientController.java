package edu.mum.farmer.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String createUser(Model model, Client client, User user, Address address) {
		ShoppingCart cart =new ShoppingCart();
		Role role =us.getRole(1);
		role.setName("USER");
		cart.setAddedDate(new Date());
		client.setShoppingCart(cart);
		client.setAddress(address);
		user.addRole(role);
		System.out.println("Post Create user page called!");
		System.out.println(client.toString());
		
		System.out.println("user:"+user.getUsername()+" password:"+user.getPassword());
		cs.addClient(client);
		us.createUser(user);
		return "redirect:/createUser";
	}

	@RequestMapping(value = "/user/{id}")
	public String getProduct(@PathVariable("id") long id, Model model) {
		Client client = cs.getClient(id);
		model.addAttribute("UserInfo", client);
		return "userDetail";
	}


	@RequestMapping(method = RequestMethod.PUT, value = "/updateUser")
	public void updateUser(@RequestBody Client client) {
		cs.updateClient(client);
	}

	@RequestMapping(value = "/users/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		cs.deleteClient(id);
		us.delete(us.getUser(id));
	}
}
