package com.vir.service;

import com.vir.model.Booking;

public interface BookingService {
	String insertBookingDetails(Booking b);
	int	cancelBooking(int bookingId);
}
