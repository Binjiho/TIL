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

<title>googleMapSimple</title>
</head>
<body>
	<div id ="map"></div>
	<script>
      var map;
      function initMap() {
    	  
    	  var uluru = {
    			  lat : 37.63751,
    			  lng : 127.07726
    	  };
    	  
         map = new google.maps.Map(
            document.getElementById('map'), 
            {
               center : {
                  lat : 37.63751,
                  lng : 127.07726
            },
            zoom : 15
         });
         
         var marker = new google.maps.Marker({
        	 position : uluru,
 			 map : map        
         });
         
         google.maps.event.addListener(map,'click',function(event){
        	 console.log(event.latLng.lat());
         	 console.log(event.latLng.lng());
         })
      }
   </script>
   <script
      src="https://maps.googleapis.com/maps/api/js?key=<!--  -->&callback=initMap"
      async defer></script>
	

</body>
</html>