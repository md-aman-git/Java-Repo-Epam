package com.epam.partsmgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Hello {
	
	@GetMapping("/test")
	public String testMethod(Model m) {
		String path = "../../../../../webapp/WEB-INF/img/India.png";
		System.out.println("Hello test");
		m.addAttribute("pat", path);
		return "imgCheck";
	}
}
