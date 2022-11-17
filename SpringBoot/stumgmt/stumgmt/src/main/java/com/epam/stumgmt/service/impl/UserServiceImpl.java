package com.epam.stumgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.stumgmt.entity.User;
import com.epam.stumgmt.entity.UserVO;
import com.epam.stumgmt.repo.UserRepo;
import com.epam.stumgmt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Override
	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		if(userRepo.findByUserNameAndPassword(username, password) != null) return true;
		return false;
	}
	@Override
	public void addUser(UserVO userVO) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName(userVO.getUserName());
		user.setPassword(userVO.getPassword());
		user.setRole(userVO.getRole());
		userRepo.save(user);
	}

}
