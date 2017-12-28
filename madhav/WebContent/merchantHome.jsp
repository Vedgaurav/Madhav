
<%@ page errorPage="error.jsp" %>

<%@ page import= "com.madhav.bean.PackageBean" %>
<%@ page import= "com.madhav.dao.PackageDao" %>
<%@ page import= "com.madhav.dao.PackageDaoImpl" %>
<%@ page import= "java.util.ArrayList" %>



<%@page import="com.madhav.bean.MerchantBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MERCHANT</title>
<style>

body {
	background-image: url(img/1764027.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body background="img/pink1.jpg" >








<%

Object obj=session.getAttribute("mname");
if(obj != null)
{
	String mname = (String)obj;
	
	if(mname!=null){
%>



<h1 align="center">Welcome merchant   <%=mname %></h1>
<hr>



<a href="packagedetails.jsp"> Click here to add  Packages</a>






<%}else{ %>

<h2>Session fails....</h2>
<%}} %>

<%

	Object o = session.getAttribute("merchantid");

	

%>
<br><br><form action="MerchantPackageSrv" method = "get">


<input type="submit" value="Get Package Details">

</form>


<%

	Object oj= session.getAttribute("packagesofmerchant");
	
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
	}session.removeAttribute("packagesofmerchant");
%>

<br><br><a href="merchantUpdate.jsp">Update Details</a>

<br><br><br><br><a href="logout.jsp">Logout</a>
</body>
</html>
<%@ include file="footer.jsp" %>
