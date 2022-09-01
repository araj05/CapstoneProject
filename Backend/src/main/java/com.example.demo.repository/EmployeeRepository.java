package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

	Optional<Employee> findByUsername(String username);
	
}
