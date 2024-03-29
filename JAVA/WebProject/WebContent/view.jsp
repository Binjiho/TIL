<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.io.PrintWriter" %>
<%@ page import = "BBS.Bbs" %>
<%@ page import = "BBS.BbsDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<meta name = "viewport" content = "width = device-width",initial-scale="1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title> Binjiho's View</title>
<style>
		.aaa:hover{color:#cc33cc;}
		.navbar{background-color:white !important; }
		.btn{color:black !important; background-color:white !important; border-color:black !important;}
</style>

</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID")!=null){
			userID=(String)session.getAttribute("userID");
		}
		int bbsID=0;
		if(request.getParameter("bbsID")!=null){
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		if(bbsID==0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('유효하지 않은 글입니다')");
			script.println("location.href='bbs.jsp'");
			script.println("</script>");
		}
		Bbs bbs = new BbsDAO().getBbs(bbsID);
	%>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   	
   		<class="active"><a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		
   
 	</nav>

 
 <div class="container">
 	<div class="row">
 	
 		<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="3"style="background-color:#eeeeee; text-align:center;">게시판 글 보기 </th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td style="width: 20%;">글 제목</td>
					<td colspan="2"><%=bbs.getBbsTitle() %></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td colspan="2"><%=bbs.getUserID() %></td>
				</tr>
				<tr>
					<td>작성일자</td>
					<td colspan="2"><%= bbs.getBbsDate().substring(0,11) + bbs.getBbsDate().substring(11,13)+"시"+bbs.getBbsDate().substring(14,16)+"분" %></td>
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="2" style="min-height:200px; text-align:left;"><%=bbs.getBbsContent().replaceAll(" ", "&nbsp;").replaceAll("<","&lt;").replaceAll(">","&gt").replaceAll("\n","<br>") %></td>
				</tr>
			</tbody>
		</table>  	
		<a herf="bbs.jsp" class="btn btn-primary">목록</a>
		
		<%
			if(userID != null && userID.equals(bbs.getUserID())){
		%>
			<a href="update.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">수정</a>
			<a href="deleteAction.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">삭제</a>
		<% 
		}
		%>
	
 		

 	</div>
 </div>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script src="js/bootstrap.js"></script>
 
</body>
</html>