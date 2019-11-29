<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/alertify.min.js"></script>
   <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/alertify.min.css"/>
   <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/themes/default.min.css"/>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/register.css">

<!-- daesub -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<title>Insert title here</title>
</head>
<body>

<div class="container">


    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form">
			<h2>Please Sign Up <small>언제나 환영합니다.</small></h2>
			<hr class="colorgraph">

		</form>
	</div>
</div>
<!-- Modal -->
<div class="modal fade" id="t_and_c_m" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel">Terms & Conditions</h4>
			</div>
			<div class="modal-body">
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" data-dismiss="modal">I Agree</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</div>

<!-- paste -->
  <form method="post" role="form">
          <div class="form-group">
            <label class="sr-only" for="inputName">Name</label>
            <input type="text" class="form-control" id="userName" name="name" placeholder="Name">
            <div class="invalid-feedback">이름을 입력하세요.</div>
          </div>
          <div class="form-group">
            <label class="sr-only" for="inputEmail">Email</label>
            <input type="email" class="form-control" id="userEmail" name="userEmail" placeholder="Email">
            <div class="invalid-feedback">이메일 주소를 올바르게 입력하세요.</div>
          </div>
          <div class="form-group">
            <label class="sr-only" for="inputPassword">Password</label>
            <input type="password" class="form-control" id="userPassword" name="userPassword"  placeholder="Password">
            <div class="invalid-feedback">10 이상의 영문,숫자,특수문자를 포함하도록 입력하세요.</div>
          </div>
          <div class="form-group">
            <label class="sr-only" for="inputPasswordCheck">Retype Password</label>
            <input type="password" class="form-control" id="userPassword2" name="userPassword2"  placeholder="Confirm Password">
            <div class="invalid-feedback">비밀번호가 일치하지 않습니다.</div>
          </div>
          
        </form>
        <button id="btn_register" class="btn btn-primary btn-block">회원 가입</button>

<!-- paste -->

<script>
      (function(document, window, $) {
         'use strict';

         var Site = window.Site;
         $(document).ready(function() {
            
        	 //Site.run();
            

            $("#btn_register").click(function(){
               
               if( validate() ){
                  sendReqeust();
               }
            });

         });
      })(document, window, jQuery);
      
      function validate(){
         
         var isUserNameValid = false;
         var isUserEmailValid = false;
         var isUserPasswordValid = false;
         var isUserPassword2Valid = false;

         var patternEng = new RegExp(/[a-zA-Z]/);   // all english

         var patternEmail = new RegExp(/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i);
         
         var patternEngAtListOne = new RegExp(/[a-zA-Z]+/);// + for at least one
         var patternSpeAtListOne = new RegExp(/[~!@#$%^&*()_+|<>?:{}]+/);// + for at least one
         var patternNumAtListOne = new RegExp(/[0-9]+/);// + for at least one
         
         //userName
         var userNameValue = $("#userName").val();
         var userNameLength = userNameValue.length;
         
         if( userNameLength > 0 ){
            isUserNameValid = true;
         }
         
         if( isUserNameValid ){
            $("#userName").removeClass("is-invalid");
         }else{
            $("#userName").addClass("is-invalid");
         }
         
         //userEmail
         var userEmailValue = $("#userEmail").val();
         var userEmailLength = userEmailValue.length;
         
         if( patternEmail.test( userEmailValue ) ){
            isUserEmailValid = true;
         }
         
         if( isUserEmailValid ){
            $("#userEmail").removeClass("is-invalid");
         }else{
            $("#userEmail").addClass("is-invalid");
         }
         
         //password
         
         var userPasswordValue = $("#userPassword").val();
         var userPasswordLength = userPasswordValue.length;
         
         var userPassword2Value = $("#userPassword2").val();
         //var password2Length = password2Value.length; // no need
         
         if( patternEngAtListOne.test( userPasswordValue ) 
               && patternSpeAtListOne.test( userPasswordValue )  
               && patternNumAtListOne.test( userPasswordValue )){
            isUserPasswordValid = true;
         }else if( userPasswordLength >= 10 ){
            isUserPasswordValid = true;
         }
         
         if( isUserPasswordValid ){
            $("#userPassword").removeClass("is-invalid");
         }else{
            $("#userPassword").addClass("is-invalid");
         }
         
         //password confirm
         console.log(userPasswordValue);
         console.log(userPassword2Value);
         if( userPasswordValue = userPassword2Value ){
            isUserPassword2Valid = true;
         }
         
         if( isUserPassword2Valid ){
            $("#userPassword2").removeClass("is-invalid");
         }else{
            $("#userPassword2").addClass("is-invalid");
         }
         
         
         if(   isUserNameValid && isUserEmailValid && isUserPasswordValid && isUserPassword2Valid ){
            return true;
         }else{
            return false;
         }
      }
      
      function sendReqeust(){
         $.ajax(
         {
              type : 'post',
              url : '/user',
              dataType : 'json',
              data : 
            {
               userName: $("#userName").val(),
               userEmail: $("#userEmail").val(),
               userPassword: $("#userPassword").val(),
            },
              beforeSend : function(xhr){
                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
                  xhr.setRequestHeader("AJAX", true);
              },
              success : function(data, status, xhr) { // alertify or another welcome page 이동
                 alertify.alert(
                        
                       '회원가입을 축하합니다. 로그인 페이지로 이동합니다', 
                       function(){ 
                          window.location.href="/login";
                       })
              }, 
              error: function(jqXHR, textStatus, errorThrown) 
              { 
                 alertify.notify(
                       'Opps!! 회원가입에 문제가 생겼습니다.', 
                       'error', //'error','warning','message'
                       3, //-1
                       function(){
                          console.log(jqXHR.responseText); 
                       }
                    );
              }
          });
         
//            $.post("/user",
//            {
//               userName: $("#userName").val(),
//               userEmail: $("#userEmail").val(),
//               userPassword: $("#userPassword").val(),
//            },
//            function(data, status){
//               console.log("Data: " + data + "\nStatus: " + status);
//            });
      }
   </script>
</body>
</html>