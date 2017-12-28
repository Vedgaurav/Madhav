package com.madhav.dao;

import java.util.ArrayList;

public interface RecordDao {

	public int book(int uid,int pid);
	
	public void merPack(int pid ,int mid);
	
	public ArrayList getUpack(int uid);
	
	public ArrayList getPack(int mid);
	
	
}
