<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<title> 로그아웃 액션</title>
</head>
<body>
	<%
	session.invalidate();
	%>
	<script>
		location.href='main.jsp';
	</script>
</body>
</html>