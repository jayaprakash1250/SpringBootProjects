package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/greet")
	public String welcomePage()
	{
		return "welcome.html";
	}
	@RequestMapping("/helloworld")
	public String getHelloWolrd()
	{
		return "helloworld.html";
	}
	
	@RequestMapping("/sum")
	public String getJspPage()
	{
		return "sum.jsp";
	}

}
