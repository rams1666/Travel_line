package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.service.AdminServiceImpl;

/**
 * Servlet implementation class AddServiceServlet
 */
@WebServlet({ "/AddServiceServlet", "/add" })
public class AddServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
	    String from=(request.getParameter("from"));
	    String to=(request.getParameter("to"));
	    int capacity = Integer.parseInt(request.getParameter("capacity"));
	    float fare =Float.parseFloat(request.getParameter("fare"));
		float distance =Float.parseFloat(request.getParameter("distance"));
		String departure = request.getParameter("departureTime");
		String jtime = request.getParameter("jTime");
		
		BusService question = new BusService();
		question.setServiceFrom(from);
		question.setServiceTo(to);
		question.setBusCapacity(capacity);
		question.setFare(fare);
		question.setDistance(distance);
		question.setDepartureTime(departure);
		question.setJourneyTime(jtime);
		
		AdminServiceImpl as = new AdminServiceImpl();
		String addService = as.addService(question);
		if(addService.equals("SUCCESS"))   
		{
			out.print("<p>Record saved successfully!</p>");  
			request.getRequestDispatcher("/Add_Service.jsp").include(request, response); 
		}
		else   
		{
			out.println("Sorry! unable to save record"); 
			request.getRequestDispatcher("/Add_Service.jsp").include(request, response); 

		}
		out.close();
	}
	}


