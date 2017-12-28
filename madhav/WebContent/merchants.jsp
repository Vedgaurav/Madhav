<%@ page errorPage="error.jsp" %>

<%@ page import ="com.madhav.dao.MerchantDao" %>
<%@ page import ="com.madhav.dao.MerchantDaoImpl" %>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "com.madhav.bean.MerchantBean" %>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body background="img/1234.jpg">

<h1 align="center">Merchant Details</h1>
		<table align="center" border="1">
			
			<tr><th>Id</th><th>Email</th><th>Contact</th><th>Date</th></tr>

<%
	MerchantDao md = new MerchantDaoImpl();
	ArrayList<MerchantBean> alist = null;
	
	alist = md.merchantRetrieve();
	
	if(alist!=null)
	{
	
	
	for(MerchantBean mb:alist)
	{
		%>
		
		<tr><td><%=mb.getId() %></td><td><%=mb.getEmail() %></td><td><%=mb.getContact() %></td><td><%=mb.getDate() %></td></tr>
		
	
		
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