package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	
	
	private String Userid;
	private Integer Acc_Bal;
	public String getUserid() {
		return Userid;
	}
	
	
	public Account(String userid, Integer acc_Bal, List<Transactions> transactionsList) {
		super();
		this.Userid = userid;
		this.Acc_Bal = acc_Bal;
		this.TransactionsList = transactionsList;
	}


	@OneToMany (mappedBy = "Account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Transactions> TransactionsList;
	public void setUserid(String userid) {
		Userid = userid;
	}
	public Integer getAcc_Bal() {
		return Acc_Bal;
	}
	public void setAcc_Bal(Integer acc_Bal) {
		Acc_Bal = acc_Bal;
	}
	@Override
	public String toString() {
		return "Account [Userid=" + Userid + ", Acc_Bal=" + Acc_Bal + "]";
	}
	
	
}
