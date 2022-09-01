package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServices {
@Autowired
    private EmployeeRepository repo;
	public Iterable<Employee> listAll() {
	        return this.repo.findAll();
	    }
	
	public void saveOrUpdate(Employee employees)  
	{  
	repo.save(employees);  
	}
	
	public Employee getEmployeeById(long id)  
	{  
	return repo.findById(id).get();  
	}
	
//	public Employee getEmployeeByUsername(String username)  
//	{  
//	return repo.findByUsername(username).get();  
//	}
	
	public void update(Employee employees, int id)  
	{  
		repo.save(employees);  
	}  
	 
	public void delete(long id)  
	{  
		repo.deleteById(id);  
	}  
}
