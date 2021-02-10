package com.app.controller;

import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Transactions;
import com.app.service.RegistrationService;
import com.app.service.TransactionService;

@RestController
public class TransactionController {
	private static final int ResponseEntity = 0;
	@Autowired
	private TransactionService service;
	@Autowired
	private RegistrationService serv;
	@PostMapping("/transaction")
	@CrossOrigin("http://localhost:4200")

	public ResponseEntity<?>  transaction(@RequestBody Transactions trans) {
		long Amount= trans.getAmount();
		
		String type= trans.getType();
		int user_id= trans.getUser_id();
		User user =serv.fetchUserById(user_id);
		long accbal=user.getAccbal();
		if(type.equals("dr")) {
			long bal = accbal - Amount;
			user.setAccbal(bal);
			serv.UpdateUserBalance(user);
		}
		if(type.equals("cr")){
		long bal = accbal + Amount;
		user.setAccbal(bal);
		System.out.println(user.getAccbal());
		serv.UpdateUserBalance(user);
		}
		Transactions Tobj=null;
		Tobj= service.savetrans(trans);
		return new ResponseEntity<Transactions>(Tobj, HttpStatus.OK);
	}
	

}
