package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public String showName(Model model) {
		
		String myName="Ankita";
		model.addAttribute("name", myName);
		
		return "demo.jsp";
		
	}
}
