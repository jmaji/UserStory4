package com.jm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	static Connection con;
	DBConnector db; 
	
	private DBConnector() throws ClassNotFoundException,SQLException {
		if(con==null)
			Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","1234567");		
	}
		
		
	public static Connection  getConnection() throws ClassNotFoundException,SQLException {
		new DBConnector();
		return con;
	}
	}
	

