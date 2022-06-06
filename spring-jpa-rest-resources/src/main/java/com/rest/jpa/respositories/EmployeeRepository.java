package com.rest.jpa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rest.jpa.models.Employee;

@RepositoryRestResource(collectionResourceRel = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
