package com.project.entities;

import java.sql.Timestamp;

public class EndUser {
	
	private int id;
	private String nameString;
	private String email;
	private String password;
	private String detail;
	private Timestamp dateTimestamp;
	private String profileString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Timestamp getDateTimestamp() {
		return dateTimestamp;
	}
	public EndUser(int id, String nameString, String email, String password, String detail, Timestamp dateTimestamp,
			String profileString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.email = email;
		this.password = password;
		this.detail = detail;
		this.dateTimestamp = dateTimestamp;
		this.profileString = profileString;
	}
	public void setDateTimestamp(Timestamp dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}
	public String getProfileString() {
		return profileString;
	}
	public void setProfileString(String profileString) {
		this.profileString = profileString;
	}
	
	public EndUser (String name, String emailString, String passwordString) {
		
		this.nameString = name;
		this.email = emailString;
		this.password = passwordString;
	}
	public EndUser() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	

}
