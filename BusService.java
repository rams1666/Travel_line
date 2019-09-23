package com.vir.model;

public class BusService {
	public int serviceId;
	public int busCapacity;
	public String serviceFrom,serviceTo;
	public float fare,distance;
	public String departureTime;
	public String journeyTime;
	public BusService(int serviceId, int busCapacity, String serviceFrom, String serviceTo, float fare, float distance,
			String departureTime, String journeyTime) {
		super();
		this.serviceId = serviceId;
		this.busCapacity = busCapacity;
		this.serviceFrom = serviceFrom;
		this.serviceTo = serviceTo;
		this.fare = fare;
		this.distance = distance;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
	}
	public BusService() {
		super();
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
	public String getServiceFrom() {
		return serviceFrom;
	}
	public void setServiceFrom(String serviceFrom) {
		this.serviceFrom = serviceFrom;
	}
	public String getServiceTo() {
		return serviceTo;
	}
	public void setServiceTo(String serviceTo) {
		this.serviceTo = serviceTo;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departure) {
		this.departureTime = departure;
	}
	public String getJourneyTime() {
		return journeyTime;
	}
	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}
	@Override
	public String toString() {
		return "BusService [serviceId=" + serviceId + ", busCapacity=" + busCapacity + ", serviceFrom=" + serviceFrom
				+ ", serviceTo=" + serviceTo + ", fare=" + fare + ", distance=" + distance + ", departureTime="
				+ departureTime + ", journeyTime=" + journeyTime + "]";
	}
	
	
	
	}
