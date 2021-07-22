package com.dash.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dash.entities.User;

//@Repository
public interface IUserDao extends JpaRepository<User, String> {
	
	public User findByUserPrincipalName(String userPrincipalName);
	

}
