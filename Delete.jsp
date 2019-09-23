<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.vir.service.*"%>  
<jsp:useBean id="u" class="com.vir.model.BusService"/>  
<jsp:setProperty property="*" name="u"/>  

<% AdminService admin= new AdminServiceImpl();
  admin.cancelService(u.getServiceId());
response.sendRedirect("Modify_Service.jsp");  
%>
</body>
</html>