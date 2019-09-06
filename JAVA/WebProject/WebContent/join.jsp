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
	input[type="password"]{border-color: #ff6699;}
	input[type="submit"]{background:white color:black; }
	input[type="email"]{border-color:#00cc33;}
	
	.navbar{background-color:white !important; }
	
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   	<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   	<a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   	
   	<a class="navbar-brand text-secondary" href="login.jsp">로그인</a>

 </nav>
 
 <div class="container">
  <div class="col-lg-4"></div>
  <div class="col-lg-4">
   <div class="jumbotron" style="padding-top: 20px; background-color:white">
    <form method="post" action="joinAction.jsp">
     <h3 style="text-align: center;"> 회 원 가 입  화 면</h3>
     
     <div class="form-group">
      <input type="text" class="form-control" id="userID" name="userID" placeholder="아 이 디" maxlength="20">
     </div>
     
     <div class="form-group">
      <input type="password" class="form-control" id="userPassword" name="userPassword"  placeholder="비 밀 번 호" maxlength="20">
     </div>
    
     
     <div class="form-group">
      <input type="text" class="form-control" id="userName" name="userName"  placeholder="이 름" maxlength="20">
     </div>
     
     <div class="form-group" style="text-aline:center; background-color:white">
     	<div class="btn-group" data-toggle="buttons">
     		<label class="btn btn-primary active">
     			<input type="radio" name="userSex" autocomplete="off" value="남자" checked>남자
     		</label>
     		<label class="btn btn-primary">
     			<input type="radio" name="userSex" autocomplete="off" value="여자" checked>여자
     		</label>
     	</div>
     </div>
     
     <div class="form-group">
      <input type="email" class="form-control" id="userEmail" name="userEmail"  placeholder="이 메 일" maxlength="20">
     </div>
     
     
     <input type="submit" class="btn btn-info form-control" value="회 원 가 입">
    </form>
   </div>
  </div>
  <div class="col-lg-4"></div>
 </div>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</body>
</html>