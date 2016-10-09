package com.db.Connection;

import java.sql.*;
;


public class DbConnection {
	
	public Connection getConnection(){
		Connection conn = null;
		try { 
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","radha"); 
			} 
		catch (Exception e) 
		{ 
			e.printStackTrace();
			}
		return conn;
	}
}
