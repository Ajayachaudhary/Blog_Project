package com.project.entities;

import java.sql.Timestamp;

public class BlogPost {
	private int bid;
	private String bTitle;
	private String bContent;
	private String bCode;
	private String bPic;
	private Timestamp bDate;
	private int cateId;
	private int userId;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbPic() {
		return bPic;
	}
	public void setbPic(String bPic) {
		this.bPic = bPic;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public BlogPost(String title,String content ) {
		this.bTitle = title;
		this.bContent = content;
	}
	public BlogPost() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	

}
