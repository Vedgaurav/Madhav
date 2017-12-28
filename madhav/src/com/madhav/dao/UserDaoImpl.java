package com.madhav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.madhav.bean.UserBean;
import com.madhav.utility.DBUtil;




public class UserDaoImpl implements UserDao {

	Connection conn = null;
	PreparedStatement ps = null;

	public UserDaoImpl(){

		conn = DBUtil.getConnect();

	}

	@Override
	public int userRegistration(UserBean ubean) {
		int id = 0;
		if (ubean != null) {

			try {
				ps = conn.prepareStatement("insert into user(u_name,email,pass,contact) values(?,?,?,?)",
						Statement.RETURN_GENERATED_KEYS);

				ps.setString(1, ubean.getU_name());
				ps.setString(2, ubean.getEmail());
				ps.setString(3, ubean.getPass());
				ps.setString(4, ubean.getContact());
				
				int x = ps.executeUpdate();
				if (x > 0) {
					ResultSet rs = ps.getGeneratedKeys();
					if (rs.next()) {
						id = rs.getInt(1);
					}
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return id;
	}

	public UserBean userDetails(String email) {
		UserBean bean=null;
		try {
			ps=conn.prepareStatement("select * from user where email=?");
			
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				bean=new UserBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bean;
	}

	@Override
	public String userValidate(String email, String pass) {
		String un=null;
		try {
			ps=conn.prepareStatement("select u_name from user where  email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
				un=rs.getString(1);
				
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return un;
	}

	@Override
	public boolean userUpdate(UserBean ubean) {
		boolean update=false;
		try {
			ps=conn.prepareStatement("update user set u_name=?,email=?,pass = ?,contact=? where u_id=?");
			ps.setString(1, ubean.getU_name());
			ps.setString(2, ubean.getEmail());
			ps.setString(3, ubean.getPass());
			ps.setString(4, ubean.getContact());
			ps.setInt(5,ubean.getU_id());
		
			int x=ps.executeUpdate();
			if(x>0)
			{
				update=true;
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return update;
	}

	@Override
	public ArrayList<UserBean> userAllDetails() {
		ArrayList<UserBean> alist=new ArrayList<UserBean>();
		
		try {
			ps=conn.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				UserBean bean=new UserBean();
				bean=new UserBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
				alist.add(bean);
			}
			
		} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
		return alist;
	}

	public boolean userRemove(String email) {
		boolean remove=false;
		
		try {
			ps=conn.prepareStatement("delete from user where email=?");
			ps.setString(1, email);
			int x=ps.executeUpdate();
			if(x>0){
				
				remove=true;
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return remove;
	}
	
	
	public boolean userUpdate(String email, String pass) {
		
		boolean flag=false;
				
				try {
					PreparedStatement ps=conn.prepareStatement("update user set email=?,pass=? where email=?");
				
					
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


	
}
