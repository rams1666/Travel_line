                                                                                                    package com.vir.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vir.model.TicketDetails;
import com.vir.util.DBConnection;

public class TicketDetailsDaoImpl implements TicketDetailsDao {

	@Override
	public TicketDetails getTicket(int ticketNo) {
		TicketDetails td = new TicketDetails();
		Connection con;
		PreparedStatement pst;
		ResultSet rs = null;
		
		
		try {
			con = DBConnection.getConnection();
			pst=con.prepareStatement("select t.ticket_no,t.booking_id,t.passenger_id,t.source_from,t.source_to,t.seat_no,t.fare,t.passenger_name,t.age,t.gender,t.journey_date from ticket_details t inner join booking b on t.booking_id=b.booking_id inner join passenger p on t.passenger_id=b.passenger_id");
			pst.setInt(1, ticketNo);
			rs=pst.executeQuery();
			if(rs.next()) {
				td.setTicketNo(rs.getInt(1));
				td.setBookingId(rs.getInt(2));
				td.setPassengerId(rs.getInt(3));   
				td.setSourceFrom(rs.getString(4));
				td.setSourceFrom(rs.getString(5));
				td.setSeatNo(rs.getInt(6));
				td.setFare(rs.getFloat(7));
				td.setPassengerName(rs.getString(8));
				td.setAge(rs.getInt(9));
				td.setGender(rs.getString(10));
				td.setJourneyDate(rs.getDate(11));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return td;
	}

	@Override
	public int cancelTicket(int ticketNo) {
		int count=0;
		String sql="delete from ticket_Details where ticket_no=?";
		PreparedStatement pstmt=null;
		try {
			pstmt=DBConnection.getConnection()
			.prepareStatement(sql);
			pstmt.setInt(1, ticketNo);
			
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
		
	}

	
	

}
