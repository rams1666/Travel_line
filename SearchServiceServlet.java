package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.service.BusServiceServiceImpl;

/**
 * Servlet implementation class SearchServiceServlet
 */
@WebServlet({ "/SearchServiceServlet", "/admin" })
public class SearchServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServiceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String from = request.getParameter("from");
		String to=request.getParameter("to"); 
		String dtime=request.getParameter("dtime");
		BusServiceServiceImpl bss = new BusServiceServiceImpl();
		List<BusService> listServices = bss.searchService(from, to, dtime);
		out.println(listServices);
		request.setAttribute("listData", listServices);
		if(listServices!=null) { 
		out.println("successfully"); 
		RequestDispatcher rd=request.getRequestDispatcher("/Select_service.jsp"); rd.forward(request,
				response);
		} 
		else 
		{ out.println("Sorry......!!!!"); RequestDispatcher
		rd=request.getRequestDispatcher("/Bus_Home.html"); rd.forward(request,
				response); }



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


}
