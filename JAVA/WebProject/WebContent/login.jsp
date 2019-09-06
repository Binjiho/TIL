<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   	<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   	<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   	<a class="navbar-brand text-secondary" href="join.jsp">회원가입</a>
   
 </nav>
 
 <div class="container">
  <div class="col-lg-4"></div>
  <div class="col-lg-4">

   <div class="jumbotron" style="padding-top: 50px;margin-top: 50px; background-color:white">
    <form method="post" action="loginAction.jsp">
     <h3 style="text-align: center;">로 그 인 화 면</h3>
     <br>
     <div class="form-row">
      <input type="text" class="form-control" id="userID" name="userID" placeholder="ID" maxlength="20">
     </div>
     <br>
     <div class="form-row">
      <input type="password" class="form-control" id="userPassword" name="userPassword"  placeholder="PASSWORD" maxlength="20">
     </div>
     <br>
     <input type="submit" class="btn btn-info form-control" value="LOGIN">
    </form>
   </div>
  </div>
 </div>
</body>
</html>