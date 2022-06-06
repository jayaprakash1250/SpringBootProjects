package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	public List<Employee> findByDesignation(String designation);
	public List<Employee> findByAgeLessThan(int age);
	public List<Employee> findByAgeGreaterThan(int age);
	
	@Query("from Employee  where designation = ?1 order by salary")
	public List<Employee> findByDesignationAndSort(String designation);
}
