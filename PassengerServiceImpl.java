package com.vir.service;

import com.vir.dao.PassengerDao;
import com.vir.dao.PassengerDaoImpl;
import com.vir.model.Passenger;

public class PassengerServiceImpl implements PassengerService {
	PassengerDao pDao=new PassengerDaoImpl();
	

	@Override
	public Passenger getDetails(int passengerId) {
		return pDao.getDetails(passengerId);
	}

	@Override
	public String insertDetails(Passenger p) {
		return pDao.insertDetails(p);
	}

}
