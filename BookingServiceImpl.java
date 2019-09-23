package com.vir.service;

import com.vir.dao.BookingDao;
import com.vir.dao.BookingDaoImpl;
import com.vir.model.Booking;

public class BookingServiceImpl implements BookingService{
	BookingDao bDao=new BookingDaoImpl();

	

	

	@Override
	public String insertBookingDetails(Booking b) {
		return bDao.insertBookingDetails(b);
	}



	@Override
	public int cancelBooking(int bookingId) {
		
		return bDao.cancelBooking(bookingId);
	}
	

}
