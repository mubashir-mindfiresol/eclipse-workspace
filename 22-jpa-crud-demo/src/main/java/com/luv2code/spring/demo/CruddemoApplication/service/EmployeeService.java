package com.luv2code.spring.demo.CruddemoApplication.service;

import java.util.List;

import com.luv2code.spring.demo.CruddemoApplication.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
