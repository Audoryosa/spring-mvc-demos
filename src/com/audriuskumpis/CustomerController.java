package com.audriuskumpis;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customerModel", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm") // validating data
	public String processForm(
			@Valid @ModelAttribute("customerModel") Customer customer,
			BindingResult bindingResult
			) {
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";	
		}
	}
}
