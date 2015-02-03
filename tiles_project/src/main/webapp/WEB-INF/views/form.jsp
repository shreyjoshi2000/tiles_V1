<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SJ Bank </title>
</head>

<body>
<h1> New Customer Form:</h1>
<hr/>
<form action="addCustomer" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="accountHolderName"/></td>
</tr>

<tr>
<td>ID:</td>
<td><input type="text" name="accountid"/></td>
</tr>

<tr>

<td>Phone Number</td>
<td><input type="text" name="contactNumber"/></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="text" name="address"/></td>
</tr>

<tr>

<td>Amount</td>
<td><input type="text" name="amount"/></td>
</tr>


<tr>
<td colspan="2" align="center"><input type="submit" name="Submit Form"/></td>
</tr>

</table>

</form>

</body>
</html>