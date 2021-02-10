package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.LoanRegistration;
import com.app.service.LoanService;

@RestController
public class LoanController {
	@Autowired
	private LoanService service;
	@PostMapping("/loanregister")
	@CrossOrigin(origins ="http://localhost:4200")
	public LoanRegistration registerloan(@RequestBody LoanRegistration loan) {
		LoanRegistration loanObj=null;
		loanObj =service.saveLoan(loan);
		return loanObj;
}
}
