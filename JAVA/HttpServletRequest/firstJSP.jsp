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
	<b><%=name %></b>���� �����ϼ̽��ϴ�.
	<a href="/Examples/second.do"> �ι�°���� ȣ��</a>
</body>
</html>
