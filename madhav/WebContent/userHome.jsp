<%@ page errorPage="error.jsp" %>

<%@ page import= "com.madhav.bean.PackageBean" %>
<%@ page import= "com.madhav.dao.PackageDao" %>
<%@ page import= "com.madhav.dao.PackageDaoImpl" %>
<%@ page import= "java.util.ArrayList" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER</title>
<style>

body {
	background-image: url(img/1764027.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body background="img\white1.jpg">
<%

Object obj=session.getAttribute("uname");
if(obj != null)
{
	String uname = (String)obj;
	
	if(uname!=null){
%>



<h1 align="center">WELCOME USER <%=uname %></h1>
<hr>

<a href="pack.jsp" >Show Packages</a><br><br><br>









<%}else{ %>

<h2>Session fails....</h2>
<%}} %>




<form action="UserPackSrv" method = "get">


<input type="submit" value="Get Package Details">

</form><br><br><br><br>

<%

	Object oj= session.getAttribute("userpackages");
	
	if(oj!=null)
	{
	
	ArrayList<PackageBean> al=(ArrayList<PackageBean>)oj;
	
	%>
	<h1 align="center">Package Details</h1>
		<table align="center" border="1">
			
			<tr><th>Id</th><th>Name</th><th>Description</th><th>Rate</th></tr>
	
	<%
	
	for(PackageBean pbean:al){
		
%>
		
		<tr><td><%=pbean.getPid() %></td><td><%=pbean.getPname() %></td><td><%=pbean.getPdescr() %></td><td><%=pbean.getPrate() %></td></tr>
		
	
		
<%
	}
	
%></table><%
	}session.removeAttribute("userpackages");
%>

<br><br><br>

<a href="userUpdate.jsp">User Update Details</a>
<font color="red">
<a href="logout.jsp">LOGOUT</a>
</font>
</body>
</html>

<%@ include file="footer.jsp" %>
