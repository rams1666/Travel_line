<%@page import="com.vir.service.AdminServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<%@page import="com.vir.service.AdminServiceImpl,com.vir.model.BusService"%>  
  
<%  
String id=request.getParameter("service_no"); 

AdminServiceImpl as=new AdminServiceImpl();
BusService u=as.getService(Integer.parseInt(id));
%>  
  
<h1>Edit Form</h1>  
<form action="EditService.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getServiceId() %>"/>  
<table border="1" width="90%">  
<tr><th>From:</th><td>  
<input type="text" name="from" value="<%= u.getServiceFrom()%>"/></td></tr>  
<tr><th>To:</th><td>  
<input type="text" name="to" value="<%= u.getServiceTo()%>"/></td></tr>  
<tr><th>Capacity:</th><td>  
<input type="number" name="capacity" value="<%= u.getBusCapacity()%>"/></td></tr>  
<tr><th>Fare:</th><td>  
<input type="text" name="fare" value="<%= u.getFare()%>"/></td></tr> 
<tr><th>Distance:</th><td>  
<input type="text" name="distance" value="<%= u.getDistance()%>"/></td></tr> 
<tr><th>Departure Time:</th><td>  
<input type="text" name="deaparture" value="<%= u.getDepartureTime()%>"/></td></tr> 
<tr><th>Journey Time:</th><td>  
<input type="text" name="journey" value="<%= u.getJourneyTime()%>"/></td></tr> 
</td></tr>  
<tr><td colspan="2"><input type="submit" value="update"/></td></tr>  
</table>  
</form>  
</div>
</body>
</html>