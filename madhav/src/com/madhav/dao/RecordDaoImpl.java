package com.madhav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.madhav.bean.PackageBean;
import com.madhav.utility.DBUtil;
import com.mysql.jdbc.Statement;

public class RecordDaoImpl implements RecordDao{
	
	public Connection conn = null;
	
	public RecordDaoImpl() {
		conn=DBUtil.getConnect();
	}
	
	public int book(int uid, int pid) {
		
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

	
	public void merPack(int pid, int mid) {
		
	try {
		PreparedStatement ps=	conn.prepareStatement("insert into merpack(p_id,m_id) values(?,?)");
	
		ps.setInt(1, pid);
		ps.setInt(2, mid);
		
		int x=ps.executeUpdate();
	
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
		
	}

	@Override
	public ArrayList getPack(int mid) {
		
		ArrayList al= new ArrayList();
		
		try {
			PreparedStatement ps= conn.prepareStatement("select p.p_id,p.p_name,p.p_descr,p.p_rate,p.p_count  from package p,merpack  where p.p_id=merpack.p_id and merpack.m_id=?") ;
		
		ps.setInt(1, mid);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			al.add(new PackageBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
		}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return al;
		
	}
	
public ArrayList getUpack(int uid) {
		
		ArrayList al= new ArrayList();
		
		try {
			PreparedStatement ps= conn.prepareStatement("select p.p_id,p.p_name,p.p_descr,p.p_rate,p.p_count  from package p,userpack  where p.p_id=userpack.p_id and userpack.u_id=?") ;
		
		ps.setInt(1, uid);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			al.add(new PackageBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
		}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return al;
		
	}
	

}
