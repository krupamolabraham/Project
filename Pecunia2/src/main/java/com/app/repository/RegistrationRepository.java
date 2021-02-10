package com.app.repository; //repository.java do all our CRUD operations

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;
//We create interface for registration
//JPA repository contain all in built CRUD operation by default, to use this repository we use JpaRepository
@Repository
public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByEmailid(String emailid);
	public User findByUsernameAndPass(String username, String pass);
}