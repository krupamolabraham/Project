package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="LoanRegistration")
public class LoanRegistration {
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="Loan_id")
	private int lid;
	private String first_name;
	private String last_name;
	private String e_mail;
	private long ph_no;
	private String gen;
	@JsonFormat(pattern="mm/dd/yyyy")
	private Date dob;
	private String add;
	private String loan;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	
}
