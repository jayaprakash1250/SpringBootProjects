package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.models.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao empDao;
	
	@RequestMapping("/createEmp")
	public String insertEmp(Employee e)
	{
		empDao.save(e);
		return "index.html";
	}
	
	@RequestMapping("/getEmployees")
	@ResponseBody
	public Iterable<Employee> getEmployees()
	{
		return empDao.findAll();
	}
	
	@RequestMapping("/searchEmp")
	@ResponseBody
	public Optional<Employee> SearchEmp(int id)
	{
		return empDao.findById(id);
	}
	
	@RequestMapping("/searchByDesignation")
	@ResponseBody
	public List<Employee> searchByDesignation(String designation)
	{
		return empDao.findByDesignation(designation);
	}
	@RequestMapping("/searchByDesignationAndSort")
	@ResponseBody
	public List<Employee> searchByDesignationAndSort(String designation)
	{
		return empDao.findByDesignationAndSort(designation);
	}
	
	@RequestMapping("/getjunior")
	@ResponseBody
	public List<Employee> getByAgeLessthan(int age)
	{
		return empDao.findByAgeLessThan(age);
	}
	
	@RequestMapping("/getsenior")
	@ResponseBody
	public List<Employee> getByAgeGreaterThan(int age)
	{
		return empDao.findByAgeGreaterThan(age);
	}
	
	@RequestMapping("/updateEmp")
	@ResponseBody
	public String UpdateEmp(Employee e)
	{
		empDao.save(e);
		return "employee update sucessfully";
	}
	@RequestMapping("/deleteEmp")
	@ResponseBody
	public String DeleteEmployee(int id)
	{
		if(empDao.existsById(id))
		{
			empDao.deleteById(id);
			return "Employee Deleted Sucessfully";
		}
		return "Invalid Employee Id";
	}
	

}
