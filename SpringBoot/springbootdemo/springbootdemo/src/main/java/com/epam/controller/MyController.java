package com.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class MyController {
	@RequestMapping("/first_method")
	public String firstMethod(Model model) {
		System.out.println("Hello from demo controller");
		System.out.println("First method called...");
		return "hello";
	}
}
