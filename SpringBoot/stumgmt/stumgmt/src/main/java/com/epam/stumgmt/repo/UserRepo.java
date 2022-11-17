package com.epam.stumgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.stumgmt.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByUserNameAndPassword(String userName, String password);
}
