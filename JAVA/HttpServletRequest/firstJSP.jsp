<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP</title>
</head>
<body>
	<% String name = (String) request.getAttribute("name"); %>
	<b><%=name %></b>님이 입장하셨습니다.
	<a href="/Examples/second.do"> 두번째서블릿 호출</a>
</body>
</html>
