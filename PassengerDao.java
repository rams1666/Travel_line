package com.vir.dao;

import com.vir.model.Passenger;

public interface PassengerDao {
	String insertDetails(Passenger p);
	
	Passenger getDetails(int passengerId);

	
	
}
