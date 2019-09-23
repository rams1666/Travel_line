package com.vir.model;

public class Passenger {
	private int passengerId,age,mobile;
	private String passengerName,mailId,gender;
	public Passenger(int passengerId, int age, int mobile, String passengerName, String mailId, String gender) {
		super();
		this.passengerId = passengerId;
		this.age = age;
		this.mobile = mobile;
		this.passengerName = passengerName;
		this.mailId = mailId;
		this.gender = gender;
	}
	public Passenger() {
		super();
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", age=" + age + ", mobile=" + mobile + ", passengerName="
				+ passengerName + ", mailId=" + mailId + ", gender=" + gender + "]";
	}
	
	
	
}
