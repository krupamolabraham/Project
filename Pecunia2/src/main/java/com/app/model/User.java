package com.app.model; 
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity(name="user")
@Table(name="User")
public class User {
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String emailid;
	private String pass;
	private long mobileno;
	private long accno;
	private long accbal=100000;
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	 private List<Transactions> transactions= new ArrayList<>();
	public User() {
	}
	 public User(int id, String username, String firstname, String lastname, String emailid, String pass,
			long mobileno, long accno,long accbal) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.pass =pass;
		this.mobileno = mobileno;
		this.accno = accno;
		this.accbal= accbal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	} 
	public long getAccbal() {
		return accbal;
	}
	public void setAccbal(long accbal) {
		this.accbal = accbal;
	}
	

}
