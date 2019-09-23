package com.vir.service;

import java.util.List;

import com.vir.model.Booking;
import com.vir.model.BusService;

public interface AdminService {

	BusService getService(int serviceId);
	List<BusService> getAllService();
	boolean cancelService(int serviceId);
	List<Booking> viewFeedback();
	int updateDetails(BusService b);
	String addService(BusService b);
}
