package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.RegistrationRepository;

@Service
public class RegistrationService { //this method will call inbuilt methods of JPA repository 
	@Autowired 
	private RegistrationRepository repo; 
	
	public User saveUser(User user) {
		return repo.save(user); 
		
	}
	public User fetchUserById(int id) {
		return repo.getOne(id);
	}
	public User fetchUserByEmailid(String email) {
		return repo.findByEmailid(email);
	}
		 
	public User fetchUserBynameAndpass(String username,String pass) {
		return repo.findByUsernameAndPass(username, pass);
	}
	
	public User UpdateUserBalance(User user) {
		return repo.save(user);
	}
}

