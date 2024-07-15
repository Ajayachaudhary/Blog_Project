<%@ page import = "com.project.entities.EndUser" %>
<%@ page import = "com.project.entities.BlogPost" %>
<%@ page import = "com.project.Dao.PostDao" %>
<%@ page import = "com.project.connector.DatabaseConnection" %>
<%@ page import = "java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<%@ include file = "Hamro_nav.jsp" %>

 <div class="container mt-3">
        <%
        EndUser user = (EndUser) session.getAttribute("currentUser");
        if (user == null)
        {
        	response.sendRedirect("Login.jsp");
        }
        %>
        
        <%
        	PostDao dbconn = new PostDao(DatabaseConnection.connector());
		    List<BlogPost> posts = dbconn.getAllPost();
        %>

        <div class="jumbotron">
            <h1 class="display-4">Welcome to My Blog!</h1>
            <p class="lead">This is a simple blog application where you can read and write about various topics.</p>
            <hr class="my-4">
            <p>Explore the categories to find interesting articles or write your own.</p>
            <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
        </div>
		<!-- Display posts -->
        <div class="row">
		   	 <% for (BlogPost post : posts) { %>
		        <div class="col-sm-4 mb-3 d-flex align-items-stretch">
		            <div class="card h-100">
		                <div class="card-body d-flex flex-column">
		                    <h5 class="card-title"><%= post.getbTitle() %></h5>
		                    <p class="card-text flex-grow-1"><%= post.getbContent() %></p>
		                    <a href="#" class="btn btn-primary mt-auto">Read More</a>
		                </div>
		            </div>
		        </div>
		    <% } %>
		</div>

       
        <!-- Form to add a new post -->
        <div class="mt-5">
            <h2>Add a New Post</h2>
            <form action="AddPostServlet" method="POST">
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" class="form-control" id="title" name="title" required>
                </div>
                <div class="form-group">
                    <label for="content">Content</label>
                    <textarea class="form-control" id="content" name="content" rows="5" required></textarea>
                </div>
                <button type="submit" class="btn btn-primary mt-3">Add Post</button>
            </form>
        </div>
       
       
    </div>
     <script 
    src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>