package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethodController {
	
	@GetMapping("/demo")
	public String GetDemo()
	{
		return "Using get http method";
	}
	
	@PostMapping("/demo")
	public String postDemo()
	{
		return "Using post http method";
	}
	
	@PutMapping("/demo")
	public String putDemo()
	{
		return "Using put http method";
	}
	
	@DeleteMapping("/demo")
	public String deleteDemo()
	{
		return "Using delete http method";
	}
	
	@PatchMapping("/demo")
	public String patchDemo()
	{
		return "Using patch http method";
	}

}
