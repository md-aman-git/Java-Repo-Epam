package com.epam.userprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.userprofile.repo.UserRepo;
import com.epam.userprofile.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public boolean checkLogin(String userName, String password) {
		// TODO Auto-generated method stub
		System.out.println("User repo : " + userRepo);
		return userRepo.checkLogin(userName, password);
	}

}
