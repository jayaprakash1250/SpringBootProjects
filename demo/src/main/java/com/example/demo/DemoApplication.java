package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.models", "com.example.demo.models"})
public class DemoApplication {

	public static void main(String[] args) {
		BeanFactory factory = SpringApplication.run(DemoApplication.class, args);
		Object obj1 = factory.getBean("emp");
		Object obj2 = factory.getBean("student");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
