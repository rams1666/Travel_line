package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.service.AdminService;
import com.vir.service.AdminServiceImpl;
import com.vir.service.BusServiceServiceImpl;

/**
 * Servlet implementation class UpdateService1
 */
@WebServlet({ "/UpdateService1", "/updated" })
public class UpdateServiceServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServiceServlet1() {
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
		// TODO Auto-generated method stub
		/*
		 * doGet(request, response); response.setContentType("text/html"); PrintWriter
		 * out=response.getWriter(); out.println("<h1>Update question</h1>"); int
		 * sno=Integer.parseInt(request.getParameter("service_no"));
		 * 
		 * AdminService qs= new AdminServiceImpl(); BusService service =
		 * qs.getService(sno);
		 * out.print("<form action='editQuestionServlet2' method='post'>");
		 * out.print("<table>");
		 * out.print("<tr><td></td><td><input type='hidden' name='qid' value='"+qs.
		 * getService(sno)+"'/></td></tr>");
		 * out.print("<tr><td>empid:</td><td><input type='number' name='empid' value='"
		 * +e.getEmpid()+"'/></td></tr>");
		 * out.print("<tr><td>qdesc:</td><td><input type='text' name='qdesc' value='"+e.
		 * getQdesc()+"'/></td></tr>");
		 * 
		 * out.
		 * print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>"
		 * ); out.print("</table>"); out.print("</form>");
		 * 
		 * out.close();
		 */
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        int sid = Integer.parseInt(request.getParameter("service_no"));  
        String source=request.getParameter("source");
		String destination= request.getParameter("destination");
		int capacity=Integer.parseInt(request.getParameter("capacity"));
		float fare=Float.parseFloat(request.getParameter("fare"));
		float distance=Float.parseFloat(request.getParameter("distance"));
		String departure= request.getParameter("departureTime");
		String journey= request.getParameter("journey");  
          
        BusService e=new BusService();  
        e.setServiceId(sid);  
        e.setServiceFrom(source);  
        e.setServiceTo(destination);  
        e.setBusCapacity(capacity);
        e.setFare(fare);
        e.setDistance(distance);
        e.setDepartureTime(departure);
        e.setJourneyTime(journey);
        AdminServiceImpl asi = new AdminServiceImpl();
        int status = asi.updateDetails(e);
        //int status=E.update(e);
        
        if(status>0){  
            response.sendRedirect("ViewServlet"); 
            out.println("successfully modified ");
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
	}


