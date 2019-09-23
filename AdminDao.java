package com.vir.dao;

import java.util.List;

import com.vir.model.Booking;
import com.vir.model.BusService;

public interface AdminDao {
	BusService getService(int serviceId);
	List<BusService> getAllService();
	boolean cancelService(int serviceId);
	List<Booking> viewFeedback();
	int updateDetails(BusService b);
	//BusService update(int serviceId);
	String addService(BusService b);
}
