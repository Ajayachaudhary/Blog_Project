package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.mysql.cj.Session;
import com.project.Dao.PostDao;
import com.project.connector.DatabaseConnection;
import com.project.entities.BlogPost;
import com.project.entities.EndUser;

/**
 * Servlet implementation class PostServlet
 */
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		
		EndUser user = (EndUser) session.getAttribute("currentUser");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BlogPost post = new BlogPost(user.getId(), title, content);
		PostDao dbconn = new PostDao(DatabaseConnection.connector());
		boolean status = dbconn.savePost(post);
		if(status) {
			pw.println("Successfully added.");
			response.sendRedirect("Index.jsp");
		}
		else {
			pw.println("Error occur!!!");
		}
	}

}
