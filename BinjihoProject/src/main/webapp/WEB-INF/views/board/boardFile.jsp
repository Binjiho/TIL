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
<title>BoardFile</title>

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
							<li>Share Hope</li>
						</ul>
					</div>
					<div class="col-lg-6">
						<ul class="header_social">
							
							
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
								<li class="dropdown"><a
									class="nav-link dropdown-toggle active" href="/" class="active"
									role="button" aria-expanded="false">Home</a></li>


								<li class="dropdown"><a class="nav-link dropdown-toggle"
									href="volunteer" class="active" role="button"
									aria-expanded="false">Volunteer</a></li>

								<li class="dropdown"><a class="nav-link dropdown-toggle"
									href="charity" class="active" role="button"
									aria-expanded="false">Charity</a></li>
								<li class="dropdown"><a class="nav-link dropdown-toggle"
									href="gallery" class="active" role="button"
									aria-expanded="false">Gallery</a></li>
									
									<li class="dropdown"><a class="nav-link dropdown-toggle"
									href="cardforkid" class="active" role="button"
									aria-expanded="false">CardForKid</a></li>
								

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
	<div class=""><img src="/resources/images/desk.jpg" alt="">
		
	</div>

	<!-- Charity and into the communities -->
	<section class="charity_communities">
		<div class="container">
			<div class="content">
				<hr>
				<h4>About Volunteer</h4>
				<h2>
					나는 자원봉사자 입니다. <br>
				</h2>
				
				<div class="row">
					<p class="col-lg-7 b_p">나는 우리 각자에게 지문만큼 고유한 개인적 소망이 있고,
					성공하는 최선의 방법은 자신이 사랑하는 것을 발견한, 열심히 일하고, 우주의 에너지가 자신을 인도하도록
					내맡기는 가운데, 자신이 사랑하는 것을 봉사의 형태로 타인들에게 내어주는 방법을 찾는 것이라고 믿게되었다.</p>
					<p class="col-lg-5 small_p"><오프라 윈프리></p>
				</div>
			</div>
			
			<div class="form-group">
                 <div class="input-group">
                      <input type="text" id="inputSearchWord" class="form-control" name="" placeholder="제목에서 검색합니다. 검색어를 입력하세요.">
                      <span class="input-group-append ">
                        <button id="btnSearchWord" class="btn btn-search"><i class="fa fa-search fa-fw" aria-hidden="true"></i> Search</button>
                      </span>
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
				<div id="paginationWrapper"></div>
				<!--  
				<div><button class="btn btn-sm btn-primary" id="btnBoardInsertForm">글쓰기</button></div>
				-->
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
									<h4 class="modal-title">게시글 생성</h4>
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
										  <div class="custom-control custom-checkbox">
										    <input type="checkbox" class="custom-control-input" id="chkFileUploadInsert" name="example1">
										    <label class="custom-control-label" for="chkFileUploadInsert">파일 추가</label>
										  </div>									
										</div>
										
										<div class="col-xl-12 form-group" style="display:none;" id="imgFileUploadInsertWrapper">
			                              <input type="file" id="inputFileUploadInsert">
			                              <div class="thumbnail-wrapper">
			                              <img id="imgFileUploadInsert">
                                    	</div>
                                    	
                                    	<div class="col-xl-12 form-group">
                                    	<button id="btnBoardInsert"
		                                    class="btn btn-sm btn-primary btn-outline"
		                                    data-dismiss="modal" type="button">등록</button>
                                    	</div>
                           			</div>
								</div>

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
		                        <tr><td>첨부파일</td><td id="fileListDetail">#</td></tr>
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
							                              첨부파일 : <span id="fileListUpdate"></span>
			                           </div>
			                           <div class="col-xl-12 form-group">
			                              <div class="checkbox-custom checkbox-primary">
			                                      <input type="checkbox" id="chkFileUploadUpdate" />
			                                      <label for="chkFileUploadUpdate">파일 변경</label>
			                                    </div>
			                           </div>
			                           <div class="col-xl-12 form-group" style="display:none;" id="imgFileUploadUpdateWrapper">
			                              <input type="file" id="inputFileUploadUpdate">
			                              <div class="thumbnail-wrapper">
			                                      <img id="imgFileUploadUpdate">
			                              </div>
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


    <!-- UPCOMING	EVENTS --> 
    <section class="upcoming_event ue_2">
    	<div class="container">
    		<div class="tittle">
    			<h2>UPCOMING EVENTS</h2>
    			<p>The Justgiving charity provides enhanced services over and above what the NHS funds. Our upcoming event</p>
    		</div>
    		<div class="row">
    			<div class="col-xl-6 event_b">
    				<img src="/resources/images/5851.jpg" alt="">
    				<div class="event media  wow fadeInUp">
    					<h2><b>21</b>July 2019</h2>
    					<div class="media-body">
    						<h6>START: JUL 18, 2019 <span>END: JUL 18, 2019</span></h6>
    						<a href="#">Fundraising as a team in the workplace </a>
    					</div>
    				</div>
    			</div> 
    			<div class="col-xl-6 event_b">
    				<img src="/resources/images/5852.jpg" alt="">
    				<div class="event media  wow fadeInUp">
    					<h2><b>13</b>July 2019</h2>
    					<div class="media-body">
    						<h6>START: JUL 18, 2019 <span>END: JUL 18, 2019</span></h6>
    						<a href="#">Donor finding program for all globalization</a>
    					</div>
    				</div>
    			</div> 
    		</div>
    	</div>
    </section>
    <!-- UPCOMING	EVENTS --> 

	


	<!-- Counter Area -->


	<!--  Crowdhope Charity -->

	
	<!-- Testimonial Area -->


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
	<link rel="stylesheet" href="/resources/css/common.css">
	<script>
	   var LIST_ROW_COUNT = 5;   //limit
	   var OFFSET = 0;
	   var PAGE_COUNT_PER_BLOCK = 10;   // pagination link 갯수
	   var TOTAL_LIST_ITEM_COUNT = 0;
	   var CURRENT_PAGE_INDEX = 1;
	   
	   var SEARCH_WORD="";
     
     $(document).ready(function(){
     	
    	 boardList();
    	 
    	 $("#btnBoardInsertForm").click(function(){
             $("#titleInsert").val("");
             $("#contentInsert").val("");
             $("#chkFileUploadInsert").prop("checked", false);
             $("#inputFileUploadInsert").val("");
             $("#imgFileUploadInsert").removeAttr("src");
             //$("#imgFileUploadInsert").attr("src", "");
             $("#imgFileUploadInsertWrapper").hide();
             
             $("#boardInsertModal").modal("show");
          });
    	 
     	$("#btnBoardInsert").click(function(){
     		//console.log("click");
     		
     		if(validate()){
     			 boardInsert();
     			 
     		}
     	});
     	
     	//Update
        $("#chkFileUploadUpdate").change(function(){
           if( $(this).prop("checked")){
              $("#imgFileUploadUpdateWrapper").show();
           }else{
              $("#inputFileUploadUpdate").val("");
              $("#imgFileUploadUpdate").attr("src", "");
              $("#imgFileUploadUpdateWrapper").hide();
           }
        });
        
        $("#inputFileUploadUpdate").change(function(e){
		   console.log("업데이트 유효성 검사");
           if( this.files && this.files[0] ){
        	  console.log("업데이트 if문 돌파");
              var reader = new FileReader();
              reader.onload = function(e){
                 $("#imgFileUploadUpdate").attr("src", e.target.result);
              }
              reader.readAsDataURL(this.files[0]);
           }
        });
     	
     	 $("#btnBoardUpdateForm").click(function(){
        	 var boardId = $("#boardDetailModal").attr("data-boardId");
        	 $("#boardUpdateModal").attr("data-boardId",boardId);
        	 
        	 $("#titleUpdate").val($("#titleDetail").html());
        	 $("#contentUpdate").val($("#contentDetail").html());
        	 
        	 var fileName = $("#fileListDetail").find(".fileName").html();
             $("#fileListUpdate").html( '<span class="fileName">' + fileName + '</span>');
             
             $("#chkFileUploadUpdate").prop("checked", false);
             $("#inputFileUploadUpdate").val("");
             $("#imgFileUploadUpdate").attr("src", "");
             //$("#imgFileUploadUpdate").removeAttr("src");
             $("#imgFileUploadUpdateWrapper").hide();
    		
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
	     $("#chkFileUploadInsert").change(function(){
	         if( $(this).prop("checked")){
	            $("#imgFileUploadInsertWrapper").show();
	         }else{
	            $("#inputFileUploadInsert").val("");
	            $("#imgFileUploadInsert").attr("src", "");
	            $("#imgFileUploadInsertWrapper").hide();
	         }
	      });
	     $("#inputFileUploadInsert").change(function(e){

	         if( this.files && this.files[0] ){
	            var reader = new FileReader();
	            reader.onload = function(e){
	               $("#imgFileUploadInsert").attr("src", e.target.result);
	            }
	            reader.readAsDataURL(this.files[0]);
	         }
	      });
	     
	   //Search
	      $("#btnSearchWord").click(function(e){
	         var searchWord = $("#inputSearchWord").val();
	         
	         if( searchWord != "" ){
	            SEARCH_WORD = searchWord;
	         }else{
	            SEARCH_WORD = "";
	         }
	         
	         boardList();
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
         
         var formData = new FormData();
         formData.append("userSeq", '<%=userDto.getUserSeq()%>');
         formData.append("title", $("#titleInsert").val());
         formData.append("content", $("#contentInsert").val());
         formData.append("file", $("#inputFileUploadInsert")[0].files[0]);
         
         $.ajax(
         {
              type : 'post',
              url : '/board/insertFile',
              dataType : 'json',
              data : formData,
              contentType: false,   // forcing jQuery not to add a Content-Type header for you, otherwise, the boundary string will be missing from it
              processData: false, // otherwise, jQuery will try to convert your FormData into a string, which will fail.
              beforeSend : function(xhr){
                  //xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
                  xhr.setRequestHeader("AJAX", true);
              },
              success : function(data, status, xhr) { 
            
                 if( data ){
                    alertify.success('글이 등록되었습니다.');
                    boardList();
                 }
              }, 
              error: function(jqXHR, textStatus, errorThrown) 
              { 
                 if( jqXHR.responseText == "timeout" ){
                    window.location.href = "/login"
                 }else{
                    alertify.notify(
                           'Opps!! 글 등록 과정에 문제가 생겼습니다.', 
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
     
     function boardList(){
    	 $.ajax(
         {
              type : 'get',
              url : '/board/list',
              dataType : 'json',
              data : 
            {
               limit: LIST_ROW_COUNT,
               offset: OFFSET,
               searchWord: SEARCH_WORD
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
         var fileList = detail.fileList;
         console.log(fileList);
         
         $("#boardDetailModal").attr("data-boardId", boardId);
         $("#boardIdDetail").html(boardId);
         $("#titleDetail").html(title);
         $("#contentDetail").html(content);
         $("#userNameDetail").html(userName);
         $("#regDtDetail").html(regDt);
         $("#readCountDetail").html(readCount);
         
         //FileList
         $("#fileListDetail").html("");
         
         if( fileList.length > 0 ){
            for(var i=0; i<fileList.length; i++){
               var fileId = fileList[i].fileId;
               var fileName = fileList[i].fileName;
               var fileUrl = fileList[i].fileUrl;
               
               $("#fileListDetail").append(
                     '<span class="fileName">' + fileName + '</span>');
               $("#fileListDetail").append(
                     '&nbsp;&nbsp;<a type="button" class="btn btn-outline btn-default btn-xs" ' +
                     'data-fileId="' + fileId + '" ' +
                     'href="' + fileUrl + '" ' +
                     'download="' + fileName + '">내려받기</a>');
            }
         }
         
         if( userSeq != '<%=userDto.getUserSeq()%>' ){
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
              data:
            	  {
            	  searchWord: SEARCH_WORD
            	  },
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