package com.example.demo;

public class User {
	
	private String user;
	private int age;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", age=" + age + "]";
	}
	

}
