package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.vir.model.Booking;
import com.vir.util.DBConnection;

public class BookingDaoImpl implements BookingDao{

	@Override
	public String insertBookingDetails(Booking b) {
		int id = b.getBookingId();
		String jDate = b.getJourneyDate();
		String bDate = b.getBookingDate();
		int serviceId = b.getServiceId();
		int passengerId = b.getPassengerId();
		int seats = b.getNoOfSeats();
		double fare = b.getFare();
		double cardNo = b.getCardNo();
		String comments = b.getComments();
		String from = b.getFrom();
		String to = b.getTo();
		Connection con  ;
		PreparedStatement ps ;
		try {
			con=DBConnection.getConnection();
			String query = "insert into Booking values(SQL_booking_id.nextval,?,?,?,?,?,?,?,?,?,?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,  jDate);
			ps.setString(3, bDate);
			ps.setInt(4,serviceId);
			ps.setInt(5,passengerId);
			ps.setInt(6, seats);
			ps.setDouble(7, fare);
			ps.setDouble(8, cardNo);
			ps.setString(9, comments);
			ps.setString(10, from);
			ps.setString(11, to);
			int i = ps.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return "Oops.. Something went wrong there..!";

	}

	

	@Override
	public int cancelBooking(int bookingId) {
		   int status=0;  
	        try{  
	        	Connection con = DBConnection.getConnection();
	        	String sql = "DELETE FROM booking where booking_id = ?";
	            PreparedStatement ps=con.prepareStatement(sql);  
	            ps.setInt(1,bookingId);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }
	}






