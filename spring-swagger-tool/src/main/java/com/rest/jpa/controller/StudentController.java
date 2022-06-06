package com.rest.jpa.controller;

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

import com.rest.jpa.models.Student;
import com.rest.jpa.repositories.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studRepo;
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return studRepo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudentById(@PathVariable int id)
	{
		return studRepo.findById(id);
	}
	
	@PostMapping("/students")
	public String insertStudent(@RequestBody Student s)
	{
		if(studRepo.existsById(s.getRegNo()))
		{
			return "Record Already exits";
		}
	    studRepo.save(s);
	    return "Record Inserted Successfully\n"+s;
	}
	
	@PutMapping("/students")
	public String updateStudent(@RequestBody Student s)
	{
		if(studRepo.existsById(s.getRegNo()))
		{
			studRepo.save(s);
			return "Record Updated Sucessfully\n"+s;
		}
	   
	    return "Record Already Exists\n"+s;
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable int id)
	{
		if(studRepo.existsById(id))
		{
			studRepo.deleteById(id);
			return "Record Deleted successfully...!";
		}
		return "Invalid RegNo....!";
	}
	
	@GetMapping("/students/result")
	public List<Student> getAllPassedorFailedStudents(@RequestParam boolean pass)
	{
		if(pass)
			return studRepo.findByPercentageGreaterThanEqual(40.0);
		return studRepo.findByPercentageLessThan(40.0);
		
	}
	
	

	@GetMapping("/students/standard/{standard}")
	public List<Student> getAllByStandard(@PathVariable int standard)
	{
		return studRepo.findByStandard(standard);
	}
	@GetMapping("/students/standard/{school}")
	public List<Student> getAllBySchool(@PathVariable String school)
	{
		return studRepo.findBySchool(school);
	}
	
	@GetMapping("/students/strength/{standard}")
	public int getAllCountOfStandard(@PathVariable int standard)
	{
		return studRepo.findByStandard(standard).size();
	}
	
	@GetMapping("/students/strength/school/")
	public int getAllCountOfSchool(@RequestParam String school)
	{
		return studRepo.findBySchool(school).size();
	}

}
