package com.example.demo.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lenevo")
@Primary
public class LenevoLaptop  implements Laptop{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("You got Lenevo laptop");
	}

}
