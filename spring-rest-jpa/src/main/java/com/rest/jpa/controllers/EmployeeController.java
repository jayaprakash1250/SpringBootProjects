package com.rest.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.jpa.models.Employee;
import com.rest.jpa.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return empRepo.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id)
	{
		return empRepo.findById(id);
	}
	
	
	@PostMapping("/employee")
	public String insertEmployee(@RequestBody Employee e)
	{
		if(empRepo.existsById(e.getId()))
			return "Employee record is Already Exists";
		empRepo.save(e);
		return "Employee Record Added Sucessfully\n "+e;
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id )
	{
		Optional<Employee> e = empRepo.findById(id);
		if(e.isPresent())
		{
			empRepo.deleteById(id);
			return "Employee Record Deleted Sucessfully\n "+e;
		}
		return "Invalid Employee Id...! ";
		
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee e)
	{
		if(empRepo.existsById(e.getId()))
		{
			empRepo.save(e);
			return "Employee Record Updated Sucessfully\n "+e;	
		}
	    return "Inavlid Employee record...! ";		
	}
	
	@GetMapping("/employees/{designation}")
	public List<Employee> getAllEmployeeByDesignation(@PathVariable String designation)
	{
		return empRepo.findByDesignation(designation);
	}
	
	@GetMapping("/employees/age")
	public List<Employee> getAllEmployeeByAgeBetween(@RequestParam("min") int min , @RequestParam("max") int max)
	{
		return empRepo.findByAgeBetween(min, max);
	}
	
	@GetMapping("/employees/role/{designation}")
	public List<Employee> getAllEmployeeByDesignationAndSort(@PathVariable String designation)
	{
		return empRepo.findByDesignationAndSort(designation);
	}
}
