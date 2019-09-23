package com.vir.model;

public class Admin {
	private int adminId;
	private String adminName,password;
	public Admin(int admin_id, String admin_name, String password) {
		super();
		this.adminId = admin_id;
		this.adminName = admin_name;
		this.password = password;
	}
	public int getAdmin_id() {
		return adminId;
	}
	public void setAdmin_id(int admin_id) {
		this.adminId = admin_id;
	}
	public String getAdmin_name() {
		return adminName;
	}
	public void setAdmin_name(String admin_name) {
		this.adminName = admin_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + adminId + ", admin_name=" + adminName + ", password=" + password + "]";
	}
	
}
