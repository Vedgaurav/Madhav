<%@ page errorPage="error.jsp" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>
Package Details
</title>
<style>
body
{
	background-image: url(img/1234.jpg);
	background-repeat: no-repeat;
	background-attachment: fixed;
	}



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

<body bgcolor="green">
<center>

<br><br><br><br><br><br>
<fieldset>
	<legend>...PACKAGE DETAILS...</legend>
	<form action="PackageServlet" method="post" >
			<table width="400" height="250" bgcolor="black">
				<tr>
					<th colspan="2"> Please Fill Up The Details</th>
				</tr>
				<tr>
					<td>Enter Package Name</td>
					<td><input class="box" type="text" name="name" required></td>
				</tr>

				<tr>
					<td>Enter Package Details</td>
					<td><input  class="box" type="textarea"  name="details" required></td>
				</tr>

				<tr>
					<td>Enter Package Rate</td>
					<td><input class="box" type="number" name="rate" required></td>
				</tr>
				
				<tr>
					<td>Enter Package Count</td>
					<td><input  class="box" type="number"  name="count" required></td>
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






<a href="merchantHome.jsp">Merchant Home</a>
<a href="logout.jsp">Logout</a>



</body>
</html>
<%@ include file="footer.jsp" %>