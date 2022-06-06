package com.example.demo.models;

public class Address {
	
	private String state;
	private String city;
	private int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String state, String city, int pin) {
		super();
		this.state = state;
		this.city = city;
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
