package com.madhav.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	
	private DBUtil() {
	}

	private static Connection conn = null;

	public static Connection getConnect() {

		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

			String s = "jdbc:mysql://localhost:3307/madhav";

			try {
				conn = DriverManager.getConnection(s,"jaijagannath","jaijagannath");
			} catch (SQLException e) {

				e.printStackTrace();
			}
			

		}
		
			return conn;
}
	public static void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
