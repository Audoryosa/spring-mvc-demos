package com.audriuskumpis;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show initial HTML
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a method to process that form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new method to read form data
	// add data to model
	
	@RequestMapping("/processFormGreeting")
	public String greeting(HttpServletRequest request, Model model) {
		// read the request parameter from html form
		String name = request.getParameter("studentName");
		// convert data to what I want
		name = "dear " + name;		
		
		// create message to return
		String result = "Hello " + name;
		
		// add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
