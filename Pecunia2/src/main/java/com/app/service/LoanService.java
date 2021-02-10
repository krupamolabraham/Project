package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.LoanRegistration;
import com.app.repository.LoanRepository;

@Service
public class LoanService {
	@Autowired
	private LoanRepository lrepo;
	public LoanRegistration saveLoan(LoanRegistration loan) {
		return lrepo.save(loan);
	}

}
