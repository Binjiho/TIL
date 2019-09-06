<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.io.PrintWriter" %>
<%@ page import = "BBS.BbsDAO" %>
<%@ page import = "BBS.Bbs" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		a,a:hover{
			color: blue;
			text-decoration: none;
		}
		.btn{color:black !important; background-color:white !important; border-color:black !important;}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<meta name = "viewport" content = "width = device-width",initial-scale="1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title> Binjiho Project</title>
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
		int pageNumber = 1;
		if(request.getParameter("pageNumber") != null){
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
	%>
	<%
	if(userID==null){
	%>
	<%
	session.invalidate();
	%>
	<script>
		location.href='login.jsp';
	</script>
 
	<%
	}else{
	 %>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
 	</nav>

 
 <div class="container">
 	<div class="row">
 		<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd;">
			<thead>
				<tr>
					<th style="background-color:white; text-align:center;">번호</th>
					<th style="background-color:white; text-align:center;">제목</th> 
					<th style="background-color:white; text-align:center;">작성자</th> 
					<th style="background-color:white; text-align:center;">작성일</th>

				</tr>
			</thead>
			<tbody>
				<%
					BbsDAO bbsDAO = new BbsDAO();
					ArrayList<Bbs> list = bbsDAO.getList(pageNumber);
					for(int i=0; i<list.size();i++){
				%>
				<tr>
					<td><%= list.get(i).getBbsID() %></td>
					<td><a href="view.jsp?bbsID=<%= list.get(i).getBbsID() %>"><%= list.get(i).getBbsTitle() %></a></td>
					<td><%= list.get(i).getUserID() %></td>
					<td><%= list.get(i).getBbsDate().substring(0,11) + list.get(i).getBbsDate().substring(11,13)+"시"+list.get(i).getBbsDate().substring(14,16)+"분" %></td>
					
					
				</tr>
				<%
					}
				%>
			</tbody>
		</table>  
		<%
			if(pageNumber != 1){
		%>	
			<a href="bbs.jsp?pageNumber=<%=pageNumber -1 %>" class="btn btn-sucess btn-arraw-left">이전</a>
		<%
			}if(bbsDAO.nextPage(pageNumber + 1)){
		%>
			<a href="bbs.jsp?pageNumber=<%=pageNumber +1 %>" class="btn btn-sucess btn-arraw-left">다음</a>
		<%
			}		
		%>
		<a href="wirte.jsp" class="btn btn-primary pull-right">글쓰기</a>
 	</div>
 </div>
 
  	<%
	}
 	%>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
 
</body>
</html>