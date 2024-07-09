<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>My Blog</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="Hamro_nav.jsp" />
    <div class="container mt-5">
    	<div class="alert alert-primary" role="alert">
            <h4 class="alert-heading">Welcome to My Blog!</h4>
            <p>Hello and thank you for visiting My Blog! Here, we delve into a myriad of topics that will help you enhance your technical knowledge and coding prowess. Whether you're a beginner looking to get started or an experienced developer seeking to refine your skills, there's something here for everyone.</p>
            <p>Our blog covers a wide range of topics, from foundational concepts in Data Structures and Algorithms to advanced programming techniques in Java and Python. We aim to provide high-quality, easy-to-understand content that empowers you to achieve your learning goals.</p>
            <hr>
            <p class="mb-0">Feel free to explore the topics below and dive into the fascinating world of technology and programming. Happy learning!</p>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Data Structures and Algorithms (DSA)</h5>
                        <p class="card-text">Learn about various data structures and algorithms to improve your coding skills and problem-solving techniques.</p>
                        <a href="dsa.jsp" class="btn btn-primary">Learn More</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Java</h5>
                        <p class="card-text">Explore Java programming language, its features, and best practices for writing efficient and maintainable code.</p>
                        <a href="java.jsp" class="btn btn-primary">Learn More</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Python</h5>
                        <p class="card-text">Dive into Python programming, from basic syntax to advanced concepts, and build real-world applications.</p>
                        <a href="python.jsp" class="btn btn-primary">Learn More</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
