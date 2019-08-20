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
<h1>회원정보 입력 결과</h1>
<% Member m = (Member)request.getAttribute("member"); %>

	<table>
	<tr><td>아이디: </td><td><%=m.getId()%></td></tr>
	<tr><td>패스워드: </td><td><%=m.getPw()%></td></tr>
	<tr><td>이름: </td><td><%=m.getName()%></td></tr>
	<tr><td>닉네임: </td><td><%=m.getnickName()%></td></tr>
	<tr><td>성별: </td><td><%=m.getSex()%></td></tr>
	<tr><td>이메일: </td><td><%=m.getEmail()%></td></tr>
	<tr><td>홈페이지: </td><td><%=m.getHomePage()%></td></tr>
	<tr><td>주소: </td><td><%=m.getAddress()%></td></tr>
	<tr><td>취미: </td><td>
	<%String[] hobby =m.getHobby(); 
		for(String ho:hobby) { %>
			<%=ho+"  " %>
		<% } %>

	</td></tr>
	</table>
			
</body>
</html>