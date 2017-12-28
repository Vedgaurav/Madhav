package com.madhav.bean;

import java.io.Serializable;
import java.sql.Date;

public class MerchantBean implements Serializable{
	
	private int id;
	private String mname;
	private String email;
	private String pass;
	private String contact;
	private Date date;
	
	public MerchantBean() {}

	public MerchantBean(int id, String mname, String email, String pass, String contact,Date date) {
		super();
		this.id = id;
		this.mname = mname;
		this.email = email;
		this.pass = pass;
		this.contact = contact;
		
		this.date= date;
		
	}

	public MerchantBean(String mname, String email, String pass, String contact) {
		super();
		this.mname = mname;
		this.email = email;
		this.pass = pass;
		this.contact = contact;
	}
	

	
	public MerchantBean(int id, String mname, String email, String pass, String contact) {
		super();
		this.id = id;
		this.mname = mname;
		this.email = email;
		this.pass = pass;
		this.contact = contact;
	}

	public Date getDate() {
		return date;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
