package com.app.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity(name="transactions")
@Table(name="Transactions")
public class Transactions {
	@Id
	@Column(name="transid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private long amount;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
   private int user_id;
   public Transactions() {
	}
	public Transactions(int id, int transid, String type, long amount, Date date) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getUser_id() {
	return user_id;
}

}
