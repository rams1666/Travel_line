package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.vir.model.BusService;
import com.vir.util.DBConnection;

public class BusServiceDaoImpl implements BusServiceDao{

	@Override
	public List<BusService> searchService(String serviceFrom, String serviceTo,String departureTime) {
		
		List<BusService> list=new ArrayList<>();
		Connection con=null;
		
		try{  
			String sql="select * from service where source_from=? and source_to=? and departure_time=?";
			con = DBConnection.getConnection(); 
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,serviceFrom);
			ps.setString(2,serviceTo);
			ps.setString(3,departureTime);
			System.out.println("data " + serviceFrom + "," + serviceTo + "," + departureTime);
			ResultSet rs=ps.executeQuery(); 
			
			while(rs.next()){  
				BusService 	bs = new BusService();
				bs.setServiceId(rs.getInt(1));
				bs.setServiceFrom(rs.getString(2));
				bs.setServiceTo(rs.getString(3));
				bs.setBusCapacity(rs.getInt(4));
				bs.setFare(rs.getFloat(5));
				bs.setDistance(rs.getFloat(6));
				bs.setDepartureTime(rs.getString(7));
				bs.setJourneyTime(rs.getString(8));
				list.add(bs);
				
			}  
			
			rs.close();
		}catch(Exception e){e.printStackTrace();}  
		System.out.println(list);
		return list;  
	}

}







