package edu.mum.farmer.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// @RequestMapping(value = { "/", "/login" })
	// public ModelAndView login() {
	// ModelAndView modelAndView = new ModelAndView();
	// modelAndView.setViewName("login");
	// System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
	// return modelAndView;
	// }

	@RequestMapping(value = { "/", "/login" })
	public String login() {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		return "login";
	}

	@RequestMapping(value = "/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}

	// @RequestMapping(value = "/login")
	// public String login(Model model, String error, String logout) {
	// if (error != null) {
	// model.addAttribute("error", "Your username and password is invalid.");
	// System.out.println("Your username and password is invalid.");
	// }
	//
	// if (logout != null) {
	// model.addAttribute("message", "You have been logged out successfully.");
	// System.out.println("You have been logged out successfully.");
	// }
	//
	// return "login";
	// }

}
