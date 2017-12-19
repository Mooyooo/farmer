package edu.mum.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.farmer.entity.LineItem;
import edu.mum.farmer.entity.ShoppingCart;
import edu.mum.farmer.service.IClientService;
import edu.mum.farmer.service.IProductService;
import edu.mum.farmer.service.IShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	IShoppingCartService scs;

	@Autowired
	IProductService ps;

	@Autowired
	IClientService cs;

	@RequestMapping(value = "/approvedProducts", method = RequestMethod.GET)
	public String interstProduct(Model model) {
		ShoppingCart cart = scs.getShoppigCartByUsername("mo");
		model.addAttribute("cart", cart);
		model.addAttribute("approvedProducts", ps.getProductByProductState());
		return "approvedProducts";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/approvedProducts")
	public String addItemToShoppingCart(@RequestParam Integer quantity, @RequestParam Long pid, Model model) {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		ShoppingCart cart;
		if (!"anonymousUser".equals(loggedInUser.getName())) {
			cart = scs.getShoppigCartByUsername(loggedInUser.getName());
		} else {
			// redirect to login page
			cart = scs.getShoppigCartByUsername("mo");
		}
		LineItem lineItem = new LineItem();
		lineItem.setQuantity(quantity);
		lineItem.setProduct(ps.getProduct(pid));
		cart.addLineItem(lineItem);
		scs.updateShoppingCart(cart);
		return "redirect:/approvedProducts";
	}
}
