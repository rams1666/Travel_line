package com.vir.service;

import com.vir.model.Passenger;

public interface PassengerService {
	String insertDetails(Passenger p);

	Passenger getDetails(int passengerId);
}
