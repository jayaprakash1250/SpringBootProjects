package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope("prototype")
public class Address {
	
	@Value("AP")
	private String state;
	@Value("HYD")
	private String city;
	@Value("2345")
	private int pin;
	public Address()
	{
		System.out.println("Address obj created ");
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
