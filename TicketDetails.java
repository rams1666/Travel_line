package com.vir.model;

import java.util.Date;

public class TicketDetails {
	private int ticketNo,bookingId,passengerId,seatNo,age;
	private String passengerName,gender,sourceFrom,sourceTo;
	private Date journeyDate;
	private float fare;
	public TicketDetails(int ticketNo, int bookingId, int passengerId, int seatNo, int age, String passengerName,
			String gender, String sourceFrom, String sourceTo, Date journeyDate, float fare) {
		super();
		this.ticketNo = ticketNo;
		this.bookingId = bookingId;
		this.passengerId = passengerId;
		this.seatNo = seatNo;
		this.age = age;
		this.passengerName = passengerName;
		this.gender = gender;
		this.sourceFrom = sourceFrom;
		this.sourceTo = sourceTo;
		this.journeyDate = journeyDate;
		this.fare = fare;
		
	}
	
	public TicketDetails() {
		super();
	}

	@Override
	public String toString() {
		return "TicketDetails [ticketNo=" + ticketNo + ", bookingId=" + bookingId + ", passengerId=" + passengerId
				+ ", seatNo=" + seatNo + ", age=" + age + ", passengerName=" + passengerName + ", gender=" + gender
				+ ", sourceFrom=" + sourceFrom + ", sourceTo=" + sourceTo + ", journeyDate=" + journeyDate + ", fare="
				+ fare + "]";
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getSourceTo() {
		return sourceTo;
	}
	public void setSourceTo(String sourceTo) {
		this.sourceTo = sourceTo;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	
	
}
