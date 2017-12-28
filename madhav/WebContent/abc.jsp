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

<form action="BookSrv" method="post">

Product id :<input type="text" name="pid" value=<%=request.getParameter("pid") %> readonly="readonly"><br><br>

Select No of Packages :<input type="text" name="qn">

<input type="submit" value="done">
</form>

</body>
</html>
<%@ include file="footer.jsp" %>