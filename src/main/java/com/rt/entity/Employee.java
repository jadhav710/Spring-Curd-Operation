package com.rt.entity;

public class Employee {
	private int id;
	private String name;
	private String emailId;
	private String mobile;
	private String city;
	private String state;
	private String address;
	public Employee() {}
	public Employee(int id, String name, String emailId, String mobile, String city, String state, String address) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
