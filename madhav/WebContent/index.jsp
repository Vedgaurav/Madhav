<%@ page errorPage="error.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
    <head>
        <!-- basics page needs -->
        <!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
        <link rel="shortcut icon" href="logo.png" >
        <meta charset="utf-8">
        <title>VSSR TOURS</title>
        <meta name="description" content="">  
        <meta name="author" content="">
              
      
             
        <!-- css required================================================================= -->
        <link rel="stylesheet" href="css/base.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/media-queries.css"> 
        <link rel="stylesheet" href="design.css">  
        <link rel="stylesheet" href="jquery-ui.css">
        <link href="drop-down-menu.css" rel="stylesheet" type="text/css" />
        
        <!-- new css added -->
        <link rel="stylesheet" href="css/style.css">
        <!-- <link rel="stylesheet" href="css/slider.css"> -->
        <!-- end new -->
       

  
        
        <!-- javascript required============================================================ -->
        <script src="jquery-3.2.1.js"></script>
        <script src="jquery-ui.js"></script>
        <script type="text/javascript" src="drop-down-menu.js"></script>

        <!-- new js added -->
        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.1.1.js"></script>
        <script src="js/superfish.js"></script>
        <script src="js/sForm.js"></script>
        <script src="js/jquery.jqtransform.js"></script>
        <script src="js/jquery.equalheights.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/tms-0.4.1.js"></script>
        <script src="js/jquery-ui-1.10.3.custom.min.js"></script>
        <script src="js/jquery.ui.totop.js"></script>
        <!-- end new -->
        
        <!-- useless tab
            <script>
                $( function() {
                $( "#tabs" ).tabs();
                } );
            </script>
            <script>
                $( function() {
                  $( "#speed" ).selectmenu();
              
                  $( "#files" ).selectmenu();
              
                  $( "#number" )
                    .selectmenu()
                    .selectmenu( "menuWidget" )
                      .addClass( "overflow" );
              
                  $( "#salutation" ).selectmenu();
                } );
                </script>
            <script>
            $( function() {
              $( "#accordion" ).accordion();
            } );
            </script>
          -->
            
    </head>
    <!-- menu bar starts from here==================================================================== -->
    <body>
         
         <!-- <div id="menu">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Register</a></li>
                <li><a href="#">News</a></li>
            </ul>
        </div>
        -->
        
        <div id="logo">
        <img src="menulogo.png"  width="1330"></div><br>
        <!-- --> <marquee scrollamount="20"><br><br>**Summer offer!! Upto 30% off !!</marquee> 
        <!-- new menu bar -->
        <div class="menu-container">
            <ul class="menu">
                <li><a href="#"><center>Home</center></a></li>
                <li><a href="aboutus.jsp"><center>About Us</center></a>
                 <!--  <ul>
                    <li><a href="login.jsp">Brief</a></li>
                    <li><a href="login.jsp">Profile</a></li>
                    <li><a href="login.jsp">Social</a></li>
                  </ul> -->
                </li>
                <li><a href="login.jsp"><center>Services</center></a>
                  <ul>
                    <li><a href="#">Customer</a></li>
                    <li><a href="#">Enquery</a></li>
                    <li><a href="#">Call</a></li>
                    <li><a href="#">Email</a></li>
                    
                    
                    </a></li>
                  </ul>
                </li>
                <li><a href="#"><center>Location</center></a></li>
                <li><a href="login.jsp"><center>Register</center></a></li>
                <li><a href="#"><center>Offers</center></a>
                  <ul>
                    <li><a href="#">Discounts</a></li>
                    <li><a href="#">Coupon</a></li>
                    <li><a href="#">Lucky Draw</a></li>
                  
                    
                  </ul>
                </li>
                <li><a href="#">Restaurant</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">Feedback</a></li>
                
              
            </ul>
            
        </div>
        
      <!-- main wrapper class ===================================================================== -->
        <div id="wrapper">
            
           <div id="header">
               <div class="slideshow-container">
                    <div class="mySlides fade">
                      <div class="numbertext">1 / 3</div>
                      <img src="hotel1320x742.jpg" style="width:100%">
                      <div class="text"><h1><font color="red" face="calibri">The Best Hotel in Transylvania</font></h1></div>
                    </div>

                    <div class="mySlides fade">
                      <div class="numbertext">2 / 3</div>
                      <img src="Hotel-Chinzanso-Tokyo_spa1.png" style="width:100%">
                      <div class="text"><h1><font color="red" face="calibri">Spend Your Holidays in Great Comfort</font></h1></div>
                    </div>

                    <div class="mySlides fade">
                      <div class="numbertext">3 / 3</div>
                      <img src="hotels-4.jpg" style="width:100%">
                      <div class="text"><h1><font color="blue" face="calibri">Feel the Adventure</font></h1></div>
                    </div>

                  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                  <a class="next" onclick="plusSlides(1)">&#10095;</a>
                </div>
                <br>

                  <div style="text-align:center">
                    <span class="dot" onclick="currentSlide(1)"></span> 
                    <span class="dot" onclick="currentSlide(2)"></span> 
                    <span class="dot" onclick="currentSlide(3)"></span> 
                  </div>


                  <!-- simple message 
              <br><br><center><font id="text1"><b>Welcome to Hotel Transylvania</b></font></h1></center> -->

                      <br><br>
                    

                               <!-- This is about short gallery -->
        <div class="content">
    <div class="container_12">
      <div class="grid_12">
        <h3>Top Destinations</h3>
      </div>
      <div class="boxes">
        <div class="grid_4">
          <figure>
            <div><img src="images/page1_img1.jpg" alt=""></div>
            <figcaption>
              <h3>Haldia Township</h3>
              velite a rew qw vehicula lacinia arcufasec ro. Aenean lacinia ucibusy fase tortor ut feugiat. Rabi tur oliti aliquam bibendum olor quis malesuadivamu. <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images/page1_img2.jpg" alt=""></div>
            <figcaption>
              <h3>Digha</h3>
              Psum dolor sit ametylo gerto consectetur ertori hykill holit adipiscing lity. Donecto rtopil osueremo	kollit asec emmodem geteq tiloli. Aliquam dapibus neclol nami wertoli elittro eget vulpoli no
              utaterbil congue turpis in su. <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="grid_4">
          <figure>
            <div><img src="images/page1_img3.jpg" alt=""></div>
            <figcaption>
              <h3>Mahishadal Rajbari</h3>
               dignissim eu velite a rew qw vehicula lacinia arcufasec ro. Aenean lacinia ucibusy fase tortor ut feugiat. Rabi tur oliti aliquam bibendum olor quis malesuadivamu. <a href="#" class="btn">Details</a> </figcaption>
          </figure>
        </div>
        <div class="clear"></div>
      </div> 
      <!-- end of the short gallery -->
                                
                                
                             <!-- simple vdo including   -->
                                
                                
                                 
                                      
                                      
                                      
                            <!-- booking check -->   
                                      
                                      
                                      

                  <!-- about tabs by jQuery -->
                  <!-- a JQuery Tab -->
                   


                  <!-- Footer section -->
                  <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><div id="footer">
                      <center><font id="txt" face="candara" color="white"><br>copyright Hotel Transylvania 2017</font></center>
                  </div>
        </div> <!-- End of the main wrapper class -->
    </body>  
                    
                    
                    
               <!-- auto slideshow at the beginning.... always put slide show js at the end of the body -->     
                <!--  this is acually for normal slide by clicking -->    
                    <script>
                      var slideIndex = 1;
                showslide(slideIndex);

                function plusSlides(n) {
                  showslide(slideIndex += n);
                }

                function currentSlide(n) {
                  showslide(slideIndex = n);
                }

                function showslide(n) {
                  var i;
                  var slides = document.getElementsByClassName("mySlides");
                  var dots = document.getElementsByClassName("dot");
                  if (n > slides.length) {slideIndex = 1} 
                  if (n < 1) {slideIndex = slides.length}
                  for (i = 0; i < slides.length; i++) {
                      slides[i].style.display = "none"; 
                  }
                  for (i = 0; i < dots.length; i++) {
                      dots[i].className = dots[i].className.replace(" active", "");
                  }
                  slides[slideIndex-1].style.display = "block"; 
                  dots[slideIndex-1].className += " active";
                }
                

            //this is for AUTO slide
                var slideIndex = 0;
                showSlides();

                function showSlides() {
                    var i;
                    var slides = document.getElementsByClassName("mySlides");
                    for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none"; 
                    }
                    slideIndex++;
                    if (slideIndex> slides.length) {slideIndex = 1} 
                    slides[slideIndex-1].style.display = "block"; 
                    setTimeout(showSlides, 3000); // Change image every 2 seconds
                }


            </script>
</html>