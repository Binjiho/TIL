<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.Binjiho.myapp.dto.*"%>

<%
	UserDto userDto = (UserDto)session.getAttribute("userDto");
	String userName = "";
	if(userDto != null){
		System.out.println(userDto.getUserSeq());
		userName = userDto.getUserName();
	}

%>
<script
	src="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/alertify.min.js"></script>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/alertify.min.css" />
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/alertifyjs@1.12.0/build/css/themes/default.min.css" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" href="/resources/images/favicon.png"
	type="image/x-icon" />
<!-- Theme tittle -->
<title>Crf Charity | Html Template</title>

<!-- Theme style CSS -->
<link href="/resources/css/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

	
</head>
<body>

	<div class="header">
		<!-- Header Top Area -->
		<div class="top_header_area">
			<div class="container">
				<div class="header_top_inner row">
					<div class="left_menu col-lg-6">
						<ul class="right_nav">
							<li><a href="index.html"><img
									src="/resources/images/logo.png" alt=""></a></li>
							<li><a href="#" class="help">Need help</a></li>
							<li>Explore The Crowd hope</li>
						</ul>
					</div>
					<div class="col-lg-6">
						<ul class="header_social">
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
							<li><a href="#"><i class="fa fa-vine"></i></a></li>
							
							<li><a href="#" class="call_support">010-5336-5012 <i
									class="flaticon-phone"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- Header Top Area -->

		<!-- Header Area -->
		<header class="main_header_area">
			<div class="container">
				<div class="header_menu">
					<nav class="navbar navbar-expand-lg">
						<!-- Small Divice Menu-->
						<button class="navbar-toggler" type="button"
							data-toggle="collapse" data-target=".navbar_supported"
							aria-expanded="false" aria-label="Toggle navigation">
							<i class="fa fa-bars" aria-hidden="true"></i>
						</button>

						<div class="collapse navbar-collapse navbar_supported">
                        <ul class="navbar-nav"> 
                            <li class="dropdown">
                                <a class="nav-link dropdown-toggle active" href="/" class="active" role="button"  aria-expanded="false">Home</a>
                       
                            </li>  
                           
  
                             <li class="dropdown">
                                <a class="nav-link dropdown-toggle" href="volunteer" class="active" role="button" aria-expanded="false">Volunteer</a>
                
                            </li>
                              
                            <li class="dropdown">
                                <a class="nav-link dropdown-toggle" href="charity" class="active" role="button" aria-expanded="false">Charity</a>
                                
                            </li> 
                            <li class="dropdown">
                                <a class="nav-link dropdown-toggle" href="gallery" class="active" role="button" aria-expanded="false">Gallery</a>
                                
                            </li>
                            
                            <li class="dropdown">
                                <a class="nav-link dropdown-toggle" href="cardforkid" class="active" role="button" aria-expanded="false">CardForKid</a>
                                
                            </li> 
                             
                           
                        </ul> 
                    </div>
                </nav> 
					<ul class="search_button_content nav">
						<li><a href="#" class="shop"><i class="flaticon-shopper"></i>
								<span>0</span></a></li>
						<li class="dropdown search_dropbown"><a
							class="nav-link dropdown-toggle" href="" role="button"
							data-toggle="dropdown" aria-expanded="false"><i
								class="fa fa-search"></i></a>
							<ul class="dropdown-menu">
								<li><input type="text" placeholder="Search.."> <span><i
										class="fa fa-search"></i></span></li>
							</ul></li>
					
					</ul>
				</div>
			</div>
		</header>
	</div>
	<!-- Header Area -->

	<!-- Banner Area -->
	<div class=""><img src="/resources/images/kite.jpg" alt="">
		
	</div>

	<!-- Charity and into the communities -->
	<section class="charity_communities">
		<div class="container">
			<div class="content">
				<hr>
				<h4>About Croudhelp</h4>
				<h2>
					Our mission extends beyond the Charity and into the communities
					that <br>we serve.
				</h2>
				<a href="#" class="theme_btn">Donation Now</a>
				<div class="row">
					<p class="col-lg-7 b_p">We are Crowdhope / non-profit/
						fundraising/ NGO organizations. Our justgiving activities are
						taken place around the world,let contribute to them with us by
						your hand to be a better life.</p>
					<p class="col-lg-5 small_p">Crowdhope founded 25 years ago as
						the American Institute of Philanthropy (AIP), is America's most
						independent, asser-tive charity watchdog. CharityWatch does not
						merely repeat what a charity reports using simplistic or automated
						formulas.</p>
				</div>
			</div>
			<!-- 게시판 -->
			<div class="">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>BOARD NUM</th>
							<th>NAME</th>
							<th>TITLE</th>
							<th>CONTENT</th>
						</tr>
					</thead>
					
					<tbody id="boardTbody">
						<tr>
							<td>url</td>
							<td>빈지호</td>
							<td>성북구 봉사</td>
							<td>결손아동급식주기</td>
						</tr>
						
					</tbody>
				</table>
				<div id="paginationWrapper">
				
				</div>

				<div class="container">

					<!-- Button to Open the Modal -->
					<button type="button" class="btn pull left btn-primary"
						data-toggle="modal" data-target="#myModal">글쓰기</button>

					<!-- Modal Insert -->
					<div class="modal" id="myModal" style="z-index:999999;">
						<div class="modal-dialog-centered">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Modal Heading</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>

								</div>

								<!-- Modal body -->
								<div class="modal-body">
									<div class="row">
										
										<div class="col-xl-12 form-group">
											<input id="titleInsert" type="text" class=" form-control"
												name="title" placeholder="제목">
										</div>
										<div class="col-xl-12 form-group">
											<textarea id="contentInsert" class="form-control" rows="5"
												placeholder="내용"></textarea>
										</div>
										<div class="col-xl-12 form-group">
											<button id="btnBoardInsert"
												class="btn btn-sm btn-primary btn-outline"
												data-dismiss="modal" type="button">등록</button>
										</div>
									</div>


									<!-- Modal footer -->
								<!-- 	<div class="modal-footer">
										<button type="button" class="btn btn-danger"
											data-dismiss="modal">Close</button>
									</div> -->

								</div>
							</div>
						</div>
					</div>
						</div>
			</div>
			</section>
					<!-- Modal End -->
					
					<!--Detail Modal-->
            <div class="modal" id="boardDetailModal" style="z-index:999999;" aria-hidden="false" aria-labelledby="boardDetailModalTitle" role="dialog" tabindex="-1">
               <div class="modal-dialog-centered modal-simple">
                  <form class="modal-content">
                     <div class="modal-header">
                        <h4 class="modal-title" id="boardDetailModalTitle" id="">글 상세</h4>
                        <!-- 
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                           <span aria-hidden="true">×</span>
                        </button>
                        -->
                         <button type="button" class="close" data-dismiss="modal">&times;</button>
                     </div>
                     
                     <div class="modal-body">
                     
		                  <div class="example table-responsive">
		                    <table class="table table-hover">
		                      <tbody>
		                        <tr><td>글번호</td><td id="boardIdDetail">#</td></tr>
		                        <tr><td>제목</td><td id="titleDetail">#</td></tr>
		                        <tr><td>내용</td><td id="contentDetail">#</td></tr>
		                        <tr><td>작성자</td><td id="userNameDetail">#</td></tr>
		                        <tr><td>작성일시</td><td id="regDtDetail">#</td></tr>
		                        <tr><td>조회수</td><td id="readCountDetail">#</td></tr>
		                      </tbody>
		                    </table>
		                  </div>
                        <button id="btnBoardUpdateForm" class="btn btn-sm btn-primary btn-outline" data-dismiss="modal" type="button" data-target="modificationModal">글 수정하기</button>
                        <button id="btnBoardDeleteConfirm" class="btn btn-sm btn-warning btn-outline" data-dismiss="modal" type="button">글 삭제하기</button>
                        <button id="btnBoardCommentForm" class="btn btn-sm btn-info" type="button">덧글 쓰기</button>
                     </div>
                  </form>
               </div>
            </div>
            <!-- End Modal -->
            
			<!-- Modification Modal -->
			<div class="container">

					<!-- The Modal -->
					<div class="modal" id="boardUpdateModal" style="z-index:999999;">
						<div class="modal-dialog-centered">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">수정 내용</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>

								</div>

								<!-- Modal body -->
								<div class="modal-body">
									<div class="row">
										
										<div class="col-xl-12 form-group">
											<input id="titleUpdate" type="text" class=" form-control"
												name="title" placeholder="제목">
										</div>
										<div class="col-xl-12 form-group">
											<textarea id="contentUpdate" class="form-control" rows="5"
												placeholder="내용"></textarea>
										</div>
										<div class="col-xl-12 form-group">
											<button id="btnBoardUpdate"
												class="btn btn-sm btn-primary btn-outline"
												data-dismiss="modal" type="button">크리스탈 수정 </button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>			
			
	


	<!-- Charity and into the communities -->

	<!-- Meet Our Team -->
	<section class="our_team">
		<div class="container">
			<div class="tittle">
				<h2>Meet Our Team</h2>
				<p>Charity, volunteer for better life and our smiles.</p>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6 team">
					<div class="team_img">
						<img src="/resources/images/박지호.jpg" alt="">
					</div>
					<a href="#">BIN JIHO</a>
					<h6>CEO</h6>
				</div>
				<div class="col-lg-3 col-sm-6 team">
					<div class="team_img">
						<img src="/resources/images/변종협.jpg" alt="">
					</div>
					<a href="#">JONG HYOUP</a>
					<h6>Support Staff</h6>
				</div>
				<div class="col-lg-3 col-sm-6 team">
					<div class="team_img">
						<img src="/resources/images/김영수.jpg" alt="">
					</div>
					<a href="#">YOUNG SOO</a>
					<h6>Support Staff</h6>
				</div>
				<div class="col-lg-3 col-sm-6 team">
					<div class="team_img">
						<img src="/resources/images/서우현.jpg" alt="">
					</div>
					<a href="#">WOO HYUN</a>
					<h6>Volunteer</h6>
				</div>
			</div>
		</div>
	</section>
	<!-- Meet Our Team -->

	<!-- Counter Area -->
	<div class="container">
		<div class="become_inner">
			<h3>BECOME A PROUD VOLUNTEER</h3>
			<p>Join your hand with us for a better life and beautiful future.
				Save The Life To Make The Better World</p>
			<a href="#" class="theme_btn">Join Us Now</a>
		</div>
	</div>
	<!-- Counter Area -->

	<!-- Counter Area -->
	<section class="counter_area">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="consultants">
						<div class="icons">
							<img src="/resources/images/people.png" alt="">
						</div>
						<h4>VOLUNTEERS</h4>
						<h2 class="counter">350</h2>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="consultants">
						<div class="icons">
							<img src="/resources/images/human.png" alt="">
						</div>
						<h4>DONORS</h4>
						<h2 class="counter">1563</h2>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="consultants">
						<div class="icons">
							<img src="/resources/images/heartbeat.png" alt="">
						</div>
						<h4>People Save</h4>
						<h2>
							<span class="counter">700</span>K
						</h2>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="consultants">
						<div class="icons">
							<img src="/resources/images/money.png" alt="">
						</div>
						<h4>DONATED</h4>
						<h2>
							<span class="counter">945</span>K
						</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Counter Area -->

	<!--  Crowdhope Charity -->
	<section class="crowdhope_charity cc_3">
		<div class="container">
			<h2>Our mission is to make them feel safe, explore the Crowdhope
				Charity</h2>
			<div class="row">
				<div class="col-lg-6">
					<img src="/resources/images/love-2.png" alt="">
				</div>
				<div class="col-lg-6">
					<form class="mission_from row">
						<div class="col-12">
							<h3>We are experts in Crowdhope services and solutions</h3>
						</div>
						<div class="form-group col-md-6">
							<select class="post_select">
								<option>How can we help</option>
								<option>Crowdhope services</option>
								<option>Services and solutions</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<input type="text" class="form-control" name="name"
								placeholder="Name">
						</div>
						<div class="form-group col-md-6">
							<input type="text" class="form-control" name="phone"
								placeholder="Phone">
						</div>
						<div class="form-group col-md-6">
							<input type="email" class="form-control" name="email"
								placeholder="Email">
						</div>
						<div class="form-group col-12">
							<button class="theme_btn" type="submit">Submit Request</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!--  Crowdhope Charity -->

	<!-- Testimonial Area -->
	<section class="testimonial_area">
		<div class="container">
			<div class="owl-carousel testimonial_slide">
				<!-- item -->
				<div class="item">
					<div class="media">
						<img src="/resources/images/testimonial-1.jpg" alt="">
						<div class="media-body">
							<a href="#">Er Misu</a>
							<h6>CEO Company</h6>
						</div>
					</div>
					<div class="t_text">
						<p>Everything we do centres on protecting you and your
							business from risk ,Peace of mind so you can focus on what’s
							important</p>
					</div>
				</div>
				<!-- item -->
				<div class="item">
					<div class="media">
						<img src="/resources/images/testimonial-2.jpg" alt="">
						<div class="media-body">
							<a href="#">Mafuz Riad</a>
							<h6>Health Care charity</h6>
						</div>
					</div>
					<div class="t_text">
						<p>Everything we do centres on protecting you and your
							business from risk ,Peace of mind so you can focus on what’s
							important</p>
					</div>
				</div>
				<!-- item -->
				<div class="item">
					<div class="media">
						<img src="images/testimonial-3.jpg" alt="">
						<div class="media-body">
							<a href="#">Emran Khan</a>
							<h6>CEO Company</h6>
						</div>
					</div>
					<div class="t_text">
						<p>Everything we do centres on protecting you and your
							business from risk ,Peace of mind so you can focus on what’s
							important</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Testimonial Area -->

	<!-- Customers_more Area -->
	<section class="customers_more cm_2">
		<div class="container">
			<h3>Join 100,000+ people raising money for personal causes on
				Crowdhelp</h3>
			<a href="#" class="theme_btn">Donation Now</a>
		</div>
	</section>
	<!-- End Customers_more Area -->

	<!-- Footer Area -->
	<footer class="footer_area">
		<div class="container">
			<div class="footer_inner row">
				<div class="col-lg-4 col-md-6 footer_logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>
					<p>The Crowdhope charity provides enhanced services over and
						above what the NHS funds. help child</p>
					<ul class="footer_social">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-google"></i></a></li>
						<li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					</ul>
					<a href="#" class="request_btn">Request a free quote <i
						class="fa fa-arrow-right"></i></a>
				</div>
				<ul class="col-lg-4 col-md-6 campaign">
					<li><a href="#">Campaign For Build Diamond Future Orphan</a></li>
					<li><a href="#">New Award To Support Children Affected by
							Crises</a></li>
					<li><a href="#">The right employers' liability insur-ance
							for restaurant owners</a></li>
				</ul>
				<div class="col-lg-4 col-md-6">
					<div class="quick_contact">
						<h4>Quick Contact</h4>
						<div class="media">
							<img src="images/newsletter.png" alt="">
							<div class="media-body">
								<h6>Email:</h6>
								<a href="info@yoursite.com">info@yoursite.com</a>
							</div>
						</div>
						<div class="media m-0">
							<img src="images/phone.png" alt="">
							<div class="media-body">
								<a href="#" class="phone_no">+880 - 1234567890</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row footer_menu">
				<ul class="footer_nav col-lg-8">
					<li><a href="#">Charity </a></li>
					<li><a href="#">Term &amp; Conditions</a></li>
					<li><a href="#">FIND AN AGENT</a></li>
					<li><a href="#">PAGES</a></li>
					<li><a href="contact.html">CONTACTS</a></li>
				</ul>
				<div class="col-lg-4">
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Enter Your Email Address">
						<div class="input-group-append">
							<span class="input-group-text"><i
								class="fa fa-paper-plane-o"></i></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="copy_right">
			<p>
				<a href="#">Crowdhope</a> © 2019 All Rights Reserved Terms of Use
				and Privacy Policy
			</p>
		</div>
	</footer>
	<!-- End Footer Area -->

	<!-- Scroll Top Button -->
	<button class="scroll-top">
		<i class="fa fa-angle-double-up"></i>
	</button>

	<!-- Preloader -->
	<div id="preloader"></div>

	
	<!-- Bootstrap v4.0.0 -->
	<script src="/resources/js/popper.min.js"></script>
	
	<!-- Extra Plugin -->
	<script src="/resources/vendors/animate-css/wow.min.js"></script>
	<script
		src="/resources/vendors/magnify-popup/jquery.magnific-popup.min.js"></script>
	<script src="/resources/vendors/counterup/jquery.waypoints.min.js"></script>
	<script src="/resources/vendors/counterup/jquery.counterup.min.js"></script>
	
	<script src="/resources/vendors/circular-progress/pie-chart.js"></script>
	<script src="/resources/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script
		src="/resources/vendors/bootstrap-selector/jquery.nice-select.min.js"></script>

	<!-- Theme js / Custom js -->
	<script src="/resources/js/theme.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/util.js"></script>
	<script>
	   var LIST_ROW_COUNT = 10;   //limit
	   var OFFSET = 0;
	   var PAGE_COUNT_PER_BLOCK = 10;   // pagination link 갯수
	   var TOTAL_LIST_ITEM_COUNT = 0;
	   var CURRENT_PAGE_INDEX = 1;
     
     $(document).ready(function(){
     	
    	 boardList();
    	 
     	$("#btnBoardInsert").click(function(){
     		//console.log("click");
     		
     		if(validate()){
     			 boardInsert();
     			 
     		}
     	});
     	
     	 $("#btnBoardUpdateForm").click(function(){
        	 var boardId = $("#boardDetailModal").attr("data-boardId");
        	 $("#boardUpdateModal").attr("data-boardId",boardId);
        	 
        	 $("#titleUpdate").val($("#titleDetail").html());
        	 $("#contentUpdate").val($("#contentDetail").html());
    		
        	 $("#boardDetailModal").modal("hide");
        	 $("#boardUpdateModal").modal("show");
         });
         
         $("#btnBoardUpdate").click(function(){
        	 console.log("유효성 검사")
        	 if( validateUpdate() ){
        		 console.log("유효함, 수정시도")
        		 boardUpdate();
        		 
        	 }
         });
         $("#btnBoardDeleteConfirm").click(function(){
        	 console.log("삭제 유효성 검사")
        	 alertify.confirm(
        			 'Binjiho',
        			 '이 글을 삭제하시겠습니까?',
        			 function(){
        				 boardDelete();
        			 },
        			 function(){
        				 console.log('cancel');
        			 }
        	 
        		);
         });
     }); 		 
     	
     function validate(){
     	var isTitleValid = false;
     	var isContentValid = false;
     	
     	var title = $("#titleInsert").val();
     	var titleLength = title.length;
     	
     	if( titleLength > 0){
     		console.log(isTitleValid);
     		isTitleValid = true;
     	}	
     	
     	var contentValue = $("#contentInsert").val();
     	var contentLength = contentValue.length;
     	
     	if( contentLength > 0){
     		isContentValid = true;
     	}
     	
     	console.log(isTitleValid);
     	
     	if(   isContentValid && isTitleValid ){
            return true;
         }else{
            return false;
         }
      }
     
     function validateUpdate(){
      	var isTitleValid = false;
      	var isContentValid = false;
      	
      	var title = $("#titleUpdate").val();
      	var titleLength = title.length;
      	
      	console.log(title);
      	
      	
      	if( titleLength > 0){
      		console.log(isTitleValid);
      		isTitleValid = true;
      	}	
      	
      	var contentValue = $("#contentUpdate").val();
      	var contentLength = contentValue.length;
      	
      	if( contentLength > 0){
      		isContentValid = true;
      	}
      	
      	console.log(isTitleValid);
      	
      	if(   isContentValid && isTitleValid ){
             return true;
          }else{
             return false;
          }
       }
     
     function boardInsert(){
    	 $.ajax(
         {
              type : 'post',
              url : '/board/insert',
              dataType : 'json',
              data : 
            {
               userSeq: '<%=userDto.getUserSeq()%>',
               userName: '<%=userDto.getUserName()%>',
               title: $("#titleInsert").val(),
               content: $("#contentInsert").val(),
            },
              beforeSend : function(xhr){
                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
                  xhr.setRequestHeader("AJAX", true);
              },
              success : function(data, status, xhr) { // alertify or another welcome page 이동
                 
                 if( data ){
                    alertify.success('글이 등록되었습니다.');
                    boardList();
                 	}
              },
              error: function(jqXHR, textStatus, errorThrown) 
              { 
            	  if( jqXHR.responseText == "timeout" ){
                 	 window.location.href="/user/login2"
                  }else{
                 	 alertify.notify(
                 			 'oops!! 게시물 작성 과정에 문제가 생겼습니다.',
                 			 'error',
                 			 3,
                 			 function(){
                 				 console.log(jqXHR.responseText);
                 			 });
               		}
           		}
          });
     }
     
     function boardList(){
    	 $.ajax(
         {
              type : 'get',
              url : '/board/list',
              dataType : 'json',
              data : 
            {
               limit: LIST_ROW_COUNT,
               offset: OFFSET
            },
              beforeSend : function(xhr){
                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
                  xhr.setRequestHeader("AJAX", true);
              },
              success : function(data, status, xhr) { // alertify or another welcome page 이동
                 
                 makeListHtml(data);
              },
              error: function(jqXHR, textStatus, errorThrown) 
              { 
                 if( jqXHR.responseText == "timeout" ){
                	 window.location.href="/user/login2"
                 }else{
                	 alertify.notify(
                			 'oops!! 글 조회 과정에 문제가 생겼습니다.',
                			 'error',
                			 3,
                			 function(){
                				 console.log(jqXHR.responseText);
                			 });
              		}
          		}
         });
     }
     
     function makeListHtml(list){
    	 
		$("#boardTbody").html("");
		  //var boardArray = JSON.parse(data); ?? @ResponseBody 자동으로 json 변환
	
		for( var i=0; i<list.length;i++){
			
			var boardId = list[i].boardId;
			var userName = list[i].userName;
			var title = list[i].title;
			var content = list[i].content;
			var regDt = list[i].regDt;
			var readCount = list[i].readCount;
		
			var listHtml =
	            '<tr style="cursor:pointer" data-boardId=' + boardId +'><td>' + boardId + '</td><td>' + userName + '</td><td>' + title + '</td><td>' + content + '</td><td>';
	
	         $("#boardTbody").append(listHtml);
	      }
	      
	      makeListHtmlEventHandler();
	      
	      boardListTotalCnt();
	   }
     
     function addPagination(){

         makePaginationHtml(LIST_ROW_COUNT, PAGE_COUNT_PER_BLOCK, CURRENT_PAGE_INDEX, TOTAL_LIST_ITEM_COUNT, "paginationWrapper", boardList );
      }
     
     function movePage(pageIndex){
         OFFSET = (pageIndex - 1) * LIST_ROW_COUNT;
         CURRENT_PAGE_INDEX = pageIndex;
         boardList();
      }
     
     function makeListHtmlEventHandler(){
    	 $("#boardTbody tr").click(function(){
    		 var boardId = $(this).attr("data-boardId")
    		 boardDetail(boardId);
    		 //alert(boardId);
    	 });
     }
     
     function boardDetail(boardId){
    	 <!--
    	 $("#boardDetailModal").modal("show");
    	 -->
    	 $.ajax(
    	         {
    	              type : 'get',
    	              url : '/board/detail',
    	              dataType : 'json',
    	              data : 
    	            {
    	               boardId: boardId
    	            },
    	              beforeSend : function(xhr){
    	                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
    	                  xhr.setRequestHeader("AJAX", true);
    	              },
    	              success : function(data, status, xhr) { // alertify or another welcome page 이동
    	                 
    	                 makeDetailHtml(data);
    	              },
    	              error: function(jqXHR, textStatus, errorThrown) 
    	              { 
    	                 if( jqXHR.responseText == "timeout" ){
    	                	 window.location.href="/user/login2"
    	                 }else{
    	                	 alertify.notify(
    	                			 'oops!! 글 조회 과정에 문제가 생겼습니다.',
    	                			 'error',
    	                			 3,
    	                			 function(){
    	                				 console.log(jqXHR.responseText);
    	                			 });
    	              		}
    	          		}
    	         });
     }
		
     function makeDetailHtml(detail){
    	 
 			var boardId = detail.boardId;
 			var userSeq = detail.userSeq;
 			var userName = detail.userName;
 			var title = detail.title;
 			var content = detail.content;
 			var regDt = detail.regDt;
 			var readCount = detail.readCount;

 			$("#boardDetailModal").attr("data-boardId",boardId);
 			$("#boardIdDetail").html(boardId);
 			$("#titleDetail").html(title);
 			$("#contentDetail").html(content);
 			$("#userNameDetail").html(userName);
 			$("#regDtDetail").html(regDt);
 			$("#readCountDetail").html(readCount);
 			
 			if(userSeq != '<%=userDto.getUserSeq()%>' ){
 				$("#btnBoardUpdateForm").hide();
 				$("#btnBoardDeleteConfirm").hide();
 			}else{
 				$("#btnBoardUpdateForm").show();
 				$("#btnBoardDeleteConfirm").show();
 			}
 			
 			$("#boardDetailModal").modal("show");
 			
 			//makeDetailHtmlEventHandler();
 			
 	      }
     
     function boardUpdate(){
    	 $.ajax(
    	         {
    	              type : 'post',
    	              url : '/board/update',
    	              dataType : 'json',
    	              data : 
    	            {
    	               boardId: $("#boardUpdateModal").attr("data-boardId"),
    	               title: $("#titleUpdate").val(),
    	               content: $("#contentUpdate").val()
    	            },
    	              beforeSend : function(xhr){
    	                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
    	                  xhr.setRequestHeader("AJAX", true);
    	              },
    	              success : function(data, status, xhr) { // alertify or another welcome page 이동
    	                 
    	            	  if(data){
    	            		  alertify.success('글이 수정되었습니다.')
    	            		  boardList();
    	            	  }
    	                 
    	              },
    	              error: function(jqXHR, textStatus, errorThrown) 
    	              { 
    	                 if( jqXHR.responseText == "timeout" ){
    	                	 window.location.href="/user/login2"
    	                 }else{
    	                	 alertify.notify(
    	                			 'oops!! 글 수정 과정에 문제가 생겼습니다.',
    	                			 'error',
    	                			 3,
    	                			 function(){
    	                				 console.log(jqXHR.responseText);
    	                			 });
    	              		}
    	          		}
    	         });
     }
     
     function boardDelete(){
    	 $.ajax(
    	         {
    	              type : 'post',
    	              url : '/board/delete',
    	              dataType : 'json',
    	              data : 
    	            {
    	               boardId: $("#boardDetailModal").attr("data-boardId"),
 	  	            },
    	              beforeSend : function(xhr){
    	                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
    	                  xhr.setRequestHeader("AJAX", true);
    	              },
    	              success : function(data, status, xhr) { // alertify or another welcome page 이동
    	                 
    	            	  if(data){
    	            		  alertify.success('글이 삭제되었습니다.')
    	            		  boardList();
    	            	  }
    	                 
    	              },
    	              error: function(jqXHR, textStatus, errorThrown) 
    	              { 
    	                 if( jqXHR.responseText == "timeout" ){
    	                	 window.location.href="/user/login2"
    	                 }else{
    	                	 alertify.notify(
    	                			 'oops!! 글 삭제 과정에 문제가 생겼습니다.',
    	                			 'error',
    	                			 3,
    	                			 function(){
    	                				 console.log(jqXHR.responseText);
    	                			 });
    	              		}
    	          		}
    	         });
     }
     
     function boardListTotalCnt(){
         
         $.ajax(
         {
              type : 'get',
              url : '/board/list/totalCnt',
              dataType : 'json',
              beforeSend : function(xhr){
                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
                  xhr.setRequestHeader("AJAX", true);
              },
              success : function(data, status, xhr) {
                 TOTAL_LIST_ITEM_COUNT = data;
                 addPagination();
              }, 
              error: function(jqXHR, textStatus, errorThrown) 
              { 
                 if( jqXHR.responseText == "timeout" ){
                    window.location.href = "/login"
                 }else{
                    alertify.notify(
                        'Opps!! 글 전체 갯수 조회 과정에 문제가 생겼습니다.', 
                        'error', //'error','warning','message'
                        3, //-1
                        function(){
                           console.log(jqXHR.responseText); 
                        }
                     );
                 }
              }
          });
      }
     
  
     
    
     	
     </script>
</body>
</html>