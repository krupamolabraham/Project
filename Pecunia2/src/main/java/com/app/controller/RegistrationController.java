package com.app.controller; //Controller will be called when user submit the form

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.app.model.User;
import com.app.service.RegistrationService;
import com.app.util.CustomError;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	@PostMapping("/registeruser") 
	@CrossOrigin(origins ="http://localhost:4200")
	public ResponseEntity<?> registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailid();
		if(tempEmailId!=null && !"".equals(tempEmailId)) {
				User userobj =service.fetchUserByEmailid(tempEmailId); 
				 if(userobj!=null) {
					 return new ResponseEntity(new CustomError("user with"+tempEmailId+"already exists"), HttpStatus.NOT_FOUND);
					 }
		}
		User userObj =null;
		userObj = service.saveUser(user);
		return new ResponseEntity<User>(userObj, HttpStatus.OK);
	}
	@PostMapping("/login")
	@CrossOrigin(origins ="http://localhost:4200")
	 public ResponseEntity<?> LoginUser(@RequestBody User user) throws Exception{
		 String username =user.getUsername();
		 String pass=user.getPass();
		 User userObj=null;
		 
		 if(username!=null && pass!=null) {
			 userObj = service.fetchUserBynameAndpass(username, pass);
		 }
		 if(userObj==null) {
			 return new ResponseEntity(new CustomError("Bad Credentials"), HttpStatus.NOT_FOUND);
		 }
		 return new ResponseEntity<User>(userObj, HttpStatus.OK);
		 
	 }
	

}
