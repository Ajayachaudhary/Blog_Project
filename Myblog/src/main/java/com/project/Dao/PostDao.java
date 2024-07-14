package com.project.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.entities.BlogPost;

public class PostDao {

	private Connection conn;
	
	public PostDao(Connection connector) {
		this.conn = connector;
	}
	
	
	public List<BlogPost> getAllPost(){
		
		List<BlogPost> posts = new ArrayList<>();
		
		// fetch all the post 
		try {
			
			String query = "select * from post order by id desc;";
			PreparedStatement pstm = conn.prepareStatement(query);
			ResultSet result = pstm.executeQuery();
			
			while(result.next()) {
				
				BlogPost post = new BlogPost();
				post.setBid(result.getInt("id"));
				post.setbTitle(result.getString("title"));
				post.setbContent(result.getString("content"));
				post.setUserId(result.getInt("user_id"));
				posts.add(post);
			}
			conn.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return posts;
	}
	
	public boolean savePost(BlogPost post) {
		boolean flag = false;
		try {
			String query = "insert into post(title,content,user_id) values (?,?,?);";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1, post.getbTitle());
			pstm.setString(2, post.getbContent());
			pstm.setInt(3, post.getUserId());
			flag = pstm.executeUpdate()>0; //upon successful insertion it return integer value and compare with 0
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return flag;
	}
	
}
