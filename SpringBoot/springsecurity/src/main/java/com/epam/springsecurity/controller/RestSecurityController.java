package com.epam.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSecurityController {
	@GetMapping("/")
	public String index() {
		return "Application started";
	}

	@GetMapping("/home")
	public String home() {
		return "HomePage";
	}

	@GetMapping("user/dashboard")
	public String dashboard() {
		return "User dashboard";
	}

	@GetMapping("user")
	public String user() {
		return "User Page";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin Page";
	}

	@GetMapping("/admin/adduser")
	public String adminadduser() {
		return "User added by admin";
	}

	@GetMapping("/common")
	public String common() {
		return "Common page";
	}
}
