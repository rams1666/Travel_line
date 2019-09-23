package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.service.AdminService;
import com.vir.service.AdminServiceImpl;

/**
 * Servlet implementation class DeleteServiceServlet
 */
@WebServlet({ "/DeleteServiceServlet" })
public class DeleteServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		/*
		 * int no = Integer.parseInt(request.getParameter("service_no")); //AdminService
		 * ad = new AdminServiceImpl(); ad.cancelService(no);
		 * out.println("Successfully delete");
		 * response.sendRedirect("ModifyService_2.jsp"); AdminService ad = new
		 * AdminServiceImpl();
		 */
		AdminService ad = new
				  AdminServiceImpl();
	        String id = request.getParameter("service_no");
	    	
			if(ad.cancelService(Integer.parseInt(id))) {
				request.setAttribute("NOTIFICATION", "Employee Deleted Successfully!");
			}
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
