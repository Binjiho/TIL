<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<style>
#map{
	height: 100%;
}
html,body{
	height: 100%;
	magin : 0;
	padding : 0;
}
</style>

<title>googleMapMarker</title>
</head>
<body>
	<div id ="map"></div>
	<script>
      var map;
      function initMap() {
    	  
    	  var uluru = {
    			  lat : -25.344,
    			  lng : 131.036
    	  };
    	  
    	  var uluru2 = {
    			  lat : -27.344,
    			  lng : 131.036
    	  };
         var map = new google.maps.Map(
            document.getElementById('map'), 
            {
               center : uluru,
            	zoom : 6
         });
         
         var marker = new google.maps.Marker({
        	 position : uluru2,
 			 map : map        
         });
      }
   </script>
   <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAhEnn9dUKDqxxmPAWsi7GX2M4DdWcSqDw&callback=initMap"
      async defer></script>
	

</body>
</html>