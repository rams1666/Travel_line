<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.vir.service.AdminServiceImpl,com.vir.model.BusService"%>  
  
<jsp:useBean id="u" class="com.vir.model.BusService"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<% BusService bs= new BusService();
AdminServiceImpl asi=new AdminServiceImpl();
int i=asi.updateDetails(bs);  
//response.sendRedirect("viewService.jsp");
out.println("SuucessFully updated");
%>  
</body>
</html>