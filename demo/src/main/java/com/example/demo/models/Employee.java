package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
@Lazy
public class Employee {
	@Value("${EmployeeName}")
	private String name;
	@Value("1234")
	private int id;
	@Value("30000")
	private int salary;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("mac")
	private Laptop laptop;
	
	public Employee()
	{
		System.out.println("Employee obj created");
	}
	
	@Override
	public String toString() {
		System.out.println(address);
		laptop.display();
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
