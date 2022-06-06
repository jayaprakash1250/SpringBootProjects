package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringcoreApplication.class, args);
		
		Object obj1 = ctx.getBean("emp1");
		System.out.println(obj1);
		
		Object obj2 = ctx.getBean("emp2");
		System.out.println(obj2);
		
		Object obj3 = ctx.getBean("emp2");
		System.out.println(obj3);
		
		Object obj4 = ctx.getBean("student");
		System.out.println(obj4);
	}

}
