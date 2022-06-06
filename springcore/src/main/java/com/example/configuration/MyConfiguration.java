package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.models.Address;
import com.example.demo.models.Employee;
import com.example.demo.models.Student;

@Configuration
public class MyConfiguration {
	@Bean("emp1")
	@Lazy
	public Employee getEmployee1()
	{
		return new Employee("JP",22,25000,"Programmer", getAddress1());
	}
	@Bean("emp2")
    @Scope("prototype")
	public Employee getEmployee2()
	{
		Employee e = new Employee();
		e.setName("Suraj");
		e.setAge(22);
		e.setDesignation("Tester");
		e.setSalary(22500);
		return e;
		
	}
	
	@Bean("student")
	public Student getStudent()
	{
		Student s = new Student();
		s.setName("Raju");
		s.setAge(22);
		s.setRegNo(1232);
		s.setAddress(getAddress2());
		return s;
	}
	
	@Bean("addr1")
	public Address getAddress1()
	{
		return new Address("TN","Chennai",123211);
	}
	
	@Bean("addr2")
	@Scope("prototype")
	public Address getAddress2()
	{
		Address addr= new Address();
		addr.setState("Goa");
		addr.setPin(3213);
		addr.setCity("Goa");
		return addr;
	}
	

}
