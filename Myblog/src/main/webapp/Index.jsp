<%@ page import = "com.project.entities.EndUser" %>

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

        <div class="jumbotron">
            <h1 class="display-4">Welcome to My Blog!</h1>
            <p class="lead">This is a simple blog application where you can read and write about various topics.</p>
            <hr class="my-4">
            <p>Explore the categories to find interesting articles or write your own.</p>
            <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
        </div>

        <!-- Display posts or any other content -->
        <div class="row">
            <!-- Example card -->
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Post Title</h5>
                        <p class="card-text">Brief description of the post.</p>
                        <a href="#" class="btn btn-primary">Read More</a>
                    </div>
                </div>
            </div>
            <!-- Add more cards as needed -->
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