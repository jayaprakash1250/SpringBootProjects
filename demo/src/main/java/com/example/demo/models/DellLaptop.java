package com.example.demo.models;

import org.springframework.stereotype.Component;

@Component("dell")
public class DellLaptop  implements Laptop{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("You got DELL laptop");
	}

}