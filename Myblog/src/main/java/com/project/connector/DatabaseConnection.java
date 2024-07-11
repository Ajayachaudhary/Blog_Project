package com.project.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

static Connection conn;
	
	public static Connection connector(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			
			String url = "jdbc:mysql://localhost:3306/teacher";
			String username = "ajay";
			String password = "Aj@ya";
			
			conn = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
		return conn;
		
		
	}
	
	
}
