package com.madhav.bean;

import java.io.Serializable;
import java.sql.Date;

public class UserBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int u_id;
	private String u_name;
	private String email;
	private String pass;
	private String contact;
	private Date date;
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(String u_name, String email, String pass,  String contact) {
		super();
		this.u_name = u_name;
		this.email = email;
		this.pass = pass;
	
		this.contact = contact;
	}

	public UserBean(int u_id, String u_name, String email, String pass,String contact, Date date) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.email = email;
		this.pass = pass;
		this.contact = contact;
		this.date = date;
	}

	
	
	
	
	public UserBean(int u_id, String u_name, String email, String pass, String contact) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.email = email;
		this.pass = pass;
		this.contact = contact;
	}

	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
