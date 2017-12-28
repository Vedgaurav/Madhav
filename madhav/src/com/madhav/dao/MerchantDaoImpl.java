package com.madhav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.madhav.bean.MerchantBean;
import com.madhav.utility.DBUtil;
import com.mysql.jdbc.Statement;

public class MerchantDaoImpl implements MerchantDao {

	public static Connection conn=null;
	
	public  MerchantDaoImpl() {
	
		conn=DBUtil.getConnect();
		
	}
	
	public int merchantRegister(MerchantBean mbean) {
		int id=0;
		
		if(mbean!=null)
		{
			try {
				PreparedStatement ps=conn.prepareStatement("insert into merchant (m_name,email,pass,contact) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
				ps.setString(1, mbean.getMname());
				ps.setString(2, mbean.getEmail());
				ps.setString(3, mbean.getPass());
				ps.setString(4, mbean.getContact());
				
			int x=	ps.executeUpdate();
			if(x>0)
			{
				ResultSet rs=ps.getGeneratedKeys();
				
				if(rs.next())
				{
					id= rs.getInt(1);
				}
			}
			
			
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return id;
		
	}

	
	public ArrayList merchantRetrieve() {
		
		ArrayList<MerchantBean> alist=new ArrayList<MerchantBean>();
		
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from merchant");
		
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				alist.add(new MerchantBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6)));
			}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return alist;
	}

	
	public MerchantBean merchantRetrieve(int id) {
		
		MerchantBean mbean=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from merchant where m_id=?");
			ps.setInt(1, id);
		
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				mbean=new MerchantBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
			}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return mbean;
	}

	
	public MerchantBean merchantRetrieve(String email) {
	
MerchantBean mbean=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from merchant where email=?");
			ps.setString(1, email);
		
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				mbean=new MerchantBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
			}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return mbean;
		
		
	}

	
	public boolean merchantUpdate(MerchantBean mbean) {
		
		boolean flag=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement("update merchant set m_name=?,email=?,pass=?,contact=? where m_id=?");
		
			ps.setString(1, mbean.getMname());
			ps.setString(2, mbean.getEmail());
			ps.setString(3, mbean.getPass());
			ps.setString(4, mbean.getContact());
			ps.setInt(5, mbean.getId());
			
		int x=	ps.executeUpdate();
			
		if(x>0)
			flag=true;
			
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return flag;
	}

	
	public boolean merchantUpdate(String email, String pass) {
		
boolean flag=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement("update merchant set email=?,pass=? where email=?");
		
			
			ps.setString(1, email );
			ps.setString(2, pass);
			ps.setString(3, email );
			
			
		int x=	ps.executeUpdate();
			
		if(x>0)
			flag=true;
			
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return flag;
		
		
	}


	public String merchantValidate(String email, String pass) {
		String name=null;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("select m_name from merchant where email=? and pass= ?");
		
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				name=rs.getString(1);
			}
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return name;
	}

	@Override
	public boolean merchantRemove(int mid) {
		
boolean flag=false;
		
	
		


		try {
			PreparedStatement ps = conn.prepareStatement("delete from merchant where m_id=?");
			
			ps.setInt(1, mid);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				flag=true;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return flag;
		
	}

}
