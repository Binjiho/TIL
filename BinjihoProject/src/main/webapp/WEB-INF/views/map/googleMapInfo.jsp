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
    			  lat : 36.551,
    			  lng : 125.554
    	  };
         var map = new google.maps.Map(
            document.getElementById('map'), 
            {
               center : uluru,
            	zoom : 6
         });
         
         
		var image = 'https://developers.google.com/maps/documentation/javascript/examples/full/images/library_maps.png';
         
         // The marker, positioned at Uluru
         var marker = new google.maps.Marker({
            position : uluru,
            map : map,
            icon : image
         });
         
         var image2 = 'https://developers.google.com/maps/documentation/javascript/examples/full/images/parking_lot_maps.png';
        
         var marker2 = new google.maps.Marker({
            position : uluru2,
            map : map,
            icon : image2
         });
         
   
         
         var contentString = 
             '<div id="content">'+
             '<div id="siteNotice">'+
             '</div>'+
             '<h1 id="firstHeading" class="firstHeading">Uluru</h1>'+
             '<div id="bodyContent">'+
             '<p><b>Uluru</b>, also referred to as <b>Ayers Rock</b>, is a large ' +
             'sandstone rock formation in the southern part of the '+
             'Northern Territory, central Australia. It lies 335&#160;km (208&#160;mi) '+
             'south west of the nearest large town, Alice Springs; 450&#160;km '+
             '(280&#160;mi) by road. Kata Tjuta and Uluru are the two major '+
             'features of the Uluru - Kata Tjuta National Park. Uluru is '+
             'sacred to the Pitjantjatjara and Yankunytjatjara, the '+
             'Aboriginal people of the area. It has many springs, waterholes, '+
             'rock caves and ancient paintings. Uluru is listed as a World '+
             'Heritage Site.</p>'+
             '<p>Attribution: Uluru, <a href="https://en.wikipedia.org/w/index.php?title=Uluru&oldid=297882194">'+
             'https://en.wikipedia.org/w/index.php?title=Uluru</a> '+
             '(last visited June 22, 2009).</p>'+
             '</div>'+
             '</div>';
             
             var contentString2 = 
                 '<div class="card" style="width:200px">' +
                '<img class="card-img-top" src="https://www.w3schools.com/bootstrap4/img_avatar3.png" alt="Card image" width="200px;">' +
                '<div class="card-body">' +
                '<h4 class="card-title">John Doe</h4>' +
                '<p class="card-text">Some example text.</p>' +
                '<a href="#" class="btn btn-primary">See Profile</a>' +
                '</div>' +
                '</div>';
             
             
          var infowindow = new google.maps.InfoWindow({
        	  content : contentString
          });
          
          var infowindow2 = new google.maps.InfoWindow({
        	  content : contentString2
          });
          
          marker.addListener('click', function(){
        	  infowindow.open(map,marker);
          });
          
          marker2.addListener('click', function(){
        	  infowindow2.open(map,marker2);
          });
      	
      }
      
      
      
      
   </script>
   <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAhEnn9dUKDqxxmPAWsi7GX2M4DdWcSqDw&callback=initMap"
      async defer></script>
	

</body>
</html>