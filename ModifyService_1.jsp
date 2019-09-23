<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th{
  border: 1px solid black;
}


.header {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
background: white;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
 padding-top: 10px;
 margin-left: 5em;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;


}
.nav-collapse {
  margin-left: 1em;

}

</style>

</head>
<body>
<div class="header">
<h1>Travel Line</h1>
  <img src="images/bus.jpg" alt="bus" style="width:1000px;height:300px">
</div>
<div class="nav-collapse">
<div class="topnav">
<a href="Add_Service.jsp">Add Service</a>
<a href="Admin_login.jsp">Logout</a>
</div>
</div>
<div align="center" ><br>
<h3>Modify Services</h3>
<form action="getservice" method="get">
Service Number:<input type="number" min="1" name="service_no" required="required"><br><br>
<button type="submit"  value="submit" id="submit">Submit</button>&nbsp;
<button type="submit" onclick="location.href = 'Admin.html';"  value="cancel">cancel</button>&nbsp;<br>
</form>
</div>
</body>
</html>