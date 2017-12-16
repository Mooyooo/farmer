package edu.mum.farmer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.entity.Client;
import edu.mum.farmer.entity.LineItem;
import edu.mum.farmer.service.IProductService;
import edu.mum.farmer.service.IShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	IShoppingCartService scs;

	@Autowired
	IProductService ps;

	@RequestMapping(method = RequestMethod.POST, value = "/addItem/{id}")
	public String addItemToShoppingCart(Model model, HttpServletRequest request, @PathVariable Long id) {
		Client user = null;
		if (request.getSession().getAttribute("user") != null) {
			user = (Client) request.getSession().getAttribute("user");
		} else {
			return "redirect:/login";
		}
		LineItem lineItem = new LineItem();
		lineItem.setProduct(ps.getProduct(id));
		// user.getShoppingCart().addLineItem(lineItem);
		scs.updateShoppingCart(user.getShoppingCart());
		request.getSession().setAttribute("user", user);
		return "approvedProducts";
	}
}
