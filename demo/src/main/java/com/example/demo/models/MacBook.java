package com.example.demo.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mac")
public class MacBook  implements Laptop{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("You got Apple laptop");
	}

}
