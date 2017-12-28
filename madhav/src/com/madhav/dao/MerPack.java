package com.madhav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.madhav.utility.DBUtil;

public class MerPack {
	
	public Connection conn = null;
	
	public MerPack()
	{
		conn = DBUtil.getConnect();
				
	}
	
	public boolean merPack(int pid,int mid)
	{	
		boolean flag= false;
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into merpack (p_id,m_id) values(?,?)" );
			ps.setInt(1, pid);
			ps.setInt(2, mid);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				flag=true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	return flag;
	
	}
	
	

}
