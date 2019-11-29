<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "com.Binjiho.myapp.dto.*" %>
<%
	UserDto userDto = (UserDto)session.getAttribute("userDto");
	String userName ="";
	
	if(userDto != null){
		System.out.println(userDto.getUserSeq());
		userName=userDto.getUserName();	
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" href="images/favicon.png" type="image/x-icon" />
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
   
   <!-- Header Top Area -->
   <div class="header">
    <div class="header_top_area"> 
        <div class="container">  
            <div class="header_top_inner row"> 
                <div class="left_menu col-lg-6"> 
                    <ul class="right_nav">
                        <li>Explore The Crowd hope</li> 
                        <li><a href="#" class="help">Need help</a></li>  
                    </ul>
                </div> 
                <div class="col-lg-6"> 
                    <ul class="header_social">
                    	<c:set var="name" value="${userDto.userName}" />
                       	 <c:if test="${name != null}">
                      	  <li class="login_btn"><a href="logout">Log Out</a></li>
                      	 </c:if>
                      	 <c:if test="${name == null}">
                      	  <li class="login_btn"><a href="login">Log in</a></li>
                      	 </c:if>
                      	
                      	 
                        <li><a href="charity" class="theme_btn">Donation Now</a></li>
                    </ul>  
                </div>
            </div>
        </div> 
    </div>
    <!-- Header Top Area -->  

    <!-- Header Area -->
    <header class="main_header_area mha_2"> 
       <div class="container">
            <div class="header_menu"> 
                <nav class="navbar navbar-expand-lg"> 
                   <a class="navbar-brand" href="index.html"><img src="/resources/images/logo.png" alt=""></a>
                    <!-- Small Divice Menu-->
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".navbar_supported"> 
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
                    <li class="dropdown search_dropbown">
                        <a class="nav-link dropdown-toggle" href="" role="button" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-search"></i></a>
                        <ul class="dropdown-menu">
                            <li>
                                <input type="text" placeholder="Search..">
                                <span><i class="fa fa-search"></i></span> 
                            </li>
                        </ul>
                    </li>  
                     <li><a href="#" class="call_support">010-5336-5012 <i class="flaticon-phone"></i></a></li>
                </ul> 
           </div>
        </div>
    </header> 
    </div>
    <!-- Header Area -->  
    
    <!-- Slider Area -->
    <section class="main_slider_area"> 
        <div id="main_slider" class="rev_slider" data-version="5.1.1RC">
            <ul>
                <!-- SLIDE 1 -->
                <li data-index="rs-82" data-transition="fade" data-slotamount="default"  data-easein="default" data-easeout="default" data-masterspeed="2000"  data-thumb="images/slider-2.jpg"  data-rotate="0"  data-fstransition="fade" data-fsmasterspeed="1500" data-fsslotamount="7" data-saveperformance="off"  data-title="The Children" data-description="">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/images/volunteer2.jpg"  alt=""  data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="10" class="rev-slidebg" data-no-retina>
                    <!-- LAYER NR. 1 -->      
                    <div class="tp-caption concept_title" 
                        id="slide-2-layer-1" 
                        data-x="['left','left','left','left']" 
                        data-hoffset="['0','0','0','15']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['430','430','200','170']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','330']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"  
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1300" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Join over 22 million people
                    </div>
                    <!-- LAYER NR. 2 --> 
                    <div class="tp-caption concept_title" 
                        id="slide-2-layer-2" 
                        data-x="['left','left','left','left']" 
                        data-hoffset="['0','0','0','15']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['510','510','250','210']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','280']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"   
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1600" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">supporting <span>Crowdhope</span>
                    </div>
                    <!-- LAYER NR. 3 -->  
					<div class="tp-caption slider_sm_heding" 
                        id="slide-2-layer-3" 
                        data-x="['left','left','left','left']"  
                        data-hoffset="['0','0','0','15']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['640','640','330','280']" 
                        data-fontsize="['20','20','16','12']" 
                        data-lineheight="['32','32','28','20']" 
                        data-width="['680','680','550','410','410','410']"
                        data-height="none"
                        data-whitespace="normal"
                        data-transform_idle="o:1;" 
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1500" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on"   
                        style="z-index: 8; min-width: 660px; max-width: 660px; white-space: normal;">Make good things happen, There are lots of ways to make good things happen Raise money for charity and personal causes
                    </div> 
                    <!-- LAYER NR. 4 -->
                    
                </li> 
                <!-- SLIDE 2 -->
                <li data-index="rs-81" data-transition="slideoverup" data-slotamount="7"  data-easein="default" data-easeout="default" data-masterspeed="1000"  data-thumb="images/volunteer.jpg" data-title="Event Video">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/images/volunteer.jpg"  alt=""  data-lazyload="images/volunteer.jpg" data-bgposition="left center" data-kenburns="on" data-duration="30000" data-scalestart="110" data-scaleend="100" class="rev-slidebg" data-no-retina> 
                    <!-- LAYER NR. 1 -->   
                    <div class="tp-caption s_title" 
                        id="slide-1-layer-1" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['420','420','200','170']" 
                        data-fontsize="['20','20','18','16']" 
                        data-lineheight="['25','25','20','20']" 
                        data-width="['none','none','none','100']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"  
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1000" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Give Hope
                    </div>
                    <!-- LAYER NR. 1 -->   
                    <div class="tp-caption concept_title" 
                        id="slide-1-layer-2" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['460','460','230','200']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','420']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"  
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1300" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Join the movement to end
                    </div>
                    <!-- LAYER NR. 2 --> 
                    <div class="tp-caption concept_title" 
                        id="slide-1-layer-3" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['540','540','290','240']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','420']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"   
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1600" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">child proverty
                    </div>
                    <!-- LAYER NR. 3 --> 
                    <div class="tp-caption slider_sm_heding" 
                        id="slide-1-layer-4" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['670','670','380','300']" 
                        data-fontsize="['18','18','16','12']" 
                        data-lineheight="['30','30','20','20']" 
                        data-width="['none','none','530','410']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"   
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1900" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Make good things happen, There are lots of ways to make good things happen 
                    </div> 
                    
                </li> 
                
                <!-- SLIDE 3 -->
                <li data-index="rs-83" data-transition="slideoverup" data-slotamount="7"  data-easein="default" data-easeout="default" data-masterspeed="1000"  data-thumb="images/kid.jpg" data-title="Event Video">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/images/kid.jpg"  alt=""  data-lazyload="images/kid.jpg" data-bgposition="left center" data-kenburns="on" data-duration="30000" data-scalestart="110" data-scaleend="100" class="rev-slidebg" data-no-retina> 
                    <!-- LAYER NR. 1 -->   
                    <div class="tp-caption s_title" 
                        id="slide-3-layer-1" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['420','420','200','170']" 
                        data-fontsize="['20','20','18','16']" 
                        data-lineheight="['25','25','20','20']" 
                        data-width="['none','none','none','100']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"  
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1000" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Give Hope
                    </div>
                    <!-- LAYER NR. 1 -->   
                    <div class="tp-caption concept_title" 
                        id="slide-3-layer-2" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['460','460','230','200']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','420']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"  
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1300" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Join the movement to end
                    </div>
                    <!-- LAYER NR. 2 --> 
                    <div class="tp-caption concept_title" 
                        id="slide-3-layer-3" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['540','540','290','240']" 
                        data-fontsize="['70','70','45','25']" 
                        data-lineheight="['78','78','55','35']" 
                        data-width="['none','none','none','420']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"   
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1600" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">child proverty
                    </div>
                    <!-- LAYER NR. 3 --> 
                    <div class="tp-caption slider_sm_heding" 
                        id="slide-3-layer-4" 
                        data-x="['center','center','center','center']" 
                        data-hoffset="['0','0','0','0']" 
                        data-y="['top','top','top','top']" 
                        data-voffset="['670','670','380','300']" 
                        data-fontsize="['18','18','16','12']" 
                        data-lineheight="['30','30','20','20']" 
                        data-width="['none','none','530','410']" 
                        data-height="none" 
                        data-whitespace="['nowrap','nowrap','nowrap','normal']" 
                        data-transform_idle="o:1;"   
                        data-transform_in="y:[-100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:1500;e:Power3.easeOut;" 
                        data-transform_out="opacity:0;s:1000;s:1000;" 
                        data-mask_in="x:0px;y:0px;s:inherit;e:inherit;" 
                        data-start="1900" 
                        data-splitin="none" 
                        data-splitout="none" 
                        data-responsive_offset="on" 
                        style="z-index: 7; white-space: nowrap;">Make good things happen, There are lots of ways to make good things happen 
                    </div> 
                   
                </li>   
                  
            </ul> 
            <div class="tp-bannertimer tp-top"></div>	 
        </div>
    </section>
    <!-- End Slider Area --> 
	
    <!-- Volunteer -->  
    <section class="volunteer_area va_2">
    	<div class="container">
    		<div class="row">
    			<div class="col-xl-3 col-lg-4 col-sm-6 wow fadeIn">
    				<div class="volunteer">
    					<img src="/resources/images/human.png" alt=""> 
    					<a href="volunteer">Volunteer</a>
    				</div>
    			</div>
    			<div class="col-xl-3 col-lg-4 col-sm-6 wow fadeIn" data-wow-delay="0.3s">
    				<div class="volunteer">
    					<img src="/resources/images/money.png" alt=""> 
    					<a href="charity">SEND DONATION</a>
    				</div>
    			</div>
    			<div class="col-xl-3 col-lg-4 col-sm-6 wow fadeIn" data-wow-delay="0.6s">
    				<div class="volunteer">
    					<img src="/resources/images/people.png" alt=""> 
    					<a href="gallery">GALLERY</a>
    				</div>
    			</div>
    			<div class="col-xl-3 col-lg-4 col-sm-6 wow fadeIn" data-wow-delay="0.9s">
    				<div class="volunteer">
    					<img src="/resources/images/heartbeat.png" alt="">
    					<hr> 
    					<a href="cardforkid">CARD FOR KID</a>
    				</div>
    			</div>
    		</div>
    	</div>
    </section>
    <!-- Volunteer --> 

    <!-- Latest Causes Area -->  
   
    <!-- About Croudhelp -->   
    
	<!-- Counter Area --> 
	 
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
    
    
   <!-- Testimonial Area 
	<section class="testimonial_area">
		<div class="container">
			<div class="owl-carousel testimonial_slide">
				
				<div class="item">
					<div class="media">
						<img src="/resources/images/80801.jpg" alt="">
						<div class="media-body">
							<a href="#">박지호</a>
							<h6>CEO Company</h6>
						</div>
					</div>
					<div class="t_text">
						<p>베품이야 말로 가장 큰 미덕이라고 생각하여 사이트를 만들었습니다.
						조금 더 관심을 갖고 조금 더 실천하여 사랑을 나누자고 생각합니다</p>
					</div>
				</div>
				
				<div class="item">
					<div class="media">
						<img src="/resources/images/80802.jpg" alt="">
						<div class="media-body">
							<a href="#">서우현</a>
							<h6>Volunteer</h6>
						</div>
					</div>
					<div class="t_text">
						<p>가장 중요한 것은 나눔과 봉사라고 생각하였습니다. 앞으로도 꾸준히 봉사활동을 통해
						많은 사람들을 돕고 싶습니다!</p>
					</div>
				</div>
				
				<div class="item">
					<div class="media">
						<img src="images/80803.jpg" alt="">
						<div class="media-body">
							<a href="#">변종협</a>
							<h6>Support Staff</h6>
						</div>
					</div>
					<div class="t_text">
						<p>빨리 가라면 혼자 가고 멀리 가려면 함께 가라.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
    -->
   
    <!-- Latest Charity News  -->  
    
	
    <!-- End Customers_more Area -->   

    
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
    <!-- Rev slider js -->
    <script src="/resources/vendors/revolution/js/jquery.themepunch.tools.min.js"></script>
    <script src="/resources/vendors/revolution/js/jquery.themepunch.revolution.min.js"></script>
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.actions.min.js"></script> 
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
    <script src="/resources/vendors/revolution/js/extensions/revolution.extension.video.min.js"></script>
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
</body>
</html>