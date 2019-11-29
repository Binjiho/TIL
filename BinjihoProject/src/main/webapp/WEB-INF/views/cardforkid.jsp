<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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

	<style>
/* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
#map {
   height: 100%;
}
/* Optional: Makes the sample page fill the window. */
html, body {
   height: 500px;
   margin: 0;
   padding: 0;
}

.place{
   padding: 3px;
}
.place_nm{
   font-size: 18px;
   font-weight: bold;
   margin-bottom: 5px;
}
.place_address{
   margin-bottom: 5px;
}
/* ???? */
.pac-container {
    z-index: 99999;
}
</style>

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
                <ul class="search_button_content nav"> 
                   	<li><a href="#" class="shop"><i class="flaticon-shopper"></i> <span>0</span></a></li>
                    <li class="dropdown search_dropbown">
                        <a class="nav-link dropdown-toggle" href="" role="button" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-search"></i></a>
                        <ul class="dropdown-menu">
                            <li>
                                <input type="text" placeholder="Search..">
                                <span><i class="fa fa-search"></i></span> 
                            </li>
                        </ul>
                    </li> 
                    
                </ul> 
           </div>
        </div>
    </header>
    </div>
    <!-- Header Area -->  
    
    <!-- Banner Area --> 
    <div class="pages_banner pb_3" img src="/resources/images/ballon.jpg" alt="">
    	<div class="container">
    		<h2>Card For Kid</h2>
    		 
    	</div>
    </div>
    <!-- Banner Area -->   
	
	<div class="container">
			<div class="content">
				<br>
				<h4>About Card</h4>
				<br>
				<h4>
					빈곤과 가정해체, 부모의 실직과 질병 등으로 결식이 우려되는 아동에게
					지역실정과 아동 욕구에 맞는 급식을 효율적으로 제공하여 건강하고 행복하게 성장할 수 있는 여건을 조성. 
				<hr>
				</h3>
				<br>
				<div class="row">
					<p class="col-lg-7 b_p">발급방법<hr>발급 방법은 주민등록지 관할 동주민센터에 방문하여 접수할 수 있으며, 지원 사유에 적합한 경우 꿈나무카드에 급식비 이체 후 지급이 됩니다. 발급 전, 아동 급식신청서,
					소득확인서류, 지원 사유 확인 서류를 제출해야 하며, 만약 부모가 질병이 있다면 의사진단서, 보호자가 부재 상태라면 이웃, 통장 확인서, 재직증명서 등이 필요합니다.
					</p>
					<p class="col-lg-5 small_p">지원대상<hr>보호자의 식사제공이 어려워 결식우려가 있는 18세 미만의 취학 및 미취학 아동 (중위소득 52%이하 가구의 아동).</p>
				</div>
			</div>

	<!-- Contact -->
	<section class="contact_area">
		<div class="container"> 
			<div class="leave_comment"> 
				<h2>Search For Restaurant</h2>
				<form class="row comment_from">  
					<div class="form-group col-md-6">   
						<input type="text" class="form-control" placeholder="시"> 
					</div> 
					<div class="form-group  col-md-6">
						<input type="email" class="form-control" name="email" placeholder="구">
					</div>  
					<div class="form-group col-md-6">   
						<input type="text" class="form-control" placeholder="종류"> 
					</div> 
					<div class="form-group col-md-6">   
						<input type="text" class="form-control" placeholder="가게이름"> 
					</div> 
				
					<div class="form-group col-12">
						<button class="theme_btn" type="submit">검색</button>  
					</div>     
				</form>  
			</div> 
		</div>
	</section>
	
	<!-- Modal -->
	<div class="container">
	
	<!-- Button to Open the Modal -->
	
         <button id="btnAddPlace" class="btn btn-sm btn-primary btn-outline" type="button">장소 추가</button>


	<!-- Modal insert-->
            <div class="modal fade" id="addPlaceModal"  aria-hidden="false" aria-labelledby="addPlacetModalTitle" role="dialog" tabindex="-1">
               <div class="modal-dialog modal-simple">
                  <form class="modal-content">
                     <div class="modal-header">
                        <h4 class="modal-title" id="addPlaceModalTitle">장소 추가</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                           <span aria-hidden="true">×</span>
                        </button>
                     </div>
                     <div class="modal-body">
                        <div class="row">
                           <div class="col-xl-12 form-group">
                              <input id="inputSearch" type="text" class="form-control" name="title" placeholder="검색어를 입력하세요.">
                           </div>
                           <div class="col-xl-12 form-group" style="height: 500px;">
                              <div id="map"></div>
                           </div>
                           <div class="col-md-12 float-right">
                              <button id="btnAddPlaceInsert" class="btn btn-sm btn-primary btn-outline" data-dismiss="modal" type="button">AddPlaceInsert</button>
                           </div>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
            <!-- End Modal -->
        </div>    
        
	
	
	<!-- Contact info-->
	<section class="contact_info">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6 info">
					<h4>Seoul Office</h4>
					<ul>
						<li><i class="fa fa-mobile"></i>Call free : <a href="#">+01053365012</a></li>
						<li><i class="fa fa-envelope-o"></i>E-mail : <a href="#">Binjiho@naver.com</a></li>
						<li><i class="fa fa-map-marker"></i>Address :  서울시, 노원구 , 공릉로 58길.</li>
					</ul>
				</div>
				<div class="col-lg-4 col-md-6 info">
					<h4>Busan Office</h4>
					<ul>
						<li><i class="fa fa-mobile"></i>Call free : <a href="#">+8801682648101</a></li>
						<li><i class="fa fa-envelope-o"></i>E-mail : <a href="#">BluePororo@naver.com</a></li>
						<li><i class="fa fa-map-marker"></i>Address :  부산시, 해운대, 광안리33길.</li>
					</ul>
				</div>
				<div class="col-lg-4 col-md-6 info">
					<h4>Nonsan Office</h4>
					<ul>
						<li><i class="fa fa-mobile"></i>Call free : <a href="#">+88014521948</a></li>
						<li><i class="fa fa-envelope-o"></i>E-mail : <a href="#">RedEyePenggu@naver.com</a></li>
						<li><i class="fa fa-map-marker"></i>Address :  충남시, 논산훈련소, 조교23연대.</li>
					</ul>
				</div>
				
			</div>
		</div>
	</section>
	<!-- Contact info-->

    <!-- Map Area -->  
    <!--
    <div class="map_area"> 
        <div id="mapBox" class="mapBox" 
            data-lat="40.701083" 
            data-lon="-74.1522848" 
            data-zoom="12" 
            data-marker="/resources/images/map-marker.png" 
            data-info="12/A Locous Creek Ave, Port Jefferson Station, NY 12775"
            data-mlat="40.701083"
            data-mlon="-74.1522848">
        </div>
    </div> 
    --> 
    <!-- End Map Area --> 
	
	
    <!-- End Customers_more Area -->
        
    
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
	
    <!-- Contact From js -->
    <script src="/resources/js/contact.js"></script>
    <script src="/resources/js/jquery.validate.min.js"></script>
    <!--gmaps Js-->
    <!-- 
    <script src="/resources/js/gmaps.min.js"></script> --> 
    
    <!-- Theme js / Custom js -->
    <script src="/resources/js/theme.js"></script>
    
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAhEnn9dUKDqxxmPAWsi7GX2M4DdWcSqDw&libraries=places&callback=initMap" async defer></script>
    
    <script>
    var MAP_VIEW;
   	var DEFAULT_MAP_LOCATION = {lat: 37.63751, lng: 127.07726};   //myhome
   	var MARKER;
   	var SEARCHED_MAP_LEVEL = 12;
   
   	$(document).ready(function() {

      $("#btnAddPlace").click(function(){
         $("#addPlaceModal").modal("show");
      });
   });
   
   function initMap(){
	   
	      MAP_VIEW = new google.maps.Map(document.getElementById("map"), {
	           center: DEFAULT_MAP_LOCATION,
	             scrollwheel: true,
	             zoom: 15
	        });
	      

   
   var input = document.getElementById("inputSearch");
   
   var autocomplete = new google.maps.places.Autocomplete(input);
     
   autocomplete.bindTo('bounds', MAP_VIEW);
   
   MARKER = new google.maps.Marker({
       map: MAP_VIEW
   });
     
   google.maps.event.addListener(MARKER, 'click', function() {
       INFO_WINDOW.open(MAP_VIEW, MARKER);
   });
   
   google.maps.event.addListener(autocomplete, 'place_changed', function() {

       //INFO_WINDOW.close();
       var place = autocomplete.getPlace();
       if (!place.geometry) {
            return;
       }

       if (place.geometry.viewport) {
            MAP_VIEW.fitBounds(place.geometry.viewport);
       } else {
            MAP_VIEW.setCenter(place.geometry.location);
            MAP_VIEW.setZoom(SEARCHED_MAP_LEVEL);
       }

       // Set the position of the marker using the place ID and location.
       MARKER.setPlace(/** @type {!google.maps.Place} */ ({
            placeId: place.place_id,
            location: place.geometry.location
       }));
       MARKER.setVisible(true);
      
       
       var place_html = 
          '<div class="place" ' +
             'data-place_id="' + place.place_id + '" ' +
             'data-place_lat="' + place.geometry.location.lat() + '" ' +
             'data-place_lng="' + place.geometry.location.lng() + '">' +
          '   <div class="place_nm">' + place.name + '</div>' +
          '   <div class="place_address">' + place.formatted_address + '</div>' +
          '   <button type="button" class="btn btn-xs btn-primary btnAddPlace">추가</button>' +
          '</div>';

       INFO_WINDOW = new google.maps.InfoWindow({
             content: place_html
       });

       INFO_WINDOW.open(MAP_VIEW, MARKER);

       google.maps.event.addListener(INFO_WINDOW,'domready', add_place_event_handler);
       
     });
   }
   
   function add_place_event_handler(){

	      $(".btnAddPlace").click(function(){

	         var place_id = $(this).closest(".place").data("place_id");
	         var place_lat = $(this).closest(".place").data("place_lat");
	         var place_lng = $(this).closest(".place").data("place_lng");
	         var place_nm = $(this).closest(".place").find(".place_nm").html();
	         var place_address = $(this).closest(".place").find(".place_address").html();

	         console.log("place_id : " + place_id);
	         console.log("place_lat : " + place_lat);   
	         console.log("place_lng : " + place_lng);   
	         console.log("place_nm : " + place_nm);   
	         console.log("place_address : " + place_address);   
	         
	         //INFO_WINDOW.close();
	      });
	   }
   
   
   </script>
</body>
</html>