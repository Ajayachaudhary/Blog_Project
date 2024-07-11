package com.project.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.project.connector.DatabaseConnection;
import com.project.entities.EndUser;

public class UserDao {

	
	private Connection conn;
	public UserDao(Connection connector) {
		// TODO Auto-generated constructor stub
		this.conn = connector;
	}
	public boolean addUser(EndUser user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		try {
			String quuery = "insert into user(nameString,email,password) values (?,?,?);";
			PreparedStatement pstm = conn.prepareStatement(quuery);
			pstm.setString(1, user.getNameString());
			pstm.setString(2, user.getEmail());
			pstm.setString(3, user.getPassword());
			pstm.executeUpdate();
			
			flag = true;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag;
	}
	

	
}
