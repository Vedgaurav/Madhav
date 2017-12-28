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
	background-image: url(img/1234.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body bgcolor="cyan">

<h1 align="center">Welcome Admin</h1>
<hr>




<a href="registermerchant.jsp" style="text-decoration: none">Register Merchant</a><br><br>        

<a href="merchants.jsp">Get Merchant Details</a><br><br>

<a href="adminpackdetails.jsp">Get Package Details</a><br><br>

<form action="AdminSrv">

<h4>Remove Merchant</h4>

 Enter Id : <input type="number" name="mid" required>
 <input type="submit" value="remove">



</form>

<%

Object o =session.getAttribute("m_id");
 
if(o!=null)
{
	boolean b = (Boolean)o;
	if(b)
	{
		%>
		<h4>Removed Successfully....</h4>
	<%
	}
	else
	{
	
	%>
	
	<h4>remove failed</h4>
<%
}session.removeAttribute("m_id");}

%>



<br><br><br><br><a href="logout.jsp">Logout</a>




</body>
</html>
<%@ include file="footer.jsp" %>