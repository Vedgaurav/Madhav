<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="ResetUserSrv" method="post">

<table cellspacing="20">

<tr><td><td>For User's</td></td></tr>

<tr><td>Enter Old Email</td><td><input type="email" name="email"></td></tr>
<tr><td>Enter Old Password</td><td><input type="password" name="pass"></td></tr>

<tr><td><td><input type = "submit" value="FOR USER CLICK HERE"></td><td></tr>

</table>


</form>



<form action="ResetMerchantSrv" method="post">

<table cellspacing="20">

<tr><td><td>For Merchant's</td></td></tr>

<tr><td>Enter Old Email</td><td><input type="email" name="email"></td></tr>
<tr><td>Enter Old Password</td><td><input type="password" name="pass"></td></tr>

<tr><td><td><input type = "submit" value="MERCHANT CLICK HERE"></td><td></tr>

</table>



</form>



<%

		Object o = session.getAttribute("uservalidated");

	if(o!=null)
	{
		boolean b=(Boolean)o;
		
		if(b)
		{
			%>
				<form action = "resetUserSrv" method="post">
			
			<br><br><br><table cellspacing="20">

<tr><td><td>For User's</td></td></tr>

<tr><td>Enter New Email</td><td><input type="newemail" name="email"></td></tr>
<tr><td>Enter New Password</td><td><input type="newpassword" name="pass"></td></tr>

<tr><td><td><input type = "submit" value="FOR USER CLICK HERE"></td><td></tr>
<%

Object obj = session.getAttribute("userupdated");

	if(obj!=null)
	{
		%>
		<br><h1>User Updated...</h1>	
	
<%}
	else
	{
	%>
<br><h1>Updation Failed</h1>

<%}session.removeAttribute("userupdated"); %>

%>
</table>
	
<%
	}
else
{
	%>
		<br><br><br><h1>Validation Failed....</h1>
		<%
}
		}session.removeAttribute("uservalidated");
		%>


%>

%>







<br><br><br> <a href="index.jsp">Home</a>


</body>
</html>