<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% String user=(String)request.getAttribute("user"); %>
	<%= user %> 님이 입장하셨습니다.
	
	
</body>
</html>