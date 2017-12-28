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
<title>Insert title here</title>
<style>

body {
	background-image: url(img/1764027.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body>

<h1 align="center">Package Details</h1>
		<table align="center" border="1">
			
			<tr><th>Id</th><th>Name</th><th>Description</th><th>Rate</th><th>Count</th></tr>


<%
	PackageDao md = new PackageDaoImpl();
	ArrayList<PackageBean> alist = null;
	
	alist = md.packageRetrieve();
	
	if(alist!=null)
	{
	
	
	for(PackageBean pb:alist)
	{
		
		
		
		
		
		
		
		
		
		
		%>
		
		<tr><td><%=pb.getPid() %></td><td><%=pb.getPname() %></td><td><%=pb.getPdescr() %></td><td><%=pb.getPrate() %></td><td><%=pb.getPcount()%></td></tr>
		
	
		
<%
	}
	}
	else
	{
	
%>
	<h1>alist is null</h1>
	<%} %>
</table>





<a href="adminHome.jsp">Admin Home</a><br><br>

<a href="logout.jsp">Logout</a>
</body>
</html>
<%@ include file="footer.jsp" %>