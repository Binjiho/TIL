<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" 
    import= "com.hansung.Member" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>ȸ������ �Է� ���</h1>
<% Member m = (Member)request.getAttribute("member"); %>

	<table>
	<tr><td>���̵�: </td><td><%=m.getId()%></td></tr>
	<tr><td>�н�����: </td><td><%=m.getPw()%></td></tr>
	<tr><td>�̸�: </td><td><%=m.getName()%></td></tr>
	<tr><td>�г���: </td><td><%=m.getnickName()%></td></tr>
	<tr><td>����: </td><td><%=m.getSex()%></td></tr>
	<tr><td>�̸���: </td><td><%=m.getEmail()%></td></tr>
	<tr><td>Ȩ������: </td><td><%=m.getHomePage()%></td></tr>
	<tr><td>�ּ�: </td><td><%=m.getAddress()%></td></tr>
	<tr><td>���: </td><td>
	<%String[] hobby =m.getHobby(); 
		for(String ho:hobby) { %>
			<%=ho+"  " %>
		<% } %>

	</td></tr>
	</table>
			
</body>
</html>