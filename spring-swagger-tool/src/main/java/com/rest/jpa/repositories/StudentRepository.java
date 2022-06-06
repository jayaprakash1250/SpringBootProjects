package com.rest.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rest.jpa.models.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	public List<Student> findByStandard(int standard);
	public List<Student> findBySchool(String school);
	
	public List<Student> findByPercentageGreaterThanEqual(double percentage);

	public List<Student> findByPercentageLessThan(double percenatge);

}
