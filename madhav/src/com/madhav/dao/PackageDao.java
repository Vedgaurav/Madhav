package com.madhav.dao;

import java.io.InputStream;
import java.util.ArrayList;

import com.madhav.bean.PackageBean;

public interface PackageDao {
	
	public int packageCreate(PackageBean pbean);
	
	public ArrayList<PackageBean> packageRetrieve();
	
	
	
	
	public PackageBean packageRetrieve(int id);
	
	public boolean packageUpdate(PackageBean pbean);
	
	
	
	public boolean packageCountUpdate(int id,int quantity);
	
	public boolean packageRemove(int id);
	
	public int avail(int id);
	

}
