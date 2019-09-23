package com.vir.dao;

import com.vir.model.Booking;

public interface BookingDao {
	
	String insertBookingDetails(Booking b);
	int	cancelBooking(int bookingId);
}
