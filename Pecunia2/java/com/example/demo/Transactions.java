package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
public class Transactions {
	
	private String Userid;
	private String Type;
	private Integer Amount;
	private Date Date;
	@Autowired
	@Qualifier
	private Account Account;

	
	public Transactions() {}


	public Transactions(String userid, String type, Integer amount, java.sql.Date date,
			com.example.demo.Account account) {
		super();
		Userid = userid;
		Type = type;
		Amount = amount;
		Date = date;
		Account = account;
	}


	public String getUserid() {
		return Userid;
	}


	public void setUserid(String userid) {
		Userid = userid;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public Integer getAmount() {
		return Amount;
	}


	public void setAmount(Integer amount) {
		Amount = amount;
	}


	public Date getDate() {
		return Date;
	}


	public void setDate(Date date) {
		Date = date;
	}


	public Account getAccount() {
		return Account;
	}


	public void setAccount(Account account) {
		Account = account;
	}
	
	
	


	
	}

