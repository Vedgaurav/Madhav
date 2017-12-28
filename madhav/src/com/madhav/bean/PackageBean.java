package com.madhav.bean;

import java.io.Serializable;

public class PackageBean implements Serializable{
	
	private int pid;
	private String pname;
	private String pdescr;
	private Double prate;
	private int pcount;
	
	public PackageBean() {
		
	}

	public PackageBean(int pid, String pname, String pdescr, Double prate, int pcount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescr = pdescr;
		this.prate = prate;
		this.pcount = pcount;
	}

	public PackageBean(String pname, String pdescr, Double prate, int pcount) {
		super();
		this.pname = pname;
		this.pdescr = pdescr;
		this.prate = prate;
		this.pcount = pcount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescr() {
		return pdescr;
	}

	public void setPdescr(String pdescr) {
		this.pdescr = pdescr;
	}

	public Double getPrate() {
		return prate;
	}

	public void setPrate(Double prate) {
		this.prate = prate;
	}

	public int getPcount() {
		return pcount;
	}

	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	
	

}
