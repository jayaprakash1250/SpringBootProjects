package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/greet")
	public String greet()
	{
		return "<h1> Hello Every One Have a Good day :)</h1>";
	}
	@GetMapping("/")
	public String mainPage()
	{
		return "<h1> Hello Rest API</h1>";
	}

}
