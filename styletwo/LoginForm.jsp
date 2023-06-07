<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.hr.beans.ErrorBean' />
<jsp:useBean id='administratorBean' scope='request' class='com.thinking.machines.hr.beans.AdministratorBean' />
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset='utf-8'>
<title>Login Form</title>
<link rel='stylesheet' type='text/css' href='/styletwo/css/styles.css'>
</head>
<body>

<div class='login-box'>
<br>
<br>
<br>

<center>
<img src='/styletwo/images/login.jpg'>
<b class='admin-text'>Admin Login</b>

<form action='/styletwo/Login.jsp' method='post'>
<table border='0'>
<tr>
<td>Username</td>
<td><input type='text' id='username' name='name' maxlength='15'></td>
</tr>

<tr>
<td>Password </td>
<td><input type='password' id='password' name='password' maxlength='15'></td>
</tr>
<tr>
<td colspan='2' align='center'>
<button type='submit'>Login</button>
</td>
</tr>

</table>
<br>
<br>
<br>

</center>
</form>
</div>
</body>
</html>