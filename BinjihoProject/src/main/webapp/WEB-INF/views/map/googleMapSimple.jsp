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
         map = new google.maps.Map(
            document.getElementById('map'), 
            {
               center : {
                  lat : -34.397,
                  lng : 150.644
            },
            zoom : 8
         });
      }
   </script>
   <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAhEnn9dUKDqxxmPAWsi7GX2M4DdWcSqDw&callback=initMap"
      async defer></script>
	

</body>
</html>