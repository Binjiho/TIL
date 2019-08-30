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
   	
   		<class="active"><a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		
   
 	</nav>

 
 <div class="container">
 	<div class="row">
 		<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th style="background-color:#eeeeee; text-align:center;">번호</th>
					<th style="background-color:#eeeeee; text-align:center;">제목</th> 
					<th style="background-color:#eeeeee; text-align:center;">작성자</th> 
					<th style="background-color:#eeeeee; text-align:center;">작성일</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>안녕하세요.</td>
					<td>홍길동</td>
					<td>2019-08-30</td>
				</tr>
			</tbody>
		</table>  	
		<a href="writhe.jsp" class=btn btn-primary pull-right">글쓰기</a>
 	</div>
 </div>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
 
</body>
</html>