package com.epam.userprofile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.userprofile.service.UserService;
import com.epam.userprofile.service.impl.UserServiceImpl;
import com.epam.userprofile.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String loginUser(Model model) {
		return "login";
	}
	@PostMapping("/login")
	public String loginSubmit(Model model, UserVO student) {
		String userName = student.getUserName();
		String password = student.getPassword();
		boolean success = userService.checkLogin(userName, password);
		if(success) {
			model.addAttribute("username", userName);
			model.addAttribute("password", password);
			return "successLogin";
		}
		return "erroPage";
	}
	@GetMapping("/signup")
	public String signupUser(Model model) {
		return "signup";
	}
	@PostMapping("/signup")
	public String signupSubmit(Model model, UserVO student) {
		String userName = student.getUserName();
		String password = student.getPassword();
		boolean success = userService.checkLogin(userName, password);
		if(success) {
			model.addAttribute("username", userName);
			model.addAttribute("password", password);
			return "successSignup";
		}
		return "erroPage";
	}

}
