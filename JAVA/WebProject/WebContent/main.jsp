<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<meta name = "viewport" content = "width = device-width",initial-scale="1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title> JSP 게시판 웹 사이트</title>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID")!=null){
			userID=(String)session.getAttribute("userID");
		}
	%>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   		<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		<a class="navbar-brand text-secondary" href="join.jsp">회원가입</a>
   
 	</nav>
 
 <div class="container">
  <div class="col-lg-4"></div>
  <div class="col-lg-4">
   <div class="jumbotron" style="padding-top: 50px;margin-top: 50px;">
    <form method="post" action="loginAction.jsp">
     <h3 style="text-align: center;">로 그 인 화 면</h3>
     <br>
     <div class="form-row">
      <input type="text" class="form-control" id="userID" name="userID" placeholder="아 이 디" maxlength="20">
     </div>
     <br>
     <div class="form-row">
      <input type="password" class="form-control" id="userPassword" name="userPassword"  placeholder="비 밀 번 호" maxlength="20">
     </div>
     <br>
     <input type="submit" class="btn btn-info form-control" value="로 그 인">
    </form>
   </div>
  </div>
 </div>
 
  <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
</body>
</html>