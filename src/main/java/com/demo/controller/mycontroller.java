package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {
	
	@GetMapping("/mycart")
	public String loadform(Model model) {
		
		String str= "welcome java";
		model.addAttribute("Emp", str);
		return "index.jsp";
		
		
	}

}
