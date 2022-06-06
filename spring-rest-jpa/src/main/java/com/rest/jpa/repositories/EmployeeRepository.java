package com.rest.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.jpa.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByDesignation(String designation);
	public List<Employee> findByAgeBetween(int min, int max);
	
	@Query("select e from Employee e where e.designation = ?1 order by id")
	public List<Employee> findByDesignationAndSort(String designation);
}
