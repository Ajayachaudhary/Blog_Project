package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.Dao.UserDao;
import com.project.connector.DatabaseConnection;
import com.project.entities.EndUser;
import com.project.entities.message;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		PrintWriter pw = response.getWriter();
		String UserEmail = request.getParameter("email");
		String UserPassword = request.getParameter("password");
		
		UserDao Dbconn = new UserDao(DatabaseConnection.connector());
		
		EndUser usr = Dbconn.getlogin(UserEmail, UserPassword);
		
		if(usr != null) {
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", usr);
			response.sendRedirect("Index.jsp");
		}
		else {
			message msg = new message("Wrong inputs! Please try again","error","alert-danger");
			HttpSession session = request.getSession();
			session.setAttribute("message", msg);
			response.sendRedirect("Login.jsp");
		}
		
		
	}

}
