<%@ page errorPage="error.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Package creation</title>
</head>
<body bgcolor="orange">

<form align="center" action="#" method="get">
<h1>WELCOME TO PACKAGE CREATION</h1>

Package Name: 		<input type="text" name="p_name" ><br><br>
Package Descr:		<input type="text" name="p_descr" ><br><br>
Package Rate:		<input type="number" name="p_rate" ><br><br>
Package Count		<input type="number" name="p_count" ><br><br>





<input type="image" src="img/DSC00574.JPG" style="width:30%"" alt="submit">

<input type="file" name="photo" size="50">

<div class="slideshow container">

<div class="mySlides fade">

<div class="numbertext">1/3</div>

<img src="_DSC2180.jpg"

style="width:100%">

<div class="text">Caption Text</div>

</div>

<div class="mySlides fade">

<div class="numbertext">2/3</div>

<img src="_DSC4369.jpg"

style="width:100%">

<div class="text">Caption Two</div>

</div>

<div class="mySlides fade">

<div class="numbertext">3/3</div>

<img src="_DSC4396.jpg.jpg"

style="width:100%">

<div class="text">Caption Three</div>

</div>

<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
<a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>


<div style="text-align:center">
<span class="dot"
onclick="currentSlide(1)">
</span>
<span class="dot"
onclick="currentSlide(2)">
</span>
<span class="dot"
onclick="currentSlide(3)">
</span>
</div>

<%
	
	Object o = session.getAttribute("p_id");

	if(o!=null){
	int id = (Integer)o;
	


%>

<h1>HARI BOL! YOUR PACKAGE HAS BEEN CREATED</h1>
<h1>YOUR PACKAGE ID IS : <%= id %></h1>

<%}
	else
	{
	%>
	<h1></h1>
	<%}session.removeAttribute("p_id"); %>


</form>

<div>

	<a href="_DSC2180.jpg" >see madhav</a><br><br>
	<a href="_DSC3603.jpg" >add hotel</a><br><br>
	<a href="_DSC4369.jpg" >add events</a><br><br>
	<a href="_DSC4382.jpg" >add places </a><br><br>
	<a href="_DSC4396.jpg" >see radha madhav</a><br><br>
	
	
	







</div>


<a href="merchantHome.jsp">Merchant Home</a>
<a href="logout.jsp">Logout</a>

</body>
</html>