<%@ page import = "file.FileDAO" %>
<%@ page import = "java.io.File" %>
<%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import = "com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset =utf-8">
<title>파일 업로드</title>
</head>
<body>
	<%
	String directory = application.getRealPath("/upload/");
	int maxSize = 1024*1024*100;
	String encoding = "utf-8";
	
	MultipartRequest multipartRequest = new MultipartRequest(request,directory,
			maxSize,encoding, new DefaultFileRenamePolicy());
	
	String fileName = multipartRequest.getOriginalFileName("file");
	String fileRealName = multipartRequest.getFilesystemName("file");
	
	new FileDAO().upload(fileName,fileRealName);
	out.write("파일명"+fileName+"<br>");
	out.write("실제 파일명"+fileName+"<br>");
	%>
</body>
</html>