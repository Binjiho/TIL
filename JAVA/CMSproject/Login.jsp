<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function check(){ //로그인 버튼 클릭시 수행
   var ob1=document.getElementById("user");
   var ob2=document.getElementById("pass");
   
   if(ob1.value<8){
      alert("아이디는 8글자 이상입니다.");
      ob1.focus();
      return;
   }
   if(ob2.value.length <8){
      alert("패스워드는 8글자 이상입니다.");
      ob2.focus();
      return;
   }
   	document.LoginForm.submit();//form 데이터를 서버로 전송, next.html로
}

</script>


</head>
<body>
	<% String msg=(String)request.getAttribute("msg");
	if(msg==null){msg="";}
	%>
	<%= msg %>
	
   <h2>로그인해 주세요.</h2>
   <p />
   <form action="/CmsProject/LoginServlet" name="LoginForm" method= "post">
      <table>
         <tr>
            <th id="myid">ID :</th>
            <td><Input type="text" id='user' name = "user" /></td>
         </tr>
         <tr>
            <th class="myclass">PW :</th>
            <td><Input type="password" id="pass" name = "pass"/></td>
         </tr>
      </table>

   </form>

   <input type="button" value="로그인" onclick="check()" />
   <input type="button" value="회원가입" onclick="location.href='Member.html'" />


</body>
</html>