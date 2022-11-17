package com.epam.stumgmt.service;

import com.epam.stumgmt.entity.UserVO;

public interface UserService {
	public boolean checkLogin(String username, String password);
	public void addUser(UserVO userVO);
}
