<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SJ Bank</title>
</head>
<body>

<h1>Enter Your Credential:</h1>
<hr/>
<form action="login" method="post"> 
<table>

<tr>
<td>User ID</td>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<td>Passcode</td>
<td><input type="text" name="password"></td>
</tr>

<tr>
<td><a href="">Forgot your code?</a></td>
<td><input type="submit" value="Log In"></td>
</tr>

<tr>
<td colspan="2">Don't have an online account?</td>
</tr>

<tr>
<td colspan="2" align="left"><a href="">Enroll Today</a></td>
</tr>

<tr>
<td colspan="2" align="left" style="color:green">More Online Services</td>
</tr>

<tr>
<td colspan="2" >   

<select name="selectedValue"  >
 <option value="default">(select one)</option>
  <option value="onlineBanking">Online Banking</option>
  <option value="loan">loan rate</option>
 </select>


</td>
</tr>
</table>
</form>

</body>
</html>