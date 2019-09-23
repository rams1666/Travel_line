package com.vir.service;

import java.util.List;

import com.vir.dao.AdminDao;
import com.vir.dao.AdminDaoImpl;
import com.vir.model.Booking;
import com.vir.model.BusService;

public class AdminServiceImpl implements AdminService {
	AdminDao aDao=new AdminDaoImpl();
	@Override
	public BusService getService(int serviceId) {
		// TODO Auto-generated method stub
		return aDao.getService(serviceId);
	}

	@Override
	public List<BusService> getAllService() {
		// TODO Auto-generated method stub
		return aDao.getAllService();
	}

	@Override
	public boolean cancelService(int serviceId) {
		// TODO Auto-generated method stub
		return aDao.cancelService(serviceId);
	}

	@Override
	public String addService(BusService b) {
		return aDao.addService(b);
	}

	@Override
	public int updateDetails(BusService b) {
		return aDao.updateDetails(b);
	}

	@Override
	public List<Booking> viewFeedback() {
		
		return aDao.viewFeedback();
	}

	
}
