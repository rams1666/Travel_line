package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vir.model.BusService;
import com.vir.service.AdminService;
import com.vir.service.AdminServiceImpl;
import com.vir.service.BusServiceService;
import com.vir.service.BusServiceServiceImpl;

/**
 * Servlet implementation class GetServiceServlet
 */
@WebServlet({ "/GetServiceServlet", "/getservice" })
public class GetServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		AdminService qs= new AdminServiceImpl();
			int serviceId =Integer.parseInt( request.getParameter("service_no"));
			BusService bus=(BusService)qs.getService(serviceId);
			if(bus!=null) {
				request.setAttribute("empdetails", bus);
				out.println("Bus Service Details");
				RequestDispatcher rd=request.getRequestDispatcher("ModifyService_2.jsp");
				rd.forward(request, response);

			}
			else {
				out.println("sorry......!");
				RequestDispatcher rd=request.getRequestDispatcher("ModifyService_1.jsp");
				rd.forward(request, response);
			}
		
	}

		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
