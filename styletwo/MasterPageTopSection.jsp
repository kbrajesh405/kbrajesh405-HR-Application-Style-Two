<%@ taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm' %>
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset='utf-8'>
<title>HR application</title>
<script src='/styletwo/js/DesignationAddForm.js'></script>
<link rel='stylesheet' type='text/css' href='/styletwo/css/styles.css'>

</head>
<body>
<!--Main Container starts here-->
<div class='main-container'>

<!--header starts here-->
<div class='header'>
<img src='/styletwo/images/logo.jpg' class='logo'><div class='brand-name'>Thinking Machines</div>
<div>
<img src='/styletwo/images/login.jpg'>
${username} &nbsp; &nbsp;
<a href='/styletwo/logout'>Logout</a>
</div>

</div> <!--header ends here-->
<!--Content container starts here-->
<div class='content-container'>
<!--Left panel starts here--->
<div class='left-panel'>

<tm:If condition='${module==DESIGNATION}'>
<b>Designations</b><br>
</tm:If>

<tm:If condition='${module != DESIGNATION}'>
<a href='/styletwo/Designations.jsp'>Designations</a><br>
</tm:If>

<tm:If condition='${module==EMPLOYEES}'>
<b>Employees</b>
</tm:If>

<tm:If condition='${module != EMPLOYEES}'>
<a href='/styletwo/Employees.jsp'>Employees</a><br>
</tm:If>


<tm:If condition='${module != HOME}'>
<br>
<a href='/styletwo/index.jsp'>Home</a><br>
</tm:If>



</div><!--Left panel left here--->
<!--Right panel starts here--->
<div class='right-panel'>