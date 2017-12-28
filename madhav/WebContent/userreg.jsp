<%@ page errorPage="error.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>
Form Validation
</title>
<style>

table,tr,td
{
	padding:5px;
	font-family: calibri;
	font-size: 18px;
	color:#24446E;
}
table
{
	border-radius: 10px;
	box-shadow: 2px 2px 3px #E86047;
}


.box
{
	width:200px;
	height: 30px;
	font-family: calibri;
	font-size: 16px;
	border-radius: 5px;
	border:none;

}
th
{
	color:#E86047;
	font-size: 30px;
	text-shadow:1px 1px 1px green;
}


.btn
{
	width: 100px;
	height: 30px;
	font-family: calibri;
	font-size: 20px;
	color:#E86047;
	font-weight: bolder;
}
fieldset
{
	width: 500px;
	border-radius: 15px;
}
legend
{
	color:#E36363;
	font-weight: bolder;
	font-size: 20px;
	font-family: arial;
}



</style>

<script>

function validation()
{

	var name=document.getElementById("name").value;
	var contact=document.getElementById("contact").value;
	var email=document.getElementById("email").value;
	var password=document.getElementById("password").value;
	var c_password=document.getElementById("c_password").value;


	if(name=="" || name==null)
	{
		alert("Name Field Is Empty");
		return false;
	}

	else if(contact=="" || contact==null || contact.length<=0 || contact.length>11 || contact.length<10)
	{
		alert("Invalid Contact Number");
		return false;
	}

	else if(validatePhone())
	{
		alert("Phone Number Can Be Only Number Digit");
		return false;
	}

	else if(email=="" || email==null)
	{
			alert("Email Field Is Empty");
			return false;
	}
	else if(validateEmail())
	{
			alert("invalid Email Id");
			return false;
	}
	else if(password=="" || password==null)
	{
		alert("Password Field Is Empty");
		return false;
	}
	else if(password!=c_password)
	{
		alert("Password Does Not Match");
		return false;
	}

	else
	{
		return true;
	}

}

function validatePhone()
{
	var val=document.getElementById("contact").value;
	for(var i=0;i<val.length;i++)
	{
		if((val.charCodeAt(i)<48 || val.charCodeAt(i)>57))
		{			
			return true;
		}
		else
		{
			false;
		}
	}
}

function validateEmail()
{
var x=document.getElementById("email").value;

var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");

if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  {  
    return true;
  }
}


</script>






</head>
<body>




<center>

<br><br><br><br><br><br>
<fieldset>
	<legend><h3>USER REGISTRATION </h3></legend>
	<form action = "UserSrv" method = "post">
			<table width="400" height="250" bgcolor="yellow">
				<tr>
					<th colspan="2"> Please Fill Up Your Details</th>
				</tr>
				<tr>
					<td>Enter Your Name</td>
					<td><input class="box" type="text" name="name"></td>
				</tr>

				<tr>
					<td>Enter Your Contact</td>
					<td><input maxlength="11" class="box" type="number" name="contact"></td>
				</tr>

				<tr>
					<td>Enter Your Email Id</td>
					<td><input class="box" type="email" name="email"></td>
				</tr>

				<tr>
					<td>Enter Your Password</td>
					<td><input class="box"  type="password" name="password"></td>
				</tr>

				

				<tr>
					<td align="center"><input class="btn" type="submit" value="Signup"
						onclick="return validation();"></td>

					<td align="center"><input class="btn" type="reset" value="Reset"></td>
				</tr>
			</table>

	</form>

</fieldset>


</center>

<%


Object obj =session.getAttribute("uid");

if(obj!=null)
{
	
	int id= (Integer)obj;
	if(id>0)
	{
%>

<h1>Registered successfully your id is : <%=id %></h1>

<%} 
else
{%>

<h1>registration fails...</h1>

<%}session.removeAttribute("uid");} %>







<a href="login.jsp">Login</a>




</body>
</html>