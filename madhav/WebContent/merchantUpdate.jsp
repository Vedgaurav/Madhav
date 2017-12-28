
<%@ page errorPage="error.jsp" %>

<%@page import="com.madhav.dao.MerchantDao" %>
<%@page import="com.madhav.dao.MerchantDaoImpl" %>
<%@page import="com.madhav.bean.MerchantBean" %>
<%@page import="java.util.ArrayList" %>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title><style>

body {
	background-image: url(img/1764027.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
}
</style>
</head>
<body>

<%

MerchantDao mdao= new MerchantDaoImpl();
MerchantBean mbean = new MerchantBean();
Object o = session.getAttribute("merchantloginid");

if(o!=null)
{
int mid = (Integer)o;

mbean=mdao.merchantRetrieve(mid);

%>

<form action="MerchantUpdateSrv" method="post">
<table>

<tr><td>Merchant Name :</td><td> <input type="text" name="name" value=<%=mbean.getMname() %>></td></tr>
<tr><td>Merchant email :</td><td> <input type="email" name="email" value=<%=mbean.getEmail() %>></td></tr>
<tr><td>Merchant Password :</td><td> <input type="text" name="pass" value=<%=mbean.getPass()%>></td></tr>
<tr><td>Merchant contact :</td><td> <input type="text" name="contact" value=<%=mbean.getContact() %>></td></tr>
<tr><td>Merchant submit :</td><td> <input type="submit" ></td></tr>

</table>

</form>

<%}
else
{%>	<h1>null pointer Exception</h1>

<%}session.removeAttribute("merchantid"); %>


<% 

Object oj= session.getAttribute("merchupdate");

if(oj!=null)
{
	boolean b= (Boolean)oj;
	if(b)
	{
%>

<br><h1>Updated...</h1>

<%}
	else{%>
	
	<h1>Failed...</h1>
	
	<%}
	}session.removeAttribute("merchupdate");%>
	
	
	
	<br><br><br><a href="merchantHome.jsp">Merchant Home</a>
</body>
</html>
<%@ include file="footer.jsp" %>