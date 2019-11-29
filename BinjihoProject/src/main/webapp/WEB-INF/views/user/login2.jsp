<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script src="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/alertify.min.js"></script>
   <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/alertify.min.css"/>
   <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/themes/default.min.css"/>
<!------ Include the above in your HEAD tag ---------->

<!--  modal -->

 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
   <!--Made with love by Mutiullah Samim -->
   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="/resources/css/login2.css">
</head>
<body>


<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				<form method="post" role="form">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" id="userName" name="userName" class="form-control" placeholder="username">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="password">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						
					</div>
				</form>
				 <button id="btn_login" class="btn float-right login_btn">LOGIN</button>
				 <!--  
				<input type="submit" value="Login" class="btn float-right login_btn" id="btn_login">
				-->			
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="register">Sign Up</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>


<script>
   (function(document, window, $) {
      'use strict';

      var Site = window.Site;
      $(document).ready(function() {
        
         

         $("#btn_login").click(function(){
            
            if( validate() ){
               login();
            }
         });

      });
   })(document, window, jQuery);
   
   function validate(){
      var isUserNameValid = false;
      var isUserPasswordValid = false;
   
      var userNameValue = $("#userName").val();
      var userNameLength = userNameValue.length;
      
      if( userNameLength > 0 ){
         isUserNameValid = true;
      }
      
      var userPasswordValue = $("#userPassword").val();
      var userPasswordLength = userPasswordValue.length;
      
      if( userPasswordLength > 0 ){
         isUserPasswordValid = true;
      }

      if(   isUserNameValid && isUserPasswordValid ){
         return true;
      }else{
         return false;
      }
   }
   
   function login(){
      $.ajax(
      {
           type : 'post',
           url : '/login',
           dataType : 'json',
           data : 
         {
            userName: $("#userName").val(),
            userPassword: $("#userPassword").val(),
         },
           beforeSend : function(xhr){
               //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
               xhr.setRequestHeader("AJAX", true);
           },
           success : function(data, status, xhr) { // alertify or another welcome page 이동
              console.log(data);
              console.log(status);
              
              if( data ){
                 window.location.href="/";
                 
              }else{
                 alertify.notify(
                     'Opps!! 이메일 또는 비밀번호가 올바르지 않습니다.', 
                     'error', //'error','warning','message'
                     3
                  );
              }
           }, 
           error: function(jqXHR, textStatus, errorThrown) 
           { 
              console.log(jqXHR);
              console.log(textStatus);
              console.log(errorThrown);
              alertify.notify(
                 'Opps!! 로그인 과정에 문제가 생겼습니다.', 
                 'error', //'error','warning','message'
                 3, //-1
                 function(){
                    console.log(jqXHR.responseText); 
                 }
              );
           }
       });
   }
   </script>

</body>
</html>