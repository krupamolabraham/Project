package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Transactions;
import com.app.repository.TransactionRepository;
@Service
public class TransactionService {
	@Autowired
	private TransactionRepository repo;
	public Transactions savetrans(Transactions trans) { 
		return repo.save(trans);
	}
}
