package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;

@RestController
public class ParamController {
	
	@GetMapping("/params")
	public String queryParamDemo(@RequestParam("user") String name,@RequestParam int age)
	{
		return "<h1> your good name is "+name+" and you are "+age+" years old";
	}
	
	@PostMapping("/params")
	public String queryParamDemo2(String name, int age)
	{
		return "<h1> your good name is "+name+" and you are "+age+" years old";
	}
	
	@GetMapping("/params/{name}/{age}")
	public String pathParamDemo( @PathVariable String name,@PathVariable int age)
	{
		return "<h1> your good name is "+name+" and you are "+age+" years old";
	}
	
	@PostMapping("/paramUser")
	public String pathParamUserDemo(@RequestBody User u )
	{
		return "<h1> your good name is "+u.getUser()+" and you are "+u.getAge()+" years old";
	}
	

}
