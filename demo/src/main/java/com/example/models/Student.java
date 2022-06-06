package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private int id;
	private int age;
	public Student()
	{
		System.out.println("Student Object is created ");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	

}
