package com.vir.model;

import java.util.Date;

public class Booking {
	private int bookingId,serviceId,passengerId,noOfSeats,cardNo;
	private String journeyDate,bookingDate;
	private double fare;
	private String comments,from,to;
	public Booking(int bookingId, int serviceId, int passengerId, int noOfSeats, int cardNo, String journeyDate,
			String bookingDate, double fare, String comments, String from, String to) {
		super();
		this.bookingId = bookingId;
		this.serviceId = serviceId;
		this.passengerId = passengerId;
		this.noOfSeats = noOfSeats;
		this.cardNo = cardNo;
		this.journeyDate = journeyDate;
		this.bookingDate = bookingDate;
		this.fare = fare;
		this.comments = comments;
		this.from = from;
		this.to = to;
	}
	public Booking() {
		super();
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", serviceId=" + serviceId + ", passengerId=" + passengerId
				+ ", noOfSeats=" + noOfSeats + ", cardNo=" + cardNo + ", journeyDate=" + journeyDate + ", bookingDate="
				+ bookingDate + ", fare=" + fare + ", comments=" + comments + ", from=" + from + ", to=" + to + "]";
	}
	
	
}
