<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="com.Binjiho.myapp.dto.*"%>
    
    <%
	UserDto userDto = (UserDto)session.getAttribute("userDto");
	String userName = "";
	int manager = 0;
	
	if(userDto != null){
		System.out.println(userDto.getUserSeq());
		userName = userDto.getUserName();
		manager = userDto.getManagerCode();
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

    <link rel="icon" href="/resources/images/favicon.png" type="image/x-icon" />
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
</head>
<body> 


	
   <div class="header">
    <!-- Header Top Area -->
    <div class="top_header_area"> 
        <div class="container">  
            <div class="header_top_inner row"> 
                <div class="left_menu col-lg-6"> 
                    <ul class="right_nav">
                       <li><a href="index.html"><img src="/resources/images/logo.png" alt=""></a></li>
                        <li><a href="#" class="help">Need help</a></li>  
                        <li>Explore The Crowd hope</li> 
                    </ul>
                </div> 
                <div class="col-lg-6"> 
                    <ul class="header_social"> 
                       
                        <li><a href="#" class="call_support">010-5336-5012 <i class="flaticon-phone"></i></a></li>
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
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".navbar_supported"  aria-expanded="false" aria-label="Toggle navigation"> 
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
           
           </div>
        </div>
    </header>
    </div>
    <!-- Header Area -->  
    
    <!-- Banner Area --> 
    <div class="pages_banner pb_3">
    	<div class="container"> 
    		<h2>Charity</h2>

    	</div>
    </div>
    <!-- Banner Area -->  
    
    <!-- charity 등록 -->
    				<br>
    				<div class="container">

					<!-- Button to Open the Modal -->
					<c:set var="manager" value="<%= manager %>" />
                       	 <c:if test="${manager != 0}">
                       		 <button type="button" class="btn pull left btn-primary"
								data-toggle="modal" data-target="#InsertStoryModal">사연 등록</button>
								
							<button type="button" class="btn pull left btn-primary"
								data-toggle="modal" data-target="#InsertStoryModal">사연 수정</button>
								
							<button type="button" class="btn pull left btn-primary"
								data-toggle="modal" data-target="#InsertStoryModal">사연 삭제</button>	
                      	 </c:if>
                      	 
			<!-- 		<button type="button" class="btn pull left btn-primary"
						data-toggle="modal" data-target="#InsertStoryModal">사연 등록</button>
 -->
					<!-- Modal Insert -->
					
					<div class="modal" id="InsertStoryModal" style="z-index:999999;">
						<div class="modal-dialog-centered">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">사연 생성</h4>
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
											<textarea id="goalInsert" class="form-control" rows="1"
												placeholder="목표금액"></textarea>
										</div>
										
										<div class="col-xl-12 form-group">
											<textarea id="locationInsert" class="form-control" rows="1"
												placeholder="장소"></textarea>
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
                                    	<button id="btnStoryInsert"
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
	
    <!-- Latest Causes Area -->
    <section class="latestc_causes list_causes">
    	<div class="container"> 
			<div class="row"> 
				<div class="col-lg-8"> 
				
					<!-- Causes --> 
					<div class="causes" id="cause">
						<div class="row"> 
							<div class="col-md-6">
								<div class="causes_img"><img src="/resources/images/01.jpg" alt=""></div> 
							</div>
							<div class="col-md-6"> 
								<a href="#" class="heding">Schools Not Slavery for Rural Haitian Children</a>
								<h6>$38,100 raised / <span>Goal: $60,000</span> <br>1956 supporters</h6>
								<div class="media">
									<div class="smpie_chart" data-percent="80"><span class="pie-value"></span></div>
									<ul class="media-body">
										<li><span><i class="fa fa-map-marker"></i></span> Northampton, United Kingdom</li>
										<li><span><i class="fa fa-heart-o"></i></span>6  Donors</li>
									</ul>
								</div>
								<button type="button" class="theme_btn"
								 data-toggle="modal" data-target="#myModal">Donation</button>
								<a href="detailcharity" class="theme_btn btn_2">View More</a>
							</div>
						</div>
					</div> 
					
					<div class="donation">

					<!-- Modal donation -->
					
					<div class="modal" id="myModal" style="z-index:999999;">
						<div class="modal-dialog modal-dialog-centered modal-sm ">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Donation</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>

								</div>

								<!-- Modal body -->
								<div class="modal-body">
									<div class="row">
										
										<div class="col-xl-4 form-group">
											<button type="button" class="btn btn-outline-danger">5$</button>
										</div>
										<div class="col-xl-4 form-group">
											<button type="button" class="btn btn-outline-warning">10$</button>
										</div>
										<br>
										<div class="col-xl-4 form-group">
											<button type="button" class="btn btn-outline-success">20$</button>
										</div>
										<div class="col-xl-4 form-group">
											<button type="button" class="btn btn-outline-info">50$</button>
										</div>
									
                                    
                           			</div>
								</div>
								</div>
							</div>
						</div>
					</div>
				
					
				
					<div class="col-12 load_more">
						<a href="causes-2.html" class="theme_btn">Load  more</a>
					</div>
				</div>
				<!-- Right sidebar -->
				<div class="col-lg-4 right_sidebar">
					<!-- Widget -->
					<div class="widget">
						<h4>What is crowdfunding?</h4>
						<p>Crowdfunding is a new type of fundraising where you can raise funds for your own personal cause, even if you're not a registered charity.</p>
						<a href="#" class="bv_button">BECOME A VOLUNTEER <i class="fa fa-arrow-right"></i></a>
					</div>
					
					
				
					
			
					<!-- Widget -->
					<div class="widget supporters_w">
						<h3 class="w_heding">Supporters <span>325</span></h3> 
						<div class="media supporters">
							<img src="/resources/images/1001.jpg" alt="">
							<div class="media-left">
								<a href="#">박지호 <span>25 July,2019 </span></a>
								<h6>All the love to Uttara</h6>
							</div>
						</div>
						<div class="media supporters">
							<img src="/resources/images/1002.jpg" alt="">
							<div class="media-left">
								<a href="#">김영수 <span>25 July,2019 </span></a>
								<h3>$20.00</h3>
							</div>
						</div>
						<div class="media supporters">
							<img src="/resources/images/1003.jpg" alt="">
							<div class="media-left">
								<a href="#">변종협 <span>25 July,2019 </span></a>
								<h3>$40.00</h3>
							</div>
						</div>
						<div class="media supporters">
							<img src="/resources/images/1004.jpg" alt="">
							<div class="media-left border-0">
								<a href="#">서우현 <span>25 July,2019 </span></a>
								<h6>You’re amazing for doing this! Get better fast gazipur</h6>
								<h3>$60.00</h3>
							</div>
						</div>
						<a href="#" class="theme_btn">Show More</a>
					</div>
				</div>
			</div>
    	</div>
    </section>
    <!-- Latest Causes Area --> 
	
  
    <!-- Quickly and Easily Area --> 
        
    
    <!-- End Footer Area -->  
    
    <!-- Scroll Top Button -->
    <button class="scroll-top">
        <i class="fa fa-angle-double-up"></i>
    </button> 
    
    <!-- Preloader -->
    <div id="preloader"></div>
    
    <!-- jQuery v3.3.1 -->
    <script src="/resources/js/jquery-3.4.1.min.js"></script> 
    <!-- Bootstrap v4.0.0 -->
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>  
    <!-- Extra Plugin -->
    <script src="/resources/vendors/animate-css/wow.min.js"></script> 
    <script src="/resources/vendors/magnify-popup/jquery.magnific-popup.min.js"></script>  
    <script src="/resources/vendors/counterup/jquery.waypoints.min.js"></script> 
    <script src="/resources/vendors/counterup/jquery.counterup.min.js"></script>    
    <script src="/resources/vendors/circular-progress/pie-chart.js"></script>  
    <script src="/resources/vendors/owl-carousel/owl.carousel.min.js"></script>   
    <script src="/resources/vendors/bootstrap-selector/jquery.nice-select.min.js"></script>   
    
    <!-- Theme js / Custom js -->
    <script src="/resources/js/theme.js"></script>
    
    <script>
    
   	   var LIST_ROW_COUNT = 5;   //limit
	   var OFFSET = 0;
	   var PAGE_COUNT_PER_BLOCK = 10;   // pagination link 갯수
	   var TOTAL_LIST_ITEM_COUNT = 0;
	   var CURRENT_PAGE_INDEX = 1;
	   
	   var SEARCH_WORD="";
    
    $(document).ready(function(){
     	
   	 storyList();
   	 
   	 $("#btnStoryInsertForm").click(function(){
            $("#titleInsert").val("");
            $("#goalInsert").val("");
            $("#locationInsert").val("");
            $("#contentInsert").val("");
            $("#chkFileUploadInsert").prop("checked", false);
            $("#inputFileUploadInsert").val("");
            $("#imgFileUploadInsert").removeAttr("src");
            //$("#imgFileUploadInsert").attr("src", "");
            $("#imgFileUploadInsertWrapper").hide();
            
            $("#boardInsertModal").modal("show");
         });
   	 
    	$("#btnStoryInsert").click(function(){
    		//console.log("click");
    		
    		if(validate()){
    			 storyInsert();
    			 
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
    
    function storyInsert(){
        
        var formData = new FormData();
        formData.append("userSeqfk", '<%=userDto.getUserSeq()%>');
        formData.append("storyTitle", $("#titleInsert").val());
       	formData.append("storyContent", $("#contentInsert").val());
       	formData.append("storyGoal", $("#goalInsert").val());
       	formData.append("storyLocation", $("#locationInsert").val());
    	formData.append("file", $("#inputFileUploadInsert")[0].files[0]);
        
        $.ajax(
        {
             type : 'post',
             url : '/story/insertFile',
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
                   storyList();
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
    
    function storyList(){
   	 $.ajax(
        {
             type : 'get',
             url : '/story/list',
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
   	 console.log(list);
		$("#cause").html("");
		  //var boardArray = JSON.parse(data); ?? @ResponseBody 자동으로 json 변환
		for( var i=0; i<list.length;i++){
			
			var storyId = list[i].storyId;
			var userName = list[i].userName;
			var storyTitle = list[i].storyTitle;
			var storyContent = list[i].storyContent;
			var regDt = list[i].regDt;
			var storyGoal = list[i].storyGoal;
			var storyLocation = list[i].storyLocation;
			var fileUrl = list[i].storyFileUrl;
			console.log(storyTitle);
			console.log(fileUrl);
			var listHtml =
	            '<div class="causes" id="cause">' +
	            '<div class="row">' +
	            '<div class="col-md-6">'+
	            '<div class="causes_img">'+
	            '<img src="' + fileUrl + '" alt="">'+
	            '</div>'+
	            '</div>'+
	            '<div class="col-md-6">'+
	            '<a href="#" class="heding">'+
	            storyTitle +
	        	'</a>'+
	        	'<h6>$38,100 raised /'+
	        	'<span>Goal: $'+
	        	storyGoal+
	        	'</span>'+
	        	'<br>1956 supporters'+
	        	'<div class="media">'+
	        	'<div class="smpie_chart" data-percent="80"><span class="pie-value"></span></div>'+
	        	'<ul class="media-body">'+
	        	'<li><span><i class="fa fa-map-marker">'+
	        	'</i></span>'+
	        	storyLocation+
	        	'</li>'+
	        	'<li><span><i class="fa fa-heart-o"></i></span>6  Donors</li>'+
	        	'</ul>'+
	        	'</div>'+
	        	'<button type="button" class="theme_btn" data-toggle="modal" data-target="#myModal">Donation</button>'+
	        	'<a href="detailcharity" class="theme_btn btn_2">View More</a>'+
	        	'</div>'+
	        	'</div>'+
	        	'</div>';
	        	
	         $("#cause").append(listHtml);
	      }
	      
	   }
	
    
    
    
    </script>
</body>
</html>