package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/show")
	public String showView(Model model ) {
		String name = "Mark";
		model.addAttribute("myName", name);
		
		return "demo";
	}
	
}
