<%@ page errorPage="error.jsp" %>

<%@page import="com.madhav.dao.UserDao" %>
<%@page import="com.madhav.dao.UserDaoImpl" %>
<%@page import="com.madhav.bean.UserBean" %>
<%@page import="java.util.ArrayList" %>





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

<%

UserDao mdao= new UserDaoImpl();
UserBean mbean = new UserBean();
Object o = session.getAttribute("useremail");

if(o!=null)
{
String email = (String)o;

mbean=mdao.userDetails(email);



%>

<form action="UserUpdateSrv" method="post">
<table>

<tr><td>User Name :</td><td> <input type="text" name="name" value=<%=mbean.getU_name()%>></td></tr>
<tr><td>User email :</td><td> <input type="email" name="email" value=<%=mbean.getEmail() %>></td></tr>
<tr><td>User Password :</td><td> <input type="text" name="pass" value=<%=mbean.getPass()%>></td></tr>
<tr><td>User contact :</td><td> <input type="text" name="contact" value=<%=mbean.getContact() %>></td></tr>
<tr><td>User submit :</td><td> <input type="submit" ></td></tr>

</table>

</form>



<%}session.removeAttribute("useremail"); %>


<% 

Object oj= session.getAttribute("userupdate");

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
	}session.removeAttribute("userupdate");%>
	
	
	
	<br><br><br><a href="userHome.jsp">Merchant Home</a>
</body>
</html>
<%@ include file="footer.jsp" %>