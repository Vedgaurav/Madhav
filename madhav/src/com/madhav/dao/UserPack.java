package com.madhav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.madhav.utility.DBUtil;
import com.mysql.jdbc.Statement;

public class UserPack {
	
	public Connection conn= null;
	
	public UserPack() {
		
		conn= DBUtil.getConnect();
	}
	
	public int book(int uid,int pid)
	{
		int bid=0;
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into userpack (u_id,p_id) values(?,?)",Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, uid);
			ps.setInt(2, pid);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				ResultSet rs=ps.getGeneratedKeys();
				
				if(rs.next())
					bid= rs.getInt(1);
				
				
			}
				
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return bid;
		
		
	}

}
