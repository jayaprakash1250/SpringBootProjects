package com.example.demo.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Employee;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String getLogin()
	{
		return "login.html";
	}
	
	@RequestMapping("/logincheck")
	public String loginCheck( String username, String passwd, HttpSession session)
	{
		//System.out.println("welcome "+username+" "+passwd);
		if(username.equalsIgnoreCase(passwd))
		{
			
		  
		  System.out.println(username+" "+passwd);
		  session.setAttribute("username", username);
		  ServletContext ctx = session.getServletContext();
		  ctx.setAttribute("username", username);
		  return "success.jsp";
		   
		}
		
		return "failure.jsp";
	}
	
	@RequestMapping("/register")
	public String getReqPage()
	{
		return "register.html";
	}
	
	@RequestMapping("/registerEmp")
	public ModelAndView registerEmployee(Employee e)
	{
		ModelAndView mv = new ModelAndView();
		 
		mv.addObject("emp", e);
		
		mv.setViewName("welcomeemp.jsp");
		
		return mv;
	}

}
