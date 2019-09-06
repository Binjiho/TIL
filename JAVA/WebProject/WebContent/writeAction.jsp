<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="BBS.BbsDAO" %>
<%@ page import="file.FileDAO" %>
<%@ page import="java.io.File" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="bbs" class="BBS.Bbs" scope="page"/>
<jsp:setProperty property="bbsTitle" name="bbs"/>
<jsp:setProperty property="bbsContent" name="bbs"/>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<title>업로드 페이지</title>
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
		script.println("alert('로그인을 하세요')");
		script.println("location.href='login.jsp'");
		script.println("</script>");
	} else{

	if(bbs.getBbsTitle()==null || bbs.getBbsContent()==null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사람이 있습니다')");
		script.println("history.back()");
		script.println("</script>");
	}else{
		BbsDAO bbsDAO = new BbsDAO();
		int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent());
		if(result == -1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('업로드에 실패하였습니다')");
			script.println("history.back()");
			script.println("</script>");
		}
		else {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href='bbs.jsp'");
			script.println("</script>");
		}
	}
	}
%>

</body>
</html>