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
		if(userID == null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('로그인이 필요합니다')");
			script.println("location.href='login.jsp'");
			script.println("</script>");
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
		if(!userID.equals(bbs.getUserID())){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('권한이 없습니다')");
			script.println("location.href='bbs.jsp'");
			script.println("</script>");
		}
	%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
 	 <a class="navbar-brand" href="main.jsp">Binjiho Project</a>
   		<a class="navbar-brand text-secondary" href="main.jsp">메인</a>
   	
   		<class="active"><a class="navbar-brand text-secondary" href="bbs.jsp">게시판</a>
   		
   
 	</nav>

 
 <div class="container">
 	<div class="row">
 	<form method="post" action="updateAction.jsp?bbsID=<%=bbsID%>">
 		<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="2"style="background-color:#eeeeee; text-align:center;">게시판 글 수정 </th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" class="form-control" placeholder="글 제목" name="bbsTitle" maxlength="50" value="<%=bbs.getBbsTitle() %>"></td>
				</tr>
				<tr>
					<td><textarea class="form-control" placeholder="글 내용" name="bbsContent" maxlength="2048" style="height:350px;">value="<%=bbs.getBbsContent() %></textarea></td>
				</tr>
			</tbody>
		</table>  	
		<input type="submit" class=btn btn-primary pull-right value="글 수정">

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