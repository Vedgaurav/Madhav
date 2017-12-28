package com.madhav.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.madhav.bean.PackageBean;
import com.madhav.utility.DBUtil;
import com.mysql.jdbc.Statement;

public class PackageDaoImpl implements PackageDao{

	public Connection conn=null;
	
	public PackageDaoImpl() {
		
		conn=DBUtil.getConnect();
	}
	
	public int packageCreate(PackageBean pbean) {
		
		int id=0;
		
		try {
			PreparedStatement ps=conn.prepareStatement("insert into package (p_name,p_descr,p_rate,p_count) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, pbean.getPname());
		ps.setString(2, pbean.getPdescr());
		ps.setDouble(3, pbean.getPrate());
		ps.setInt(4, pbean.getPcount());
		
		
		int x=ps.executeUpdate();
		
		if(x>0)
		{
			ResultSet rs=ps.getGeneratedKeys();
			
			if(rs.next())
			{
				id=rs.getInt(1);
			}
		}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return id;
	}

	
	public ArrayList<PackageBean> packageRetrieve() {
		
		ArrayList<PackageBean> alist= new ArrayList<PackageBean>();
		
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from package");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				alist.add(new PackageBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return alist;
	}

	
	public PackageBean packageRetrieve(int id) {
		
		PackageBean pbean=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from package where p_id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				 pbean=new PackageBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return pbean;
	}
	
	
	public boolean packageUpdate(PackageBean pbean) {
		boolean flag=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement("update package set p_name=?,p_descr=?,p_rate=?,p_count=? where p_id=?");
			
			ps.setString(1, pbean.getPname());
			ps.setString(2, pbean.getPdescr());
			ps.setDouble(3, pbean.getPrate());
			ps.setInt(4, pbean.getPcount());
			ps.setInt(5, pbean.getPid());
			
			
			int x=ps.executeUpdate();
			
		if(x>0)
			flag=true;
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return flag;
	}

	
	public boolean packageCountUpdate(int id,int quantity) {
		
		boolean flag=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement("update package set p_count=p_count-? where p_id=?");
			
			
			ps.setInt(2, id);
			ps.setInt(1, quantity);
		
			
			int x=ps.executeUpdate();
			
		if(x>0)
			flag=true;
		
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
		
	}

	
	public boolean packageRemove(int id) {
		
		boolean flag=false;
		
		try {
			PreparedStatement ps = conn.prepareStatement("delete from package where id=?");
			
			ps.setInt(1, id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				flag=true;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return flag;
		
	}

	
	public int avail(int id) {
		
		int avail=0;
		
		try {
			PreparedStatement ps = conn.prepareStatement("select p_count from package where p_id=?");
		
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
				avail= rs.getInt(1);
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		return avail;
	}

	
	

}
