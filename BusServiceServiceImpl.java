package com.vir.service;

import java.util.List;

import com.vir.dao.BusServiceDaoImpl;
import com.vir.model.BusService;

public class BusServiceServiceImpl implements BusServiceService{

	
	@Override
	public List<BusService> searchService(String serviceFrom, String serviceTo, String departureTime) {
		// TODO Auto-generated method stub
		BusServiceDaoImpl bsDao = new BusServiceDaoImpl();
		return bsDao.searchService(serviceFrom, serviceTo, departureTime);
	}
	
	
	
	
	
	

}
