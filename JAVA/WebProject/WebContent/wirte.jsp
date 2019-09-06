<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<meta name = "viewport" content = "width = device-width",initial-scale="1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title> Binjiho's 게시판</title>
<style>
		.aaa:hover{color:#cc33cc;}
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

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   	
   		<class="active"><a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		
   
 	</nav>

 
 <div class="container">
 	<div class="row">
 	<form method="post" action="writeAction.jsp">
 		<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="2"style="background-color:#eeeeee; text-align:center;">게시판 글쓰기 </th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" class="form-control" placeholder="글 제목" name="bbsTitle" maxlength="50"></td>
				</tr>
				<tr>
					<td><textarea class="form-control" placeholder="글 내용" name="bbsContent" maxlength="2048" style="height:350px;"></textarea></td>
				</tr>
			</tbody>
		</table>  	
		<input type="submit" class=btn btn-primary pull-right value="글 쓰기">

 		</form>
 		
 		<form action="uploadAction.jsp" method="post" enctype="multipart/form-data">
		<input type="file" name="file" class=btn btn-primary pull-right">
			<input type="submit" class=btn btn-primary pull-right value="UPLOAD"><br>
		</form>
		
 	</div>
 </div>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
 
</body>
</html>