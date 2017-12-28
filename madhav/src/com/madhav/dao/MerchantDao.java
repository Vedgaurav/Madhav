package com.madhav.dao;

import java.util.ArrayList;

import com.madhav.bean.MerchantBean;

public interface MerchantDao {
	
	public int merchantRegister(MerchantBean mbean);
	
	public ArrayList merchantRetrieve();
	public MerchantBean merchantRetrieve(int id);
	public MerchantBean merchantRetrieve(String email);
	
	public boolean merchantUpdate(MerchantBean mbean);
	public boolean merchantUpdate(String email,String pass);
	
	public String merchantValidate(String email,String pass);
	
	public boolean merchantRemove(int mid);
	
	

}


