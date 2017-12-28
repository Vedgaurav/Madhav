<%@ page errorPage="error.jsp" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

body {
	background-image: url(img/1764027.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body bgcolor="pink">

<h1 align="center">Merchant Registration Page</h1>
<hr>

<form align ="center"action="MerchantServlet" method="post">

<table align="center" cellspacing="10">
<tr><td>Enter Name:</td><td><input type="text" name="mname" required></td></tr><br><br>

<tr><td>Enter Email:			</td><td><input type="email" name="email" required></td></tr>
<tr><td>Enter Password: 		</td><td><input type="password" name="password" required></td></tr>
<tr><td>Enter Mobile:			</td><td><input type="number" name="contact" maxsize="10" minsize="10" required></td></tr>

<tr><td><td><input type="submit" value="Register"></td></td></tr>

</table>




<%

	Object o=session.getAttribute("merchantid");
	

	
	if(o!=null)
	{
		int id = (Integer)o;
		if(id>0){
	
%>

<h1>Registered merchant your id is <%=id %></h1>
<%}
	else
	{%>
	
	<h1>failed...</h1>
	<a href="registermerchant.jsp">try again</a>
	
	<%}session.removeAttribute("merchantid");}%>

</form>


<a href="adminHome.jsp">Admin Home</a><br><br>

<a href="logout.jsp">Logout</a>
</body>
</html>
<%@ include file="footer.jsp" %>