package com.example.session16_md3_hn_jv240408.service;

import com.example.session16_md3_hn_jv240408.model.Employee;

import java.util.List;

public interface IEmployeeService
{
	List<Employee> getEmployees();
	
	Employee findById(Integer id);
	
	void save(Employee employee); // save -> 1. add || 2. update
	
	void delete(Integer id);
}
