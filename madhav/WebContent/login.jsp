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
<body>

	<h1 align="center">Welcome to VSSR</h1>
	<hr>

	<div align="center">

		<form action="LoginSrv" method="post">

			Enter Username:<input type="text" name="uname"
				placeholder="Enter Username" required><br>
			<br> Enter Password:<input type="password" name="pass"
				placeholder="Enter Password" required><br>
			<br> Login As: <select name="role">
				<option>Admin</option>
				<option>Merchant</option>
				<option>User</option>

			</select> <input type="submit" value="Login">
		</form>


		<br><br><br> <a href="userreg.jsp">New
			Customer ? Register Here</a>


	</div>


	<div>

		<%
			Object obj = session.getAttribute("flag");
			if (obj != null) {
		%>

		<h2>Invalid username or password..</h2>

		<%
			}
			session.removeAttribute("flag");
		%>


	</div>








</body>


</html>

<%@ include file="footer.jsp" %>
