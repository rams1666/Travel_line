package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vir.model.Booking;
import com.vir.model.BusService;
import com.vir.model.Passenger;
import com.vir.util.DBConnection;

public class AdminDaoImpl implements AdminDao{

	@Override
	public BusService getService(int serviceId) {

		Connection con=DBConnection.getConnection();
		BusService bs=new BusService();

		PreparedStatement pst=null;
		

		try {
			
			String st="select * from service where service_id=?";
			pst=con.prepareStatement(st);
			pst.setInt(1, serviceId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				bs.setServiceId(rs.getInt(1));
				bs.setServiceFrom(rs.getString(2));
				bs.setServiceTo(rs.getString(3));
				bs.setBusCapacity(rs.getInt(4));
				bs.setFare(rs.getFloat(5));
				bs.setDistance(rs.getFloat(6));
				bs.setDepartureTime(rs.getString(7));
				bs.setJourneyTime(rs.getString(8));
			
				System.out.println(bs);
			}

			
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pst!=null) {
					pst.close();
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return bs;

	}





	@Override
	public  boolean cancelService(int serviceId) {
		boolean flag = false;
		String sql="delete from service where service_id="+serviceId;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getConnection();
			pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1,serviceId);
			pstmt.executeUpdate();
			flag=true;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;

	}

	
	

	@Override
	public String addService(BusService b) {
		String from = b.getServiceFrom();
		String to = b.getServiceTo();
		int capacity = b.getBusCapacity();
		String dt = b.getDepartureTime();
		String jt = b.getJourneyTime();
		float fare = b.getFare();
		float distance = b.getDistance();
		Connection con  ;
		PreparedStatement ps ;
		try {
			con=DBConnection.getConnection();
			String query = "insert into Service values (SQL_Service_id.nextval,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			//ps.setInt(1, id);
			ps.setString(1,from);
			ps.setString(2, to);
			ps.setInt(3, capacity);
			ps.setFloat(4, fare);
			ps.setFloat(5, distance);
			ps.setString(6,  dt);
			ps.setString(7,jt);
			int i = ps.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
		return "Oops.. Something went wrong there..!"; 
	}

	public List<BusService> getAllService() {
		List<BusService> list=new ArrayList<BusService>(); 
		BusService bs = new BusService();
		try{  
			Connection con=DBConnection.getConnection();
			String sql="select * from Service";
			PreparedStatement ps=con.prepareStatement(sql);  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  

				bs.setServiceId(rs.getInt(1));
				bs.setServiceFrom(rs.getString(2));
				bs.setServiceTo(rs.getString(3));
				bs.setBusCapacity(rs.getInt(4));
				bs.setDepartureTime(rs.getString(5));
				bs.setJourneyTime(rs.getString(6));
				bs.setFare(rs.getFloat(7));
				bs.setDistance(rs.getFloat(8));
				list.add(bs);  
			}  
			con.close();  
		}catch(Exception e){e.printStackTrace();}  

		return list;  
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> viewFeedback() {
		List<Booking> list=new ArrayList<Booking>();
		List<Passenger> list2=new ArrayList<Passenger>();
		
		@SuppressWarnings("rawtypes")
		List m=new ArrayList(list);
		m.addAll(list2);
		Booking b=new Booking(); 
		Passenger p = new Passenger();
		String sql="select passenger_name,mail_id,comments from booking b inner join passenger p on b.passenger_id=p.passenger_id where service_id=?";
		try{  
			Connection con = DBConnection.getConnection(); 
			PreparedStatement ps=con.prepareStatement(sql);  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
				p.setPassengerName(rs.getString(1));
				p.setMailId(rs.getString(2));
				b.setComments(rs.getString(3));

			}  
			con.close();  
		}catch(Exception e){e.printStackTrace();}  

		return m;  
	}

	@Override
	public int updateDetails(BusService b) {
		String sql="update service set source_from = ?,  source_to  = ? , capacity=?, departure_time=?,journey_time =?,fare =?,distance =? where service_id = ?"; 
		Connection con = null;
		int status=0;
		try{
			con = DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,b.getServiceId());
			ps.setString(2,b.getServiceFrom());
			ps.setString(3,b.getServiceTo());
			ps.setInt(4,b.getBusCapacity());
			
			ps.setFloat(5,b.getFare());
			ps.setFloat(6,b.getDistance());
			ps.setString(7, b.getDepartureTime());
			ps.setString(8, b.getJourneyTime());


			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;

	}





}
