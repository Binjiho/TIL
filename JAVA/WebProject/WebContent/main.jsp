<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<meta name = "viewport" content = "width = device-width",initial-scale="1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title> Binjiho's Project</title>
<style>
	input[type="text"]{border-color: #ff3366;}
	input[type="password"]{border-color: #ff0000;}
	input[type="submit"]{background:white; color:black;}
	.navbar{background-color:white !important; }
</style>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID")!=null){
			userID=(String)session.getAttribute("userID");
		}
	%>

 
 	   
<%
	if(userID==null){
%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   	
   		<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		<a class="navbar-brand text-secondary" href="login.jsp">로그인</a>
   		<a class="navbar-brand text-secondary" href="join.jsp">회원가입</a>
   
 	</nav>
 	
 	
 	 <div class="container">
 	<div class="jumbotron" style="padding-top: 50px;margin-top: 50px; background-color:white">
 		<div class="container">
 			<h1>Binjiho's Project</h1>
 			<p>This website had been made by Binjiho. Show your life to my website.</p>
 			<p><a class="btn btn-primary btn-pull" href=#" role="button">자세히 알아보기</a></p>
 		</div>
 	</div>
 </div>
 
	
 <%
	}else{
 %>
 	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   	
   		<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		<a class="navbar-brand text-secondary" href="logoutAction.jsp">로그아웃</a>
   		<a class="navbar-brand text-secondary" href="join.jsp">회원가입</a>
   
 	</nav>
 	
 	 <div class="container">
 	<div class="jumbotron" style="padding-top: 50px;margin-top: 50px; background-color:white">
 		<div class="container">
 			<h1>Binjiho's Project</h1>
 			<p>This website had been made by Binjiho. Show your life to my website.</p>
 			<p><a class="btn btn-primary btn-pull" href=#" role="button">자세히 알아보기</a></p>
 		</div>
 	</div>
 </div>
 
 
 <%
	}
 %>

  <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
</body>
</html>