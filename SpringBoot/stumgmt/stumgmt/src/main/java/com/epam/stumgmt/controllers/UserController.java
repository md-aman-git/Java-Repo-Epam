package com.epam.stumgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.stumgmt.entity.UserVO;
import com.epam.stumgmt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/login")
	public String login(Model m) {
		return "login";
	}
	@PostMapping("/login")
	public String loginSubmit(Model m, UserVO userVO) {
		String username = userVO.getUserName();
		String password = userVO.getPassword();
		boolean success = userService.checkLogin(username, password);
		System.out.println("user : " + username);
		System.out.println("user : " + password);
		System.out.println("success : " + success);
		if(success) {
			m.addAttribute("name", username);
			m.addAttribute("pass", password);
			return "loginDetails";
		}
		return "errorPage";
	}
	@GetMapping("/signup")
	public String signupUser() {
		return "user";
	}
}
